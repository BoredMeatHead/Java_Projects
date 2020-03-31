import java.util.Scanner;


public class zaokroglenia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner wejscie = new Scanner(System.in);
		
		double a=wejscie.nextDouble();
		double b=Math.ceil(a);
		double c=Math.floor(a);
		double d=Math.round(a);
	
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		wejscie.close();
	}

}
