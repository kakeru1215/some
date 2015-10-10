package kakeru_201510;
public class zhishu{
		public static void main(String[] args){
			int count = 0;
			for( int A = 2;A <= 100;A++ ){
				boolean flag = false;
				for( int B = 2;B < A;B++ ){
					if(A%B == 0){
					flag = true;
					}
				}
				if(flag == false){
					count++;
					System.out.printf("%2d 是质数\n",A);
				}
			}
		System.out.println("==================");
		System.out.println("质数的个数是 : "+count);
		}
}
