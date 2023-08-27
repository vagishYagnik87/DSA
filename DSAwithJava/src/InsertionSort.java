public class InsertionSort {
    public void solve(int[] array) {
        for (int length = 2; length < array.length; length++) {
            int start = 0, end = length - 1;
            while (end > 0 && array[end] < array[end-1]) {
                int temp = array[end];
                array[end] = array[end-1];
                array[end-1] = temp;
                end--;
            }
        }

        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + ", ");
        } System.out.println();
    }
}
