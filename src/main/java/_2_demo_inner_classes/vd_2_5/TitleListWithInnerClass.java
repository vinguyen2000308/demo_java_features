package _2_demo_inner_classes.vd_2_5;

import java.util.ArrayList;
import java.util.Iterator;

public class TitleListWithInnerClass {
    private final ArrayList<String> titleList = new ArrayList<>();

    public void addTitle(String title) {
        titleList.add(title);
    }

    public void removeTitle(String title) {
        titleList.remove(title);
    }

    public Iterator<String> titleIterator() {
        // An anonymous class
        Iterator<String> iterator =
                new Iterator<String>() {
                    int count = 0;

                    @Override
                    public boolean hasNext() {
                        return (count < titleList.size());
                    }

                    @Override
                    public String next() {
                        return titleList.get(count++);
                    }
                }; // Anonymous inner class ends here

        return iterator;
    }
}
