import java.util.Scanner;


public class rokprzestepny {

	public static void main(String[] args) {
		// jest podzielny przez 4 i jet niepodzielny przez 100 lub jest podzielny przez 400
		// a % 4 == 0 && 100 % == 0
		Scanner wejscie = new Scanner(System.in);
		System.out.print("Podaj rok: ");
		int a = wejscie.nextInt();
		
		if (a<0) {
			
			System.out.println("Liczba jest mniejsza niz zero");
		}
		
		
		else if (a % 4 == 0 && 100 % == 0) {
			
			
			
			
		}
		
		
		
wejscie.close();

	}

}
