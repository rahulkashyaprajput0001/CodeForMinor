import java.util.HashSet;

public class FindSubstringWithKDistinctChar {
    public static void main(String[] args) {
        String str = "abcbaa";
        int disC=0,res =0,k=3;
        HashSet<Character> hset =  new HashSet<>();
        for(int i =0 ;i<str.length();i++){
           hset.clear();  disC=0;
            for(int j =i;j<str.length();j++){
                
                    if(!hset.contains(str.charAt(j)))
                    {
                        hset.add(str.charAt(j));
                        disC = disC+1;
                    }
                if(disC == k) {
                    System.out.println(hset);
                    res = res+1;
          
                  
                            
                }
            }
        }
        System.out.println(res);
    }
}
