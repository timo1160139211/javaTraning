package site.gaoyisheng.map;

public class TestMap {

	public static void main(String []args) {
		java.util.HashMap map=new java.util.HashMap(); 
		map.put("name",null);
		map.put("name","Jack");
		System.out.println(map.size());
		System.out.println(map.get("name"));
	}
	
	
	/*
	 * HashMap可以插入null的key或value，插入的时候，检查是否已经存在相同的key，
	 * 	如果不存在，则直接插入，如果存在，则用新的value替换旧的value，
	 * 
	 * 第一条put语句，会将key/value对插入HashMap，
	 * 而第二条put，因为已经存在一个key为name的项，所以会用新的value替换旧的vaue，
	 * 因此，两条put之后，HashMap中只有一个key/value键值对。那就是（name，jack）。所以，size为1.
	 */
	
}
