package urban.common.data_structure.set;

import urban.common.data_structure.Element;

import java.util.LinkedList;
import java.util.List;

public class Set {

    private List<LinkedList<String>> table = new LinkedList<LinkedList<String>>();

    public Set() {
        for(int i = 0; i < 26; i++) {
            this.table.add(new LinkedList<String>());
        }
    }

    public void add(String word) {
        if(!contains(word)) {
            int index = calculateTableIndex(word);
            List<String> list = this.table.get(index);
            list.add(word);
        }
    }

    public void remove(String word) {
        if(contains(word)) {
            int index = calculateTableIndex(word);
            List<String> list = this.table.get(index);
            list.remove(word);
        }
    }

    private boolean contains(String word) {
        int index = calculateTableIndex(word);
        return this.table.get(index).contains(word);
    }

    private int calculateTableIndex(String word) {
        return word.toLowerCase().charAt(0) % 26;
    }

    @Override
    public String toString() {
        return this.table.toString();
    }
}
