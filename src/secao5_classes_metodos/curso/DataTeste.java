package secao5_classes_metodos.curso;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		Data d2 = new Data();
		d2.dia = 13;
		d2.mes = 07;
		d2.ano = 1973;
		
		Data d3 = new Data(28, 05, 2001);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
	}
	
}
