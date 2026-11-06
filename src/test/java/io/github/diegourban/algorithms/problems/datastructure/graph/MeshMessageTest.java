package io.github.diegourban.algorithms.problems.datastructure.graph;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

/**
 * MeshMessage — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/mesh-message
 * <p>
 * Breadth-first search from the sender, recording how each node was reached (which doubles as the visited set),
 * then backtrack from the recipient to rebuild the path. O(N + M) time, O(N) space.
 */
class MeshMessageTest {

    static String[] solve(Map<String, String[]> graph, String start, String end) {
        if (!graph.containsKey(start)) {
            throw new IllegalArgumentException("Start node not in graph");
        }
        if (!graph.containsKey(end)) {
            throw new IllegalArgumentException("End node not in graph");
        }
        var toVisit = new ArrayDeque<String>();
        toVisit.add(start);
        var reachedFrom = new HashMap<String, String>();
        reachedFrom.put(start, null);

        while (!toVisit.isEmpty()) {
            var current = toVisit.remove();
            if (current.equals(end)) {
                return path(reachedFrom, end);
            }
            for (var neighbor : graph.get(current)) {
                if (!reachedFrom.containsKey(neighbor)) {
                    toVisit.add(neighbor);
                    reachedFrom.put(neighbor, current);
                }
            }
        }
        return null;
    }

    private static String[] path(Map<String, String> reachedFrom, String end) {
        var path = new ArrayList<String>();
        for (var node = end; node != null; node = reachedFrom.get(node)) {
            path.add(node);
        }
        Collections.reverse(path);
        return path.toArray(String[]::new);
    }

    @Test
    void unknownSenderIsRejected() {
        var graph = Map.of("Foo", new String[] {"A", "B"});

        assertThatIllegalArgumentException().isThrownBy(() -> solve(graph, "Bar", "Baz"));
    }

    @Test
    void unknownRecipientIsRejected() {
        var graph = Map.of("Foo", new String[] {"A", "B"});

        assertThatIllegalArgumentException().isThrownBy(() -> solve(graph, "Foo", "Baz"));
    }

    @Test
    void disconnectedRecipientHasNoPath() {
        var graph = Map.of(
                "Foo", new String[] {"Bar"},
                "Bar", new String[] {"Foo"},
                "Baz", new String[] {"Asdf"},
                "Asdf", new String[] {"Baz"});

        assertThat(solve(graph, "Foo", "Asdf")).isNull();
    }

    @Test
    void loopsDoNotPreventTermination() {
        var graph = Map.of(
                "Foo", new String[] {"Asdf", "Bar"},
                "Asdf", new String[] {"Foo", "Bar"},
                "Bar", new String[] {"Foo", "Asdf", "Baz"},
                "Baz", new String[] {"Bar"});

        assertThat(solve(graph, "Foo", "Baz")).containsExactly("Foo", "Bar", "Baz");
    }

    @Test
    void findsShortestRoute() {
        var graph = Map.of(
                "Min", new String[] {"William", "Jayden"},
                "William", new String[] {"Min"},
                "Jayden", new String[] {"Min", "Amelia", "Ren"},
                "Ren", new String[] {"Jayden"},
                "Amelia", new String[] {"Jayden", "Adam", "Miguel"},
                "Adam", new String[] {"Amelia", "Miguel"},
                "Miguel", new String[] {"Amelia", "Adam"});

        assertThat(solve(graph, "Min", "Adam")).containsExactly("Min", "Jayden", "Amelia", "Adam");
    }

    @Test
    void senderIsRecipient() {
        var graph = Map.of("Foo", new String[] {});

        assertThat(solve(graph, "Foo", "Foo")).containsExactly("Foo");
    }
}
