
public class Teste {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(5623, "Moises Silva", 1550.56);
		Conta c2 = new Conta(5624, "Joaquim Lima", 3550.56);
		Conta c3 = new Conta(5625, "Maria Rodrigues", 50.56);
		
		System.out.println(c1.getDados());
		System.out.println(c2.getDados());
		System.out.println(c3.getDados());

	}

}
