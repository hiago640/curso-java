package secao10_tratamento_excecoes.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {

    private String nomeDeAtributo;

    public StringVaziaException(String nomeDeAtributo) {
        this.nomeDeAtributo = nomeDeAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está vazio.", nomeDeAtributo);
    }

}
