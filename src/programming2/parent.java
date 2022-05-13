package programming2;

public class parent {
    private static String  name = " is this visible to child class ? ";
   int wealth;
   public parent()
   {
       System.out.println("this is the parent constructor");
   }
   public static void print(){
       System.out.println("this is the parent class");
   }
   public static String getname()
   {
       return name;
   }
}