package kakeru_201510;

public class equalTest {
	public static void main(String[] args){
		String str01 = new String("123");
		String str02 = "123";//�ȼ��123�Ƿ��Ѿ����ڣ��������ֱ��ָ�����ַ����������newһ��123��ʵ��
		String str03 = "123";//ָ��str02��ʵ��
		//false
		System.out.println(str01 == str02);
		//true  equals�ȶԵ���ֵ   ==�ȶԵ��ǵ�ַ��ʵ����
		System.out.println(str01.equals(str02));
		//true 
		System.out.println(str02 == str03);
		
		
		//����instanceof
		instanceofTest ob01 = new instanceofTest();
		equalTest ob02 =new equalTest();
		//true  ʵ������ instanceof ������ʵ��������丸��ʱ����true,���򷵻�false��
		System.out.println(ob01 instanceof Object);
		System.out.println(ob01 instanceof equalTest);
		System.out.println(ob01 instanceof instanceofTest);
		//false
		System.out.println(ob01 instanceof instanceofTest02);
		
		
		//instanceof�жϵ����������ʱ״̬  �����Ǳ�����״̬
		//���� ob03ΪObject���ͣ���ʵ��ָ�����instanceofTest��ʵ�������Է���true
		Object ob03 = new instanceofTest();
		if(ob03 instanceof instanceofTest){
			instanceofTest ob04 = (instanceofTest)ob03;
			ob04.method01();
		}
		
		//instanceofTest02ΪinstanceofTest���࣬����false
		System.out.println(ob03 instanceof instanceofTest02);
	}
}

class instanceofTest extends equalTest{
	void method01(){
		System.out.println("instanceofTest Class");
	}
}
class instanceofTest02 extends instanceofTest{}