
public class ParametrosInvalidosException extends Exception {
    private int numeroInicial;
    private int numeroFinal;

    public ParametrosInvalidosException(int numeroInicial, int numeroFinal) {
        super();
        this.numeroInicial = numeroInicial;
        this.numeroFinal = numeroFinal;
    }

    @Override
    public String toString() {
        return "Parâmetro inicial("+this.numeroInicial+") maior que o final("+this.numeroFinal+")";
    }
}
