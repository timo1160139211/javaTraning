package site.gaoyisheng.BaseDataType;

public class TypeLength {

	public static void main(String[] args) {
		short a =128;
		byte b =(byte) a;
		System.out.println(a);
		System.out.println(b);
		/*
		 *  1.short类型，a的二进制是：0000 0000 1000 0000；
			2.强制转换的截后8位，正数用源码表示，负数用补码表示，第一位是符号。
			3.因此，a截取后8位的二进制是：1000 0000，
					第一位是1，表示是一个负数，二进制的值是128，所以结果是   -128。
		 */
	}
}
