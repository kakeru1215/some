package kakeru_201510;

public class mathTest {
	static double a=-9.8d;
	static double b=-8.6d;
	
	public static void main(String[] args){
		//Test lang.Math
		
		//��a�ľ���ֵ,����double 9.8
		System.out.println(Math.abs(a));
		//���a�����С����������double -9.0
		System.out.println(Math.ceil(a));
		//���aС����С���� ����double -10.0
		System.out.println(Math.floor(a));
		//��a�������������� ����long -10
		System.out.println(Math.round(a));
		//��a,b�����ֵ
		System.out.println(Math.max(a,b));
		//��a,b����Сֵ
		System.out.println(Math.min(a,b));
		//��a��2�η�
		System.out.println(Math.pow(a,2));
		//��a��ƽ���� a����Ϊ����
		System.out.println(Math.sqrt(Math.abs(a)));
		//��100����eΪ�͵Ķ��� ����double 
		System.out.println(Math.log(100));
		//��100����10λ�͵Ķ��� ����double 2.0
		System.out.println(Math.log10(100));
		//��a��sin.cos,tan
		System.out.println(Math.sin(a));
		System.out.println(Math.cos(a));
		System.out.println(Math.tan(a));
	}
}
