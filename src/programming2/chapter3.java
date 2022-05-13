package programming2;
import java.util.*;
public class chapter3 { /*
    public static int sumOfTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }

    public static int maxOfTwoNumbers(int number1, int number2) {
        if (number1 >= number2)
            return number1;
        else return number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = input.nextInt();
        System.out.println("Enter the second number");
        int number2 = input.nextInt();
        System.out.println("the sum of the two numbers is : " + sumOfTwoNumbers(number1, number2));
        System.out.println("the max of the two numbers: " + number1 + " and " + number2 + "   is : "
                + maxOfTwoNumbers(number1, number2));
    }
*/
   /* public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int result = max(number1, number2);
        System.out.println("the max number is : "+ result);
    }

    public static int max(int number1, int number2)
    {
        if (number1 >= number2)
            return number1;
        else return number2;
    } */
    /*public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Grade");
        double score = input.nextDouble();
        System.out.println(getGrade(score));
        printGrade(score);
    }
    public static String getGrade(double score)
    {
        if (score < 0  || score>100) {
            return "Invalid input";
        }
        if (score >= 90.0)
           return "A";
        else  if (score >= 80.0 )
            return "B";
        else if(score >= 70.0)
            return "C";
        else if(score >= 60.0)
            return "D";
        else return "F";
    }
    public static void printGrade(double score){
        if (score < 0  || score>100) {
            System.out.println("Invalid input");
            return;
        }
        if (score >= 90.0)
            System.out.println('A');
        else  if (score >= 80.0 )
            System.out.println('B');
        else if(score >= 70.0)
            System.out.println('C');
        else if(score >= 60.0)
            System.out.println('D');
        else System.out.println('F');
    }*/

    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter message u wanna print");
        String line = input.nextLine();
        System.out.println("enter number of times u wanna print this message");
        int number = input.nextInt();
        messagePrinting(line,number);
    }
    public static void messagePrinting(String line , int times)
    {
        for (int i = 0; i<times ;i++)
            System.out.println(line);
    }*/
    /*public static void main(String [] args)
    {
        int x = 1;
        System.out.println("before the call, x is " + x);
        increament(x);
        System.out.println("after the call, x is " + x);
    }
    public static void increament(int n){
        n++;
        System.out.println("inside the method n is : " + n);
        //return n;
    }*/

    /*public static void swap(int number1,int number2)
    {
        System.out.println("inside swap method");
        System.out.println("before swaping");
        System.out.println("first number: "+ number1 + "  :::  second number:  " + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After swaping");
        System.out.println("first number: "+ number1 + "  :::  second number:  " + number2);
    }
    public static void main(String[]args)
    {
        int number1 = 1;
        int number2 =2;
        System.out.println("inside main method");
        System.out.println("first number: "+ number1 + "  :::  second number:  " + number2);
        swap(number1,number2);
        System.out.println("first number: "+ number1 + "  :::  second number:  " + number2);
    }*/
    /*
    // greatest common divisor between two numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        int number1 = input.nextInt();
        System.out.println("enter the second number");
        int number2 = input.nextInt();
        System.out.println(greatestCommonDivisor(number1, number2));

    }
    public static int greatestCommonDivisor(int number1, int number2)
    {
        int divisor = 2 , result = 1;
        while( divisor <= number1 && divisor <= number2)
        {
            if (number1 % divisor == 0 && number2 % divisor == 0)
                result = divisor;
            divisor++;
        }
        return result;
    }*/

    /*public static void main(String[] args) {
        System.out.println("the first 50 prime numbers are");
        printPrimeNumbers(50);
    }
    public static void printPrimeNumbers(int numberofprimes) {
        final int NUMBER_OF_PRIME_PER_LINE = 10;
        int count = 0;
        int number = 2;
        int i = 1;
        while (count < numberofprimes) {
            if (isPrime(number)) {
                count++;
                System.out.println("number(" + i + ") is: " + number);
                i++;
            }
            number++;
        }
        }

    public static boolean isPrime(int number) {
        for (int divosor = 2; divosor <= number / 2; divosor++) {
            if (number % divosor == 0)
                return false;
        }
        return true;
    }*/
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a hexadecimal number: ");
        String hexValue = input.nextLine();
        System.out.println("the decimal value for the hexadecimal number: "+
                hexValue + "  is   " + hexToDecimal(hexValue.toUpperCase(Locale.ROOT)));
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0 ; i<hex.length();i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch)
    {
        if (ch >='A' && ch <='F')
            return 10 + ch - 'A';
        else return ch - '0';
    }*/
    /*public static int maxOfTwoNumbers(int number1, int number2)
    {
        if (number1 >= number2)
            return number1;
        else return number2;
    }
    public static double maxOfTwoNumbers(double number1, double number2){
        if (number1 >= number2)
            return number1;
        else return number2;
    }
    public static double maxOfTwoNumbers(double number1, double number2, double number3){
        if (number1 >= number2)
            return number1;
        else
        {if (number2>= number3) return number2;
            else return number3;}
    }
    public static void main(String[] args) {
        System.out.println(maxOfTwoNumbers(1,2));
        System.out.println(maxOfTwoNumbers(2.3, 3.4));
        System.out.println(maxOfTwoNumbers(3.3,3.4,33.1));
        System.out.println(maxOfTwoNumbers(1,2.1));
        System.out.println(maxOfTwoNumbers(1.1,12,1.1));
    }*/
    /*public static double ambiguousOverloading(int number1, double number2)
    {
        if (number1 >= number2)
            return number1;
        else return number2;
    }
    public static double ambiguousOverloading(double number1, int number2)
    {
        if (number1 >= number2)
            return number1;
        else return number2;
    }

    public static void main(String[] args) {
        System.out.println(ambiguousOverloading(1.1,2));
        System.out.println(ambiguousOverloading(1,2.1));
    }
    */
    // randomCharacter
    /* public static char getRandomCharacter(char ch1, char ch2){
        return (char) (ch1  + Math.random() * (ch2 - ch1 + 1)   );
    }
    public static char getRandomLowerCaseCharacter(){
        return getRandomCharacter('a' , 'z');
    }
    public static char getRandomUpperCaseCharacter(){
        return getRandomCharacter('A' , 'Z');
    }
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0','9');
    }
    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000','\uFFFF');
    }
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 200;
        final int CHARS_PER_LINE = 25;
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = getRandomUpperCaseCharacter();
            if ((i + 1)%CHARS_PER_LINE ==0)
                System.out.println(ch);
            else System.out.print(ch);
        }
    }*/
    // Calender
}