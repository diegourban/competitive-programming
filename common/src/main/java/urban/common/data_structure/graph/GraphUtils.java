package urban.common.data_structure.graph;

import java.util.*;

public class GraphUtils {

    /**
     * Given an undirected graph, with maximum degree D, find a graph coloring using at most D+1 colors.
     * <p>
     * Solution: We go through the nodes in one pass, assigning each node the first legal color we find.
     * How can we be sure we'll always have at least one legal color for every node? In a graph with maximum degree D, each node has at most D neighbors.
     * That means there are at most D colors taken by a node's neighbors. And we have D+1 colors, so there's always at least one color left to use.
     * <p>
     * When we color each node, we're careful to stop iterating over colors as soon as we find a legal color.
     * <p>
     * Complexity: O(N+M) time where N is the number of nodes and M is the number of edges.
     * The only thing we're storing is the illegalColors hash set. In the worst case, all the neighbors of a node with the maximum degree (D) have different colors, so our hash set takes up O(D) space.
     *
     * @param graph  the graph
     * @param colors color list
     */
    public static void colorGraph(List<GraphNode> graph, List<String> colors) {
        for (GraphNode node : graph) {
            Set<GraphNode> neighbors = node.getNeighbors();

            if (neighbors.contains(node)) {
                throw new IllegalArgumentException(String.format(
                        "Legal coloring impossible for node with loop: %s",
                        node.getLabel()));
            }

            // get the node's neighbors' colors, as a set so we
            // can check if a color is illegal in constant time
            Set<String> illegalColors = new HashSet<>();
            for (GraphNode neighbor : neighbors) {
                if (neighbor.hasColor()) {
                    illegalColors.add(neighbor.getColor());
                }
            }

            // assign the first legal color
            for (String color : colors) {
                if (!illegalColors.contains(color)) {
                    node.setColor(color);
                    break;
                }
            }
        }
    }

    /**
     * Solution:
     * We treat the input user network as a graph in adjacency list format. Then we do a breadth-first search from the sender, stopping once we reach the recipient.
     * In order to recover the actual shortest path from the sender to the recipient, we do two things:
     * 1. during our breadth-first search, we keep track of how we reached each node;
     * 2. after our breadth-first search reaches the end node, we use our hash map to backtrack from the recipient to the sender.
     * <p>
     * To make sure our breadth-first search terminates, we're careful to avoid visiting any node twice. We could keep track of the nodes we've already seen in a hash set, but, to save space, we reuse the hash map we've already set up for recovering the path.
     *
     * Complexity:
     *
     *
     * @param graph     the network graph
     * @param startNode the sender
     * @param endNode   the receiver
     * @return the shortest path between the sender and receiver
     */
    public static String[] shortestPathBfs(Map<String, String[]> graph, String startNode, String endNode) {
        if (!graph.containsKey(startNode)) {
            throw new IllegalArgumentException("Start node not in graph");
        }
        if (!graph.containsKey(endNode)) {
            throw new IllegalArgumentException("End node not in graph");
        }

        Queue<String> nodesToVisit = new ArrayDeque<>();
        nodesToVisit.add(startNode);

        // keep track of how we got to each node
        // we'll use this to reconstruct the shortest path at the end
        // we'll ALSO use this to keep track of which nodes we've
        // already visited
        Map<String, String> howWeReachedNodes = new HashMap<>();
        howWeReachedNodes.put(startNode, null);

        while (!nodesToVisit.isEmpty()) {
            String currentNode = nodesToVisit.remove();

            // stop when we reach the end node
            if (currentNode.equals(endNode)) {
                return reconstructPath(howWeReachedNodes, startNode, endNode);
            }

            for (String neighbor : graph.get(currentNode)) {
                if (!howWeReachedNodes.containsKey(neighbor)) {
                    nodesToVisit.add(neighbor);
                    howWeReachedNodes.put(neighbor, currentNode);
                }
            }
        }

        // if we get here, then we never found the end node
        // so there's NO path from startNode to endNode
        return null;
    }

    private static String[] reconstructPath(Map<String, String> previousNodes, String startNode, String endNode) {
        List<String> reversedShortestPath = new ArrayList<>();

        // start from the end of the path and work backwards
        String currentNode = endNode;

        while (currentNode != null) {
            reversedShortestPath.add(currentNode);
            currentNode = previousNodes.get(currentNode);
        }

        // reverse our path to get the right order
        // by flipping it around, in place
        Collections.reverse(reversedShortestPath);
        return reversedShortestPath.toArray(new String[reversedShortestPath.size()]);
    }
}
