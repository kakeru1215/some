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
	//���Ӻ�Ҫ�����ȶ��ڳ�Աʱ��Ҫ��;��β
	//���Ӷ���ʱ���Ը���������ʵ�Σ�ÿһ��������ʵ���Ǹ����һ����̬ʵ��
	SUN("this is SUN"),MOON("this is MOON"),
	EARTH("this is EARTH"),MARS("this is MARS");
	
	private String str;
	//ö����Ĺ�����������private
	private test01(String str){
		this.str = str;
	}
	//��дobject��toString����
	public String toString(){
		return this.str;
	}
}
