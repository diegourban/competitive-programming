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

        private GraphNode(final String label) {
            this.label = label;
        }

        private void connect(final GraphNode other) {
            neighbors.add(other);
            other.neighbors.add(this);
        }
    }

    static void solve(final List<GraphNode> graph, final List<String> colors) {
        for (final var node : graph) {
            if (node.neighbors.contains(node)) {
                throw new IllegalArgumentException("Legal coloring impossible for node with loop: " + node.label);
            }
            final var illegalColors = new HashSet<String>();
            for (final var neighbor : node.neighbors) {
                if (neighbor.color != null) {
                    illegalColors.add(neighbor.color);
                }
            }
            for (final var color : colors) {
                if (!illegalColors.contains(color)) {
                    node.color = color;
                    break;
                }
            }
        }
    }

    @Test
    void colorsAPathWithoutNeighborClashes() {
        final var a = new GraphNode("a");
        final var b = new GraphNode("b");
        final var c = new GraphNode("c");
        a.connect(b);
        b.connect(c);
        final var colors = List.of("red", "green", "blue");

        solve(List.of(a, b, c), colors);

        assertThat(b.color).isIn(colors);
        final var remaining =
                colors.stream().filter(color -> !color.equals(b.color)).toList();
        assertThat(a.color).isIn(remaining);
        assertThat(c.color).isIn(remaining);
    }

    @Test
    void colorsATriangleWithThreeDistinctColors() {
        final var a = new GraphNode("a");
        final var b = new GraphNode("b");
        final var c = new GraphNode("c");
        a.connect(b);
        b.connect(c);
        c.connect(a);

        solve(List.of(a, b, c), List.of("red", "green", "blue"));

        assertThat(List.of(a.color, b.color, c.color)).doesNotHaveDuplicates().doesNotContainNull();
    }

    @Test
    void nodeWithLoopCannotBeColored() {
        final var a = new GraphNode("a");
        a.neighbors.add(a);

        assertThatIllegalArgumentException().isThrownBy(() -> solve(List.of(a), List.of("red", "green")));
    }
}
