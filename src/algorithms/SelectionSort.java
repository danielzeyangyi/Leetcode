package algorithms;

public class SelectionSort {
    // int[] with size n
    public void selectionSort (int arr[], int n ) {

        int global; // record global min
        for (int i = 0; i < n - 1; i++) { // first iterate through arr
            global = i;
            for (int j = i + i; j < n; j++) { // second iterate through unsorted remaining
                if (arr[j] < arr[global]) {
                    global = j; // get global min
                }
            }
            // swap position global min front
            int tmp = arr[i];
            arr[i] = arr[global];
            arr[global] = tmp;
        }

        // Time: O(n^2)  Space: O(1)
    }
}
