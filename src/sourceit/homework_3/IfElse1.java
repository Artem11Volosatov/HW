package sourceit.homework_3;

public class IfElse1 {
	
	public static void main(String[] args) {
		
		String admin = "admin";
		String guest = "guest";
 		
		if (args[0].contains(admin) && args[0].length()>1) {
			System.out.print("Please, select either 'ADMIN' or 'GUEST'");
		}
		else if (args[0].contains(guest)) {
			System.out.print("Hello, guest!");
		}
		else if(args[0].contains(admin)) {
			System.out.print("Hello, admin!");
		}
	}
}