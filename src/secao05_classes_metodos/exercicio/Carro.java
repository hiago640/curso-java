package secao05_classes_metodos.exercicio;

public class Carro {

	private String nomeDoFabricante;
	private String modelo;
	private int ano;

	public Carro(String nomeDoFabricante, String modelo, int ano) {
		this.nomeDoFabricante = nomeDoFabricante;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getNomeDoFabricante() {
		return nomeDoFabricante;
	}

	public void setNomeDoFabricante(String nomeDoFabricante) {
		this.nomeDoFabricante = nomeDoFabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	void apresentar() {
		System.out.printf("Sou um carro de modelo: %s - ano %s, da fabricante %s.", modelo, ano, nomeDoFabricante);;
	}
	
}
