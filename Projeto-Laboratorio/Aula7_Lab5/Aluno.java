package Aula7_Lab5;

public class Aluno {
	public static int contatdorDeAlunos;
	private String nome;	
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimeAluno() {
		System.out.println("Aluno: " + this.nome);
	}
	
}
