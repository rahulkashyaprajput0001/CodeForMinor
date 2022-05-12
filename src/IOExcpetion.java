/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahul.kashyap
 */
class IOExcpetion extends Exception {
    public IOExcpetion(String ex){
        super(ex);
    }

    public static void main(String[] args) {
        try{
            throw new IOExcpetion("error");
        }catch (IOExcpetion ex){
            System.out.println(ex.getMessage());

        }
    }
    
}
