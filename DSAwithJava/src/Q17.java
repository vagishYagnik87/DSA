import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://leetcode.com/problems/merge-intervals/description/
public class Q17 {
    class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length <= 1) return intervals;
            Arrays.sort(intervals, new java.util.Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    int result = Integer.compare(a[0], b[0]);
                    return result==0? Integer.compare(a[1], b[1]): result;
                }
            });
            int[] currentInterval = new int[2];
            currentInterval[0] = intervals[0][0];
            currentInterval[1] = intervals[0][1];
            List<List<Integer>> resultList = new ArrayList<>();
            for (int i=1; i<intervals.length; i++) {
                if (intervals[i][0] >= currentInterval[0] && intervals[i][0] <= currentInterval[1]) {
                    currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
                } else if (intervals[i][0] > currentInterval[1]) {
                    List<Integer> addMe = new ArrayList<>();
                    addMe.add(currentInterval[0]); addMe.add(currentInterval[1]);
                    resultList.add(addMe);
                    currentInterval[0] = intervals[i][0];
                    currentInterval[1] = intervals[i][1];
                }
            }
            List<Integer> addMe = new ArrayList<>();
            addMe.add(currentInterval[0]); addMe.add(currentInterval[1]);
            resultList.add(addMe);

            int[][] result = new int[resultList.size()][2];
            for (int i=0; i<resultList.size(); i++) {
                result[i][0] = resultList.get(i).get(0);
                result[i][1] = resultList.get(i).get(1);
            }

            return result;
        }
    }
}
