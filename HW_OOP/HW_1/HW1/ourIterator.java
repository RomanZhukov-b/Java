import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ourIterator<T extends Goods> implements Iterator<T> {

    List<T> goodsList = new ArrayList<>();
    int count;

    public ourIterator(List<T> goodsList) {
        this.goodsList = goodsList;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < goodsList.size()-1;
    }

    @Override
    public T next() {
        if(!hasNext()) return null;
        return goodsList.get(count++);
    }
}