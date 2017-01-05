package urban.codewars.kyu8;

public class Counter {

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean b : arrayOfSheeps) {
            if (b != null && b.booleanValue()) {
                count++;
            }
        }
        return count;
    }

}
