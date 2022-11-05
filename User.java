package Exception;

public class User {
	public static void main(String[] args) {
		try {
			int age=17;
			if (age<=18) {
				throw new AgeException("not eligible");
			}else {
				System.out.println("eligible");}}
	catch(AgeException e) {
		e.printStackTrace();
	}
	}
}
			
		
		
		
	


