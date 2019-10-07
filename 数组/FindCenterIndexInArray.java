/*
    输入:
        nums = [1, 7, 3, 6, 5, 6]
        输出: 3
        解释:
        索引3 (nums[3] = 6) 的左侧数之和(1 + 7 + 3 = 11)，与右侧数之和(5 + 6 = 11)相等。
        同时, 3 也是第一个符合要求的中心索引。
*/
public class FindCenterIndexInArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        Solution solution = new Solution();
        solution.pivotIndex(nums);
    }
}
class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (leftSum(nums, i) == rightSum(nums, i)) {
                System.out.println(i);
                return i;
            }
        }
                System.out.println(-1);
        return -1;
    }

    //索引左边和
    public int leftSum(int[] nums, int index) {
        if (index <= 0 || index >= nums.length)
            return 0;
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += nums[i];
        }
        return sum;
    }

    //索引右边和
    public int rightSum(int[] nums, int index) {
        if (index < 0 || index >= nums.length - 1)
            return 0;
        int sum = 0;
        for (int i = index + 1; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}

