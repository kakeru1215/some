package kakeru_201510;

public class stringTest {
	public static void main(String[] args){
		char[] chars = new char[]{'a','b','c','a','b','c'};
		char[] chars02 = new char[]{1,2,3,4,5};
		String str01 = new String("abc");
		str01 = "efg";
		str01=new String(chars);
		System.out.println(new String(chars));
		//�ڶ�����Ϊ��ʼ�ַ������ţ���0��ʼ�����������ǽ�ȡ�ַ�������
		System.out.println(new String(chars,0,2));
		System.out.println(new String(chars02));
		//�����ַ�������
		System.out.println(str01.length());
		//����λ������2���ַ�
		System.out.println(str01.charAt(2));
		//�����ַ������ַ���������ֵ�λ�ã���������
		System.out.println(str01.indexOf('b'));
		//�����ַ������ַ���������ֵ�λ�ã���������,������1�Ժ�ʼ���𣨰���1��
		System.out.println(str01.indexOf('b',2));
		//�����ַ������ַ��������ֵ�λ�ã���������
		System.out.println(str01.lastIndexOf('b'));
		//�����ַ������ַ��������ֵ�λ�ã���������,��������4��ǰ��ʼ��(����4)
		System.out.println(str01.lastIndexOf('b',3));

		//�ַ��������
		System.out.println(str01.indexOf("abc"));
		System.out.println(str01.lastIndexOf("abc"));
		//�Ƿ���bΪ��ʼ ����Ϊ�ַ���
		System.out.println(str01.startsWith("b"));
		//�Ƿ���b���� ����Ϊ�ַ���
		System.out.println(str01.endsWith("b"));
		//�Ƚ� ÿ���ַ����ֵ�˳�Ƚ� ��������  С���� �൱Ϊ0 ��Ϊa<c ���Խ��Ϊ-2
		System.out.println(str01.compareTo("cc"));
		System.out.println(str01.compareTo("abcabc"));
		System.out.println(str01.compareTo("0"));
		//���Դ�Сд ����Ϊ0 ���
		System.out.println(str01.compareToIgnoreCase("ABCABC"));
		
		
		String str02 = new String("abc");
		String str03 = new String("abc");
		//�ж��ַ��������Ƿ����    true
		System.out.println(str02.equals(str03));
		//�ж��ַ���������ʵ���Ƿ���ͬ false
		System.out.println(str02==str03);
	}
}
