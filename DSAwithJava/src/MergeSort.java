public class MergeSort {
    private void mergeSortUtils(int[] array, int start, int end) {
        if (start == end) return;
        int mid = (start + end)/2;
        mergeSortUtils(array, start, mid);
        mergeSortUtils(array, mid+1, end);

        int[] extraArray = new int[end - start + 1];
        int index = 0;
        int left = start, right = mid+1;
        while (left <= mid && right <= end) {
            if (array[left] < array[right]) {
                extraArray[index++] = array[left++];
            } else {
                extraArray[index++] = array[right++];
            }
        }
        while (left <= mid) {
            extraArray[index++] = array[left++];
        }
        while (right <= end) {
            extraArray[index++] = array[right++];
        }
        for (int i=0; i<extraArray.length; i++) {
            array[start++] = extraArray[i];
        }
    }
    public void solve(int[] array) {
        mergeSortUtils(array, 0, array.length-1);

        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + ", ");
        } System.out.println();
    }
}
