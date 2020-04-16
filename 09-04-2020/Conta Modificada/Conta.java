package testeconta;

class Conta {

    public String titular;
    private int numero;
    private String agencia;
    private double saldo;
    protected Data dataDeAbertura;

    private boolean saca(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    private void deposita(double valor) {
        this.saldo += valor;
    }

    protected double calculoRendimento() {
        this.saldo = this.saldo * 0.1;
        return this.saldo;
    }

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        return dados;
    }

}
