
public class condicao_ternaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;
		
		System.out.println(desconto);
	}

}
