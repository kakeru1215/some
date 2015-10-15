package kakeru_201510;

class data{
	private static StringBuffer DATA = new StringBuffer();;
	public static synchronized void input(String str){
		data.DATA.append(str);
		System.out.println(data.DATA);
	} 
}

class myThread implements Runnable{
	String name;
	public myThread(String name){
		this.name = name;
	}
	public void run(){
		//ʹ��ͬ��������£�һ���̵߳�run()����֮�󣬲Ż�������һ���̵߳�run()����
		try{
			data.input(name);
		}
		catch(Exception e){}
	}
}

public class threadTest {
	public static void main(String[] args) throws Exception{
		myThread run01 = new myThread("thread-01");
		myThread run02 = new myThread("thread-02");
		
		Thread thread01 = new Thread(run01);
		Thread thread02 = new Thread(run02);
		
		thread01.start();
		thread02.start();
		
	}
	
}
