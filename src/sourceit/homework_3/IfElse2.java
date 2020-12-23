package sourceit.homework_3;

public class IfElse2 {

	public static void main(String[] args) {
		double resultD;
		int resultI;
	
		if (args[0].contains(".")||args[1].contains(".")){
			resultD = Double.parseDouble(args[0]) + Double.parseDouble(args[1]) ;
			System.out.println("The result of addition " + resultD);
		} else {
			resultI = Integer.parseInt(args[0]) + Integer.parseInt(args[1]) ;
			System.out.println("The result of addition " + resultI);
			}
		
		}	
	}
	
