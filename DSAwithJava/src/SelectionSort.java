public class SelectionSort {
    public void solve(int[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + ", ");
        } System.out.println();
    }
}
