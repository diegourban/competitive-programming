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
     * Compares this element with another by name.
     *
     * @param obj the object to compare with
     * @return {@code true} if {@code obj} is an element with an equal name, {@code false} otherwise (including
     *     {@code null} and objects of other types)
     */
    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof final Element other)) {
            return false;
        }
        return other.getName().equals(this.getName());
    }

    /**
     * Returns a hash code consistent with {@link #equals(Object)}: elements with equal names hash alike.
     *
     * @return the hash code of the name
     */
    @Override
    public int hashCode() {
        return this.getName().hashCode();
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
