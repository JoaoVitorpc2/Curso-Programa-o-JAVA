package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BancoP;

public class Banco {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    BancoP banco; // Variável que representa a instância da classe BancoP (uma conta bancária)

    System.out.print("Enter account number: ");
    int number = sc.nextInt(); // Variável que armazena o número da conta bancária
    
    System.out.print("Enter account holder: ");
    sc.nextLine();
    String holder = sc.nextLine(); // Variável que armazena o nome do titular da conta
    System.out.println();
    
    System.out.print("Is there an initial deposit (y/n)? ");
    char response = sc.next().charAt(0); // Variável que armazena a resposta para a existência de um depósito inicial
    
    if (response == 'y') {
      System.out.print("Enter initial deposit value: ");
      double initialDeposit = sc.nextDouble(); // Variável que armazena o valor do depósito inicial
      
      banco = new BancoP(number, holder, initialDeposit); // Cria uma nova instância de BancoP com número de conta, titular e depósito inicial
      
    } else {
      
      banco = new BancoP(number, holder); // Cria uma nova instância de BancoP com número de conta e titular, sem depósito inicial
      
    }
    
    System.out.println();
    System.out.println("Account data:");
    System.out.println(banco); // Imprime os dados da conta bancária (representado pelo objeto banco)
    System.out.println();
    
    System.out.print("Enter a deposit value: ");
    double depositValue = sc.nextDouble(); // Variável que armazena o valor do depósito a ser realizado
    
    banco.deposit(depositValue); // Chama o método deposit() da instância da classe BancoP para realizar o depósito
    
    System.out.println("Updated account data:");
    System.out.println(banco); // Imprime os dados atualizados da conta bancária
    System.out.println();
    
    System.out.print("Enter a withdraw value: ");
    double withdrawValue = sc.nextDouble(); // Variável que armazena o valor do saque a ser realizado
    banco.withdraw(withdrawValue); // Chama o método withdraw() da instância da classe BancoP para realizar o saque
    
    System.out.println("Updated account data:");
    System.out.println(banco); // Imprime os dados atualizados da conta bancária
    
    sc.close(); // Fecha o Scanner
  }
}
