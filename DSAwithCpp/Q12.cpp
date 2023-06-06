class Solution {
public:
    int getMinDiff(int arr[], int n, int k) {
        // code here
        sort(arr, arr + n);
        multiset<int> sortedOrder;
        int border = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= k) {
                if (border == -1) border = i;
                sortedOrder.insert(arr[i] - k);
            }
            else {
                sortedOrder.insert(arr[i] + k);
            }
        }

        if (border == -1) {
            return *(--sortedOrder.end()) - *(sortedOrder.begin());
        }
        int ans = *(--sortedOrder.end()) - *(sortedOrder.begin());
        while (border < n) {
            auto itr = sortedOrder.find(arr[border] - k);
            sortedOrder.erase(itr);
            sortedOrder.insert(arr[border] + k);
            ans = min(ans, *(--sortedOrder.end()) - *(sortedOrder.begin()));
            border++;
        }
        return ans;
    }
};