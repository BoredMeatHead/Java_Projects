import java.util.Scanner;


public class srodkowa_liczba {

	public static void main(String[] args) {
		// pobrac z wejscia 3 liczby rzeczywiste wyswietlic srodkowa co do wielkosci
		
		Scanner wejscie = new Scanner(System.in);
		System.out.print("Podaj pierwsz� liczb�: ");
		int a = wejscie.nextInt();
		System.out.print("Podaj drug� liczb�: ");
		int b = wejscie.nextInt();
		System.out.print("Podaj trzecia liczb�: ");
		int c = wejscie.nextInt();
		
		if (b > a && a > c || c > a && a>b) {
			
			System.out.println("Liczba pierwsza to ta srodkowa");
			
		}

		else	if (b < a && b > c || c > b && b>a) {
			
			System.out.println("Liczba druga to ta srodkowa");
			
		}
		
else	if (a > c && c > b || b > c && c>a) {
			
			System.out.println("Liczba trzecia to ta srodkowa");
			
		}
		
	}

}
