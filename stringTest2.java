package kakeru_201510;

import java.util.Arrays;

public class stringTest2 {

	public static void main(String[] args) {
		
		char[] chars = new char[]{'a','b','c','a','b','c'};
		String str01 = "123";
		String str02 = "456";
		String str03;
		
		//concat�ַ�������
		System.out.println(str01 = str01.concat(str02));
		//���ַ����鸴�Ƴ��ַ���    ��2����ʼindex ��3����Ҫ���Ƶ��ַ�������
		System.out.println(str03 = String.copyValueOf(chars));
		System.out.println(str03 = String.copyValueOf(chars,0,3));
		
		//�滻
		System.out.println(str01.replace('1', '2'));
		System.out.println(str01.replace("123", "abc"));
		
		//����������ʽ���滻
		System.out.println(str01.replaceAll("[0-9]{3}", "abc"));
		System.out.println(str01.replaceAll("^.*$", "abcdef"));
		
		//�滻��һ��ƥ����ַ���
		System.out.println(str01.replaceFirst("[0-9]{3}", "abc"));
		System.out.println(str01.replaceAll("^[0-9]{3}", "abc"));
		
		//���дСд
		System.out.println(new String(chars).toUpperCase());
		System.out.println(new String(chars).toLowerCase());
		
		//�����ַ���
		String str04;
		System.out.println(str04=str01.trim());
		
		//���ظ������������͵��ַ�������
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(100));
		System.out.println(String.valueOf(1.2));
		System.out.println(String.valueOf('b'));
		
		//����������ַָ�����ַ�������
		String[] strs = new String(chars).split("a.*a");
		System.out.println(Arrays.toString(strs));
		
		//���ַ�����Ϊ�ַ����鷵��
		System.out.println(chars = new String("123456789").toCharArray());
	}

}
