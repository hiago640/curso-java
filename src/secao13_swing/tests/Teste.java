package secao13_swing.tests;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
	
		Class<?> classe;
		ClassLoader classLoader = Teste.class.getClassLoader();

		List<String> listaMetodos = Arrays.asList("meuMetodo", "meuMetodo2");
		
		try {
			classe = classLoader.loadClass("secao13_swing.tests.MinhaClasse");

			System.out.println("Classe encontrada");
			System.out.println(classe.getCanonicalName());
			
			for (String metodo : listaMetodos) {
				System.out.println("Executando método: " + metodo);
				
				Method method = classe.getMethod(metodo);
				System.out.println("Invocando Metodo...");
				System.out.println(method.invoke(classe.newInstance()));			
				System.out.println("\n");
			}
			
			
		} catch (Exception e) {
			System.out.println("Classe não encontrada");
			System.out.println(e.getLocalizedMessage());
		}
		
	}
	
}
