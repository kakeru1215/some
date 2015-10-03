package kakeru_201510;
//¥Ú”°9x9≥À∑®±Ì 
public class table9x9 {
	public static void main(String[] args){
		for(int y=0;y<=9;y++){
			for(int x=0;x<=9;x++){
				if(x==0&&y==0){
					System.out.print("0	1	2	3	4	5	6	7	8	9");
					break;
				}else if(x==0){
					System.out.print(y + "\t");
				}else{
					System.out.print(x*y + "\t");
				}
			}
			System.out.println();
		}
	}
}
