
import java.util.Scanner;

public class for_Example3 {
	
	public static void main (String [] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		
		double numero_dec;
		double numero_dec1;
		double numero_dec2;
		
		int med1 = 2;
		int med2 = 3;
		int med3 = 5;
		
		int soma_peso = med1 + med2 + med3;
		
		for(int i = 0; i<1; i++) {
			
			System.out.println ("Digite 3 valores: ");
			
			numero_dec = sc.nextDouble();
			numero_dec1 = sc.nextDouble();
			numero_dec2 = sc.nextDouble();
			
			double resultado = numero_dec * med1 / (soma_peso);
			double segundo_resultado = numero_dec1 * med2 / (soma_peso);
			double terceiro_resultado = numero_dec2 * med3 / (soma_peso);
			
			
			
			System.out.println("------------------------");
			System.out.println ("Fórmula do Resultado: ");
			System.out.println("------------------------");
			
			System.out.println (numero_dec + " * " + med1 + " / " +soma_peso + " = " + resultado);
			System.out.println (numero_dec1 + " * " + med2 +" / " +soma_peso + " = " + segundo_resultado);
			System.out.println (numero_dec2 + " * " + med3 + " / " +soma_peso + " = " + terceiro_resultado);
			
			System.out.println ("");
		}
		
	sc.close ();
		
		
	}
	
}
