package maths2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileRead {

	public static void main(String[] args) throws IOException {
		FileReader t=new FileReader("D:\\mammo\\Hi.docs");
		BufferedReader B=new BufferedReader(t);
		String str;
		while((str=B.readLine())!=null)
		{
			System.out.println(str);
		}
	}

}
