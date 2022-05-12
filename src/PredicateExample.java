import java.util.function.Predicate;
public class PredicateExample {
    public static void main(String[] args)
    {
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 20);
        Predicate<Integer> greatenthan = i -> (i > 22);
        // Calling Predicate method
        System.out.println(lesserthan.or(greatenthan).test(21));
    }
}
