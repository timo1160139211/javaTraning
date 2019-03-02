package site.gaoyisheng.testExtends;

public class TestMain {
    public static void main(String[] args)
    {
        //Base base = new Son(); //无法转换
        //base.method();
        //base.methodB();//The method methodB() is undefined for the type Base
    	
    	/*
    	    Base base=new Son(); 是多态的表示形式。父类对象调用了子类创建了Son对象。
			base调用的method()方法就是调用了子类重写的method()方法。
			而此时base还是属于Base对象，base调用methodB()时Base对象里没有这个方法，所以编译不通过。
			要想调用的话需要先通过SON son=(SON)base;强制转换，然后用son.methodB()调用就可以了。
    	 */
    }
}
