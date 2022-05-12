import java.util.Stack;

public class FindNextgreater {
    
    public static void main(String[] args) {
        
        int arr[]= {2,5,3,1,8,13,12};
       findNextgreaterEle(arr);
    }
    
    public static void findNextgreaterEle(int arr[]){
         Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i =1 ;i<arr.length;i++){
         
            if(arr[i] < stack.peek()){
                stack.push(arr[i]);
            }else{
                while(!stack.isEmpty() && arr[i] > stack.peek() ){
                    System.out.println(stack.peek() +" "+ arr[i]);
                    stack.pop(); 
                }
                 stack.push(arr[i]);
            }
            
        }
    }
    
}
