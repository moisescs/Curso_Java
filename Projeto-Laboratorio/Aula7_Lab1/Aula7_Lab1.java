package Aula7_Lab1;

public class Aula7_Lab1 {

	public static void main(String[] args) {
		
		Funcionario fun = new Funcionario();
		fun.nome = "Moises";
		fun.sobrenome = "Silva";
		fun.cargo="Analista";
		fun.salario = 1800.50;
		
		System.out.println("Nome: " + fun.nome);
		System.out.println("Sbrenome: " + fun.sobrenome);
		System.out.println("Cargo: " + fun.cargo);
		System.out.println("Salário: " + fun.salario);
		

	}

}
