package kakeru_201510;

class father{
	//��̬��Ա��ʼ��˳�� ��̬block ����ʱ��ֵ   ��̬block ������
	//��˾�̬�����ĸ���ֵֻ���ھ�̬block��������ʱ����
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
		//�����Ĺ����뷵��ֵ�޹� 
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
		//������ �β� ����ֵ������ȫ��ͬ
		return a*a;
	}
	void method02(){}
}


public class extendsTest{
	public static void main(String[] arsg){
		//��̬    ����ʱΪ��������  ����ʱΪ��������
		father ob01 = new children();
		ob01.method01();
		//��Ϊmethod01(int a)�����า�ǣ�����������õ�������ķ���������100
		ob01.method01(10);
		//�޷����������method02()����,��Ϊ������û�д˷����Ķ��壬�������ᱨ��
		//ob01.method02();
		
		//ǿ��ת��Ϊ�������ͣ�ע��ֻ������ʱ����Ϊ��������ʱ�ſ���ǿ��ת��Ϊ��������
		children ob02 = (children)ob01;
		//ת������Ե������ඨ���method02()
		ob02.method02();
		
	}
}
