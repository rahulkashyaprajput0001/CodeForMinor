public class ImmutableClass
{
    public static void main(String ar[])
    {
        Employee1 e = new Employee1("ABC123");
        Employee1 e2 = new Employee1("ABC2123");
        String s1 = e.getPancardNumber();

        System.out.println("Pancard Number: " + s1);
    }
}