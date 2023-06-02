// https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q6 {
    public class GFG {
        public static void main (String[] args) {

            //Taking input using class Scanner
            Scanner sc=new Scanner(System.in);
            //Taking total count of testcases
            int t=sc.nextInt();
            sc.nextLine();
            while(t-->0)
            {

                int n,m;

                //taking size of array a
                n=sc.nextInt();

                //taking size of array b
                m=sc.nextInt();

                //Creating 2 array of size n and m
                int a[]=new int[n];
                int b[]=new int[m];

                //inserting elements to array a
                for(int i=0;i<n;i++)
                {
                    a[i]=sc.nextInt();
                }

                //inserting elements to array b
                for(int i=0;i<m;i++)
                {
                    b[i]=sc.nextInt();
                }
                Solution ob=new Solution();
                //calling doUnion method and printing the results
                System.out.println(ob.doUnion(a,n,b,m));
            }

        }
    }
// } Driver Code Ends


//User function Template for Java

    private static class Solution{
        public static int doUnion(int a[], int n, int b[], int m)
        {
            //Your code here
            Set<Integer> uniqueElements = new HashSet<>();
            for (int i=0; i<n; i++) {
                uniqueElements.add(a[i]);
            }
            for (int j=0; j<m; j++) {
                uniqueElements.add(b[j]);
            }
            return uniqueElements.size();
        }
    }
}
