package BigO;

public class BigO{

    // O(n + n) = O(2n) = O(n)
    public static void log1(int[] numbers){
        // O(n)
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]); // O(1)
        }

        // O(n)
        for(int number : numbers){
            System.out.println(number); // O(1)
        }
    }

    // O(n * n) = O(n^2)
    public static void log2(int[] numbers){
        // O(n * n) = O(n^2)
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]); // O(1)
            // O(n)
            for(int number : numbers){
                System.out.println(number); // O(1)
            }
        }
    }


    // O(n + m)
    public static void log3(int[] numbers, char[] strings){
        // O(n)
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]); // O(1)
        }

        // O(m)
        for(char string : strings){
            System.out.println(string); // O(1)
        }
    }


    public void greet(String[] names){
        for(int i = 0; i < names.length; i++){
            System.out.println("Hi " + names[i]);
        }
    }


////////////////// MAIN ///////////////////
    public static void main(String[] args){

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++){
            arr[i] = 1+i;
        }

        char[] strings = new char[5];
        for(int i = 0; i < strings.length; i++){
            strings[i] = (char)(65 + i);
        }

        log1(arr);
        System.out.println("---------");

        log3(arr, strings);


    }

}
