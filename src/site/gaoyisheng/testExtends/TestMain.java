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
    }
}
