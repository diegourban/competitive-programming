package io.github.diegourban.algorithms.datastructure.vector;

import io.github.diegourban.algorithms.datastructure.Element;
import java.util.Arrays;

/**
 * A growable list of {@link Element}s backed by an array that starts with capacity 100 and doubles when full.
 * Positions are zero-based.
 */
public class Vector {

    private static final int INITIAL_CAPACITY = 100;

    private Element[] elements = new Element[INITIAL_CAPACITY];
    private int totalElements = 0;

    /** Creates an empty vector with capacity 100. */
    public Vector() {}

    /**
     * Appends an element, growing the backing array if needed.
     *
     * @param element the element to append
     */
    public void add(final Element element) {
        this.ensureCapacity();

        this.elements[this.totalElements] = element;
        this.totalElements++;
    }

    /**
     * Inserts an element at the given position, shifting it and later elements one position back. Position
     * {@link #size()} appends.
     *
     * @param position the zero-based position, from {@code 0} to {@link #size()}
     * @param element the element to insert
     * @throws IllegalArgumentException if {@code position} is negative or greater than {@link #size()}
     */
    public void add(final int position, final Element element) {
        if (!isInsertablePosition(position)) {
            throw new IllegalArgumentException("Invalid position");
        }

        this.ensureCapacity();
        for (int i = this.totalElements - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[position] = element;
        this.totalElements++;
    }

    private boolean isInsertablePosition(final int position) {
        return position >= 0 && position <= totalElements;
    }

    /**
     * Returns the element at the given position.
     *
     * @param position the zero-based position
     * @return the element at {@code position}
     * @throws IllegalArgumentException if {@code position} is negative or not less than {@link #size()}
     */
    public Element get(final int position) {
        if (!positionOccupied(position)) {
            throw new IllegalArgumentException("Invalid position");
        }
        return this.elements[position];
    }

    private boolean positionOccupied(final int position) {
        return position >= 0 && position < this.totalElements;
    }

    /**
     * Removes the element at the given position, shifting later elements one position forward.
     *
     * @param position the zero-based position, from {@code 0} to {@code size() - 1}
     * @throws IllegalArgumentException if {@code position} is negative or not less than {@link #size()}
     */
    public void remove(final int position) {
        if (!positionOccupied(position)) {
            throw new IllegalArgumentException("Invalid position");
        }
        for (int i = position; i < this.totalElements - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        totalElements--;
        this.elements[this.totalElements] = null;
    }

    /**
     * Tells whether the vector holds an element equal to the given one, calling {@code element.equals} on each stored
     * element.
     *
     * @param element the element to look for; must not be {@code null}
     * @return {@code true} if an equal element is found
     */
    public boolean contains(final Element element) {
        for (int i = 0; i < this.totalElements; i++) {
            if (element.equals(this.elements[i])) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns the number of elements.
     *
     * @return the number of elements in the vector
     */
    public int size() {
        return this.totalElements;
    }

    private void ensureCapacity() {
        if (this.totalElements == this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, this.elements.length * 2);
        }
    }

    /**
     * Returns the stored elements in order, in the form {@code "Vector{elements=[a, b]}"}.
     *
     * @return the string form of the vector
     */
    @Override
    public String toString() {
        return "Vector{" + "elements=" + Arrays.toString(Arrays.copyOf(elements, totalElements)) + '}';
    }
}
