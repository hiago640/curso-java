package secao05_classes_metodos.curso;

public class Pessoa {

	String nome;
	double peso;
	
	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida){
		System.out.println("Comendo a comida: " + comida.nome);
		this.peso += comida.peso;
	}
	
}
