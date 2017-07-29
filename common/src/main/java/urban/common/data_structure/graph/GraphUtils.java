package urban.common.data_structure.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
}
