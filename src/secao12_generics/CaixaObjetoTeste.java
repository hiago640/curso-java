package secao12_generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {

		CaixaObjeto caixaA = new CaixaObjeto();
		
		caixaA.guardar(2.4);
		
//		Integer coisa = (Integer) caixaA.abrir();
		Double coisa = (Double) caixaA.abrir();
		
		System.out.println(coisa);
		
	}
}
