import java.util.Scanner;


public class trojkat {

	public static void main(String[] args) {
		//pobrac 3 liczby sprawdzic czy sa dodatnie i czy moga tworzyc trojkat, jezeli tak to obliczyc jego pole
		
		
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
			
				double p = 0.5*(a+b+c);
				 
				 double pole=Math.sqrt(p*(p-a)*(p-b)*(p-c));
				 
				 System.out.println(pole);
			}
			
			else  {
				
				System.out.println("Nie moga utworzyc");
			}
			 
			 
		
		}
		

		
		
	}

}
