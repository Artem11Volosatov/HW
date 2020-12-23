package sourceit.homework_3;


import java.util.Scanner;

public class Strings2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter any text you want: ");
		String text = sc.nextLine();
		
		String[] textArr = text.split("[\\p{Punct}\\s]+");

		for (String wordsArr : textArr) {
			System.out.println(wordsArr);
		}
		
	}
}
