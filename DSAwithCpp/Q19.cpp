class Solution {
public:
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    long long int findInversions(long long arr[], long long start, long long end, long long temp[]) {
        if (start == end) return 0;
        long long mid = start + (end - start) / 2;
        long long leftInversion = findInversions(arr, start, mid, temp);
        long long rightInversion = findInversions(arr, mid + 1, end, temp);
        long long i = start, j = mid + 1, k = 0, ans = 0;
        while (i <= mid && j <= end) {
            if (arr[i] > arr[j]) {
                temp[k++] = arr[j++];
            }
            else {
                ans += (j - mid - 1);
                temp[k++] = arr[i++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
            ans += end - mid;
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        for (int i = start; i <= end; i++) {
            arr[i] = temp[i - start];
        }
        return leftInversion + rightInversion + ans;
    }
    long long int inversionCount(long long arr[], long long N)
    {
        // Your Code Here
        long long extra[N];
        return findInversions(arr, 0, N - 1, extra);
    }

};