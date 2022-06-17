public class Factorial {
    public static void main(String[] args) {
        int prod=1,num=4;
        for (int i=2;i<=num;i++){
            prod  = prod*i;
        }
        System.out.println("prod is" + prod);
    }
}
