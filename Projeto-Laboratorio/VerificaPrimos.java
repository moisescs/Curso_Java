
public class VerificaPrimos {

	public static void main(String[] args) {
		int numero = 337, divisores = 0;
		
		for (int i = 1; i < numero; i++) {			
			if (numero % i == 0) {
				divisores++;		
			}			
		}

		if (divisores < 2) {
			System.out.println(numero + " é primo");			
		}else {
			System.out.println(numero + " não é primo");
		}

	}

}
