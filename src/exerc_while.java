import java.util.Scanner;

public class exerc_while {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int senha = 2002;
		
		int entrada;
		int entrada2;
		
		System.out.printf ("Digite sua senha: %n--------------%n");
		entrada = sc.nextInt ();
		
		System.out.printf ("Confirme sua senha: %n--------------%n");
		entrada2 = sc.nextInt ();
		
		while (entrada != senha && entrada2 != senha) {
			
			System.out.println ("Senha Inválida");
			
		}
		
			System.out.println ("Acesso permitido");
		
		sc.close ();
		
	}
	
}
