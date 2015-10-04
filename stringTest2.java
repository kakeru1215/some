package kakeru_201510;

import java.util.Arrays;

public class stringTest2 {

	public static void main(String[] args) {
		
		char[] chars = new char[]{'a','b','c','a','b','c'};
		String str01 = "123";
		String str02 = "456";
		String str03;
		
		//concat字符串连接
		System.out.println(str01 = str01.concat(str02));
		//将字符数组复制成字符串    第2数起始index 第3参数要复制的字符串长度
		System.out.println(str03 = String.copyValueOf(chars));
		System.out.println(str03 = String.copyValueOf(chars,0,3));
		
		//替换
		System.out.println(str01.replace('1', '2'));
		System.out.println(str01.replace("123", "abc"));
		
		//运用正则表达式的替换
		System.out.println(str01.replaceAll("[0-9]{3}", "abc"));
		System.out.println(str01.replaceAll("^.*$", "abcdef"));
		
		//替换第一次匹配的字符串
		System.out.println(str01.replaceFirst("[0-9]{3}", "abc"));
		System.out.println(str01.replaceAll("^[0-9]{3}", "abc"));
		
		//变大写小写
		System.out.println(new String(chars).toUpperCase());
		System.out.println(new String(chars).toLowerCase());
		
		//复制字符串
		String str04;
		System.out.println(str04=str01.trim());
		
		//返回各基本数据类型的字符串表现
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(100));
		System.out.println(String.valueOf(1.2));
		System.out.println(String.valueOf('b'));
		
		//按照正则表现分割，返回字符串数组
		String[] strs = new String(chars).split("a.*a");
		System.out.println(Arrays.toString(strs));
		
		//将字符串变为字符数组返回
		System.out.println(chars = new String("123456789").toCharArray());
	}

}
