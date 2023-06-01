package secao12_generics;

public class CaixaInteiraTeste {

	public static void main(String[] args) {
	
		CaixaInteira caixaInteira = new CaixaInteira();
		caixaInteira.guardar(7);
		
		System.out.println(caixaInteira.abrir());
	}
}
