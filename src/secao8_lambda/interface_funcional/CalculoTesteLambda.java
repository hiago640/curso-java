package secao8_lambda.interface_funcional;

public class CalculoTesteLambda {

	public static void main(String[] args) {

		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(2, 3));

		// quando não coloca as {}, a expressão após o -> o Java já identifica que o
		// resultado da expressão é retornado
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));

	}

}
