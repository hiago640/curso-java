package secao10_tratamento_excecoes.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {

    private String nomeDeAtributo;

    public NumeroForaIntervaloException(String nomeDeAtributo) {
        this.nomeDeAtributo = nomeDeAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está fora do intervalo.", nomeDeAtributo);
    }

}
