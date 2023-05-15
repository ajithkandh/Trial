package AI;

import java.util.Scanner;

public class Ques_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String in=sc.nextLine();
		int len=in.length();
		String re="";
		String vow[]= {"a,e,i,o,u"};
		for(String vows:vow) {
				re=in.replaceAll(vows, "");
				in=re;
		
		}
		int len2=re.length();
		int len3=len-len2;
		System.out.println("The vowels in the word: "+len3);
		System.out.println("The constants in the word: "+len2);

	}

}
