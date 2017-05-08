package urban.common.data_structure;

public class Element {

    private String name;

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        Element other = (Element) obj;
        return other.getName().equals(this.getName());
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
