package secao05_classes_metodos.curso;

public class Data {

	public int dia;
	public int mes;
	public int ano;
	
	public Data(){
//		dia = 01;
//		mes = 01;
//		ano = 1970;
		this(1, 1, 1970);
	}
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String obterDataFormatada() {
		String formato = "%d/%d/%d";
		return String.format(formato, this.dia, this.mes, this.ano);
	}
	
}
