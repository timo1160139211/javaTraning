/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Q19_PrintMatrixCircle
 * Author:   gaoyisheng
 * Date:     19-4-1 下午8:50
 * Description: print matrix circle
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package site.gaoyisheng.aimToOffer66;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈print matrix circle〉
 *
 * @author gaoyisheng
 * @create 19-4-1
 * @since 1.0.0
 */
public class Q19_PrintMatrixCircle {

    public ArrayList<Integer> printMatrix(int[][] array) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (array.length == 0) {
            return result;
        }
        int n = array.length, m = array[0].length;
        if (m == 0) {
            return result;
        }
        //这个是层数
        int layers = (Math.min(n, m) - 1) / 2 + 1;
        for (int i = 0; i < layers; i++) {
            //左至右
            for (int k = i; k < m - i; k++) {
                result.add(array[i][k]);
            }
            //右上至右下
            for (int j = i + 1; j < n - i; j++) {
                result.add(array[j][m - i - 1]);
            }
            //右至左
            for (int k = m - i - 2; (k >= i) && (n - i - 1 != i); k--) {
                result.add(array[n - i - 1][k]);
            }
            //左下至左上
            for (int j = n - i - 2; (j > i) && (m - i - 1 != i); j--) {
                result.add(array[j][i]);
            }
        }
        return result;
    }
}
/**
 * Q:
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * A:
 * 解题思路：顺时针打印就是按圈数循环打印，一圈包含两行或者两列，
 * 在打印的时候会出现某一圈中只包含一行，
 * 要判断从左向右打印和从右向左打印的时候是否会出现重复打印，
 * 同样只包含一列时，要判断从上向下打印和从下向上打印的时候是否会出现重复打印的情况
 *
 */
