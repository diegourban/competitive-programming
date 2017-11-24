package urban.common.data_structure.graph;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GraphUtilsTest {

    @Test
    public void shouldColorGraph() {
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

        Assert.assertThat(b.getColor(), Matchers.isIn(colors));
        Assert.assertThat(a.getColor(), Matchers.not(Matchers.equalTo(b.getColor())));
        Assert.assertThat(c.getColor(), Matchers.not(Matchers.equalTo(b.getColor())));

        List<String> remainingPossibleColors = colors.stream().filter(color -> !color.equals(b.getColor())).collect(Collectors.toList());
        Assert.assertThat(a.getColor(), Matchers.isIn(remainingPossibleColors));
        Assert.assertThat(c.getColor(), Matchers.isIn(remainingPossibleColors));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldHandleNotExistingStartNode() {
        Map<String, String[]> graph = new HashMap<>();
        graph.put("Foo", new String[]{"A", "B"});

        GraphUtils.shortestPathBfs(graph, "Bar", "Baz");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldHandleNotExistingEndNode() {
        Map<String, String[]> graph = new HashMap<>();
        graph.put("Foo", new String[]{"A", "B"});

        GraphUtils.shortestPathBfs(graph, "Foo", "Baz");
    }

    @Test
    public void shouldHandleNoPath() {
        Map<String, String[]> graph = new HashMap<>();
        graph.put("Foo", new String[]{"Bar"});
        graph.put("Bar", new String[]{"Foo"});
        graph.put("Baz", new String[]{"Asdf"});
        graph.put("Asdf", new String[]{"Baz"});

        Assert.assertThat(GraphUtils.shortestPathBfs(graph, "Foo", "Asdf"), Matchers.nullValue());
    }

    @Test
    public void shouldHandleLoops() {
        Map<String, String[]> graph = new HashMap<>();
        graph.put("Foo", new String[]{"Asdf", "Bar"});
        graph.put("Asdf", new String[]{"Foo", "Bar"});
        graph.put("Bar", new String[]{"Foo", "Asdf", "Baz"});
        graph.put("Baz", new String[]{"Bar"});

        Assert.assertThat(GraphUtils.shortestPathBfs(graph, "Foo", "Baz"), Matchers.equalTo(new String[]{"Foo", "Bar", "Baz"}));
    }

    @Test
    public void shouldFindRoute() {
        Map<String, String[]> graph = new HashMap<String, String[]>() {{
            put("Min", new String[]{"William", "Jayden"});
            put("William", new String[]{"Min"});
            put("Jayden", new String[]{"Min", "Amelia", "Ren"});
            put("Ren", new String[]{"Jayden"});
            put("Amelia", new String[]{"Jayden", "Adam", "Miguel"});
            put("Adam", new String[]{"Amelia", "Miguel"});
            put("Miguel", new String[]{"Amelia", "Adam"});
        }};

        Assert.assertThat(GraphUtils.shortestPathBfs(graph, "Min", "Adam"), Matchers.equalTo(new String[]{"Min", "Jayden", "Amelia", "Adam"}));
    }
}
