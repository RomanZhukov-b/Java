import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OurNameComporator<T extends Goods> implements Comparator<T> {
    List<T> goodsList = new ArrayList<>();
    int counter;

    public OurNameComporator(List<T> goodsList) {
        this.goodsList = goodsList;
        this.counter = 0;
    }


    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}