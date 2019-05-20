package Aula8_lab1;

public class Cadastro {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	public Cadastro() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Cadastro(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Cadastro(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public void mostar() {		
		System.out.println(this.nome + " - " + this.sobrenome + " - " + this.idade);
	}
	

}
