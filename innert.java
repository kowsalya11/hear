public class InsertionSortDemo {

    public static void main(String args[]) {
        // unsorted integer array
        int[] unsorted = {32, 23, 45, 87, 92, 31, 19};
        System.out.println("integer array before sorting : " + Arrays.toString(unsorted));
        insertionSort(unsorted);
        System.out.println("integer array after sorting  : " + Arrays.toString(unsorted));
    }


    /*
     * Sort integer array using Insertion sort algorithm.
     * only good for small array.
     */
    public static void insertionSort(int[] unsorted) {
        for (int i = 1; i < unsorted.length; i++) {
            int j = i;
            while (j > 0 && unsorted[j] < unsorted[j - 1]) {
                //swap
                int temp = unsorted[j - 1];
                unsorted[j - 1] = unsorted[j];
                unsorted[j] = temp;
                j--;
            }
        }
    }

}