import java.util.ArrayList;
import java.util.List;

public class HotBeveragesMachine extends SuperMachine{
    List<HotBeverages> hotBeverages = new ArrayList<>();
    void initProduct(List<HotBeverages> hotBeverages) {
        this.hotBeverages = hotBeverages;

    }

    @Override
    public String getProduct(String cName) {
        for(HotBeverages el: hotBeverages) {
            if (el.getName().equals(cName)) return el.toString();
        }
        return "not found";
    }
}