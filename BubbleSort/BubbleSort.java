
package bubblesort;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    // Bubble Sort algorithm implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        do {
            swapped = false;
            int i = 0;

            do {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
                i++;
            } while (i < n - 1);
            
            n--; // Reduce the size of the unsorted subarray
        } while (swapped);
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
