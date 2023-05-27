//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

public class Q4 {
// } Driver Code Ends
//User function template for Java

    public static class Solution
    {
        public static void sort012(int a[], int n)
        {
            // code here
            int left = 0, right = n-1, i = 0;
            while (i <= right) {
                switch (a[i]) {
                    case 0:
                        int temp = a[left];
                        a[left++] = a[i];
                        a[i++] = temp;
                        break;
                    case 2:
                        temp = a[right];
                        a[right--] = a[i];
                        a[i] = temp;
                        break;
                    case 1:
                        i++;
                }
            }
        }
    }

//{ Driver Code Starts.

    class GFG {
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            while(t-->0){
                int n = Integer.parseInt(br.readLine().trim());
                int arr[] = new int[n];
                String inputLine[] = br.readLine().trim().split(" ");
                for(int i=0; i<n; i++){
                    arr[i] = Integer.parseInt(inputLine[i]);
                }
                Solution ob= new Solution();
                ob.sort012(arr, n);
                StringBuffer str = new StringBuffer();
                for(int i=0; i<n; i++){
                    str.append(arr[i]+" ");
                }
                System.out.println(str);
            }
        }
    }


// } Driver Code Ends
}
