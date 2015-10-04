package kakeru_201510;

abstract class abs{
	//抽象类允许拥有构造器，但是抽象类无法生成实例
	abs(){}
	
	//也可以定义普通方法
	void method01(int a){}
	//定义抽象方法，抽象方法没有方法体，所以不谢大括号{}
	abstract void method01();
	
	//下面定义报错，final定义的方法无法被覆盖，因此abstract不可以和final一起使用
	//private的方法对外部相当于隐藏类，无法被覆盖，所以不可以使用
	//private abstract void method01();
	//final abstract void method01();
}


interface inter{
	//※接口没有构造器，不可以生成实例
	
	//接口中field必须为静态常量 切连接控制符为public
	//public final static省略时，系统会自动添加
	int b =1000;
	public static final int a=100;
	
	//抽象方法必须为public 省略时自动添加
	public abstract void method01();
	
	//不可以定义普通类
	//void method01(int a){}
}

public class classInterface extends abs implements inter{
	//同事继承父类和安装接口的时候，extends卸载前
	//只可以继承一个父类，但恶意安装多个借口 如 implements iter01,inter02
	
	//当接口和抽象类中方法定义重复时，只需要重写一个，如本例abs 和 inter都定义有method01()
	//因此在实现类中只要重写一个method01方法即可
	public void method01(){
		//调用接口中的常量
		System.out.println(inter.b + inter.a);
	}
	public void method02(){
		System.out.println("方法method02");
	}
	
	public static void main(String[] args){
		inter ob01 = new classInterface();
		ob01.method01();
		
		abs ob02 = new classInterface();
		ob02.method01();
		
		classInterface ob03 = (classInterface)ob01;
		ob03.method02();
	}
}
