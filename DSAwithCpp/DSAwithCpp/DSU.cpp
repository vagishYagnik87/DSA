#include <iostream>
#include <unordered_map>
using namespace std;
class DSU {
	unordered_map<int, int> parent;
public:
	int findParent(int node) {
		if (parent[node] < 0) return node;
		int nodeParent = findParent(parent[node]);
		parent[node] = nodeParent;
		return nodeParent;
	}
	void performUnion(int a, int b) {
		int aParent = findParent(a);
		int bParent = findParent(b);
		int aNodes = -1 * parent[aParent];
		int bNodes = -1 * parent[bParent];
		if (aNodes > bNodes) {
			parent[bParent] = aParent;
			parent[aParent] = -1 * (aParent + bParent);
		}
		else {
			parent[aParent] = bParent;
			parent[bParent] = -1 * (aParent + bParent);
		}
		return;
	}
	void addElement(int a) {
		parent[a] = -1;
	}
	bool isConnected(int a, int b) {
		if (findParent(a) == findParent(b)) return true;
		return false;
	}
};
int main() {
	DSU dsu;
	dsu.addElement(1);
	dsu.addElement(2);
	dsu.addElement(3);
	dsu.addElement(4);
	dsu.addElement(5);
	dsu.addElement(6);
	dsu.addElement(7);


}