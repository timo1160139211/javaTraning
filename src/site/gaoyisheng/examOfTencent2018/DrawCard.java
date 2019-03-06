package site.gaoyisheng.examOfTencent2018;

import java.util.Scanner;
import java.util.Arrays;
 
//idea 1: 先排序，从大到小，奇数项和-偶数项的和。
//idea 2: 或者每次从数组中找出一个最大的，与前一个做 差or和。
 
public class DrawCard {
 
    public static void main(String args[]) {
//  public int fun() {
         
        //输入保存
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        int i = 0;
         
        while(i<n&&sc.hasNext()) {
            array[i] = sc.nextInt();
            i++;
        }
         
        //1 排序；
        /*
        int temp = 0;
        for(i = 0; i < n; i++) {
            for(int j = i; j < n - 1;j++) {
                if(array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        */
        Arrays.sort(array);
         
        //2做差：从左到右(大到小)做差/和      or 奇数项和 - 偶数项和；
        int temp =0;//temp重用为记录差值。
        for(i = 0; i < n;i++) {
            if(i%2 == 0){
                temp += array[i];
            }else {
                temp -= array[i];
            }
            //System.out.println(array[i] + " ");
        }
        System.out.println(Math.abs(temp));
        //return ;//temp;
    }
 
}