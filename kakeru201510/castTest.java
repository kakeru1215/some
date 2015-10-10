package kakeru_201510;

public class castTest {
	public static void main(String[] args){
		//byte short需要创制转换才能转成char  不会自动转换
		byte a = 10;
		short c =100;
		char b = (char)a;
		b=(char)c;
		System.out.println(b);
	}
}
