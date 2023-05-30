package secao10_tratamento_excecoes.personalizadaB;

@SuppressWarnings("serial")
public class NumeroNegativoException extends Exception {

    private String nomeDeAtributo;

    public NumeroNegativoException(String nomeDeAtributo) {
        this.nomeDeAtributo = nomeDeAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está negativo.", nomeDeAtributo);
    }

}
