package learning;

public class Selenium {
	private static int age=45;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Shireesh Ithineni";
		System.out.println("My age is " +age);
		System.out.println("My Name is : "+name);
//		displayAddress();
		Selenium sel = new Selenium();
		sel.displayAddress();
		sel.displayAddress();
		
	}

public void displayAddress() {
	
	System.out.println("Sydney");
	System.out.println("Victoria");
	System.out.println("MelB");
	System.out.println("Tarneit");
	System.out.println("Brisbane");
	System.out.println("My age is " +age);
	
}
}
