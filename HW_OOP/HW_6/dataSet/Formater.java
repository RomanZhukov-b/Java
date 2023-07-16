import org.example.Java.HW_OOP.HW_6.data.FoneBook;
import org.example.Java.HW_OOP.HW_6.data.User;

import java.util.List;

public interface Formater {
    FoneBook formatPdf(FoneBook foneBook);
    FoneBook formatJson(FoneBook foneBook);
}