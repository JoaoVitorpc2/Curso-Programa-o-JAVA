package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class dolarHoje {

  public final double DOLAR = 4.92;

  public static void main(String[] args) {


    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite quantos dólares você quer comprar: ");
    
    double somar = sc.nextDouble();
    double resultado = CurrencyConverter.somando(somar);
    double total = somar + resultado;
    double reais = total * 4.92;
    System.out.println();
    System.out.println("Taxa de importação: " + "$ " +resultado);
    System.out.println("Total a pagar em $: " +total);
    System.out.printf("Total a pagar em R$ %.2f%n", reais);
    
  sc.close();

  }

}
