package kakeru_201510;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class charset {
	public static void main(String[] args){
		//java使用Unicode字符集编码储存char
		//String则是由char数组组成的 
		String utf8 ="学习";//储存在内存中的是“中国”的unicode编码
		byte[] utf8s = utf8.getBytes(Charset.forName("Shift-JIS"));//将中国的unicode编码转成sjis编码
		//不指定参数，则会使用现在平台的默认字符集（简体中文系统为GBK）
		byte[] utf8s2 = utf8.getBytes();//将中国的unicode编码转成系统默认编码（gbk）
		for(byte i:utf8s){
			System.out.print(Integer.toHexString(i & 0xFF) + " ");
		}
		System.out.println();
		for(byte i:utf8s2){
			System.out.print(Integer.toHexString(i & 0xFF) + " ");
		}
		System.out.println();
		//日语字符集SJIS字库里没有“习”这个字符，所以显示？，从unicode编码转换成其他编码的过程中，对于没有对应编码的字符 一律用unicode编码3f替换
		//3f表示？
		System.out.println(new String(utf8s,Charset.forName("Shift-JIS")));
		System.out.println(new String(utf8s2,Charset.forName("GBK")));
	}
}
