package site.gaoyisheng.Converter;

import java.util.Scanner;

public class ConverseInt {
	
	Scanner sc = new Scanner(System.in);
	
	String s = sc.next();
	
	System.out.println("Integer.parseInt(new StringBuilder(s).reverse().toString())+Integer.parseInt(s)");

	sc.close();
}
