/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Main
 * Author:   gaoyisheng
 * Date:     19-4-15 下午7:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package site.gaoyisheng.exam.wanmei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author gaoyisheng
 * @create 19-4-15
 * @since 1.0.0
 */
public class Main {
//    static class Node implements Comparable{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> la = new ArrayList<>();
        List<Integer> lb = new ArrayList<>();
        for (int j = 0; j < num; j++) {
            la.add(sc.nextInt());
        }
        for (int j = 0; j < num; j++) {
            lb.add(sc.nextInt());
        }

        Collections.sort(la);
        Collections.sort(lb);


        int count = 0;

        int index = getMax(lb,la.get(la.size() - 1));
        while (index != -1){
            la.remove(la.size() - 1);
            lb.remove(index);
            count ++;
            index = getMax(lb,la.get(la.size() - 1));
        }

        int maxScore = count * 100 - (num - count) * 100;
        System.out.println(maxScore);
    }

    //先做kda高的题目
    static int getMax(List<Integer> list,int maxA){
        int index = -1;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < maxA){
                index = i;
            }
        }

        return index;
    }

}
//public class Main {
//    static class Node{
//        int time = 0;
//        int score = 0;
//        float kda = 0f;
//        boolean isUsed = false;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        Node[] nodes = new Node[num];
//        for (int j = 0; j < num; j++) {
//            nodes[j] = new Node();
//        }
//
//        for(int j = 0; j < num; j++){
//            nodes[j].score = sc.nextInt();
//        }
//
//        for(int j = 0; j < num; j++){
//            nodes[j].time = sc.nextInt();
//            nodes[j].kda = nodes[j].score / nodes[j].time;
//        }
//
//        int totalTime = 0;
//        totalTime = sc.nextInt();
//
//        int maxScore = 0,currentTime = 0;
//
//        if (num == 0 || nodes == null || totalTime == 0){
//            return;
//        }
//
//        Node currentNode;
//        while (currentTime <= totalTime){
//            currentNode = getOneMax(nodes);
//            if(currentTime + currentNode.time
//                    <= totalTime){
//                maxScore += currentNode.score;
//                currentTime += currentNode.time;
//            }else if(!check(nodes)){
//                continue;
//            }else {
//                //全都试过
//                break;
//            }
//        }
//
//        System.out.println(maxScore);
//    }
//
//    //先做kda高的题目
//    static Node getOneMax(Node[] nodes){
//        int index = 0;
//        float max = 0f;
//        for (int i = 0; i < nodes.length; i++) {
//            if (!nodes[i].isUsed &&
//                    nodes[i].kda >= max){
//                index = i;
//                max = nodes[i].kda;
//            }
//        }
//
//        nodes[index].isUsed = true;
//        return nodes[index];
//    }
//
//    //全遍历一遍，返回是否全都试过了
//    static boolean check(Node[] nodes){
//        int count = 0;
//        for (int i = 0; i < nodes.length; i++) {
//            if (nodes[i].isUsed){
//                count ++;
//            }
//        }
//
//        //相等则全都试过了。
//        return count == nodes.length;
//    }
//}
