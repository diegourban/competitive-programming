package urban.common.data_structure.set;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetTest {

    @Test
    public void shouldAdd() {
        Set set = new Set();
        set.add("Diego");
        set.add("André");
        set.add("Zuleika");
        assertEquals("[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Zuleika], [André], [], [], [Diego], [], [], []]", set.toString());
    }

    @Test
    public void shouldRemove() {
        Set set = new Set();
        set.add("Diego");
        set.add("André");
        set.add("Zuleika");
        assertEquals("[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Zuleika], [André], [], [], [Diego], [], [], []]", set.toString());
        set.remove("André");
        assertEquals("[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Zuleika], [], [], [], [Diego], [], [], []]", set.toString());
    }
}
