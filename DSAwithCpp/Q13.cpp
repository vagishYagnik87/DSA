class Solution {
public:
    int minJumps(int arr[], int n) {
        // Your code here
        if (n == 1) return 0;
        int rightL = 0, leftL = 0, steps = 0;
        while (rightL < n - 1) {
            int maxJump = 0;
            for (int i = leftL; i <= rightL; i++) {
                maxJump = max(maxJump, arr[i] + i);
            }
            if (maxJump <= rightL) return -1;
            steps++;
            leftL = rightL + 1;
            rightL = maxJump;
        }
        return steps;
    }
};