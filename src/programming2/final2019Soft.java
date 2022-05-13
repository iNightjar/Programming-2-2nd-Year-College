package programming2;
import java.util.*;
/*
Question 1 (a)
class a{
    public a(){
        System.out.println("the default constructor of a is invoked");

    }
}
class b extends a {
    public b(String s){
        System.out.println(s);
    }
}
public class final2019Soft {
    public static void main(String[] args) {
        b B = new b("the constructor of b is invoked");
    }

}
*/
/*
// Question 1 (b)
// method to reverse a String
public class final2019Soft{
    // method to reverse
    public static String reversed(String originalString)
    {
        String reversedString= "";
        int i = originalString.length() -1;
        while ( i >= 0)
        {
            reversedString += originalString.charAt(i);
            i--;
        }
        return reversedString;
    }
    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter String");
        String testString = input.nextLine();
        System.out.println(reversed(testString));
    }
}*/
/*
// Question 2 (a)
public class final2019Soft{
    public static void main(String[] args) {
        char [] x = args[0].toCharArray();
        int counter = 0;
        for (int i=0 ; i<x.length;i++) {
            if (Character.isUpperCase(x[i]))
                counter++;
        }
        //System.out.println(x);
        System.out.println("the number of uppercase letters is: " + counter);
    }
} */
/*
// Question 2 (b)
public class final2019Soft{
    public static long mulDigits(int number)
    {
        if(number / 10 == 0) return number;
        else return (number % 10 ) * mulDigits(number / 10);
    }

    public static void main(String[] args) {
        int number = 20;
        System.out.println(mulDigits(number));
    }
} */
/*
// Question 3 (a)
public class final2019Soft{
    public static boolean isAnagram(String s1, String s2)
    {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char [ ] x1 = s1.toCharArray();
        char[] x2 = s2.toCharArray();
        Arrays.sort(x1);
        Arrays.sort(x2);
        return Arrays.equals(x1,x2);
    }
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "LIstena";
        System.out.println(isAnagram(s1,s2));
    }
} */
/*
// Question 3 (b)
public class final2019Soft{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[10];
        for (int i= 0 ;i<array.length;i++)
            array[i] = input.nextInt();
        for (int i = array.length-1;i>=0;i--)
            System.out.println(array[i]);
    }
}*/