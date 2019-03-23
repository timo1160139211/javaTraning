package site.gaoyisheng.aimToOffer66;

public class Q13_ReorderArrayOddBeforeEven {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
		
		reOrderArray(a);
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

	
    public static void reOrderArray(int [] array) { 

    	int temp =0;
    	boolean flag = true;
    	for(int i = 0;flag && i < array.length;i++) {
    		flag = false;
    		for(int j = 0;j < array.length - i - 1;j++) {
    			if(array[j]%2==0 && array[j+1]%2==1) {
    				temp = array[j];
    				array[j] = array[j+1];
    				array[j+1] = temp;
    				flag = true;
    			}
    		}
    	}
    }
}

/**
 * 
 * Q:
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * 
 * A:
 * 1：类似于冒泡排序，前偶后奇就交换两个位置
 * 
 * 2:辅助数组：先扫所有奇数加到数组，在扫所有偶数加到数组。
 * 
 * 
 * 
 */
