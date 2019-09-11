package Arrays;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args){
        // declaring an int array.
        int[] numbers0;

        //initialize int array of size 3, all values are initialized to 0 by default.
        int[] numbers1 = new int[3];

        //change values of array via index access.
        numbers1[0] = 10;
        numbers1[1] = 20;
        numbers1[2] = 30;

        //initialize int array of size 3 with pre-determined values.
        int[] numbers2 = {40, 50, 60};

        //Printing out length of array.
        System.out.println("The size of the array, numbers1, is: " + numbers1.length);

        //Printing out the contents of array.
        System.out.println("The contents in the array, numbers1, is: " + Arrays.toString(numbers1));
    }
}
