import java.util.Scanner;


public class rownanieliniowe {

	public static void main(String[] args) {
		// podac dwie liczby rzeczywiste (a,b - wspo�czynniki rownania liniowego) znalezc rozwizanie tego rownania
		
		Scanner wejscie = new Scanner(System.in);
		System.out.print("Podaj pierwsz� liczb�: ");
		float a = wejscie.nextFloat();
		System.out.print("Podaj drug� liczb�: ");
		float b = wejscie.nextFloat();
		
		if (a != 0) {
			
			float c = -b/a;
			System.out.println("Rozwiazanie rownania wynosi" + c);
		}

		else if (b == 0) {
			
			System.out.println("Rownanie ma nieskoczenie wiele rozwiazan");
	
		}
		
		else {
			
			System.out.println("rownanie nie ma rozwiazan");
		}
	}

}
