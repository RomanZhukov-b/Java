import java.util.ArrayList;

public class SnackMachine extends SuperMachine {
    ArrayList<Snacks> allSnacks = new ArrayList<>();

    void initSnacks(ArrayList<Snacks> snacks) {
        this.allSnacks = snacks;
    }

    @Override
    public String getProduct(String cName) {
        for (Snacks p : allSnacks) {
            if (p.getName().equals(cName)) return p.toString();
        }
        return "not found";
    }


}