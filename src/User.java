public class User {
    private int userId;
    private String username;
    private String userSalary;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userSalary='" + userSalary + '\'' +
                ", userAge='" + userAge + '\'' +
                '}';
    }

    private String userAge;

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getUserSalary() {
        return userSalary;
    }

    public String getUserAge() {
        return userAge;
    }

    public User(UserBuilder userBuilder) {
        this.userAge = userBuilder.userAge;
        this.userId = userBuilder.userId;
        this.userSalary = userBuilder.userSalary;
        this.username = userBuilder.username;

    }
    static class UserBuilder {
        public int userId;
        public String username;
        public String userSalary;
        public String userAge;

        public UserBuilder(int userId, String username) {
            this.userId = userId;
            this.username = username;
        }

        public UserBuilder setUserSalary(String userSalary) {
            this.userSalary = userSalary;
            return this;
        }

        @Override
        public String toString() {
            return "UserBuilder{" +
                    "userId=" + userId +
                    ", username='" + username + '\'' +
                    ", userSalary='" + userSalary + '\'' +
                    ", userAge='" + userAge + '\'' +
                    '}';
        }

        public UserBuilder setUserAge(String userAge) {
            this.userAge = userAge;
            return this;
        }
        public User build(){
            User user = new User(this);
            System.out.println(user);
            return user;

        }
    }

}
