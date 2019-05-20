package Aula8_lab1;

public class Aula8_lab1 {

	public static void main(String[] args) {

		Cadastro cad1 = new Cadastro();
		cad1.mostar();
		
		Cadastro cad2 = new Cadastro("Moises", "Silva");
		cad2.mostar();
		
		Cadastro cad3 = new Cadastro("Moises", "Silva", 42);
		cad3.mostar();
		

	}

}
