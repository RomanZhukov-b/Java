public class HotBeverages  extends Goods{


    private final int temperature;
    public HotBeverages(String name, int cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

     @Override
    public String toString() {
        return name + " temperature " + temperature + " price " + cost;
    }
}