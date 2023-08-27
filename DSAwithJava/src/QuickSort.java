public class QuickSort {

    private void quickSortHelper(int[] array, int start, int end) {
        if (start >= end) return;

        int lessIndex = start-1;
        for (int i=start; i<=end-1; i++) {
            if (array[i] < array[end]) {
                lessIndex++;
                int temp = array[i];
                array[i] = array[lessIndex];
                array[lessIndex] = temp;
            }
        }
        lessIndex++;
        int temp = array[end];
        array[end] = array[lessIndex];
        array[lessIndex] = temp;

        quickSortHelper(array, start, lessIndex-1);
        quickSortHelper(array, lessIndex+1, end);
    }
    public void solve(int[] array) {
        quickSortHelper(array, 0, array.length-1);
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + ", ");
        } System.out.println();
    }
}
