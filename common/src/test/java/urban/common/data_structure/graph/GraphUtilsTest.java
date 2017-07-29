package urban.common.data_structure.graph;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
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
}
