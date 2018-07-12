import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter text a: ");
		String a = scanner.nextLine();

		System.out.println("Enter text b: ");
		String b = scanner.nextLine();
		
		if(a.length() >= b.length()) {
			System.out.println("Text: " + b+a+b);
		}else {
			System.out.println("Text: " + a+b+a);
		}
		scanner.close();
			

	}

}
