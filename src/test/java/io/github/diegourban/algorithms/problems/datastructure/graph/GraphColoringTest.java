package io.github.diegourban.algorithms.problems.datastructure.graph;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

/**
 * Graph Coloring — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/graph-coloring
 * <p>
 * Greedy, one pass: give each node the first color not used by its neighbors; with D+1 colors and degree at most
 * D one is always free. O(N + M) time, O(D) extra space.
 */
class GraphColoringTest {

    private static final class GraphNode {
        private final String label;
        private final Set<GraphNode> neighbors = new HashSet<>();
        private String color;

        private GraphNode(String label) {
            this.label = label;
        }

        private void connect(GraphNode other) {
            neighbors.add(other);
            other.neighbors.add(this);
        }
    }

    static void solve(List<GraphNode> graph, List<String> colors) {
        for (var node : graph) {
            if (node.neighbors.contains(node)) {
                throw new IllegalArgumentException("Legal coloring impossible for node with loop: " + node.label);
            }
            var illegalColors = new HashSet<String>();
            for (var neighbor : node.neighbors) {
                if (neighbor.color != null) {
                    illegalColors.add(neighbor.color);
                }
            }
            for (var color : colors) {
                if (!illegalColors.contains(color)) {
                    node.color = color;
                    break;
                }
            }
        }
    }

    @Test
    void colorsAPathWithoutNeighborClashes() {
        var a = new GraphNode("a");
        var b = new GraphNode("b");
        var c = new GraphNode("c");
        a.connect(b);
        b.connect(c);
        var colors = List.of("red", "green", "blue");

        solve(List.of(a, b, c), colors);

        assertThat(b.color).isIn(colors);
        var remaining = colors.stream().filter(color -> !color.equals(b.color)).toList();
        assertThat(a.color).isIn(remaining);
        assertThat(c.color).isIn(remaining);
    }

    @Test
    void colorsATriangleWithThreeDistinctColors() {
        var a = new GraphNode("a");
        var b = new GraphNode("b");
        var c = new GraphNode("c");
        a.connect(b);
        b.connect(c);
        c.connect(a);

        solve(List.of(a, b, c), List.of("red", "green", "blue"));

        assertThat(List.of(a.color, b.color, c.color)).doesNotHaveDuplicates().doesNotContainNull();
    }

    @Test
    void nodeWithLoopCannotBeColored() {
        var a = new GraphNode("a");
        a.neighbors.add(a);

        assertThatIllegalArgumentException().isThrownBy(() -> solve(List.of(a), List.of("red", "green")));
    }
}
