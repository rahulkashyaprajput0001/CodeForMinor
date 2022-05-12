public class Age implements Comparable<Age> {
    int age;

    @Override
    public String toString() {
        return "Age{" +
                "age=" + age +
                '}';
    }

    Age(int age){
        this.age = age;
    }
    @Override
    public int compareTo(Age o) {

       return o.age - this.age;

    }

}
