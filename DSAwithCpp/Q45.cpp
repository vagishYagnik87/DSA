// https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
//User function template for C++
class Solution {
public:
	int rowWithMax1s(vector<vector<int> > arr, int n, int m) {
		// code here
		int column = m - 1, row = 0, ans = -1;
		while (column >= 0 && row < n) {
			if (arr[row][column] == 1) {
				column--;
				ans = row;
			}
			else {
				row++;
			}
		}
		return ans;
	}
};