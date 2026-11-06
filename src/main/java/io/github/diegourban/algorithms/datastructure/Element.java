package io.github.diegourban.algorithms.datastructure;

public class Element {

    private final String name;

    public Element(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        final Element other = (Element) obj;
        return other.getName().equals(this.getName());
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
