package site.gaoyisheng.ThreadVSRunnable;

class MyThreadImp implements Runnable {
	
	private int ticketsCount = 5;//剩余票数

	@Override
	public void run() {
		while(ticketsCount > 0) {
			ticketsCount--;//如果还有票，则卖出1
			System.out.println(Thread.currentThread().getName() + "卖了一张票，剩余票数为: "+ticketsCount);
		}
	}
	
}
public class TicketsThreadInImplements {

	public static void main(String[] args) {
		
		MyThreadImp mt = new MyThreadImp(); 	
		
		Thread th1 = new Thread(mt,"窗口1");
		Thread th2 = new Thread(mt,"窗口2");
		Thread th3 = new Thread(mt,"窗口3");
		
		th1.start();
		th2.start();
		th3.start();
		
		
	}
	
}
