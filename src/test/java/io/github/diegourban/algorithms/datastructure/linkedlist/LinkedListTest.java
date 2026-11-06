package io.github.diegourban.algorithms.datastructure.linkedlist;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

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

    @Test
    void shouldAddAtPositionOfEmptyList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(0, new Element("diego"));

        assertThat(linkedList.size()).isEqualTo(1);
        assertThat(linkedList.get(0)).isEqualTo(new Element("diego"));
    }

    @Test
    void shouldAddAtPositionEqualToSizeAsLast() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.add(1, new Element("paulo"));

        assertThat(linkedList).hasToString("[diego,paulo,]");
    }

    @Test
    void shouldRejectGettingAMissingPosition() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));

        assertThatIllegalArgumentException().isThrownBy(() -> linkedList.get(1));
        assertThatIllegalArgumentException().isThrownBy(() -> linkedList.get(-1));
    }

    @Test
    void shouldRejectRemovingFromStartOfEmptyList() {
        assertThatIllegalStateException().isThrownBy(() -> new LinkedList().removeFromStart());
    }

    @Test
    void shouldBecomeEmptyAfterRemovingTheOnlyElementFromStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.removeFromStart();

        assertThat(linkedList.size()).isZero();
        assertThat(linkedList).hasToString("[]");
    }

    @Test
    void shouldBecomeEmptyAfterRemovingTheOnlyElementFromEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.removeFromEnd();

        assertThat(linkedList.size()).isZero();
        assertThat(linkedList).hasToString("[]");
    }

    @Test
    void shouldRemoveFirstAndLastByPosition() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.addAtEnd(new Element("josé"));

        linkedList.remove(0);
        assertThat(linkedList).hasToString("[paulo,josé,]");

        linkedList.remove(1);
        assertThat(linkedList).hasToString("[paulo,]");
        assertThat(linkedList.size()).isEqualTo(1);
    }

    @Test
    void shouldPrintEmptyList() {
        assertThat(new LinkedList()).hasToString("[]");
    }
}
