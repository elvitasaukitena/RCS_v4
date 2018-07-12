import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value x: ");
		int x;
		x = sc.nextInt(); 

		System.out.println("Enter value y: ");
		int y = sc.nextInt();
		sc.close();
		int sum = x + y; 
		System.out.println("Sum: " + sum);
	}

}
