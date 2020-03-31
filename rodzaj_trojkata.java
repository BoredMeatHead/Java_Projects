import java.util.Scanner;


public class rodzaj_trojkata {

	public static void main(String[] args) {
		//pobrac 3 liczby sprawdzic czy sa dodatnie i czy moga tworzyc trojkat, jezeli tak to sprawdzic jaki to 
		//jest trojkat
		
		Scanner wejscie = new Scanner(System.in);
		System.out.print("Podaj pierwsz¹ liczbê: ");
		float a = wejscie.nextFloat();
		System.out.print("Podaj drug¹ liczbê: ");
		float b = wejscie.nextFloat();
		System.out.println("Podaj trzecia liczbe: ");
		float c = wejscie.nextFloat();
		
		if (a > 0 && b > 0 && c > 0) {
			
			System.out.println("Liczby sa dodatnie");
if (a + b > c && b + c > a && b + c > a) {
				
				System.out.println("Moga utworzyc trojkat");
}
			
			if (a == b && a == c && b == a && b == c && c == a && c == b) {
				
				System.out.println("Jest to trojkat rownoczboczny");
			}
			else if (a >= b+c || c >= b+a || b >= a+c) {
				
				System.out.println("Rownoramienny");
			}
		}
		

	}

}
