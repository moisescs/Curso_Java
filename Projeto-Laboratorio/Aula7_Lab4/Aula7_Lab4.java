package Aula7_Lab4;
import Aula7_Lab3.Calculadora;

public class Aula7_Lab4 {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println("Metodos subtratir sobrecarregados");
		System.out.println("Chamando a versão de subtrair com 2 double: " + calc.subtrair(5.8, 4.5));
		System.out.println("Chamando a versão de subtrair com 1 double e 1 int: " + calc.subtrair(5.8, 4));
		System.out.println("Chamando a versão de subtrair com 1 int e 1 double: " + calc.subtrair(8, 4.5));
	}
}
