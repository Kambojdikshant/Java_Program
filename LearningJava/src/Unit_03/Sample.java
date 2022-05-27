package Unit_03;

import java.util.InputMismatchException;

public class Sample {

	public static void main(String[] args) {
		try {
			int a = 100/0 ; 
			System.out.println(a) ;
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		finally {
		  System.out.println("Done !!");
		}
	}

}
