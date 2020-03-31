import java.util.Scanner;


public class dzialania_cztery {

	public static void main(String[] args) {
		// pobrac z wejscia dwie liczby calkowite
		// wykonac 4 podstawowe dzialania arytmetyczne
		// wyswietlic je (wynik dzielenia musi byc dokladny)
		
Scanner wejscie = new Scanner(System.in);
		
		int a=wejscie.nextInt();
		int b=wejscie.nextInt();
		float iloraz=(float)a/b;
		System.out.println(a+b);
		System.out.println("To wynik dodawania");
		System.out.println(a-b);
		System.out.println("To wynik odejmowania");
		System.out.println(iloraz);
		System.out.println("To wynik dzielenia");
		System.out.println(a*b);
		System.out.println("Wynik mno¿enia");
		wejscie.close();


	}

}
