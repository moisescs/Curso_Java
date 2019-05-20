package Aula7_Lab5;

public class Aula7_Lab5 {

	public static void main(String[] args) {
		
		Aluno joao = new Aluno();
		joao.setNome("João");
		joao.contatdorDeAlunos++;
		joao.imprimeAluno();
		System.out.println("Contagem do Objeto Joao " + joao.contatdorDeAlunos);
		
		System.out.println("\n");
		
		Aluno maria = new Aluno();
		maria.setNome("Maria");
		maria.contatdorDeAlunos++;
		maria.imprimeAluno();
		System.out.println("Contagem do Objeto maria " +  maria.contatdorDeAlunos);
		
		System.out.println("\n");
		
		Aluno marcos = new Aluno();
		marcos.setNome("Marcos");
		marcos.contatdorDeAlunos++;
		marcos.imprimeAluno();
		System.out.println("Contagem do Objeto marcos " + marcos.contatdorDeAlunos);
		
		System.out.println("\n");
		
	}

}
