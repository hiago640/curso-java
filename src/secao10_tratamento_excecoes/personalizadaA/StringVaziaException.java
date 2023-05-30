package secao10_tratamento_excecoes.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

    private String nomeDeAtributo;

    public StringVaziaException(String nomeDeAtributo) {
        this.nomeDeAtributo = nomeDeAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está vazio.", nomeDeAtributo);
    }

}
