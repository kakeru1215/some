package kakeru_201510;
import java.io.*;

public class iostream {

	public static void main(String[] args) throws IOException{
		//�ֽ���  FileInputStream FileOutputStream
		File infile = new File("C:\\Users\\kakeru\\Desktop\\in.txt");
		File outfile = new File("C:\\Users\\kakeru\\Desktop\\out.txt");
		
		//�����ȡ�ֽ�
		int EOF;
		FileInputStream fis = new FileInputStream(infile);
		FileOutputStream fos = new FileOutputStream(outfile);
		while((EOF=fis.read()) != -1){
			fos.write(EOF);
		}
		fis.close();
		fos.close();
		
		/*
		 ÿ�ζ�ȡbuffer��С���ֽڣ�512��
		 */
		int bytes;
		byte[] buffer = new byte[512];
		fis = new FileInputStream(infile);
		fos = new FileOutputStream(outfile);
		while((bytes=fis.read(buffer)) != -1){
			System.out.println("��ȡ" + bytes + "�ֽ�");
			fos.write(buffer,0,buffer.length);
		}
		fis.close();
		fos.close();
		
		//�����������ֽ��� BufferedInputStream BufferedOutputStream
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(infile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outfile));
		
		while((EOF=bis.read())!=-1){
			bos.write(EOF);
		}
		
		bis.close();
		bos.close();
		
		bis = new BufferedInputStream(new FileInputStream(infile));
		bos = new BufferedOutputStream(new FileOutputStream(outfile));
		
		while((bytes=bis.read(buffer))!=-1){
			System.out.println("��ȡ" + bytes + "�ֽ�");
			bos.write(buffer,0,buffer.length);
		}
		//ǿ����ջ�����
		bos.flush();
		bis.close();
		bos.close();
		
		
		//�ַ��� FileReader FileWriter
		char[] char_buffer = new char[512];
		int chars;
		FileReader fr = new FileReader(infile);
		FileWriter fw = new FileWriter(outfile);
		while((EOF=fr.read())!=-1){
			fw.write(EOF);
		}
		fr.close();
		fw.close();
		
		fr = new FileReader(infile);
		fw = new FileWriter(outfile);
		while((chars=fr.read(char_buffer))!=-1){
			System.out.println("��ȡ" + chars + "�ַ�");
			fw.write(char_buffer,0,char_buffer.length);
		}
		fr.close();
		fw.close();
		
		//�����������ַ��� BufferedReader BufferedWriter
		String line;
		BufferedReader br = new BufferedReader(new FileReader(infile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outfile));
		while((line=br.readLine())!=null){
			bw.write(line);
			//readline�����ȡ���з�������Ҫ���л���
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
		
		//�ֽ���ת�ַ��� InputStreamReader(inputstream) InputStreamWriter(outputstream)
		InputStreamReader ins = new InputStreamReader(new FileInputStream(infile));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(outfile));
		
		while((EOF=ins.read())!=-1){
			osw.write(EOF);
		}
		
		ins.close();
		osw.close();
		
		//PrintWriter
		int num=0;
		br = new BufferedReader(new FileReader(infile));
		bw = new BufferedWriter(new FileWriter(outfile));
		PrintWriter pw = new PrintWriter(bw);
		while((line=br.readLine())!=null){
			num++;
			pw.printf("��%d�У�%s%n",num,line);
		}
		bw.flush();
		br.close();
		bw.close();
		
		//��ש�������  System.in System.out
		br = new BufferedReader(new InputStreamReader(System.in));
		String std_input = br.readLine();
		System.out.println(std_input);
	}
}
