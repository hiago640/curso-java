package secao5_classes_metodos.exercicio;

public class ParImpar {

	public void calcular() {
		
		long soma = 0;
		long multiplicacao = 1;
		
		for(int i = 0; i <= 30; i++) {
			
			if(i % 2 == 0) 
				soma += i;
			else
				multiplicacao *= i;
		}
		
		System.out.println(soma);
		System.out.println(multiplicacao);
	}

}
