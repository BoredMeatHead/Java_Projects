import java.util.Scanner;

public class pole_lub_obwod_figury {

	public static void main(String[] args) {
		//

		Scanner wejscie = new Scanner(System.in);
		System.out.print("Podaj pierwsz¹ liczbê: ");
		float a = wejscie.nextFloat();
		System.out.print("Podaj drug¹ liczbê: ");
		float b = wejscie.nextFloat();
		System.out.println("podaj o albo p");
		String litera = wejscie.nextLine();
		litera = wejscie.nextLine();

		if (a == b) {

			System.out.println("To jest kwadrat wiec nie wykonam else if");

		}

		else if (litera.equals("o")) {

			System.out.println(a * 2 + b * 2);

		}

		if (a == b) {

			System.out.println("To jest kwadrat wiec nie wykonam else if");

		}

		else if (litera.equals("p")) {

			System.out.println(a * b);

		}

		if (a > 0 && b > 0 && a != b) {

			System.out.println("To jest prostokat wiec nie wykonam else if");

		}

		else if (litera.equals("p")) {
			System.out.println("To jest pole");
			System.out.println(a*a);
			System.out.println("Obowd");
			System.out.println(a*4);
		}

			if (a < 0 || b < 0) {

				System.out.println("Liczby sa ujemne");

			}

			else if (a == b) {

				System.out.println("Jest to kwadrat");

			}

			else {

				System.out.println("Jest to prostokat");

			}

	}

}
