import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableList<T extends Goods> implements Iterable, Comparable<T>{

    List<T> ourList = new ArrayList<>();


    @Override
    public Iterator iterator() {
        return new ourIterator(ourList);
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}