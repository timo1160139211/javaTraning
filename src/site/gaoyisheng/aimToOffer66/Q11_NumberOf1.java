package site.gaoyisheng.aimToOffer66;

public class Q11_NumberOf1 {

	static int i = 0;
	public static void main(String[] args) {
		System.out.println(NumberOf1(15));
		
		//使用n=10,二进制形式为1010，则1的个数为2；
		int n = -10;
		System.out.println(n + "的二进制中1的个数：" + NumberOf1(n)); 
	}
	
	public static int NumberOf1(int n) {
		int count = 0;
		while(n != 0) {
			++count;
			n = (n - 1) & n;
		}
		
		return count;
	}
	
}


/**
 * 
 * Q:
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 链接：https://www.nowcoder.com/questionTerminal/8ee967e43c2c4ec193b040ea7fbb10b8
 * 
 * A:
 * 
 */



