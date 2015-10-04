package kakeru_201510;

class father{
	//静态成员初始化顺序 静态block 声明时初值   动态block 构造器
	//因此静态常量的赋初值只能在静态block或者声明时进行
	static final int a;
	static{
		a=0;
		System.out.println("father's class is loading");
	}
	{
		
		System.out.println("father's init block");
	}
	father(){
		System.out.println("I'm father");
	}
	void method01(){
		
	}
	int method01(int a){
		//overload method01()
		//方法的过载与返回值无关 
		return a;
	}
}
class children extends father{
	static{
		System.out.println("children class is loading");
	}
	{
		System.out.println("child's init block");
	}
	children(){
		System.out.println("I'm child");
	}
	int method01(int a){
		//override super.method01(int a)
		//方法名 形参 返回值必须完全相同
		return a*a;
	}
	void method02(){}
}


public class extendsTest{
	public static void main(String[] arsg){
		//多态    编译时为父类类型  运行时为子类类型
		father ob01 = new children();
		ob01.method01();
		//因为method01(int a)倍子类覆盖，所以这里调用的是子类的方法，返回100
		ob01.method01(10);
		//无法调用子类的method02()方法,因为父类中没有此方法的定义，下面语句会报错
		//ob01.method02();
		
		//强制转换为子类类型，注意只有运行时类型为子类类型时才可以强制转换为子类类型
		children ob02 = (children)ob01;
		//转换后可以调用子类定义的method02()
		ob02.method02();
		
	}
}
