package secao04_estrutura_controle.curso;

public class For1 {

	public static void main(String[] args) {
		
		for(int contador = 0; contador <= 10; contador++)
			System.out.println("i = " + contador);
		
		
		System.out.println("");
		
		for(int contador = 10; contador >= 0; contador -= 2)
			System.out.println("i = " + contador);
		
		System.out.println("");
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++)
				System.out.print("[" + i + " " + j + "]");
			
			System.out.println("");
		}
	}

}
