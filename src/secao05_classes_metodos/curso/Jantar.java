package secao05_classes_metodos.curso;

public class Jantar {

	public static void main(String[] args) {

		System.out.println("Bem vindo ao nosso jantar.");
		
		Comida arroz = new Comida("Arroz", 0.470);
		Comida feijao = new Comida("Feijão", 0.257);
		
		Pessoa joao = new Pessoa("João", 73.405);
		
		System.out.println("Boa noite " + joao.nome + "!");
		System.out.println("O seu peso atual é: " + joao.peso + "\n");
		
		joao.comer(arroz);
		System.out.println("Após o prato de arroz...");
		System.out.println("O seu peso atual é: " + joao.peso + "\n");
		
		joao.comer(feijao);
		System.out.println("Após o prato de feijão...");
		System.out.println("O seu peso atual é: " + joao.peso);
	}

}
