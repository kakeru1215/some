//生成10个1-10的随机数，且不重复
public class random7num{
	static{
		ar01 = new int[10];
	}
	private final static int[] ar01;
	private int getRandomInt(){
		return (int)Math.round(Math.random()*10);
	}
	private boolean has(int[] ar01,int next){
		for(int i=0;i<ar01.length;i++){
			if(next == ar01[i]){
				return true;
			}
		}
		return false;
	}
	public void showArray(int[] ar01){
		for(int i=0;i<ar01.length;i++){
			System.out.print(ar01[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int next;
		random7num ins01 = new random7num();
		random7num.ar01[0] = ins01.getRandomInt();
		for(int i=1;i<=ar01.length-1;i++){
			while(ins01.has(ar01,next=ins01.getRandomInt())){}
			random7num.ar01[i]=next;
		}
		ins01.showArray(ar01);
	}
	
	
}
