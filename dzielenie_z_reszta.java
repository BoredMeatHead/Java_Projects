import java.util.Scanner;


public class dzielenie_z_reszta {

	public static void main(String[] args) {
		// pobrac z wejscia dwie liczby calkowite wyswietlic wynik dzielenia w postaci np: 17:3=5 r.2 procent % reszta
		// dzielenia
		
		
Scanner wejscie = new Scanner(System.in);
		
		int a=wejscie.nextInt();
		int b=wejscie.nextInt();
		System.out.println("Wynik dzielenia");
		System.out.println(a/b);
		System.out.println("Reszta z dzielenia");
		System.out.println(a%b);
		
		wejscie.close();
	}

}
