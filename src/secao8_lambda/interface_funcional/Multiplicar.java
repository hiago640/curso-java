package secao8_lambda.interface_funcional;

public class Multiplicar implements Calculo {

	@Override
	public double executar(double a, double b) {
		return a * b;
	}

}
