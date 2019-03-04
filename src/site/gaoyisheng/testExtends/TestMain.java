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
    	
    	
    	
    	
    	
    	//A  B
    	AB();
    	
    }
    
    public static void AB() {
        A a = new B();
        B b = new B();
        System.out.println("Result=" + a.func1(100, 50));
        System.out.println("Result=" + b.func1(100, 50));
        
        //Result=150
        //Result=150
        
        //compile  left,  run  right.
        /*
         * 其实很简单，涉及转型的题目，分为向上或者向下转型。
关键的来了，不论向上或者向下转型，都是一句话，“编译看左边，运行看右边”。也就是编译时候，会看左边引用类型是否能正确编译通过，运行的时候是调用右边的对象的方法。
就本题来说，编译时候会发现左边满足条件所以编译通过，运行时候又会调用右边也就是 class B 的方法，所以答案都是150。
         *
         */
    }
}
