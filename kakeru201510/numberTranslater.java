package kakeru_201510;
import java.io.*;
import java.util.*;

public class numberTranslater {
	
	public static StringBuffer transForm(int[] numbers){
		StringBuffer transform = new StringBuffer("");
		HashMap<Integer,String> values = new HashMap<>();
		values.put(0, "零");
		values.put(1, "壹");
		values.put(2, "贰");
		values.put(3, "叁");
		values.put(4, "肆");
		values.put(5, "伍");
		values.put(6, "陸");
		values.put(7, "柒");
		values.put(8, "仈");
		values.put(9, "玖");
		
		for(int i=0;i<numbers.length;i++){
			switch(i){
			case 0:
				if(numbers[i]!=0){
					transform=transform.append(values.get(numbers[i])+"百");
				}
				break;
			case 1:
				if(numbers[i]!=0){
					transform=transform.append(values.get(numbers[i])+"十");
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
			System.out.print("请输入一个0~999的数字：");
			in = br.readLine();
			while(Integer.parseInt(in)>999 || Integer.parseInt(in)<0 ){
				System.out.print("您输入的数字不在范围内，请重新输入：");
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
