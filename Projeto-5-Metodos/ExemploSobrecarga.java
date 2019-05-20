
public class ExemploSobrecarga {

	public static void main(String[] args) {
		exibirNome();
		exibirNome("Moisés");
		exibirNome("Moisés", 10);		

	}
	
	static void exibirNome(String nome, int quantidade) {
		for (int i = 0; i < quantidade ; i++) {
			System.out.println(nome);
		}	
	}
	
	static void exibirNome(String nome) {
		for (int i = 0; i < 10 ; i++) {
			System.out.println(nome);
		}	
	}
	
	
	static void exibirNome() {
		 for (int i = 0; i < 10; i++) {
			System.out.println("Manuel");
		}	
	}
	


}
