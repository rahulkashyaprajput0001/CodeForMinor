public class NUsingRecursion {
    
    
    public static void main(String[] args) {
        nUsingRec(40, 1);
    }

    public static void nUsingRec(int num, int i) {

        if (num + 1 == i) {
            return;
        }
        System.out.println(i);

        nUsingRec(num, i + 1);

    }
}
