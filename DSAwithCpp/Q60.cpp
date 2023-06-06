// https://leetcode.com/problems/count-and-say/description/
class Solution {
public:
    string countAndSay(int n) {
        string number = "1";
        for (int i = 2; i <= n; i++) {
            int index = 0;
            string newNumber = "";
            while (index < number.length()) {
                int freq = 0;
                char ch = number[index];
                while (index < number.length() && number[index] == ch) {
                    freq++;
                    index++;
                }
                newNumber.push_back(freq + '0');
                newNumber.push_back(ch);
            }
            number = newNumber;
        }
        return number;
    }
};