package course;

import java.util.Scanner;

public class funcoes_30_04_2023 {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println ("Digite três números: ");

		int a = sc.nextInt ();
		int b = sc.nextInt ();
		int c = sc.nextInt ();

		int higher = max(a,b,c);

		showResult(higher);			

		sc.close ();
	}

// Declarando Função 
	
	public static int max (int x, int y, int z) {

		int aux;

		if(x>y && x > z) {
			aux = x;
		} 
		else if (y>z) {
			aux = y;	
		} 
		else {
			aux = z;
		}

		return aux; // Retorna função
	}
	
	// Declarando outra função
	
	public static void showResult (int value) {
		System.out.println ("Máximo = "+value);
	}

}
