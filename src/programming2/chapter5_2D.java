package programming2;
import java.util.*;
public class chapter5_2D{
    /*
    // FindNearestPoints Program
    // compute the distance between two points (x1,y1) and (x2,y2);
    public static   double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2-y1)*(y2-y1));
    }
    // Main Method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers of points: ");
        int numberOfPoints = input.nextInt();
        // create an array to store points
        double [][] points = new double[numberOfPoints][2];
        System.out.println("Enter " + numberOfPoints  + " points: ");
        for (int i =0 ;i < points.length;i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        // p1 and p2 are the idicates in points' array
        int p1=0 , p2 = 1; // Initial two points
        double shortestDistence = distance(points[p1][0], points[p2][1],
                points[p2][0], points[p2][1]); // initialize shortestDistance
        // compute distance for every two points
        for (int i= 0 ;i < points.length;i++){
            for (int j= 0 ;j < points.length;j++){
                double distance = distance(points[i][0],points[i][1],points[j][0],points[j][1]); // find distance
                if (shortestDistence > distance)
                {
                    p1 = i; // update p1
                    p2 = j ; // update p2
                    shortestDistence = distance; // update distance
                }
            }
        }
        // display result
        System.out.println("the closest two points are: " + "(" + points[p1][0] +
                ", " + points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")" );
    }*/

   /*
    // passTwoDimentionalArray
    // sum of elements in a twoDimentional array
    public static int sum(int [] [] twoDimentionalArray)
    {
        int total = 0 ;
        for (int row = 0 ;row < twoDimentionalArray.length;row++)
        {
            for (int cul=0;cul < twoDimentionalArray.length;cul++)
                total += twoDimentionalArray[row][cul];
        }
        return total;
    }
    // getArray
    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        // Enter array values
        int [][] twoDimentionalArray = new int[3][4];
        System.out.println("Enter "+ twoDimentionalArray.length +  " rows and "
         + twoDimentionalArray[0].length + " columns: " );
        for (int row = 0;row<twoDimentionalArray.length;row++)
            for (int cul=  0 ; cul < twoDimentionalArray.length;cul++)
                twoDimentionalArray[row][cul] = input.nextInt();
            return twoDimentionalArray;
    }

    public static void main(String[] args) {
        int [][] twoDimentionalArray = getArray(); // get the array

        // Display the sum of elements
        System.out.println("\nsum of all elements of the Two Dimentional Array is : "
                + sum(twoDimentionalArray));
    }*/
}
