package site.gaoyisheng.testExtends;

public class StaticFatherB extends Object{

	    static
	    {
	        System.out.println("Load B");
	    }
	    public StaticFatherB()
	    {
	        System.out.println("Create B");
	    }

}
