package dataStructures;

import java.lang.Math;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Part 1
        int[] arrayToSum = {1, 2, 3, 4, 5};
        System.out.printf("Sum of array: %d\n", sumArray(arrayToSum));

        // Part 2
        double[] exampleArray = {1, 5, 6, 5, 4, 1};
        double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i < exampleArray.length; i++){
            if (exampleArray[i] > maximum) {
                maximum = exampleArray[i];
                index = i;
            }
        }
        System.out.println("Index: " + index); // "What is the output?" Answer: 2

        // Part 3
        int size = 4;
        int power = 2;
        System.out.println("toPower Method: " + Arrays.toString(toPower(size, power))); // Arrays.toString method used to output the array as a string
    }

    // Part 1, used to sum values of a given array
    public static int sumArray (int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    // Part 3, used to produce an array of exponents of a given power to the given size
    public static int[] toPower (int size, int power) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            result[i] = (int) Math.pow(i, power);
        }
        return result;
    }
}
