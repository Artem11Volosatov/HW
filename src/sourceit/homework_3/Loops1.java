package sourceit.homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Loops1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter the integer numbers: ");
		char [] input = sc.next().toCharArray();
		
		for(char number : input) {
			System.out.println(number);
		}
		
//		*****************ÇÎËÎÒÀß ÏÈĞÀÌÈÄÀ ÄÌÈÒĞÈß ÃÎĞÄÎÍÀ*******************
		
		System.out.println("Please, enter the height of the piramid : ");
		
		int height = sc.nextInt();
		for (int i = 0; i <= height; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			
			System.out.println();
		}	
		
		for (int i = height; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
		
//		**************************************************************
		
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7 }, { 8, 9, 10 } };
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {	
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
		
}
	


