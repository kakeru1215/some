import java.io.*;

public class checkInt {
	public static void main(String[] args) throws IOException{
		boolean result = false;
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入一个数字： ");
		int Num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==Num){
				result=true;}
			else continue;
		}
		if(result){
			System.out.println(Num + "在数组内");
		}else{
			System.out.println(Num + "不在数组内");
		}
	}
}
