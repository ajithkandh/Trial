package Exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exe_12 {

	public static void main(String[] args) throws IOException {
		FileReader fl=new FileReader("C:\\Users\\Admin\\Desktop\\GP.txt");
		
BufferedReader br=new BufferedReader(fl);
String str;
while((str=br.readLine())!=null) 
{
 
 System.out.println(str);
}

	}

}
