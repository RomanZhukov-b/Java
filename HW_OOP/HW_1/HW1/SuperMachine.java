import java.util.ArrayList;
import java.util.List;

public abstract class SuperMachine implements VendingMachine2{
    List<Goods> products = new ArrayList<>();
    @Override
    public String getProduct(String cName) {
        for (Goods p : products) {
            if (p.getName().equals(cName)) return p.toString();
        }
        return "not found";
    }

}