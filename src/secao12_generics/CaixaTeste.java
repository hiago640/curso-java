package secao12_generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Tu te tornas eternamente responsável por aquilo que cativas.");
		
		System.out.println("Desempacotando a caixaA: " + caixaA.abrir());
		
		Caixa<Integer> caixaB = new Caixa<>();
		caixaB.guardar(42);
		
		System.out.println("Desempacotando a caixaB: " + caixaB.abrir());
		
		Caixa<Caixa<Integer>> caixaC = new Caixa<>();
		caixaC.guardar(caixaB);
		
		System.out.println("Desempacotando a caixaC que dentro tem a caixaB: " + caixaC.abrir().abrir());
	}
	
}
