package urban.common.data_structure.vector;

import org.junit.Test;
import urban.common.data_structure.Element;

import java.util.ArrayList;
import java.util.List;

public class VectorTest {

    @Test
    public void test() {
        Element e1 = new Element("Joao");
        Element e2 = new Element("Jose");

        Vector vector = new Vector();
        vector.add(e1);
        vector.add(e2);

        System.out.println(vector);
        System.out.println(vector.contains(e1));

        Element e3 = new Element("Mario");
        System.out.println(vector.contains(e3));

        vector.add(1, e3);
        System.out.println(vector);

        vector.remove(1);
        System.out.println(vector);

        for(int i = 0; i < 300; i++) {
            Element e = new Element("Element " + i);
            vector.add(e);
        }
        System.out.println(vector);

        // arraylist is similar
        List<Element> list = new ArrayList<>();
    }
}
