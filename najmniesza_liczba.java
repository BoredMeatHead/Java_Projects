import java.util.Scanner;


public class najmniesza_liczba {

	public static void main(String[] args) {
		// pobrac z wejscia 3 liczby calkowite wyswietlic najmniejsza z nich
		
		Scanner wejscie = new Scanner(System.in);
		System.out.print("Podaj pierwsz¹ liczbê: ");
		int a = wejscie.nextInt();
		System.out.print("Podaj drug¹ liczbê: ");
		int b = wejscie.nextInt();
		System.out.print("Podaj trzecia liczbê: ");
		int c = wejscie.nextInt();
		
		if (a<b && a<c) {
			
			System.out.println("Liczba pierwsza jest najmniejsza");
		}
		
		else if (a>b && b<c) {
			
			System.out.println("Liczba druga jest najmniejsza");
		}
		
		else if (a>c && c<b ) {
			
			System.out.println("Trzecia jest najmniejsza");
		}
		
		else {
			System.out.println("S¹ równe");
		}
			
		wejscie.close();
	}

}
