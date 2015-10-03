package kakeru_201510;

public class equalTest {
	public static void main(String[] args){
		String str01 = new String("123");
		String str02 = "123";//先检查123是否已经存在，如果存在直接指向其地址，不存在则new一个123的实例
		String str03 = "123";//指向str02的实例
		//false
		System.out.println(str01 == str02);
		//true  equals比对的是值   ==比对的是地址（实例）
		System.out.println(str01.equals(str02));
		//true 
		System.out.println(str02 == str03);
		
		
		//测试instanceof
		instanceofTest ob01 = new instanceofTest();
		equalTest ob02 =new equalTest();
		//true  实例变量 instanceof 类名（实例的类或其父类时返回true,否则返回false）
		System.out.println(ob01 instanceof Object);
		System.out.println(ob01 instanceof equalTest);
		System.out.println(ob01 instanceof instanceofTest);
		//false
		System.out.println(ob01 instanceof instanceofTest02);
		
		
		//instanceof判断的是类的运行时状态  而不是编译是状态
		//如下 ob03为Object类型，但实际指向的是instanceofTest的实例，所以返回true
		Object ob03 = new instanceofTest();
		if(ob03 instanceof instanceofTest){
			instanceofTest ob04 = (instanceofTest)ob03;
			ob04.method01();
		}
		
		//instanceofTest02为instanceofTest子类，返回false
		System.out.println(ob03 instanceof instanceofTest02);
	}
}

class instanceofTest extends equalTest{
	void method01(){
		System.out.println("instanceofTest Class");
	}
}
class instanceofTest02 extends instanceofTest{}