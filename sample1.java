package Exception;

public class sample1 {
public static void main(String args[]) {
	try {
		int num1=10;
		int num2=0;
		System.out.println(num1/num2);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println();
		}
	System.out.println("program end");
		}
}

