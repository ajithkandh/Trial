package AI;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class Ques4_3 {

	public static void main(String[] args)  {
		String str="";
		try {
		Scanner sc=new Scanner(new File("C:\\Users\\Admin\\Desktop\\New Text Document (3).txt"));
		while(sc.hasNextLine())
		{
			str +=sc.nextLine() + " ";
		}
		sc.close();
		}
		
		catch(FileNotFoundException e){
			System.out.println("File not found");
			return;
			
		}
		
		
		str=str.replaceAll("[^a-zA-Z\\s]", "");
		str=str.toLowerCase();
		String[] words=str.split("\\s+");
		
		HashMap <String,Integer> hm=new HashMap <String,Integer>();
		for(String word:words)
		{
			if(hm.containsKey(word))
			{
				int count=hm.get(word);
				hm.put(word, count+1);
			}
			else
			{
				hm.put(word, 1);
			}
			
		}
		for(String word:hm.keySet())
		{
			int count=hm.get(word);
			System.out.println(word+": "+count);
		}

	}

}
