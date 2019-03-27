package site.gaoyisheng.ExamOfTongCheng;

import java.util.Scanner;

public class Main{
    protected String str;
    //内部线程类
    private class SThread extends Thread {

        String apd;

        SThread(String s){
            apd = s;
        }

        @Override
        public void run() {
            synchronized (str){
                str += apd;
            }
        }
    }


    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        Main m = new Main();
        m.str = cin.nextLine();

        m.new SThread("_A").start();
        m.new SThread("_B").start();
        m.new SThread("_C").start();

        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(m.str);

    }
}
