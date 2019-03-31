package site.gaoyisheng.exam.shenceData.kuaishou;


import java.util.ArrayList;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (in.hasNext()){
            list.add(in.nextInt());
        }

        int i = 0;
        boolean flag = false;
        while(i < list.size()-1){
            if((i+1)%2 == 0){

                i++;
            }else {


                i++;
            }

        }

        if(flag){
            System.out.println("True");
        }else{
            System.out.println("False");
        }



    }
}

/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();

            int result = 0;

            if(a < 0){
                a = Math.abs(a);
            }
            if(a > 0){
                while(a != 0){
                    if(a % 2 == 1){
                        result ++;
                    }
                    a = a >> 1;

                }
            }



            System.out.println(result);
        }
    }
}



/*
import java.util.Scanner;

public class Main {

    static int x;
    static int y;
    static int limitKey;

    static int panel[][];
    static boolean[][] visited;

    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        limitKey = sc.nextInt();

        //init
        panel = new int[x][y];
        for(int i = 0; i < x; i++){
            for (int j = 0; j < y; j++ )
                panel[i][j] = getNum(i,j);
        }

        //work
        visited = new boolean[x][y];
        System.out.println(count(0,0));
    }


    public static int count(int r,int c){
        if (check(r,c) || visited[r][c] || panel[r][c] > limitKey)  return 0;
        visited[r][c] = true;
        return count(r - 1,c) + count(r,c - 1)
                + count(r + 1,c) + count(r,c + 1) + 1;
    }

    public static boolean check(int i, int j){
        return (i < 0 || i >= x || j < 0 || j >= y);
    }

    public static int getNum(int i, int j){
        int result = 0;
        while(i != 0 && j != 0){
            if(i != 0) {
                result += i % 10;
                i /= 10;
            }
            if (j != 0){
                result += j % 10;
                j /= 10;
            }
        }
        return result;
    }
}
*/