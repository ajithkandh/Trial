package Exercise;

import java.util.ArrayList;

public class Exe_8 {

	public static void main(String[] args) {
		ArrayList<String> subjects=new ArrayList<String>();
		subjects.add(0, "Tamil"	);
		subjects.add(1,"English");
		subjects.add(2, "MAths");
		subjects.add(3, "Science");
		System.out.println(subjects);
		for(String sub:subjects)
		{
			System.out.println(sub);
		}
	}
}