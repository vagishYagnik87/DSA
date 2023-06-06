public class Q18 {
    class Solution {
        private void reverseArray(int[] nums, int s, int e) {
            while (s < e) {
                int temp = nums[s];
                nums[s++] = nums[e];
                nums[e--] = temp;
            }
        }
        public void nextPermutation(int[] nums) {
            int index = nums.length - 1;
            while (index > 0 && nums[index-1] >= nums[index]) {
                index--;
            }
            if (index == 0) {
                reverseArray(nums, 0, nums.length - 1);
                return;
            }
            index--;
            int gtIndex = nums.length - 1;
            while (nums[index] >= nums[gtIndex]) {
                gtIndex--;
            }
            int temp = nums[index];
            nums[index] = nums[gtIndex];
            nums[gtIndex] = temp;
            reverseArray(nums, index+1, nums.length - 1);
        }
    }
}
