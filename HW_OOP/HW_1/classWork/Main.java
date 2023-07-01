import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendMachine = new VendingMachine();
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("pepsi", 42),
                new Product("cola", 70),
                new Product("choco", 92),
                new Product("chips", 142)));
        vendMachine.intProduct(products);
        System.out.println(vendMachine.getProduct("cola"));
    }
}