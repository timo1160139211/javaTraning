package site.gaoyisheng.aimToOffer;

public class Q02_ReplaceSpace {

	public static void main(String[] args) {
		System.out.println(replaceSpace(new StringBuffer("we are happy.")));
	}
	
    public static String replaceSpace(StringBuffer str) {
    	return str.toString().replaceAll(" ","%20");
    }
}

/**
 * 
 * Q:替换空格
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 
 * A:
 * 库函数or..
 * 
 * 
 */
