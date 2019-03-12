package site.gaoyisheng.map;

import java.util.HashMap;
import java.util.Map;

public class PrintMap {

	
	public static void main(String[] args) {
		/*****************************************************
		����#1 ʹ��For-Each����entries
		��������ķ��������ڴ��������¸���ȡ�ġ�������ѭ������Ҫʹ��Map�ļ���ֵʱ���Ϳ���ʹ���������
		ע�⣺For-Eachѭ����Java5������ģ�����ֻ����Java5���ϵİ汾��ʹ�á�����������map��null�Ļ���For-Eachѭ�����׳�NullPointerException�쳣�������ڱ���֮ǰ��Ӧ���ж��Ƿ�Ϊ�����á�
		*/
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		
		
		/*****************************************************
		/*
		����#2 ʹ��For-Each����keys��values
		�����ֻ��Ҫ�õ�map��keys��valuesʱ������Ա���KeySet����values����entrySet
		���������entrySet����������΢����������(��Լ��10%)���Ҵ�������
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
