package Tasks1_2_3;

import java.util.Arrays;

/**
 * Created by Guillaume Gingembre on 06/03/2017.
 */
public final class ArraysUtils {
    /* a util class:
    takes no variable;
    cannot be inherited from, so is final;
    we cannot create it, so it has a private constructor;
    contains only static methods;
     */

    // static methods of HW2

    public static int  sum(int [ ] value)  //method definition to find sum
    {
        int i, total = 0;
        for(i=0; i<value.length; i++)
        {
            total += value[ i ];
        }

        return (total);
    }

    public static int  min(int [ ] value)  //method definition to find sum
    {
        int i, total;
        total = value [0];
        for(i=0; i<value.length; i++)
        {
            if (value [i] < total) {total = value[ i ];}
        }

        return (total);
    }

    public static int  max(int [ ] value)  //method definition to find sum
    {
        int i, total;
        total = value [0];
        for(i=0; i<value.length; i++)
        {
            if (value [i] > total) {total = value[ i ];}
        }

        return (total);
    }

    public static int maxPositive(int [ ] value)  //method definition to find max positive
    {
        int i, total;
        total = value [0];
        for(i=0; i<value.length; i++)
        {
            if (value [i] > total && value[i] > 0) {total = value[ i ];}
        }

        if (total > 0) {return total;}
        else {return 0;}
    }

    public static double  multiplication(int [ ] value)  //method definition to find product
    {
        int i;
        double total;
        total = 1;
        for(i=0; i<value.length; i++)
        {
            total *= value [i];
        }
        return (total);
    }

    public static int  modulus(int [ ] value)  //method definition to find modulus
    {
        int i, j, total;
        i = value [0];
        j = value [value.length-1];
        total = i%j;

        return (total);
    }

    public static int secondLargest(int [ ] value)  //method definition to find second largest
    {
        int i, total, largest;
        total = value [0];
        largest = max (value);
        for(i=0; i<10; i++)
        {
            if ((value [i] > total)&&(value[i]<largest)) {
                total = value[ i ];
            }
        }

        return (total);
    }

    // New static methods
    public static int[] reverse(int[] array){
        int [] newArray = new int[array.length];
        int j = array.length -1;

        for (int i = 0; i<array.length; i++) {
            newArray[j - i] = array[i];
        }
        return newArray;
    }

    public static int[] addElement(int[] a, int e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }

    public static int[] findEvenElements(int[] array){
        int[] evenArray = new int[0];
        for (int i = 0; i<array.length; i++){
            if((array[i]%2)==0) {
                evenArray = addElement(evenArray,array[i]);
            }
        }
        return evenArray;
    }

    // private constructor
    private ArraysUtils() {}
}