import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {

        // Creating an array list
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add elements
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("Sorted ArrayList: " + arrayList);

        // Using the shuffle() method
        Collections.shuffle(arrayList);
        System.out.println("ArrayList using shuffle: " + arrayList);

    }
}