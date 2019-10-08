
/*
给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

        最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

        你可以假设除了整数 0 之外，这个整数不会以零开头。
        输入: [4,3,2,1]
        输出: [4,3,2,2]
        解释: 输入数组表示数字 4321。
*/
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        Solution2 solution2 = new Solution2();
        solution2.plusOne(digits);
    }
}

class Solution2 {
    public int[] plusOne(int[] digits) {
        int[] box = new int[digits.length+1];
        for (int i = 0; i <digits.length ; i++) {
            box[i+1] = digits[i];
        }

        int i = 1;
        while (box[box.length-i]+1==10){
            box[box.length-i] = 0;
            ++i;
        }
        box[box.length-i] = box[box.length-i]+1;

        System.out.print("[");
        if ((box[0]==0)) {
            for (int j = 1; j < box.length-1; j++) {
                System.out.print(box[j]+",");
            }
            System.out.print(box[box.length-1]+"]");
        }else {
            for (int j = 0; j < box.length-1; j++) {
                System.out.print(box[j]+",");
            }
            System.out.print(box[box.length-1]+"]");
        }
        return box;
    }
}