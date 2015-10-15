package kakeru_201510;

public class stringbufferTest {
	public static void main(String[] args){
	
	//trim()�������ض����ַ�����ʵ�������==Ϊtrue
	String str01 = new String("aaa");
	String str02 = str01.trim();
	String str03 = str02.trim();
	System.out.println(str01==str02);
	
	//StringBuffer��һЩ����ʹ����ϰ
	StringBuffer sb01 = new StringBuffer("aabbccddbb");
	//��ת�ַ���
	System.out.println(sb01.reverse());
	//�����������ַ�
	sb01.setCharAt(4, 'z');
	System.out.println(sb01);
	//�����������ַ�
	System.out.println(sb01.charAt(0));
	System.out.println(sb01.indexOf("bb"));//0
	System.out.println(sb01.lastIndexOf("bb"));//6
	//start to end-1�����ַ������滻
	sb01.replace(0, 6, "aaaaaa");
	System.out.println(sb01);
	
	//subString start to end-1
	str01 = sb01.substring(0, 6);
	System.out.println(str01);
	//׷���ַ���
	sb01.append("aaaaaa");
	System.out.println(sb01);
	//�����ַ���
	sb01.insert(0, "cccc");
	System.out.println(sb01);
	//ɾ���ַ���
	sb01.delete(0, 4);
	System.out.println(sb01);

	
	//TrapperClass Integer
	int num01 = 10;
	Integer num02 = 10;
	Integer num03 = new Integer(10);
	
	System.out.println(num02==num03);//false ʵ���Ƚ�
	System.out.println(num02.equals(num03));//true ֵ�Ƚ�
	System.out.println(num02.equals(num01));//true int���Զ������Integer�� Ȼ�����ֵ�Ƚ�
	
	num01=1000000;
	System.out.println(num02.compareTo(num01));//����num01:1 С��num01:-1 ����num01:0
	
	System.out.println(Integer.parseInt("ffff",16));
	System.out.println(Integer.parseInt("65535",10));
	System.out.println(Integer.parseInt("1111111111111111",2));
	
	
	System.out.println(Integer.valueOf("10"));
	System.out.println(Integer.valueOf(num01));
	
	System.out.println(num02.toString());
	System.out.println(num02.intValue());
	
	//TrapperClass Character
	str01 = "1234abcd ";
	char[] chars = str01.toCharArray();
	System.out.printf("����\t��ĸ\t����%n");
	for(Character i:chars){
		str01 = String.valueOf(Character.isDigit(i));
		str02 = String.valueOf(Character.isAlphabetic(i));
		str03 = String.valueOf(Character.isSpaceChar(i));
		System.out.printf("%1$s\t%2$s\t%3$s%n",str01,str02,str03);
	}
	
	}
}
