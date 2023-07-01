
import java.util.Locale;
import java.util.Scanner;


public class banco {

  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    Locale.setDefault (Locale.US);



    System.out.println("Digite o seu salário");
    int salario = sc.nextInt();

    double poupanca = salario * 3 / 100;
    double rendaFixa = salario * 4 / 100;
    double poupanca_ano = poupanca * 12;
    double rendaFixa_ano = rendaFixa * 12;

    System.out.println("O saldo da poupança será de: ");
    System.out.println(poupanca);
    
    System.out.println("O saldo da poupança em 1 ano será de: ");
    System.out.println(poupanca_ano);
    
    System.out.println("O saldo dos investimentos em renda fixa será de:");
    System.out.println(rendaFixa);
    
    System.out.println("O saldo da Renda Fixa em 1 ano será de: ");
    System.out.println(rendaFixa_ano);


    sc.close();

  }

}
