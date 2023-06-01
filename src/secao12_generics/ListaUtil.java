package secao12_generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimoElemento(List<?> list) {
		return list.get(list.size() - 1);
	}
	
	public static <T> T getUltimoElementoGenerics(List<T> list) {
		return list.get(list.size() - 1);
	}

}
