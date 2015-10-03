package kakeru_201510;

import java.util.Arrays;

public class int2Byte {
	public byte[] int2Bytes(int num){
		//声明byte数组
		byte[] bytes = new byte[4];
		for(int i=0;i<bytes.length;i++){
		    //32位int数据型从低位开始依次每8位存进一个byte，依次向右位移8位后与0xff进行与运算即可得出低位8位，
		    	bytes[i]=(byte)((num>>>(i*8))&0xff);
		}		
		return bytes;
	}
	
	public int bytes2Int(byte[] bytes){
		int num=0;
		for(int i=0;i<bytes.length;i++){
			//bytes从低位开始,先与0xff取与变int型，再依次向左位移8位后相加,
			//※注意位移是符号位是不动的，所以如果不先进行与运算把高位清0的话，结果会有错误。
			num+=((bytes[i]&0xff)<<(i*8));
		}
		return num;
	}
	
	public static void main(String[] args){
		//test number
		int num = 62345;   
		int2Byte ob01 = new int2Byte();
		//显示byte，由于第一位为符号位，当符号位为1时会表示为负数 
		System.out.println(Arrays.toString(ob01.int2Bytes(num)));
	    //还原成int
		System.out.println(ob01.bytes2Int((ob01.int2Bytes(num)))); 
		//下面的实验说，位移的时候符号位是不动的。位移后显示结果为-1664
		//位移前1111 0011
		//位移后1111 1111 1111 1111 1111 0011 0000 0000
		//符号位不变为1 其余填符号位（算数位移）
		byte a=-13;
		System.out.println(Integer.toBinaryString(a&0xff));
		System.out.println(Integer.toBinaryString(a<<8));
	}
}
