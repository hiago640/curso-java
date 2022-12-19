package secao5_classes_metodos.curso;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4000);
		
		Produto p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 1500;

		Produto.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(p1.precoComDesconto());
		
		System.out.println(p2.nome);
		System.out.println(p2.preco);
		System.out.println(p2.precoComDesconto());
	}
	
}
