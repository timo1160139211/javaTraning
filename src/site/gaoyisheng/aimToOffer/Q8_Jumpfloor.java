package site.gaoyisheng.aimToOffer;

public class Q8_Jumpfloor {
	static int[] fibArry = { 0, 1, 2 };
	public static void main(String[] args) {
			System.out.println( ":" + JumpFloor(3));
	}


	public static int JumpFloor(int n){
		if (n < 0) return 0;
		if (n < 3) return fibArry[n];
		
	    return JumpFloor(n - 1) + JumpFloor(n - 2);
	}

}

/**
 * 
 * Q:
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * 
 * A:
 * 比较倾向于找规律的解法，f(1) = 1, f(2) = 2, f(3) = 3, f(4) = 5，  
 * 可以总结出f(n) = f(n-1) + f(n-2)的规律，
 * 但是为什么会出现这样的规律呢？
 * 假设现在6个台阶，我们可以从第5跳一步到6，这样的话有多少种方案跳到5就有多少种方案跳到6，
 * 另外我们也可以从4跳两步跳到6，跳到4有多少种方案的话，
 * 就有多少种方案跳到6，其他的不能从3跳到6什么的啦，
 * 
 * 所以最后就是f(6) = f(5) + f(4)；
 * 这样子也很好理解变态跳台阶的问题了。
 * 
 */