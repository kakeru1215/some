package kakeru_201510;
import java.io.*;
import java.util.*;

public class numberTranslater {
	
	public static StringBuffer transForm(int[] numbers){
		StringBuffer transform = new StringBuffer("");
		HashMap<Integer,String> values = new HashMap<>();
		values.put(0, "��");
		values.put(1, "Ҽ");
		values.put(2, "��");
		values.put(3, "��");
		values.put(4, "��");
		values.put(5, "��");
		values.put(6, "�");
		values.put(7, "��");
		values.put(8, "��");
		values.put(9, "��");
		
		for(int i=0;i<numbers.length;i++){
			switch(i){
			case 0:
				if(numbers[i]!=0){
					transform=transform.append(values.get(numbers[i])+"��");
				}
				break;
			case 1:
				if(numbers[i]!=0){
					transform=transform.append(values.get(numbers[i])+"ʮ");
				}
				if(numbers[i]==0&&numbers[i-1]!=0){
					transform=transform.append(values.get(numbers[i]));
				}
				break;
			case 2:
					transform=transform.append(values.get(numbers[i]));
				break;
			}
		}
		return transform;
	}
	
	public static void main(String[] args){
		try{
			int[] numbers = new int[3];
			int num;
			String in;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("������һ��0~999�����֣�");
			in = br.readLine();
			while(Integer.parseInt(in)>999 || Integer.parseInt(in)<0 ){
				System.out.print("����������ֲ��ڷ�Χ�ڣ����������룺");
				in = br.readLine();
			}
			num=Integer.parseInt(in);
			numbers[0]=num/100;
			numbers[1]=(num%100)/10;
			numbers[2]=num%10;
			System.out.println(numberTranslater.transForm(numbers));
			br.close();
			}
		catch(IOException e){
			
		}
	}
}
