
public class Teste {

	public static void main(String[] args) {

		Motorista m = new Motorista(1234, "Manuel", 3500.20, "454545", "ABC-1235");
		// Metodos da classe Funcion�rio que foram gerdados;
		// m.setMatricula(14687878);
		// m.setNome("Manuel");
		// m.setSalario(2500.00);

		// Metodos da pr�pria classe Motorista
		// m.setCnh("454545");
		// m.setPlacaAutomovel("ABC-1235");
		
		System.out.println(m);
	}

}


//Metodos Final - Bloqueia a sobrescrita;
//Classe Final - Bloqueia a heran�a, e pode d� um extend nesta classe;
//Classes Abstratas - Precisa ter heran�as, n�o pode d� new nesta classe, n�o � instanciada;