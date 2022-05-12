public class ReplaceXUsingRec {
   static StringBuffer tmp; static int i=1;
    public static void main(String[] args) {
        String st = "abxcdexef";
        rep(st);
        System.out.println(st);
    }
    static public void rep(String st){
        
        if(i< st.length()){
            if(st.charAt(i)=='x'){
            st= st.replace('x','#');
                System.out.println(st.charAt(i));
            }
            i=i+1;
            rep(st);
        }
        //System.out.println(st);
    }

    
}
