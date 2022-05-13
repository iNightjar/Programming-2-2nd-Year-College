package programming2;
import java.util.*;
public class chapter5_1D {
    /*
    // seleciton sort
    public static int[] selectionSort(int [] list){
        for (int i = 0 ; i < list.length -1 ;i++)
        {
            int currentMin = list[i];
            int currentMinIndex = i ;
            for (int j = i + 1; j<list.length;j++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // swap list[i] with list[curerntMinIndex] if necessary
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] list = {22,32,3,1,2,4,35,33,87,34,99,3};
        System.out.println(selectionSort(list));
    } */

    /*
    // using binary search to find the key in the list
    public static boolean BinarySearch(int [] list , int key) {
        int low = 0 ;
        int high = list.length -1 ;
        while (high >= low ){
            int mid  = (low + high) /2 ;
            if (key < list[mid])
                high = mid -1;
            else if (key == list[mid])  return true;
            else low = mid + 1;
        }
        return false ; // now high  < low, key is not found
    }
    // BinarySearch
    public static void main(String[] args) {
        int [] list = {1,2,3,4,5};
        int key = 5;
        System.out.println(BinarySearch(list, key));
    } */

    // LinearSearch
    /*public static int Linearsearch(int[] list , int key) {
        for (int i = 0; i < list.length; i++){
            if (key == list[i])
                return i;
    }
        return -1;
    } */

    /*public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No arguement passed");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i <numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i];
        System.out.println("the max value is " + result);
    }
    // VarArgsDemo
    public static void main(String[] args) {
        printMax(34,3,3,2,56.5);
        printMax(new double[]{1,2,3});
    }*/
    /*
    // CountLettersInArray

    //Display counts
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + "  " + (char) (i + 'a'));
            else System.out.print(counts[i] + " " + (char) (i + 'a') + " ");
        }
    }

    // Count the occurences of each letter
    public static int[] countLetters(char[] chars){
        // declare and create an array fo 26 int
        int [] counts = new int[26];

        // for each lowercase letter in the array, count it
        for (int i =0 ; i < chars.length;i++)
            counts[chars[i] - 'a']++;
        return counts;
    }

    // Display the array of characters
    public static void displayArray(char [] chars)
    {// display the characters in the array 20 on each line
        for (int i = 0 ; i < chars.length;i++)
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else System.out.print(chars[i] + " ");
    }

    // Generate a random character between ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    // Generate a random lowercase letter
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

     // create array of characters
    public static char[] createArray(){
        // delcare an array of characters and create it
        char[] chars = new char[100];
         // create a lowercase letters randomly and assign them  to the array
        for(int i = 0 ;i<chars.length;i++)
            chars[i] = getRandomLowerCaseLetter();
        // Return the array
        return chars;
    }

    // Main Method
    public static void main(String[] args) {
        // declare and create an array
        char[] chars = createArray();
        // display the array
        System.out.println("The lowercase letters are:");
        displayArray(chars);
        // count the occurences of each letter
         int [] counts = countLetters(chars);
         // Display counts
        System.out.println();
        System.out.println("the occurencees of each letter are: ");
        displayCounts(counts);
    }*/

    /*
    //TestPass Array
    // swap the first two elements in array
    public static void swapFristTwoInArray(int[] array)
    {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
    // swap two variables
    public static void swap(int number1, int number2)
    {
        int temp = number1;
        number1 = number2;
        number2 = temp;
    }
    // Main method,
    public static void main(String[] args) {
        int [] arrayOfTwoElements = {1,2};
        // swap elements using the swap method
        System.out.println("Before invoking swap");
        System.out.println("Array is { " +arrayOfTwoElements[0] + ", " + arrayOfTwoElements[1] + " }");
        swap(arrayOfTwoElements[0] , arrayOfTwoElements[1]);
        System.out.println("After invoking");
        System.out.println("Array is { " +arrayOfTwoElements[0] + ", " + arrayOfTwoElements[1] + " }");

        System.out.println();
        System.out.println();


        // swap elements using the swapFirstTwoInArray method
        System.out.println("Before invoking swapFirstTwoInArray method");
        System.out.println("Array is { " +arrayOfTwoElements[0] + ", " + arrayOfTwoElements[1] + " }");
        swapFristTwoInArray(arrayOfTwoElements);
        System.out.println("After invoking");
        System.out.println("Array is { " +arrayOfTwoElements[0] + ", " + arrayOfTwoElements[1] + " }");
    } */
    // a way to copy array
    /*
    int [] sourceArray = {2,,3,4,5};
    int[] targetArray = new int[sourceArray.length];
    for (int i=0 ; i<sourceArray.length;i++){
            targetArray [i] = sourceArray[i];
     }
     */
    /*
    // DeckOfCards
    public static void main(String[] args) {
        int[] deck   = new int[52];
        String [] suits = {"Spades", "Hearts", "Diamonds","Clubs"};
        String [] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack"
        ,"Queen","King"};
        // Initialize the cards
        for (int i = 0 ; i<deck.length;i++)
            deck[i] = i;
        // shuffle the cards
        for (int i = 0 ; i<deck.length;i++) {
            // generate an index randomly
            int index = (int) (Math.random() * deck.length);
            //System.out.println(deck[index]);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
            //System.out.println(deck[i]);
        }
        // print the deck elments's values
        for(int i=0 ; i< deck.length;i++)
            System.out.println(deck[i]);
         // display the first four cards
        for (int i  = 0 ; i < 4 ; i++){
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + " :: " +
                    rank + " of " + suit);
        }

    }*/
    /*
    // analyze Numbers

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0 ;
        System.out.println("Enter the Numbers");
        for (int i= 0 ; i< n;i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        double average = sum / n;
        int count = 0 ;
        for (int i = 0; i < n ; i++)
            if (numbers[i] > average)
                count ++ ;
        System.out.println("Avarega is : " + average  );
        System.out.println("Number of elements above the average is : " + count);
        }*/

    /*
    // print array elements
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array length");
        int length = input.nextInt();
        System.out.println();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter Number");
            array[i] = input.nextInt();
            System.out.println("array element is : " + array[i]);
            System.out.println();
        } */
}