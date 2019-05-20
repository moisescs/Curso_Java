package carro;

public class Garagem {
	
    public Carro carroPasseio;
	public Carro carroUtilitario;
	
	public static void main(String[] args) {
		Garagem g = new Garagem();
				
		g.carroPasseio = new Carro();
		g.carroPasseio.cor = "Vermelho";		
		g.carroPasseio.modelo = "Ferrari";
		g.carroPasseio.potencia = "4.0";
		
		g.carroUtilitario = new Carro();
		g.carroUtilitario.cor = "Branco";
		g.carroUtilitario.modelo = "Renault Boxer";
		g.carroUtilitario.potencia = "3.8";
		
		
		System.out.println("Carro de Passeio: ");
		System.out.println("Cor: " + g.carroPasseio.cor);
		System.out.println("Modelo: " + g.carroPasseio.modelo);
		System.out.println("Potencias: " + g.carroPasseio.potencia);
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Carro Ultilitário: ");
		System.out.println("Cor: " + g.carroUtilitario.cor);
		System.out.println("Modelo: " + g.carroUtilitario.modelo);
		System.out.println("Potencias: " + g.carroUtilitario.potencia);
		
		

	}

}
