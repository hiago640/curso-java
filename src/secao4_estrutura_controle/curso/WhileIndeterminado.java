package secao4_estrutura_controle.curso;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		String valor = "";
		
		while (!"sair".equalsIgnoreCase(valor)) {
			System.out.println("Você diz: ");
			valor = n.nextLine();
		}
		
		n.close();
	}

}
