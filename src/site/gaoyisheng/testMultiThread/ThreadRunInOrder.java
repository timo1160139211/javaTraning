package site.gaoyisheng.testMultiThread;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.*;

public class ThreadRunInOrder {

    //两种方法：
    //1.  join方法，改变执行顺序。
    //2.  线程池，顺序调用。

    public static void main(String[] args) throws InterruptedException{


        final Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " 1 ");
                }catch (Exception e){

                }

            }
        },"_A");

        final Thread t2 = new Thread(() -> {
            try {
                //t1.join();
                System.out.println(Thread.currentThread().getName() + " 2 ");
            }catch (Exception e){

            }

        },"_B");

        final Thread t3 = new Thread(() -> {
            try {
                //t2.join();
                System.out.println(Thread.currentThread().getName() + " 3 ");
            }catch (Exception e){

            }

        },"_C");

        t1.run();
        t2.run();
        t3.run();



//        不确定，未掌握
//        LinkedBlockingQueue<Thread> q = new LinkedBlockingQueue<>();
//        q.put(t1);
//        q.put(t2);
//        q.put(t3);
//
//        while (!q.isEmpty()){
//            q.take().run();
//        }



        ExecutorService es =Executors.newSingleThreadExecutor();
        es.submit(t1);
        es.submit(t2);
        es.submit(t3);

        if(!es.isShutdown()){
            es.shutdown();
        }
    }

}
