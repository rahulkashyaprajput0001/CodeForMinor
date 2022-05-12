 class UserBuilder1 {
    public int userId;
    public String username;
    public String userSalary;
    public String userAge;

    public UserBuilder1(int userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public UserBuilder1 setUserSalary(String userSalary) {
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

    public UserBuilder1 setUserAge(String userAge) {
        this.userAge = userAge;
        return this;
    }
    public void build(){
//        User user = new User(this);
//        System.out.println(user);
//        return user;

    }
}
