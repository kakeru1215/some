package kakeru_201510;
import java.io.*;
//for语句生成一些简单字符串团
public class forTest01 {
	public static void main(String[] args) throws IOException{
	//practice01
	for(int i=0;i<=5;i++){
		for(int w=0;w<=5;w++){
			System.out.print("@");
		}
		System.out.println();
	}
	System.out.println();
	//practice02
	for(int i=0;i<=5;i++){
		for(int w=0;w<=5;w++){
			if((w>0&&w<5)&&(i>0&&i<5)){
				System.out.print("@");
			}else{
					System.out.print("X");
			}
		}
		System.out.println();
	}
	System.out.println();
	//practice03
	for(int i=0;i<=5;i++){
		for(int w=0;w<=5;w++){
			if(w>=i){
				System.out.print("@");
			}else{
					System.out.print(" ");
			}
		}
		System.out.println();
	}	
	}
}

