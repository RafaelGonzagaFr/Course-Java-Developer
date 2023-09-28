public class Conta {
    protected String conta;
    protected String agencia;
    protected String portadorDaConta;
    protected Double saldo = 0.0;
    

    public String getConta() {
        return conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getPortadorDaConta() {
        return portadorDaConta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setPortadorDaConta(String portadorDaConta) {
        this.portadorDaConta = portadorDaConta;
    }

    public void sacar(Double valorDoSaque) {
        if(valorDoSaque > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            setSaldo(this.saldo - valorDoSaque);
        }
        
    }

    public void depositar(Double valorDoDeposito) {
        setSaldo(this.saldo + valorDoDeposito);
    }
}
