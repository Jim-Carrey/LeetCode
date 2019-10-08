/*      在一个给定的数组nums中，总是存在一个最大元素 。
        查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
        如果是，则返回最大元素的索引，否则返回-1。

        输入: nums = [1, 2, 3, 4]
        输出: -1
        解释: 4没有超过3的两倍大, 所以我们返回 -1.
*/

public class DominantIndex {

    public static void main(String[] args) {

        int[] nums = {0,0,3,2};
        Solution1 solution = new Solution1();
        solution.dominantIndex(nums);

    }

}

class Solution1{
    public int dominantIndex(int[] nums) {
        int biggestIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>nums[biggestIndex]){
                biggestIndex = i;
            }
        }
        for (int i = 0; i < nums.length ; i++) {
            if (i==biggestIndex) continue;
            if (!(nums[biggestIndex]>=2*nums[i])){
                System.out.println(-1);
                return -1;
            }
        }
        System.out.println(biggestIndex);
        return biggestIndex;
    }
}
