package secao07_orientacao_objetos.curso.abstrato;

public abstract class Mamifero extends Animal {

	@Override
	public String mover() {
		return "Usando as patas";
	}
	
	public abstract String mamar();
}
