public class FrequencyFinder {
    public static void main(String[] args) {
        String str = "abashdbfsgfrgfdsbdbsdvcyuseraqfsgdcxxmnbv";
        int []fre = new int[500];
        for(int i = 0;i<str.length();i++){
            fre[str.charAt(i)]++;
        }
        
       for(int i =0;i<str.length();i++){
           if(fre[str.charAt(i)] != 0){
           System.out.print("Frequency of "+str.charAt(i)+" "+fre[str.charAt(i)]);
               System.out.println();
           fre[str.charAt(i)]=0;
           }
       }
    }
    
}

