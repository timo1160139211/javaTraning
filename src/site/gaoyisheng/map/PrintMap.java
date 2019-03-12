package site.gaoyisheng.map;

import java.util.HashMap;
import java.util.Map;

public class PrintMap {

	
	public static void main(String[] args) {
		/*****************************************************
		方法#1 使用For-Each迭代entries
		这是最常见的方法，并在大多数情况下更可取的。当你在循环中需要使用Map的键和值时，就可以使用这个方法
		注意：For-Each循环是Java5新引入的，所以只能在Java5以上的版本中使用。如果你遍历的map是null的话，For-Each循环会抛出NullPointerException异常，所以在遍历之前你应该判断是否为空引用。
		*/
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		
		
		/*****************************************************
		/*
		方法#2 使用For-Each迭代keys和values
		如果你只需要用到map的keys或values时，你可以遍历KeySet或者values代替entrySet
		这个方法比entrySet迭代具有轻微的性能优势(大约快10%)并且代码更简洁
		*/
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();

		//iterating over keys only
		for (Integer key : map1.keySet()) {
			System.out.println("Key = " + key);
		}

		//iterating over values only
		for (Integer value : map1.values()) {
			System.out.println("Value = " + value);
		}
	}
}
