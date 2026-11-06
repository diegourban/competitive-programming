package io.github.diegourban.algorithms.datastructure;

/**
 * A named value stored by the data structures in this package. Two elements are equal when their names are equal.
 */
public class Element {

    private final String name;

    /**
     * Creates an element with the given name.
     *
     * @param name the element's name
     */
    public Element(final String name) {
        this.name = name;
    }

    /**
     * Returns the element's name.
     *
     * @return the name given at construction
     */
    public String getName() {
        return name;
    }

    /**
     * Compares this element with another by name. The argument is cast without a type check, so passing an object
     * that is not an {@code Element} fails with a {@code ClassCastException}. {@code hashCode} is not overridden.
     *
     * @param obj the object to compare with; must be an {@code Element} or {@code null}
     * @return {@code true} if {@code obj} is an element with an equal name, {@code false} if {@code obj} is
     *     {@code null}
     */
    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        final Element other = (Element) obj;
        return other.getName().equals(this.getName());
    }

    /**
     * Returns the element's name.
     *
     * @return the name, same as {@link #getName()}
     */
    @Override
    public String toString() {
        return this.getName();
    }
}
