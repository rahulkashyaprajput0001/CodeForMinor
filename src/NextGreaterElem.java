import java.util.Stack;

public class NextGreaterElem {
    
    
    public static void findNextGreater(int arr[]){
        Stack stk = new Stack();
        int stkTopEle,curr;
        stk.push(arr[0]);
        for(int currnetIndex = 1;currnetIndex < arr.length; currnetIndex++){
               curr = arr[currnetIndex];     
                if(arr[currnetIndex]< (int)stk.peek()){
                    stk.push(arr[currnetIndex]);
                }else{
                while(arr[currnetIndex] > (int) stk.peek()){
                        System.out.println("greater element for " + (int) stk.peek() +" -->"  + arr[currnetIndex] );
                        if(stk.isEmpty()){
                       break;
                        }
                        else{
                            stk.pop();
                            if(stk.isEmpty())
                                break;
                        }
                }
                stk.push(arr[currnetIndex]);
             }
            
        }
        
        
    }
    public static void main(String[] args) {
        int ar[]= {5,3,2,10,6,8,1,4,12,7,4};
        findNextGreater(ar);
    }
}
