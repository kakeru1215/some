package kakeru_201510;

public class innerClass {
	int i=100;
	
//成员内部类，生命的内部类作为外部类的一个成员
	public class inner01{
		//成员内部类不可以有静态成员，下面static int o 会报错
		//private static int o;
		private int i=1000;
		private void method01(){
			//调用外部类成员   外部类名.this.成员名
			System.out.println(innerClass.this.i+this.i);
		}
	}
//静态内部类
	public static class inner02{
		//静态内部类可以有静态成员
		private static int o=10000;
		private static void method01(){}
	    private void method02(){}
    } 
	
	void localClass(){
		final int i=100;
		//本地内部类由于不是外部类成员，所以不能用成员的连接修饰符如public private等，只可以用abstracts final
		class local{
			public local(){
			//调用外部类成员变量
				System.out.println(innerClass.this.i);
			//调用方法内局部变量时，只能调用final修饰的变量
				System.out.println(i);
			}
		}
		
		//本地类只能在方法内声明，使用
		local ob01 = new local();
	}
	
	void test(){
		//在非静态态方法中使用成员内部类，不需要先显示生成外部类实例（因为此语句在运行时，已经处在外部类实例中）
		inner01 ob01 = new inner01();
		//外部类可以调用内部类的private成员
		ob01.method01();
		
		/*静态内部类不需要外部类的实例，可以直接调用其静态方法
		  调用非静态方法还需先生成内部类实例
		 */
		innerClass.inner02.method01();
		innerClass.inner02 ob02= new innerClass.inner02();
		ob02.method02();
	}
	
	public static void main(String[] args){
	//在静态方法中使用成员内部类，需要先生成其外部类的实例	
		innerClass outter = new innerClass();
		innerClass.inner01 ob01 = outter.new inner01();
		ob01.method01();
		
		//匿名类   可以当场继承各种类或者安装接口，但是需要注意匿名类没有类名，所以没有构造器，
		//如果需要构造器，可以用动态初始化块代替
		new innerClass(){
			{
				System.out.println("初始化块可以代替构造器，但是只能执行一次");
			}
			void test(){
				System.out.println("Override");
			}
		}.test();
	}
}

class innerClass2{
	void test2(){
	//在其他类中使用成员内部类，要先生成宿主类实例
		innerClass outter = new innerClass();
		innerClass.inner01 ob01 = outter.new inner01();
		//在其他类中不可以调用内部类的private成员，下面代码会出错
		//ob01.method01();
	}
}
