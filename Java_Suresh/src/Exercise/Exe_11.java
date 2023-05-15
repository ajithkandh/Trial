package Exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exe_11 {

	public static void main(String[] args) throws IOException {
		FileWriter fl=new FileWriter("C:\\Users\\Admin\\Desktop\\GP.txt");
		BufferedWriter bw=new BufferedWriter(fl);
		bw.write("HI HOW ARE YOU");
		bw.newLine();
		bw.write("Thank you");
		bw.close();
	}

}
