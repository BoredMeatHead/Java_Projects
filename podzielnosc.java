import java.util.Scanner;


public class podzielnosc {

	public static void main(String[] args) {
		// pobrac z wejscia dwie liczby calkowite ( a i b ) , sprawdzic czy a jest podzielne przez b
		
		Scanner wejscie = new Scanner(System.in);
		System.out.print("Podaj pierwsz¹ liczbê: ");
		int a = wejscie.nextInt();
		System.out.print("Podaj drug¹ liczbê: ");
		int b = wejscie.nextInt();
		
		if (a != 0) {
			
			if (a % b == 0) {
				
				System.out.println("Tak jest podzielna");
			}
			else {
				System.out.println("Nie jest podzielna");
				
			}
		}
		
wejscie.close();
	}

}
