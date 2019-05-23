
public class Teste {

	public static void main(String[] args) {
		Cachorro.qtdCaudas = 1;
		
		Cachorro c = new Cachorro();
		c.cor = "Branco";
		
		exibeOla();
		

	}
	
	 public static void exibeOla() {
		 System.out.println("Olá !!!");
	 }

}
