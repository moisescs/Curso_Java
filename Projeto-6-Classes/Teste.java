
public class Teste {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.numero = 8585;
		c1.nome = "Moisés";
		c1.depositar(1200.96);
		
		
		c1.depositar(150.00);
		c1.retirar(300.00);
		
		System.out.println("Dados da conta:");
		System.out.println(c1.numero);
		System.out.println(c1.nome);
		System.out.println(c1.getSaldo());
	}

}
