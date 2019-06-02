import java.util.Arrays;

public class kth_smallest_unsorted_array {
    public static int[] kSmallest(int[] arr, int k) {
        if (arr.length == 0 || k == 0) {
            return new int[0];
        }

        //selected kth smallest in the arr
        quickSelect(arr, k, arr.length - 1, k - 1);

        //copy first kth item of array
        int[] result = Arrays.copyOf(arr, k);
        Arrays.sort(result);
        return result;
    }

    public static void quickSelect(int[] arr, int left, int right, int target) {
        int mid = partition(arr, left, right);
        if (mid == target) {
            return;
        } else if (target < mid) {
            quickSelect(arr, left, mid - 1, target);
        } else {
            quickSelect(arr, mid + 1, right, target);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int start = left;
        int end = right - 1;
        while (start <= end) {
            if (array[start] < pivot) {
                start++;
            } else if (array[end] > pivot) {
                end--;
            } else {
                swap(array, start++, end--);
            }
        }
        swap(array, start, right);
        return start;
    }

    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = b;
        array[b] = tmp;
    }
}


