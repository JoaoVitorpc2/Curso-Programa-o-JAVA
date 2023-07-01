import java.util.Locale;
import java.util.Scanner;
public class funcao_matematica2 {
	
	public static void main (String [] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double a;
		double b;
		double c;
		
		System.out.println ("Digite o valor de A:");
		a = sc.nextDouble ();
		
		System.out.println ("Digite o valor de B:");
		b = sc.nextDouble ();
		
		System.out.println ("Digite o valor de C:");
		c = sc.nextDouble ();
		
		double delta = Math.pow (b, 2.0) - 4 * a * c;
		double x1 = (-b + Math.sqrt (delta)) / (2.0 * a);
		double x2 = (-b - Math.sqrt (delta)) / (2.0 * a);
		
		System.out.println ("Resultado X1: " + x1);
		System.out.println ("Resultado X2: " + x2);
		
		sc.close ();
		
	}
	
}
