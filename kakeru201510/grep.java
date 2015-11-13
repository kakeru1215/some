package kakeru_201510;
import java.io.*;
import java.util.*;

public class grep {
	public static void main(String[] args){
		try{
		if(args != null){ 
			BufferedReader br = null;
			int line_counter = 0;
			try{
				br = new BufferedReader(new InputStreamReader(System.in));
				String line;
				while((line = br.readLine()) != null){
					line_counter++;
					if(line.matches(args[0])){
						System.out.println("Line" + line_counter + " " + line);
					}
				}
			}
			catch(IOException e){
				System.out.println("IO Error.");
			}
			finally{
				if(br != null){
				try{
				br.close();
				}
				catch(IOException e){
					System.out.println("Stream Close Error.");
				}
				}
			}
		}	
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("no args.please use the command just like: grep .*test.*");
		}
	}
}
