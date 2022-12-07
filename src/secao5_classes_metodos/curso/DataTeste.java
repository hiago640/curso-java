package secao5_classes_metodos.curso;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 28;
		d1.mes = 05;
		d1.ano = 2001;
		
		Data d2 = new Data();
		d2.dia = 13;
		d2.mes = 07;
		d2.ano = 1973;

		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
	
}
