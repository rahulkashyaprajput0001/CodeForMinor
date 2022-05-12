import java.util.Stack;

public class FindFirstClosetChar {
    public static void main(String[] args) {
        Stack stk = new Stack();
        String str = "helloworld";
        char targetChar = 'o';
       for(int i = 0 ; i<str.length(); i++){
           if(str.charAt(i) != targetChar){
               stk.push(str.charAt(i));
           }else{
               emptyStack(stk,i+1,targetChar);
           }
       }
    }
    
   static public void emptyStack(Stack stk,int i,char targetChar){
        System.out.print(i +" " +targetChar +" is closet to-- ");
        while(!stk.isEmpty()){
            System.out.print(stk.pop()+",");
            
        }
        System.out.println();
    }
}
