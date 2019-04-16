/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Main
 * Author:   gaoyisheng
 * Date:     19-4-16 下午7:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package site.gaoyisheng.exam.safe360;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author gaoyisheng
 * @create 19-4-16
 * @since 1.0.0
 */
public class Main{
    /**
     题目描述：
     构建HASH表，HASH表大小为hashsize，
     键值key为正整数，hash函数表达为key%hashsize，
     求解最大桶深和对应等于该桶深的所有桶的索引值及桶中key值

     输入
     输入为

     hashsize/key

     格式，其中hashsize为正整数，key值可以是单个数字，数字区间等(如果key值重复的话要进行去重处理)

     输出
     输出为

     maxdepth-index-key

     (如果bucket有多个重复的值，输出第一个即可)

     (key多个时，使用空格分隔)


     样例输入
     4/1-20,100
     样例输出
     6-0-100 20 16 12 8 4
     */
    static class Index{
        int length = 0;
        int indexKey = 0;
        Node head;
        Node tail;
    }

    static class Node{
        int key;
        int value;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] strs = str.split("/");
        int hashSize = Integer.valueOf(strs[0]);


        Index[] hashTable = new Index[hashSize];
        for (int i = 0; i < hashSize; i++) {
            hashTable[i] = new Index();
        }

        int maxdepth = 0;
        int index = 0;
        int key = 0;

        //
        for (int i = 0; i < 10; i++) {



        }

        StringBuilder sb = new StringBuilder();

        sb.append(maxdepth)
                .append("-")
                .append(index)
                .append("-")
                .append(key)
                .append(" ");

        for (int i = 0; i < hashSize; i++) {
            sb.append(" " + hashTable[i].indexKey);
        }


        System.out.println(sb.toString());




    }

}

/**
 * 判断可修改一个的非递减数列。
 */
/*
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        do{
            String str = sc.nextLine();
            String[] strs = str.split(" ");

            int count = 0;

            for(int i = 0; i < strs.length - 1; i++){
                if(Integer.valueOf(strs[i]) > Integer.valueOf(strs[i + 1])){
                    count ++;
                }
            }

            if(count > 1){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }

        }while(sc.hasNextLine());

    }

}
 */