package site.gaoyisheng.method;

public class ClassMethod {

	
	public void fun() {
		//this.xx;
		
		//报错。方法中不可以出现this指针。
		
		//类方法指的是 static 标记的方法(普通方法叫对象方法)，可以不实例化直接调用的方法，
		//如 Util.copy(xx,xx);
		
		//不带static的均为实例方法，必须先实例化才可以使用。
		
		
		/*
		下列说法正确的是（）
			A在类方法中可用this来调用本类的类方法
			B在类方法中调用本类的类方法时可直接调用
			C在类方法中只能调用本类中的类方法
			D在类方法中绝对不能调用实例方法
		*/
		//A.this指的是当前对象，类方法依附于类而不是对象this会编译出错 C.类方法中也可以调用其他类的类方法。同时可以通过创建对象来调用普通方法 D.类方法中可以创建对象，所以可以调用实例方法
	}
}
