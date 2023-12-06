package Week6.Methods;

public class BinarySearch {
    public static int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while(left <= right) {
            int middle = left + (right-left)/2;

            if(array[middle] == target) {
                return middle;
            }
            if(array[middle] > target) {
                right = middle - 1;
            }
            if(array[middle] < target) {
                left = middle + 1;
            }
        }
        return -1;
    }
}

