/*给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。

        输入:
        [
        [ 1, 2, 3,4 ],
        [ 4, 5, 6,5 ],
        [ 7, 8, 9,6 ]
        ]

        输出:  [1,2,4,7,5,3,6,8,9]*//*

class Solution {

    boolean isOdd (int num){
        if (num%2==0) return false;
        return true;
    }
    public int[] findDiagonalOrder(int[][] matrix) {

        int row = matrix.length;  //3
        int line = matrix[0].length;  //4


        int a = row*line;

        //最左最上 就往右，最左就往下，最左最下就往右，最上最右就往下
        //a = row * line
        //方向改变      奇数： a/2+1次     偶数： a/2次
        //最多循环次数  奇数： a/line      偶数:  a/line次
        if (isOdd(a)){
            for (int i = 0; i < ; i++) {
                System.out.print();
            }

        }else {


        }





           matrix[0][0];

           matrix[0][1];matrix[1][0];
           matrix[2][0];matrix[1][1];matrix[0][2];
           matrix[0][3];matrix[1][2];matrix[2][1];
           matrix[2][2];matrix[1][3];

           matrix[2][3];





        

    }
}


public class FindDiagonalOrder {
    public static void main(String[] args) {

        int[][] doubleArray = {{1,2,3,},{2,3,4,}};
        int length = doubleArray[0].length;
        System.out.println(length);

    }
}
*/
