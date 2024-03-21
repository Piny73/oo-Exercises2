package ExBankAccount;

abstract class CCBanca {

    private String numeroconto;
    private double saldo;

    public CCBanca(String numeroconto, double saldo) {
        this.numeroconto = numeroconto;
        this.saldo = saldo;
    }

    public String getNumeroConto() {
        return numeroconto;
    }

    public void setNumeroConto(String numeroconto) {
        this.numeroconto = numeroconto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void deposito(double importo);

    public abstract void prelievo(double importo);
    
}
