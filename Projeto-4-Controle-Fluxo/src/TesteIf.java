
public class TesteIf {

	public static void main(String[] args) {
		
		int idade = 16;
		
		if (idade < 18) {
			System.out.println("Entrada Proibida");
			System.out.println(" ..... ");
		}	else
			System.out.println("Entrada Permitida");
		
		int hora = 19;
		
		if (hora < 12) {
			System.out.println("Dom Dia!");
		} else if (hora < 18){
			System.out.println("Boa Tarde!");
		} else {
			System.out.println("Boa Noite!");
		}
			
			
	}

}
