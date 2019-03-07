package site.gaoyisheng.testExtends;

public class TestMain {
    public static void main(String[] args)
    {
        //Base base = new Son(); //�޷�ת��
        //base.method();
        //base.methodB();//The method methodB() is undefined for the type Base
    	
    	/*
    	    Base base=new Son(); �Ƕ�̬�ı�ʾ��ʽ�����������������ഴ����Son����
			base���õ�method()�������ǵ�����������д��method()������
			����ʱbase��������Base����base����methodB()ʱBase������û��������������Ա��벻ͨ����
			Ҫ����õĻ���Ҫ��ͨ��SON son=(SON)base;ǿ��ת����Ȼ����son.methodB()���þͿ����ˡ�
    	 */
    	
    	
    	
    	
    	
    	//A  B
    	AB();
    	
    	
    	
    	//StaticSonA
    	new StaticSonA();
    	
    	
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
         * ��ʵ�ܼ򵥣��漰ת�͵���Ŀ����Ϊ���ϻ�������ת�͡�
�ؼ������ˣ��������ϻ�������ת�ͣ�����һ�仰�������뿴��ߣ����п��ұߡ���Ҳ���Ǳ���ʱ�򣬻ῴ������������Ƿ�����ȷ����ͨ�������е�ʱ���ǵ����ұߵĶ���ķ�����
�ͱ�����˵������ʱ��ᷢ����������������Ա���ͨ��������ʱ���ֻ�����ұ�Ҳ���� class B �ķ��������Դ𰸶���150��
         *
         */
    }
}
