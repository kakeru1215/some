package kakeru_201510;

public class reflect {
	@Override
	public String toString(){
		return "reflect";
	}
	public static void main(String[] args) throws Exception{
		reflect ob = new reflect();
		
		Class<?> a;
		a = ob.getClass();
		
		reflect b = (reflect)a.newInstance();
		
		System.out.println(b.toString());
		
		
	}
}
