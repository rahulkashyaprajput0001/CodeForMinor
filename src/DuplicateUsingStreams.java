import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateUsingStreams {
    public static void main(String[] args) {
        printDuplicateFruits();
    }

    private static void printDuplicateFruits() {
        List<String> fruits = Arrays.asList("apple", "bnana", "orange", "grapes", "apple", "litchi", "bnana");

        Set<String> duplicateFruits = fruits.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println("Duplicate fruits: " + duplicateFruits);
    }

}
