import java.util.ArrayList;
import java.util.List;

public class WaterMachine extends SuperMachine {
    List<BottleOfWater> waterBottles = new ArrayList<>();
    void initProduct(List<BottleOfWater> waterBottles) {
        this.waterBottles = waterBottles;

    }

    @Override
    public String getProduct(String cName) {
        for (BottleOfWater p : waterBottles) {
            if (p.getName().equals(cName)) return p.toString();
        }
        return "not found";
    }


}