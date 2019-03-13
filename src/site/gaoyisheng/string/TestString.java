package site.gaoyisheng.string;

public class TestString {
	
	
	public static void main(String[] args) {
		

		testLength();
	}
	
	
	//length
	public static void testLength() {
		
		//StringBuffer  &  String
		
		/*
		 * 1.String对象不可变、StringBuffer对象可变的含义： 举个例子：String str = "aa"; str = "aa"+"bb"; 
		 *   此时str的值为"aabb"，但是"aabb"不是在开始的字符串"aa"后面直接连接的"bb"，而是又新生成了字符串"aabb"，
		 *   字符串"aa"一旦被初始化，那么它的值不可能再改变了。 
		 * 
		 * 2.StringBuffer strb = StringBuffer("aa"); 
		 *   strb.append("bb"); 此时的strb的值也为"aabb"，但是"aabb"是直接在开始的字符串"aa"后面连接的“bb”，并没有生成新的字符串。
		 *   
		  // stringbuffer是可变长度的，可通过append,insert,remove等方法改变其长度
		 */
		
		String str = "aa";
		str = "aa" + "bb";
		String s2 = "aa";
		String s3 = "aabb";
		
		StringBuffer sb = new StringBuffer("xx");
		sb.append("yy");
		
		System.out.println(str);
		System.out.println(sb.toString());
		
		System.out.println(str == s2);
		System.out.println(str == s3);
		
	}
}
