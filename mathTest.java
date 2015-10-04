package kakeru_201510;

public class mathTest {
	static double a=-9.8d;
	static double b=-8.6d;
	
	public static void main(String[] args){
		//Test lang.Math
		
		//求a的绝对值,返回double 9.8
		System.out.println(Math.abs(a));
		//求比a大的最小整数，返回double -9.0
		System.out.println(Math.ceil(a));
		//求比a小的最小整数 返回double -10.0
		System.out.println(Math.floor(a));
		//求a的四舍五入整数 返回long -10
		System.out.println(Math.round(a));
		//求a,b中最大值
		System.out.println(Math.max(a,b));
		//求a,b中最小值
		System.out.println(Math.min(a,b));
		//求a的2次方
		System.out.println(Math.pow(a,2));
		//求a的平方根 a必须为正数
		System.out.println(Math.sqrt(Math.abs(a)));
		//求100的以e为低的对数 返回double 
		System.out.println(Math.log(100));
		//求100的以10位低的对数 返回double 2.0
		System.out.println(Math.log10(100));
		//求a的sin.cos,tan
		System.out.println(Math.sin(a));
		System.out.println(Math.cos(a));
		System.out.println(Math.tan(a));
	}
}
