public class UserBuilderMain {
    public static void main(String[] args) {
        User user = new User.UserBuilder(1,"zayn").setUserAge("28").setUserSalary("1000000").build();
        System.out.println(user);

    }
}
