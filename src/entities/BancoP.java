package entities;

public class BancoP {

  private int number; // Número da conta bancária
  private String holder; // Titular da conta bancária
  private double balance; // Saldo da conta bancária

  public BancoP(int number, String holder) {
    this.number = number; // Inicializa o número da conta
    this.holder = holder; // Inicializa o titular da conta
  }

  public BancoP(int number, String holder, double initialDeposit) {
    this.number = number; // Inicializa o número da conta
    this.holder = holder; // Inicializa o titular da conta
    deposit(initialDeposit); // Realiza um depósito inicial na conta
  }

  public int getNumber() {
    return number; // Retorna o número da conta
  }

  public String getHolder() {
    return holder; // Retorna o titular da conta
  }

  public void setHolder(String holder) {
    this.holder = holder; // Define um novo titular para a conta
  }

  public double getBalance() {
    return balance; // Retorna o saldo da conta
  }

  public void deposit(double amount) {
    balance += amount; // Realiza um depósito na conta, aumentando o saldo
  }

  public void withdraw(double amount) {
    balance -= amount + 5.0; // Realiza um saque na conta, diminuindo o saldo e aplicando uma taxa de 5.0
  }

  public String toString() {
    return "Account " +
      number +
      ", Holder: " +
      holder +
      ", Balance: $" +
      String.format("%.2f", balance); // Retorna uma representação em formato de string dos dados da conta
  }
}
