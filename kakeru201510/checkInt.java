package kakeru_201510;
import java.io.*;

public class checkInt {
	public static void main(String[] args) throws IOException{
		boolean result = false;
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������һ�����֣� ");
		int Num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==Num){
				result=true;}
			else continue;
		}
		if(result){
			System.out.println(Num + "��������");
		}else{
			System.out.println(Num + "����������");
		}
	}
}
