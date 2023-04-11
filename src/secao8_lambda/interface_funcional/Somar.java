package secao8_lambda.interface_funcional;

public class Somar implements Calculo {

	@Override
	public double executar(double a, double b) {
		return a + b;
	}
	
}
