package kakeru_201510;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class charset {
	public static void main(String[] args){
		//javaʹ��Unicode�ַ������봢��char
		//String������char������ɵ� 
		String utf8 ="ѧϰ";//�������ڴ��е��ǡ��й�����unicode����
		byte[] utf8s = utf8.getBytes(Charset.forName("Shift-JIS"));//���й���unicode����ת��sjis����
		//��ָ�����������ʹ������ƽ̨��Ĭ���ַ�������������ϵͳΪGBK��
		byte[] utf8s2 = utf8.getBytes();//���й���unicode����ת��ϵͳĬ�ϱ��루gbk��
		for(byte i:utf8s){
			System.out.print(Integer.toHexString(i & 0xFF) + " ");
		}
		System.out.println();
		for(byte i:utf8s2){
			System.out.print(Integer.toHexString(i & 0xFF) + " ");
		}
		System.out.println();
		//�����ַ���SJIS�ֿ���û�С�ϰ������ַ���������ʾ������unicode����ת������������Ĺ����У�����û�ж�Ӧ������ַ� һ����unicode����3f�滻
		//3f��ʾ��
		System.out.println(new String(utf8s,Charset.forName("Shift-JIS")));
		System.out.println(new String(utf8s2,Charset.forName("GBK")));
	}
}
