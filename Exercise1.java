package Exception;

public class Exercise1 {
	public static void main(String[] args) {
		try {
			String mail="janurenu@gmail.com";
			if (mail=="@gmail.com") {
				throw new MailException("is not mail");
			}else {
				System.out.println("is a mail");}}
	catch(MailException m) {
		m.printStackTrace();
	}
	}
}
