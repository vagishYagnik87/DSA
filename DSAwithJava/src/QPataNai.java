import java.util.*;


class RandomShit implements Comparable<RandomShit> {
    @Override
    public int compareTo(RandomShit o) {
        return 0;
    }
}
public class QPataNai {

    class Pair {
        public int first;
        public int second;
    }

    public boolean solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int eSum = 0, oSum = 0;
        for (int i=0; i<n; i++) {
            if (i%2 == 0) eSum += arr[i];
            else oSum += arr[i];
        }

        int currESum = 0, currOSum = 0;
        for (int i=0; i<n; i++) {
            if (i % 2 == 0) {
                eSum -= arr[i];
                if (currESum + oSum == currOSum + eSum) {
                    return true;
                }
                currESum += arr[i];
            } else {
                oSum -= arr[i];
                if (currESum + oSum == currOSum + eSum) {
                    return true;
                }
                currOSum += arr[i];
            }
        }
        Queue<Integer> q = new PriorityQueue<>();
        q.add(1);
        q.remove(1);
        Integer
        return false;
    }
}
