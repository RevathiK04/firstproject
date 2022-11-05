package Exception;

public class User1 {
	public static void main(String args[])throws AgeException {
		int age=23;
		if(age<=18) {
			throw new AgeException("not eligible");
		}else {
		System.out.println("Eligible");	
	}
			
		}
	}


