//{ Driver Code Starts
#include<iostream>
#include<vector>
#include <set>
using namespace std;

// } Driver Code Ends


class Solution
{
public:
    //Function to find length of longest increasing subsequence.
    int longestSubsequence(int n, int a[])
    {
        // your code here
     //   vector<int> dp(n, 0);
     //   int lis = 1;
     //   for (int i=0; i<n; i++) {
     //       int ans = 1;
     //       for (int j=i-1; j>=0; j--) {
     //           if (a[j] < a[i]) {
     //               ans = max(ans, 1+dp[j]);
     //           }
     //       }
     //       dp[i] = ans;
     //       lis = max(lis, dp[i]);
     //   }
     //   return lis;

        set<int> lastElements;
        for (int i = 0; i < n; i++) {
            if (lastElements.find(a[i]) != lastElements.end()) continue;
            set<int>::iterator it = lastElements.insert(a[i]).first;
            it++;
            if (it != lastElements.end()) {
                lastElements.erase(it);
            }
        }
        return lastElements.size();
    }
};

//{ Driver Code Starts.
int main()
{
    //taking total testcases
    int t, n;
    cin >> t;
    while (t--)
    {
        //taking size of array
        cin >> n;
        int a[n];

        //inserting elements to the array
        for (int i = 0; i < n; i++)
            cin >> a[i];
        Solution ob;
        //calling method longestSubsequence()
        cout << ob.longestSubsequence(n, a) << endl;
    }
}

// } Driver Code Ends