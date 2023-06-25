import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Map<Integer, ArrayList> dataBase = new HashMap<>();
        ArrayList<String> ourData = new ArrayList<>();
        StringBuilder ourSentence = new StringBuilder();
        try {
            String ourPath1 = System.getProperty("user.dir");
            String ourPath2 = ourPath1.concat("/db.txt");
            File ourFile = new File(ourPath2);

            String line;
            BufferedReader ourReader = new BufferedReader(new FileReader(ourFile));

            //ourReader.lines().forEach(System.out::println);

            while (ourReader.readLine() != null) {

                ourSentence.append(ourReader.readLine());
                ourSentence.append(" ");

            }


            System.out.println("File opened");

        } catch (Exception e) {
            System.out.println("Catch");
        }
