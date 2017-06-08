package urban.codewars.kyu7;

public class Node {

    public int data;
    public Node next = null;

    public static int getNth(Node n, int index) {
        if (n == null || index < 0) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            return n.data;
        }
        return getNth(n.next, index - 1);
    }

}
