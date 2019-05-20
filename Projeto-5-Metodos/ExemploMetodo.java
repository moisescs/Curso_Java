
public class ExemploMetodo {
	
	public static void main(String[] args) {
		System.out.println("Exibindo o nome: ");
		exibirNome("Moisés", 2);		
	}

	static void exibirNome() {
		 for (int i = 0; i < 10; i++) {
			System.out.println("Manuel");
		}	
	}
	
	static void exibirNome(String nome, int quantidade) {
		for (int i = 0; i < quantidade ; i++) {
			System.out.println(nome);
		}	
	}
	
}
