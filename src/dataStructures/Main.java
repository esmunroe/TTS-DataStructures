package dataStructures;

public class Main {

    public static void main(String[] args) {
        // Part 1
        int[] randomArray = {1, 2, 3, 4, 5};
        System.out.printf("Sum of array: %d", sumArray(randomArray));
    }

    public static int sumArray (int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
