package site.gaoyisheng.lockAndThread;

public class DeadLockDemo implements Runnable{

    public static int flag = 1;

    //
    static Object o1 = new Object();
    static Object o2 = new Object();

    @Override
    public void run() {
        System.out.println("flag = " + flag);
        if(flag == 1){
            synchronized (o1){
                try {
                    System.out.println("lock o1");
                    Thread.sleep(750);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println("get o2");
                }
            }
        }
        if(flag == 0){
            synchronized (o2){
                try {
                    System.out.println("lock o2");
                    Thread.sleep(750);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println("get o1");
                }
            }
        }
    }

    public static  void main(String args[]){

        DeadLockDemo t1 = new DeadLockDemo();
        DeadLockDemo t2 = new DeadLockDemo();
        t1.flag = 1;
        t2.flag = 0;
        //td1,td2都处于可执行状态，但JVM线程调度先执行哪个线程是不确定的。
        //td2的run()可能在td1的run()之前运行
        new Thread(t1).start();
        new Thread(t2).start();

    }


}
