package _2_demo_inner_classes.vd_2_3;

import java.util.Iterator;
// Call local inner class from other class by implementing public interface - Iterator
public class Main {
    public static void main(String[] args) {
        TitleList tl = new TitleList();
        // Add two titles
        tl.addTitle("Beginning Java 8");
        tl.addTitle("Scripting in Java");
        // Get the iterator
        Iterator iterator = tl.titleIterator();
        // Print all titles using the iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
