import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter up to 5 Integers: \r");
        int [] mainArray = getIntegers(5);

        printArray(mainArray);
        mainArray = sortArray(mainArray);
        printArray(mainArray);

    }

    public static int[] getIntegers(int integer){
        int [] array = new int [integer];
        for(int i =0; i <array.length ; i++){
            int in = input.nextInt();
            array[i] = in;
        }

        return array;
    }

    public static void printArray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("\r");
    }
    public static int[] sortArray(int[] array){
        int temp =0;
        for(int i =0; i<array.length; i++){
            for(int j =0; j< array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
