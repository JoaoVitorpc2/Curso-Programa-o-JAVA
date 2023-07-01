import java.util.Locale;
import java.util.Scanner;

public class telefonia {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double conta;
		int minutos;
		
		conta = 50.00;
		
		System.out.println("Digite quantos minutos o cliente usou o plano:");
		minutos = sc.nextInt();
		System.out.printf("%n");
		
		if (minutos > 100) {
		
		conta += ( minutos - 100) * 2.0 ;
			
		System.out.printf("Valor incluso a multa R$: %.2f ", conta);	
		
		}else {
			
		System.out.printf("Você paga R$: %.2f", conta);
		
		
	}
		
	
		
		sc.close();
		
		

}
	}