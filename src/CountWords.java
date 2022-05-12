public class CountWords {
    public static void main(String[] args) {
        String word = "hello";
        String para = "Hello hi khana kha k jaana Hello bro Hello hii";
        int count = 0;

        String arr[] = para.split(" ");
        for (String str : arr) {
            if (str.equals("Hello")) {
                count++;
            }

        }
        System.out.println(count);
    }
}
