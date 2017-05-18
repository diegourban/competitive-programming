package urban.common.data_structure.vector;

import org.junit.Test;
import urban.common.data_structure.Element;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VectorTest {

    @Test
    public void test() {
        Element e1 = new Element("Joao");
        Element e2 = new Element("Jose");

        Vector vector = new Vector();
        vector.add(e1);
        vector.add(e2);

        assertThat(vector.size(), is(2));
        assertThat(vector.contains(e1), is(true));

        Element e3 = new Element("Mario");
        vector.add(1, e3);
        assertThat(vector.contains(e3), is(true));
        assertThat(vector.size(), is(3));

        vector.remove(1);

        for(int i = 0; i < 300; i++) {
            Element e = new Element("Element " + i);
            vector.add(e);
        }
        System.out.println(vector);
    }
}
