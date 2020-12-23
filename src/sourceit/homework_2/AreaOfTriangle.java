package sourceit.homework_2;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter length of the side A of triangle: ");
		double lenA = sc.nextDouble();
		
		System.out.print("Please, enter length of the side B of triangle: ");
		double lenB = sc.nextDouble();
	
		System.out.print("Please, enter length of the side C of triangle: ");
		double lenC = sc.nextDouble();

		if(((lenA + lenB) < lenC) || ((lenB + lenC) < lenA) || ((lenA + lenC) < lenB)){
			System.out.println("This triangle doesn`t exist :(");
			System.out.println("Try another values");
		} 
		
		double triHalfPer = (lenA + lenB + lenC)/2;
		
		double triangleArea = Math.sqrt(triHalfPer * 
				(triHalfPer-lenA) * 
				(triHalfPer-lenB) * 
				(triHalfPer-lenC));
		
		System.out.println(triangleArea);
		
			}

}
