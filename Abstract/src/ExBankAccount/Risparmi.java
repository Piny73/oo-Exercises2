package ExBankAccount;

class Risparmi extends CCBanca {

    public Risparmi(String numeroconto, double saldo) {
        super(numeroconto, saldo);
    }

    @Override
    public void deposito(double importo) {
        setSaldo(getSaldo() + importo);
        System.out.println("Vuoi depositare €" + importo + " Il saldo attuale è €: " + getSaldo());
    }

    @Override
    public void prelievo(double importo) {
        if (getSaldo() >= importo) {
            setSaldo(getSaldo() - importo);
            System.out.println("Vuoi prelevare €" + importo + " Il saldo attuale è €: " + getSaldo());
        } else {
            System.out.println("Fondi insufficienti. Prelievo non possibile!");
        }
    }
}
