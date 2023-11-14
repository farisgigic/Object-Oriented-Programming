import java.util.Arrays;


public class Methods {
    public static int findSmallest(int[] array) {
        int smallest = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for(int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestStartingFrom(int[] array, int startIndex) {
        int smallestIndex = startIndex;
        for(int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        if (index1 >= array.length || index2 >= array.length || index2 < 0 || index1 < 0) {
            System.out.println("Invalid input");
        } else {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    public static void printElegantly(int[] array) {
        for(int i = 0; i <array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            }else {
                System.out.print(", " + array[i]);
            }
        }
    }


    public static void main(String[] args) {


    }
}