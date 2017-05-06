package urban.common.structure.vector;

import urban.common.structure.Element;

import java.util.Arrays;

public class Vector {

    private Element[] elements = new Element[100];
    private int totalElements = 0;

    public void add(final Element element) {
        this.guaranteesSpace();

        this.elements[this.totalElements] = element;
        this.totalElements++;
    }

    public void add(final int position, final Element element) {
        if(!isPositionValid(position)) {
            throw new IllegalArgumentException("Invalid position");
        }

        this.guaranteesSpace();
        for(int i = this.totalElements - 1; i >= position; i--) {
            this.elements[i+1] = this.elements[i];
        }
        this.elements[position] = element;
        this.totalElements++;
    }

    private boolean isPositionValid(final int position) {
        return position >= 0 && position < totalElements;
    }

    public Element get(final int position) {
        if(!positionOccupied(position)) {
            throw new IllegalArgumentException("Invalid position");
        }
        return this.elements[position];
    }

    private boolean positionOccupied(final int position) {
        return position >= 0 && position < this.totalElements;
    }

    public void remove(final int position) {
        for(int i = position; i < this.totalElements; i++) {
            this.elements[i] = this.elements[i+1];
        }
        totalElements--;
        this.elements[this.totalElements] = null;
    }

    public boolean contains(final Element element) {
        for(int i = 0; i < this.totalElements; i++) {
            if(element.equals(this.elements[i])) {
                return true;
            }
        }

        return false;
    }

    public int size() {
        return this.totalElements;
    }

    private void guaranteesSpace() {
        if(this.totalElements == this.elements.length) {
            Element[] newElements = new Element[this.elements.length * 2];
            for(int i = 0; i < this.elements.length; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    @Override
    public String toString() {
        return "Vector{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
