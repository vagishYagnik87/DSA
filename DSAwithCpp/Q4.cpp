// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
class Solution
{
public:
    void sort012(int a[], int n)
    {
        // code here 
        int left = 0, right = n - 1, i = 0;
        while (i <= right) {
            switch (a[i]) {
            case 0:
                swap(a[left++], a[i++]);
                break;
            case 1:
                i++;
                break;
            case 2:
                swap(a[right--], a[i]);
            }
        }
    }

};