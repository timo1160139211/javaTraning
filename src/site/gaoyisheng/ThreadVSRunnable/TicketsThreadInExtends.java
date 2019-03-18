package site.gaoyisheng.ThreadVSRunnable;

class MyThreadExt extends Thread{
	
	private int ticketsCount = 5;//剩余票数
	private String name;//窗口,也就是线程的名称。
	
	public MyThreadExt(String s) {
		this.name = s;
	}
	
	@Override
	public void run() {
		
		while(ticketsCount > 0) {
			ticketsCount--;//如果还有票，则卖出1
			System.out.println(name + "卖了一张票，剩余票数为: "+ticketsCount);
		}
		
	}
}

public class TicketsThreadInExtends extends Thread {

	public static void main(String[] args) {
		
		//创建三个线程来卖票
		MyThreadExt mt1 = new MyThreadExt("窗口1");
		MyThreadExt mt2 = new MyThreadExt("窗口2");
		MyThreadExt mt3 = new MyThreadExt("窗口3");
		
		//开始卖票：启动线程
		mt1.start();
		mt2.start();	
		mt3.start();
		
		/*
		 * 
		 * 
窗口3卖了一张票，剩余票数为: 4
窗口2卖了一张票，剩余票数为: 4
窗口2卖了一张票，剩余票数为: 3
窗口2卖了一张票，剩余票数为: 2
窗口1卖了一张票，剩余票数为: 4
窗口2卖了一张票，剩余票数为: 1
窗口3卖了一张票，剩余票数为: 3
窗口2卖了一张票，剩余票数为: 0
窗口1卖了一张票，剩余票数为: 3
窗口3卖了一张票，剩余票数为: 2
窗口1卖了一张票，剩余票数为: 2
窗口1卖了一张票，剩余票数为: 1
窗口1卖了一张票，剩余票数为: 0
窗口3卖了一张票，剩余票数为: 1
窗口3卖了一张票，剩余票数为: 0

		 * 
		 */
	}
}
