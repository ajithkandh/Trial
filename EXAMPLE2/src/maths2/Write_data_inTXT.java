package maths2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_data_inTXT {

	public static void main(String[] args) throws IOException {
		FileWriter w=new FileWriter("C:\\Users\\Admin\\Desktop\\New.txt");
		BufferedWriter bw=new BufferedWriter(w);
		bw.write("JAva");
		bw.newLine();
		bw.write("Selenium");
		System.out.println("OK");
		bw.close();

	}

}
