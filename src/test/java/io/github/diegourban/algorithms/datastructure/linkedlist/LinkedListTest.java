package io.github.diegourban.algorithms.datastructure.linkedlist;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.datastructure.Element;
import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    void shouldAddAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtStart(new Element("diego"));
        linkedList.addAtStart(new Element("paulo"));
        linkedList.addAtStart(new Element("josé"));

        assertThat(linkedList.get(0).getName()).isEqualTo("josé");
        assertThat(linkedList.get(1).getName()).isEqualTo("paulo");
        assertThat(linkedList.get(2).getName()).isEqualTo("diego");
    }

    @Test
    void shouldAddAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.addAtEnd(new Element("josé"));

        assertThat(linkedList.get(0).getName()).isEqualTo("diego");
        assertThat(linkedList.get(1).getName()).isEqualTo("paulo");
        assertThat(linkedList.get(2).getName()).isEqualTo("josé");
    }

    @Test
    void shouldAddAtTheMiddle() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.add(1, new Element("josé"));

        assertThat(linkedList.get(0).getName()).isEqualTo("diego");
        assertThat(linkedList.get(1).getName()).isEqualTo("josé");
        assertThat(linkedList.get(2).getName()).isEqualTo("paulo");
    }

    @Test
    void shouldShowSize() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.add(1, new Element("josé"));

        assertThat(linkedList.size()).isEqualTo(3);
    }

    @Test
    void shouldRemoveFromStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.addAtEnd(new Element("josé"));
        linkedList.removeFromStart();

        assertThat(linkedList.size()).isEqualTo(2);
        assertThat(linkedList.get(0).getName()).isEqualTo("paulo");
        assertThat(linkedList.get(1).getName()).isEqualTo("josé");
    }

    @Test
    void shouldRemoveFromEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.addAtEnd(new Element("josé"));
        linkedList.removeFromEnd();

        assertThat(linkedList.size()).isEqualTo(2);
        assertThat(linkedList.get(0).getName()).isEqualTo("diego");
        assertThat(linkedList.get(1).getName()).isEqualTo("paulo");
    }

    @Test
    void shouldRemoveFromMiddle() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.addAtEnd(new Element("josé"));
        linkedList.remove(1);

        assertThat(linkedList.size()).isEqualTo(2);
        assertThat(linkedList.get(0).getName()).isEqualTo("diego");
        assertThat(linkedList.get(1).getName()).isEqualTo("josé");
    }

    @Test
    void shouldContainElement() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.addAtEnd(new Element("josé"));

        assertThat(linkedList.contains(new Element("diego"))).isTrue();
    }

    @Test
    void shouldNotContainElement() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.addAtEnd(new Element("josé"));

        assertThat(linkedList.contains(new Element("jabiraca"))).isFalse();
    }

    @Test
    void shouldPrint() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.addAtEnd(new Element("josé"));

        assertThat(linkedList).hasToString("[diego,paulo,josé,]");
    }
}
