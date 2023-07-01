public class Snacks extends Goods {
    private final int calories;

    public Snacks(String name, int cost, int calories) {
        super(name, cost);
        this.calories = calories;
    }


    @Override
    public String toString() {
        return name + " price " + cost + " calories " + calories;
    }
}