package site.gaoyisheng.reflection;

import java.lang.reflect.*;

public class TestReflection {

	    public static void main(String[] args) {
	        try {
	            Class c=Class.forName("java.util.ArrayList");
	            Method m[]=c.getDeclaredMethods();
	            System.out.println(m.length);
	            for (int i = 0; i < m.length; i++) {
	                System.out.println(m[i].toString());
	            }
	        } catch (Throwable e) {
	            System.err.println(e);
	        }
	    }

}
