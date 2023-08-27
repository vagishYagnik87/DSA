//{ Driver Code Starts
//Initial Template for Java
// https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
import java.io.*;
import java.util.*;

public class Q21 {
    public class GFG {

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(br.readLine().trim());
            while (tc-- > 0) {
                String[] inputLine;
                inputLine = br.readLine().trim().split(" ");
                int n = Integer.parseInt(inputLine[0]);
                int k = Integer.parseInt(inputLine[1]);
                int[] arr = new int[n];
                inputLine = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(inputLine[i]);
                }
                int ans = new Solution().getPairsCount(arr, n, k);
                System.out.println(ans);
            }
        }
    }

// } Driver Code Ends


//User function Template for Java

    private static class Solution {
        int getPairsCount(int[] arr, int n, int k) {
            // code here
            Map<Integer, Integer> freq = new HashMap<>();
            int ans = 0;
            for (int num: arr) {
                if (freq.containsKey(k - num)) {
                    ans += freq.get(k-num);
                }
                if (freq.containsKey(num)) {
                    freq.put(num, freq.get(num) + 1);
                } else {
                    freq.put(num, 1);
                }
            }
            return ans;
        }
    }
}
