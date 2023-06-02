package secao07_orientacao_objetos.curso.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa(99.65);
		
		Comida ingrediente1 = new Arroz(0.25);
		Comida ingrediente2 = new Feijao(0.2);
		Comida sobremesa = new Sorvete(0.1);
		
		System.out.println(pessoa.getPeso());
		
		pessoa.comer(ingrediente1);
		pessoa.comer(ingrediente2);
		pessoa.comer(sobremesa);
		
		System.out.println(pessoa.getPeso());
	}
}
