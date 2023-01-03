package secao6_arrays_collections.curso.virado_no_jiraya.test;

import secao6_arrays_collections.curso.collections.list.Smartphone;

public class EqualsTest01 {

	public static void main(String[] args) {
		
		Smartphone s1 = new Smartphone("1ABC1", "iPhone");
		Smartphone s2 = new Smartphone("1ABC1", "Pixel");
		
		System.out.println(s1.equals(s2));
		
		s2 = s1;
		
		System.out.println(s1.equals(s2));
		
		
	}
	
}
