/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahul.kashyap
 */
public class sortValues {
    public static void main(String[] args) {
        int arr[] = {1, 60, -10, 70, -80, 85};
        for(int i=1;i<arr.length;i++){
            if(!(arr[i]<arr[i-1])){
                int tmp  = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = tmp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
