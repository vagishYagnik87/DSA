// https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
class Solution {
public:
    void findPath(vector<vector<int>>& m, vector<vector<bool>>& visited, int row, int col, int n, vector<string>& ans, string& currPath) {
        if (row >= n || col >= n || row < 0 || col < 0) return;
        if (m[row][col] == 0 || visited[row][col]) return;

        visited[row][col] = true;
        if (row == n - 1 && col == n - 1) {
            ans.push_back(currPath);
        }
        else {
            currPath.push_back('R');
            findPath(m, visited, row, col + 1, n, ans, currPath);
            currPath.pop_back();
            currPath.push_back('D');
            findPath(m, visited, row + 1, col, n, ans, currPath);
            currPath.pop_back();
            currPath.push_back('L');
            findPath(m, visited, row, col - 1, n, ans, currPath);
            currPath.pop_back();
            currPath.push_back('U');
            findPath(m, visited, row - 1, col, n, ans, currPath);
            currPath.pop_back();
        }
        visited[row][col] = false;
        return;
    }
    vector<string> findPath(vector<vector<int>>& m, int n) {
        // Your code goes here
        vector<string> ans;
        vector<vector<bool>> visited(n, vector<bool>(n, 0));
        string currPath = "";
        findPath(m, visited, 0, 0, n, ans, currPath);
        return ans;
    }
};