package secao07_orientacao_objetos.curso.encapsulamento;

public class Pessoa {

	private int idade;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade >= 0 && idade <= 120)
			this.idade = idade;

	}

}
