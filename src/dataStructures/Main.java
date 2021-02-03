package dataStructures;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        // Part 1
        int[] randomArray = {1, 2, 3, 4, 5};
        System.out.printf("Sum of array: %d\n", sumArray(randomArray));

        // Part 2
        double[] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i< exampleArray.length; i++){
            if (exampleArray[ i ] > maximum) {
                maximum = exampleArray[ i ];
                index = i;
            }
        }
        System.out.println("Index: " + index);
    }

    public static int sumArray (int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static int[] toPower (int size, int power) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            result[i] = (int) Math.pow(size, power);
        }
        return result;
    }
}
