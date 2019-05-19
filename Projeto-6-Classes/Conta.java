
public class Conta {
	
	public int numero;
	public String nome;
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

//	public void setSaldo(double saldo) {
//		this.saldo = saldo;
//	}

	public void depositar(double v) {
		saldo += v;
	}
	
	public void retirar (double v) {
		if( v <= saldo)
			saldo -= v;
		else 
			System.out.println("Saldo insuficiente!");
		
		saldo -= v;
	}

}
