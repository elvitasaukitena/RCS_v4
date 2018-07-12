import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ievadiet vadu un uzvârdu: ");
		String name  = scanner.nextLine();
		scanner.close();
		
		int spaceIndex = name.indexOf(' ');
		
		if (spaceIndex > 0) {
			String name1 = name.substring(0, spaceIndex);
			name1 = name1.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
			
			String surname = name.substring(spaceIndex + 1).toUpperCase();
			
			System.out.println("'" + name1 + "'");
			System.out.println("'" + surname + "'");
		} else {
			System.out.println("Nepareiza ievade!");
		}
		
	}

}
