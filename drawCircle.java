import java.io.*;

public class drawCircle {
	static{r=10;}
	private static final double r;
	
	public static void main(String[] args) throws IOException{
		int point=0;
		int h=0;
		for(int y=0;y<=2*r;y++){
			if(y>r){h=y-(int)r;}
			else{h=(int)r-y;}
			point=(int)Math.round(Math.sqrt(Math.pow(r, 2) - Math.pow(h,2)));
			for(int x=0;x<=2n *r;x++){
				if(x==r-point || x==r+point){
					System.out.print("@");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}
