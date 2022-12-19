package secao5_classes_metodos.curso;

public class AreaCircunferencia {

	double raio;
	final static double pi = 3.1415;
	
	AreaCircunferencia(double raio){
		this.raio = raio;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}
}
