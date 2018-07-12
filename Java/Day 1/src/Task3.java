import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value a: ");
		int a = scanner.nextInt();

		System.out.println("Enter value b: ");
		int b = scanner.nextInt();
		int sum = a + b;

		if (sum <= 19 && sum >= 10) {
			System.out.println("20");
		}else if(sum <10 || sum > 19){
			System.out.println("Sum is " + sum);
			scanner.close(); 
		}
			
			
	}

}


