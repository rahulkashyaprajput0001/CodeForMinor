public class staticConcept {

     int a=0;
   static int b=1;
    public static void cal()
    {
        System.out.println("hiii");
        System.out.println();
    }
    public static void pri(int i)
    {   if(i==1)
        System.out.println("yehqwdhv");
    }
     public static void pri(int i,int y)
    {   if(i==1)
        System.out.println("hhhh");
    }
    public static void main(String[] args) {
       
        staticConcept obj =  new staticConcept();
        obj.a++;
        obj.b++;
        System.out.println(obj.a++);
         System.out.println(obj.a++);
        obj.cal();
        staticConcept.cal();
        staticConcept.pri(1);
        staticConcept.pri(1, 9);
        
    }
    
}
