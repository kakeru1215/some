package kakeru_201510;

import java.util.Arrays;

public class int2Byte {
	public byte[] int2Bytes(int num){
		//����byte����
		byte[] bytes = new byte[4];
		for(int i=0;i<bytes.length;i++){
		    //32λint�����ʹӵ�λ��ʼ����ÿ8λ���һ��byte����������λ��8λ����0xff���������㼴�ɵó���λ8λ��
		    	bytes[i]=(byte)((num>>>(i*8))&0xff);
		}		
		return bytes;
	}
	
	public int bytes2Int(byte[] bytes){
		int num=0;
		for(int i=0;i<bytes.length;i++){
			//bytes�ӵ�λ��ʼ,����0xffȡ���int�ͣ�����������λ��8λ�����,
			//��ע��λ���Ƿ���λ�ǲ����ģ�����������Ƚ���������Ѹ�λ��0�Ļ���������д���
			num+=((bytes[i]&0xff)<<(i*8));
		}
		return num;
	}
	
	public static void main(String[] args){
		//test number
		int num = 62345;   
		int2Byte ob01 = new int2Byte();
		//��ʾbyte�����ڵ�һλΪ����λ��������λΪ1ʱ���ʾΪ���� 
		System.out.println(Arrays.toString(ob01.int2Bytes(num)));
	    //��ԭ��int
		System.out.println(ob01.bytes2Int((ob01.int2Bytes(num)))); 
		//�����ʵ��˵��λ�Ƶ�ʱ�����λ�ǲ����ġ�λ�ƺ���ʾ���Ϊ-1664
		//λ��ǰ1111 0011
		//λ�ƺ�1111 1111 1111 1111 1111 0011 0000 0000
		//����λ����Ϊ1 ���������λ������λ�ƣ�
		byte a=-13;
		System.out.println(Integer.toBinaryString(a&0xff));
		System.out.println(Integer.toBinaryString(a<<8));
	}
}
