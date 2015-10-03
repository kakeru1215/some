package kakeru_201510;

public class enumTest {
	public static void main(String[] args){
		test01 ob01 = test01.SUN;
		switch(ob01){
		case SUN:
			System.out.println(test01.SUN.toString());
			break;
		case MOON:
			System.out.println(test01.MOON.toString());
			break;
		case EARTH:
			System.out.println(test01.EARTH.toString());
			break;
		case MARS:
			System.out.println(test01.MARS.toString());
			break;
		default:
			System.out.println("Default");
			break;
		}
	}
}

enum test01{
	//举子后还要声明兹定于成员时，要以;结尾
	//举子定义时可以给构造器传实参，每一个举子其实都是给类的一个静态实例
	SUN("this is SUN"),MOON("this is MOON"),
	EARTH("this is EARTH"),MARS("this is MARS");
	
	private String str;
	//枚举类的构造器必须是private
	private test01(String str){
		this.str = str;
	}
	//重写object的toString方法
	public String toString(){
		return this.str;
	}
}
