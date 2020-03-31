import java.util.Scanner;


public class znak_iloczynu {
	public static void main(String[] args) {
		
		Scanner wejscie = new Scanner(System.in);
		System.out.print("Podaj pierwsz¹ liczbê: ");
		int a = wejscie.nextInt();
		System.out.print("Podaj drug¹ liczbê: ");
		int b = wejscie.nextInt();
		
		if (a > 0 && b > 0 || a < 0 && b < 0) {
			System.out.println("Iloczyn jest dodatni.");
		} else if (a > 0 && b < 0 || a < 0 && b > 0) {
			System.out.println("Iloczyn jest ujemny.");
		} else {
			System.out.println("Iloczyn to zero.");
		}
		
	}
}