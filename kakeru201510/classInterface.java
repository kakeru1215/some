package kakeru_201510;

abstract class abs{
	//����������ӵ�й����������ǳ������޷�����ʵ��
	abs(){}
	
	//Ҳ���Զ�����ͨ����
	void method01(int a){}
	//������󷽷������󷽷�û�з����壬���Բ�л������{}
	abstract void method01();
	
	//���涨�屨��final����ķ����޷������ǣ����abstract�����Ժ�finalһ��ʹ��
	//private�ķ������ⲿ�൱�������࣬�޷������ǣ����Բ�����ʹ��
	//private abstract void method01();
	//final abstract void method01();
}


interface inter{
	//���ӿ�û�й�����������������ʵ��
	
	//�ӿ���field����Ϊ��̬���� �����ӿ��Ʒ�Ϊpublic
	//public final staticʡ��ʱ��ϵͳ���Զ����
	int b =1000;
	public static final int a=100;
	
	//���󷽷�����Ϊpublic ʡ��ʱ�Զ����
	public abstract void method01();
	
	//�����Զ�����ͨ��
	//void method01(int a){}
}

public class classInterface extends abs implements inter{
	//ͬ�¼̳и���Ͱ�װ�ӿڵ�ʱ��extendsж��ǰ
	//ֻ���Լ̳�һ�����࣬�����ⰲװ������ �� implements iter01,inter02
	
	//���ӿںͳ������з��������ظ�ʱ��ֻ��Ҫ��дһ�����籾��abs �� inter��������method01()
	//�����ʵ������ֻҪ��дһ��method01��������
	public void method01(){
		//���ýӿ��еĳ���
		System.out.println(inter.b + inter.a);
	}
	public void method02(){
		System.out.println("����method02");
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
