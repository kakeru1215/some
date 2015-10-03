package kakeru_201510;

public class loopTest {
//ÊµÑéfor while do while
	public static void main(String[] args){
		String[] arr = new String[]{"abc","def","ghi"};
		//For 1
		int sum=0;
		for(int i=0;i<10;i++){
			System.out.println(sum=sum+i);
		}
		//For 2
		sum=0;
		int i=0;
		for(;;){
			if(i==10){break;}
			System.out.println(sum=sum+i);
			i++;
		}
		
		//For 3
		for(String str:arr){
			System.out.print(str + " ");
		}
		i=0;
		sum=0;
		//while
		while(i<10){
			System.out.println(sum=sum+i);
			i++;
		}
		
		//do while
		i=0;
		sum=0;
		do{	
			System.out.println(sum=sum+i);
			i++;
		}while(i<10);
		
		//switch
		
		test ob01 = test.A;
		switch(ob01){
		case A:
			System.out.println(test.A);
			break;
		case B:
			System.out.println(test.B);
			break;
		default:
			System.out.println("Default");
			break;
		}
		
		
	}
}
enum test{A,B,C}