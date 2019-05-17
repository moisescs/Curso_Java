
public class TesteLoop {

	public static void main(String[] args) {

		int i = 0 ;
		while(i < 100) {
			System.out.println("Dentro While");
			i +=3;
		}
		
		do {
			System.out.println("Dentro  do While");
			i +=3;
		} while(i < 100);
		
		for (int j = 0; j < 10; j++) {
			System.out.println("Dentro  do for");
		}
	}

}
