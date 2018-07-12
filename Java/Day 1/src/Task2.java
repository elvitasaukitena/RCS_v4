import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//Refactor-rename 
		
		System.out.println("Enter value x: ");
		int x = scanner.nextInt(); 

		System.out.println("Enter value y: ");
		int y = scanner.nextInt();
		
		System.out.println("Enter value z: ");
		int z = scanner.nextInt();
		scanner.close();
		
		int sum = x + y + z; 
		double avg = sum / 3.0; // var arî double avg = (double) sum / 3;
				
		System.out.println("Avg: " + avg);
		
		int maxValue = x > y ? x : y;
		System.out.println("MaxValue is " + maxValue);
		
		int newMaxValue;
		if (x > y) {
			newMaxValue = x;
		}else {
			newMaxValue = y;
		}
		System.out.println("newMaxValue is " + newMaxValue);
	}

}
