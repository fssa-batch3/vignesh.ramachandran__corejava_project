package day05.practice;

public class App {

	public static void main(String[] args) {
		
		// AXIS
		AxisATM axis1 = new AxisATM();
		
		axis1.deposit("12E45", 45000.00);
		
		try {
			axis1.withdraw("12E45", 1000);
			System.out.println(axis1.getBalance());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(axis1.getBalance());
		}
		
		
	//	
		
		
		// ICICI
		IciciATM icici1 = new IciciATM();
		
		icici1.deposit("12E45", 40000.00);
		
		try {
			icici1.withdraw("98U765", 200);
			System.out.println(icici1.getBalance());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Current Balance: " + icici1.getBalance());
		}
		
		
		
		
		
	}

}
