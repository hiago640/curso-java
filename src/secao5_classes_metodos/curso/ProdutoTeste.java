package secao5_classes_metodos.curso;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4000;
		p1.desconto = 10;
		
		Produto p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 1500;
		p2.desconto = 14;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
	}
	
}
