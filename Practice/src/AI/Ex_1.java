package AI;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ex_1 {
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter the length of the random string: ");
		        int length = input.nextInt();

		        System.out.print("Enter the number of strings to generate: ");
		        int count = input.nextInt();

		        for (int i = 1; i <= count; i++) {
		            String randomString = generateRandomString(length);
		            char[] chars = randomString.toCharArray();
		            Arrays.sort(chars);
		            String sortedString = new String(chars);
		            System.out.println("String " + i + ": " + sortedString);
		        }

		        input.close();
		    }

		    private static String generateRandomString(int length) {
		        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		        StringBuilder sb = new StringBuilder(length);
		        Random random = new Random();

		        for (int i = 0; i < length; i++) {
		            sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
		        }

		        return sb.toString();
		    }

	}


