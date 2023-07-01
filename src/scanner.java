import java.util.Locale;
import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		char y;
		Double x;
		
		System.out.printf("Digite um valor para ser atribuído ao X:%n");		
		
		x = sc.nextDouble();
		
		System.out.printf("Valor de X: %.2f%n%n", x);
		
		System.out.printf("Digite um valor para ser atribuído ao Y:%n");
		
		y = sc.next().charAt(0);
		
		System.out.printf("Valor de Y: %s%n ", y);
		
		
		sc.close();
		
		
	}

}
