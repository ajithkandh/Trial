package AI;

import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;

public class Ex_2 {
    public static void main(String[] args) {
        // Step 1: Read the contents of the file into a String object
        String content = "";
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Admin\\Desktop\\New Text Document (3).txt"));
            while (scanner.hasNextLine())
            {
                content += scanner.nextLine() + " ";
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }
        
        // Step 2: Remove all the punctuation marks from the String object
        content = content.replaceAll("[^a-zA-Z ]", "");
        
        // Step 3: Convert the entire String object into lowercase letters
        content = content.toLowerCase();
        
        // Step 4: Split the String object into an array of words
        String[] words = content.split("\\s+");
        
        // Step 5: Create a HashMap object to store the word count
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        
        // Step 6: Iterate through the array of words and update the word count in the HashMap
        for (String word : words) {
            if (wordCount.containsKey(word))
            {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } 
            else {
                wordCount.put(word, 1);
            }
        }
        
        // Step 7: Print the word count for each word in the HashMap
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }
    }
}



