package secao8_lambda.interface_funcional;

public class CalculoTesteLambda {

	public static void main(String[] args) {

		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(2, 3));

		// quando n�o coloca as {}, a express�o ap�s o -> o Java j� identifica que o
		// resultado da express�o � retornado
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));

	}

}
