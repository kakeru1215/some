package kakeru_201510;

public class innerClass {
	int i=100;
	
//��Ա�ڲ��࣬�������ڲ�����Ϊ�ⲿ���һ����Ա
	public class inner01{
		//��Ա�ڲ��಻�����о�̬��Ա������static int o �ᱨ��
		//private static int o;
		private int i=1000;
		private void method01(){
			//�����ⲿ���Ա   �ⲿ����.this.��Ա��
			System.out.println(innerClass.this.i+this.i);
		}
	}
//��̬�ڲ���
	public static class inner02{
		//��̬�ڲ�������о�̬��Ա
		private static int o=10000;
		private static void method01(){}
	    private void method02(){}
    } 
	
	void localClass(){
		final int i=100;
		//�����ڲ������ڲ����ⲿ���Ա�����Բ����ó�Ա���������η���public private�ȣ�ֻ������abstracts final
		class local{
			public local(){
			//�����ⲿ���Ա����
				System.out.println(innerClass.this.i);
			//���÷����ھֲ�����ʱ��ֻ�ܵ���final���εı���
				System.out.println(i);
			}
		}
		
		//������ֻ���ڷ�����������ʹ��
		local ob01 = new local();
	}
	
	void test(){
		//�ڷǾ�̬̬������ʹ�ó�Ա�ڲ��࣬����Ҫ����ʾ�����ⲿ��ʵ������Ϊ�����������ʱ���Ѿ������ⲿ��ʵ���У�
		inner01 ob01 = new inner01();
		//�ⲿ����Ե����ڲ����private��Ա
		ob01.method01();
		
		/*��̬�ڲ��಻��Ҫ�ⲿ���ʵ��������ֱ�ӵ����侲̬����
		  ���÷Ǿ�̬���������������ڲ���ʵ��
		 */
		innerClass.inner02.method01();
		innerClass.inner02 ob02= new innerClass.inner02();
		ob02.method02();
	}
	
	public static void main(String[] args){
	//�ھ�̬������ʹ�ó�Ա�ڲ��࣬��Ҫ���������ⲿ���ʵ��	
		innerClass outter = new innerClass();
		innerClass.inner01 ob01 = outter.new inner01();
		ob01.method01();
		
		//������   ���Ե����̳и�������߰�װ�ӿڣ�������Ҫע��������û������������û�й�������
		//�����Ҫ�������������ö�̬��ʼ�������
		new innerClass(){
			{
				System.out.println("��ʼ������Դ��湹����������ֻ��ִ��һ��");
			}
			void test(){
				System.out.println("Override");
			}
		}.test();
	}
}

class innerClass2{
	void test2(){
	//����������ʹ�ó�Ա�ڲ��࣬Ҫ������������ʵ��
		innerClass outter = new innerClass();
		innerClass.inner01 ob01 = outter.new inner01();
		//���������в����Ե����ڲ����private��Ա�������������
		//ob01.method01();
	}
}
