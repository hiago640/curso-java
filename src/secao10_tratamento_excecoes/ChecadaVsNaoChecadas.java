package secao10_tratamento_excecoes;

public class ChecadaVsNaoChecadas {

    public static void main(String[] args) {

        try {
            geraErro1();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

    private static void geraErro2() {
        // lance um erro do tipo Runtime com essa mensagem
        throw new RuntimeException("Ocorreu um erro bem legal #02!");
    }

    private static void geraErro1() throws Exception {
        throw new Exception("Ocorreu um erro bem legal #01!");
    }
}
