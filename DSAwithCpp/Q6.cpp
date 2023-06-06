// https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
class Solution {
public:
    //Function to return the count of number of elements in union of two arrays.
    int doUnion(int a[], int n, int b[], int m) {
        //code here
        map<int, int> uniqueElements;
        for (int i = 0; i < n; i++) {
            uniqueElements[a[i]]++;
        }
        for (int j = 0; j < m; j++) {
            uniqueElements[b[j]]++;
        }
        return uniqueElements.size();
    }
};