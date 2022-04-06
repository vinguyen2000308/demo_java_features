package _2_demo_inner_classes.vd_2_3;

import java.util.ArrayList;
import java.util.Iterator;
/*
*  TitleList giữ một list các string là các title
*  Nó có các method như thêm và remove.
*  Ngoài ra method titleIterator() sử dụng LOCAL INNER CLASS để có thể tạo ra iterator object và nó
*  truy cập đến titleList - private instance variable of its enclosing class
*
* */
public class TitleList {
    private final ArrayList<String> titleList = new ArrayList<>();

    public void addTitle(String title) {
        titleList.add(title);
    }

    public void removeTitle(String title) {
        titleList.remove(title);
    }

    public Iterator<String> titleIterator() {
        // A local inner class - TitleIterator
        class TitleIterator implements Iterator<String> {
            int count = 0;

            @Override
            public boolean hasNext() {
                return (count < titleList.size());
            }

            @Override
            public String next() {
                return titleList.get(count++);
            }
        } // Local Inner Class TitleIterator ends here
        // Create an object of the local inner class and return the reference
        TitleIterator titleIterator = new TitleIterator();
        return titleIterator;
    }


}
