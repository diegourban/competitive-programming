package urban.common.data_structure.queue;

import urban.common.data_structure.Element;

import java.util.LinkedList;

public class Queue {

    private final LinkedList<Element> elements = new LinkedList<>();

    public void add(Element element) {
        this.elements.add(element);
    }

    public Element poll() {
        return this.elements.remove(0);
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
