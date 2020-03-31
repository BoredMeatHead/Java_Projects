import java.util.Scanner;
public class podciag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner wejscie = new Scanner(System.in);
		System.out.println("wpisz dowlony ciag znakow (minimalnie 6 znakow)");
		String c=wejscie.nextLine();
		String a=c.substring(2, 5);
		System.out.println("Fragnebt cuagy od znaku "+3+" do"+5+" :");
		System.out.println(a);
		wejscie.close();
	}

}
