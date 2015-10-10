package kakeru_201510;

public class stringTest {
	public static void main(String[] args){
		char[] chars = new char[]{'a','b','c','a','b','c'};
		char[] chars02 = new char[]{1,2,3,4,5};
		String str01 = new String("abc");
		str01 = "efg";
		str01=new String(chars);
		System.out.println(new String(chars));
		//第二参数为起始字符索引号，从0开始，第三参数是截取字符串长度
		System.out.println(new String(chars,0,2));
		System.out.println(new String(chars02));
		//返回字符串长度
		System.out.println(str01.length());
		//返回位于索引2的字符
		System.out.println(str01.charAt(2));
		//返回字符或者字符串最初出现的位置（索引数）
		System.out.println(str01.indexOf('b'));
		//返回字符或者字符串最初出现的位置（索引数）,从索引1以后开始算起（包括1）
		System.out.println(str01.indexOf('b',2));
		//返回字符或者字符串最后出现的位置（索引数）
		System.out.println(str01.lastIndexOf('b'));
		//返回字符或者字符串最后出现的位置（索引数）,从索引数4以前开始算(包括4)
		System.out.println(str01.lastIndexOf('b',3));

		//字符串的情况
		System.out.println(str01.indexOf("abc"));
		System.out.println(str01.lastIndexOf("abc"));
		//是否以b为开始 参数为字符串
		System.out.println(str01.startsWith("b"));
		//是否以b结束 参数为字符串
		System.out.println(str01.endsWith("b"));
		//比较 每个字符按字典顺比较 大则正数  小则负数 相当为0 因为a<c 所以结果为-2
		System.out.println(str01.compareTo("cc"));
		System.out.println(str01.compareTo("abcabc"));
		System.out.println(str01.compareTo("0"));
		//忽略大小写 下例为0 相等
		System.out.println(str01.compareToIgnoreCase("ABCABC"));
		
		
		String str02 = new String("abc");
		String str03 = new String("abc");
		//判断字符串内容是否相等    true
		System.out.println(str02.equals(str03));
		//判断字符串变量的实例是否相同 false
		System.out.println(str02==str03);
	}
}
