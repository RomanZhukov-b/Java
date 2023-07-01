import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OurPriceComporator<T extends Goods> implements Comparator<T> {
    List<T> listOfGoods = new ArrayList<>();
    int count;

    public OurPriceComporator(List<T> listOfGoods) {
        this.listOfGoods = listOfGoods;
        this.count = 0;
    }


    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getCost(), o2.getCost());
    }
}