package sourceit.homework_3;

import java.util.Formatter;

public class Strings1 {
	
	public static void main(String[] args) {
		
		Formatter formatter1 = new Formatter();
		Formatter formatter2 = new Formatter();
		Formatter formatter3 = new Formatter();
		Formatter formatter4 = new Formatter();
		Formatter formatter5 = new Formatter();
		
		formatter1.format("%, .1f", Math.PI);
		System.out.println(formatter1);
		
		formatter2.format("%, .2f", Math.PI);
		System.out.println(formatter2);
		
		formatter3.format("%, .3f", Math.PI);
		System.out.println(formatter3);
		
		formatter4.format("%, .4f", Math.PI);
		System.out.println(formatter4);
		
		formatter5.format("%, .5f", Math.PI);
		System.out.println(formatter5);
		
		
		}	
}
