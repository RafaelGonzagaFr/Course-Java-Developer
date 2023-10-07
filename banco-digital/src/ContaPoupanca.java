public class ContaPoupanca extends Conta {
    private Double valorPoupado = 0.0;

    public void poupar(int tempo, Double valorDoDeposito){
        depositar(valorDoDeposito);
        setSaldo(this.saldo + (((valorDoDeposito * 0.15)*tempo)));
        setValorPoupado(this.valorPoupado+((valorDoDeposito * 0.15)*tempo));
        
    }

    private void setValorPoupado(Double valorPoupado) {
        this.valorPoupado = valorPoupado;
    }

    public Double getValorPoupado() {
        return valorPoupado;
    }

    @Override
    public void sacar(Double valorDoSaque) {
        if(valorDoSaque >= valorPoupado){
            setValorPoupado(this.valorPoupado-valorDoSaque);
        } else {
            setSaldo(this.saldo-valorDoSaque);
        }
    }

    
}
