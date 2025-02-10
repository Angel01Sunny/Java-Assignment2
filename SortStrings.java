import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Orange", "Banana", "Grape");
        
        // Sorting in descending order using a lambda expression
        Collections.sort(strings, (s1, s2) -> s2.compareTo(s1));
        
        System.out.println("Sorted Strings in Descending Order: " + strings);
    }
}