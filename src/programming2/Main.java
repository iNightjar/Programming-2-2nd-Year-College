package programming2;
import javax.swing.JOptionPane;
import java.sql.SQLOutput;
import java.util.Scanner;
/*public class Main {
    public static void main(String[] args) {
        int i  = 2 , j = 5;
        System.out.println("the bigger number is: " + max(i,j));
        prinsentence("welcome to java" , 5);
        System.out.println(getRandomCharacter('a' , 'z'));
    }

    public static char getRandomCharacter(char ch1 , char ch2)
    {
        return (char) (ch1 + Math.random() * (  ch2 - ch1 + 1));
    }
    public static int max(int number1 , int number2)
    {
        int result;
        if ( number1 > number2)
            result = number1;
        else result = number2;
        return result;
    }
    public static void prinsentence(String sentence , int number)
    {
        for (int i = 0 ; i < number ; i++)
            System.out.println(sentence);
    }
}
*/
/*public class Main {
    public static void main(String[] args) {
        int max = 2;
        System.out.println(max);
    }
    public static void max(int value1, int value2, int max) {
        if (value1 > value2)
            max = value1;
        else
            max = value2;
    }
} */
/*public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 4) {
            xMethod(i);
            i++;
        }
        System.out.println("i is " + i);
    }
    public static void xMethod(int i) {
        do {
            if (i % 3 != 0)
                System.out.print(i + " ");
            i--;
        }
        while (i >= 1);
        System.out.println();
    }
} */
/*public class Main {
    public static void main(String[] args){
        int sum = xMethod(5);
        System.out.println("Sum is " + sum);
    }
    public static int xMethod(int n) {
        if (n == 1)
            return 1;
        else
            return n + xMethod(n - 1);
    }
} */
/*public class Main {
    public static  void main(String[] args) {
        char character = 'A';
        System.out.println(upperCaseToLowerCase(character));
    }
    public static char upperCaseToLowerCase(char ch)
    {
        return (char) (ch + 32);
    }
} */
/*
// scanner class in java
import java.util.Scanner;
public class Main {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        System.out.println("enter a character");
        System.out.println("enter an integer number");
        System.out.println("enter an double number");
        System.out.println("enter an long number");
        // getting input from user
        String stringInput = input.nextLine(); // String input
        char character = input.next().charAt(0); // character input
        int integerNumber = input.nextInt(); // integer input
        double doubleNumber = input.nextDouble(); // double input
        long longNumber = input.nextLong(); // long input
        // printing out the inputs
        System.out.println("string is : "  + stringInput);
        System.out.println("character is :  " + character );
        System.out.println("integer number is: " + integerNumber);
        System.out.println("double numebr is : " + doubleNumber );
        System.out.println("long number is : " + longNumber);
    }
}
*/
/*
// converting from feets to meters
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter feets number");
        double feets = input.nextDouble();
        System.out.println("feets: "+ feets + " converted to meters = "+ feets*0.305);
    }
} */
// using JoptionPane.showMessageDialog with x and y variables
/*public class Main{
    public static void main(String[]args) {
        int x = 2 , y = 3 ;
        JOptionPane.showMessageDialog(null, (x + y ) + " = " + (y  + x )  );
    }
}*/
// perimeter of a triangle with it's three edges
/*public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = input.nextInt();
        if (number >0 && number < 1000) {
            int sum = 0;
            if (number / 100 >= 1)
                sum = (number / 100) + ((number / 10) % 10) + (number % 10);
            else if (number / 10 >= 1)
                sum = (number / 10) + (number % 10);
            else sum = number;
            System.out.println("the sum is : " + sum);
        }
        else System.out.println("Please enter number between 0 and 1000");
    }
}
// printing degree and sin and cos from  0 to 360
public class Main {
    public static void main(String[] args) {
        System.out.println("Degree      sin        cos");
        for (int i = 0 ; i<= 360 ; i+=10){
            System.out.printf("%d%14.4f%9.4f",i,Math.sin(i),Math.cos(i));
            System.out.println();
        }
    }
} */
