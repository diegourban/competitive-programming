package io.github.diegourban.algorithms.datastructure.graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class GraphUtilsTest {

    @Test
    void shouldColorGraph() {
        GraphNode a = new GraphNode("a");
        GraphNode b = new GraphNode("b");
        GraphNode c = new GraphNode("c");

        a.addNeighbor(b);
        b.addNeighbor(a);
        b.addNeighbor(c);
        c.addNeighbor(b);

        // (a)-(b)-(c)
        List<GraphNode> graph = Arrays.asList(a, b, c);
        List<String> colors = Arrays.asList("red", "green", "blue");
        GraphUtils.colorGraph(graph, colors);

        assertThat(b.getColor()).isIn(colors);
        assertThat(a.getColor()).isNotEqualTo(b.getColor());
        assertThat(c.getColor()).isNotEqualTo(b.getColor());

        List<String> remainingPossibleColors = colors.stream().filter(color -> !color.equals(b.getColor())).collect(Collectors.toList());
        assertThat(a.getColor()).isIn(remainingPossibleColors);
        assertThat(c.getColor()).isIn(remainingPossibleColors);
    }

    @Test
    void shouldHandleNotExistingStartNode() {
        Map<String, String[]> graph = new HashMap<>();
        graph.put("Foo", new String[]{"A", "B"});
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() ->
                GraphUtils.shortestPathBfs(graph, "Bar", "Baz"));
    }

    @Test
    void shouldHandleNotExistingEndNode() {
        Map<String, String[]> graph = new HashMap<>();
        graph.put("Foo", new String[]{"A", "B"});
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() ->
                GraphUtils.shortestPathBfs(graph, "Foo", "Baz"));
    }

    @Test
    void shouldHandleNoPath() {
        Map<String, String[]> graph = new HashMap<>();
        graph.put("Foo", new String[]{"Bar"});
        graph.put("Bar", new String[]{"Foo"});
        graph.put("Baz", new String[]{"Asdf"});
        graph.put("Asdf", new String[]{"Baz"});

        assertThat(GraphUtils.shortestPathBfs(graph, "Foo", "Asdf")).isNull();
    }

    @Test
    void shouldHandleLoops() {
        Map<String, String[]> graph = new HashMap<>();
        graph.put("Foo", new String[]{"Asdf", "Bar"});
        graph.put("Asdf", new String[]{"Foo", "Bar"});
        graph.put("Bar", new String[]{"Foo", "Asdf", "Baz"});
        graph.put("Baz", new String[]{"Bar"});

        assertThat(GraphUtils.shortestPathBfs(graph, "Foo", "Baz")).isEqualTo(new String[]{"Foo", "Bar", "Baz"});
    }

    @Test
    void shouldFindRoute() {
        Map<String, String[]> graph = new HashMap<String, String[]>() {{
            put("Min", new String[]{"William", "Jayden"});
            put("William", new String[]{"Min"});
            put("Jayden", new String[]{"Min", "Amelia", "Ren"});
            put("Ren", new String[]{"Jayden"});
            put("Amelia", new String[]{"Jayden", "Adam", "Miguel"});
            put("Adam", new String[]{"Amelia", "Miguel"});
            put("Miguel", new String[]{"Amelia", "Adam"});
        }};

        assertThat(GraphUtils.shortestPathBfs(graph, "Min", "Adam")).isEqualTo(new String[]{"Min", "Jayden", "Amelia", "Adam"});
    }
}
