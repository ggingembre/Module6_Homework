package Tasks1_2_3;

import Tasks1_2_3.ArraysUtils;

import java.util.Arrays;
import java.util.Random;
//import ArrayUtils.*;

// question: how can I here import my Tasks1_2_3.ArraysUtils? The teacher did it in the webinar, but I got the error: "cannot resolve symbol arrayutils.


/**
 * Created by Guillaume Gingembre on 06/03/2017.
 */
public class ArraysUtilsTest {

    public static void main(String[] args) {

        int [ ]  myArray = new int [10];   // instantiate the array, size 10, type int
        Random rand = new Random(); // initiate the random method
        int i; // index for array
        int n; // random number, type int to keep the product smaller
        int mySum, myMin, myMax, myModulus, mySecondLargest, myMaxPos; // computed values from array
        double myProduct; // double as value can get high

        // from HW2
        for (i = 0; i < 10; i++ ) {
            n = rand.nextInt(100) -49; // generate random number of type int, positive or negative
            myArray[ i ] = n; // fill the array
        }

        System.out.println(Arrays.toString(myArray)); // print array

        mySum = ArraysUtils.sum(myArray);   // invoke method to find sum
        System.out.println("The sum is " +mySum + ".");

        myMin = ArraysUtils.min(myArray); // invoke method to find min
        System.out.println("The min is " +myMin + ".");

        myMax = ArraysUtils.max(myArray); // invoke method to find max
        System.out.println("The max is " +myMax + ".");

        myMaxPos = ArraysUtils.maxPositive(myArray);
        if (myMaxPos > 0){
            System.out.println("The maximum positive is: " + myMaxPos + ".");
        } else {
            System.out.println("There is no integer higher than 0 in this array");
        }

        myProduct = ArraysUtils.multiplication(myArray); // invoke method to find product
        System.out.println("The product is " +myProduct + ".");

        myModulus = ArraysUtils.modulus(myArray); // invoke method to find product
        System.out.println("The modulus of the first and last elements is " +myModulus + ".");

        mySecondLargest = ArraysUtils.secondLargest(myArray); // invoke method to find product
        System.out.println("The second largest elements is " +mySecondLargest + ".");

        // Testing new methods from HW6
        int[] reverseArray = new int[myArray.length];
        reverseArray = ArraysUtils.reverse(myArray);
        System.out.println("The original array is: " + Arrays.toString(myArray)+".");
        System.out.println("The reverse array is: " + Arrays.toString(reverseArray)+".");

        int[] evenArray = ArraysUtils.findEvenElements(myArray);
        System.out.println("Even elements of the array are: " + Arrays.toString(evenArray)+".");
    }
}
