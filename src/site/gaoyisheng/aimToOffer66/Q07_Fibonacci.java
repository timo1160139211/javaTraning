package site.gaoyisheng.aimToOffer66;

public class Q07_Fibonacci {
    static int[] fib = {0,1,1};
	public static void main(String[] args) {
		
		System.out.println("8:" + Fibonacci(8));
	}


    public static int Fibonacci(int n) {
        if(n < 3){
            return fib[n];
        }else{
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}


/**
 * Q:
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。n<=39
 * 
 * A:
 * 经典递归
 * 
 * 
 */

