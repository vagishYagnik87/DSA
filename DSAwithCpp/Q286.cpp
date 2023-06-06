// https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
class Solution
{
public:
	void permute(string& s, int index, vector<string>& permutations) {
		if (index == s.length()) {
			permutations.push_back(s);
		}
		else {
			unordered_set<char> deDup;
			for (int i = index; i < s.length(); i++) {
				if (deDup.find(s[i]) == deDup.end()) {
					swap(s[i], s[index]);
					permute(s, index + 1, permutations);
					swap(s[i], s[index]);
					deDup.insert(s[i]);
				}
			}
		}
	}
	vector<string> find_permutation(string S)
	{
		// Code here there
		vector<string> permutations;
		permute(S, 0, permutations);
		sort(permutations.begin(), permutations.end());
		return permutations;
	}
};