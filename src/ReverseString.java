public class ReverseString {

    public static int main(int[] args) {
        return 0;
    }
    public static void main(String[] args) {
        String str = "abcdefghi";
        for(int i = str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
}
