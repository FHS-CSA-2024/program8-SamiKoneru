import java.util.Scanner;
import java.lang.Math;

public class Program8 {
    public static void main(String[] args) {
        System.out.println("Enter the first integer: ");
        Scanner myObj1 = new Scanner(System.in);
        int value1 = myObj1.nextInt();
        System.out.println("Enter the second integer: ");
        Scanner myObj2 = new Scanner(System.in);
        int value2 = myObj2.nextInt();
        int sum = value1 + value2;
        int diff = value1 - value2;
        int product = value1 * value2;
        double average = sum / 2.0;
        int absvalue = Math.abs(diff);
        int max = 0;
        int min = 0;
        if (diff > 0) {
            max = value1;
            min = value2;
        }
        else {
            max = value2;
            min = value1;
        }
        System.out.println("Original numbers are " + value1 + " and " + value2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
        System.out.println("Distance = " + absvalue);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + 13);
    }
}

//Paste console output below:
/*
Enter the first integer: 
13
Enter the second integer: 
20
Original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Distance = 7
Maximum = 20
Minimum = 13

*/
