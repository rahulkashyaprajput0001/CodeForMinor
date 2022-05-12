public class MethodOverloading {

    void method1(String str){
        System.out.println("1");
    }
    void method1(Object obj){
        System.out.println("2");
    }
    public static void main(String[] args) {

        MethodOverloading m =  new MethodOverloading();
        m.method1(null);
    }
}
