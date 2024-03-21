package ExBankAccount;

public class AppCCBanca {
    public static void main(String[] args) {
        
        double sal,d€,p€;
        sal = 10000.00;
        Risparmi risparmi = new Risparmi ("Ris2024", sal);
        System.out.println("Saldo risparmi €: " + sal);
        d€ = 1500.00;
        risparmi.deposito(d€);
        p€ = 500.00;
        risparmi.prelievo(p€);
        p€ = 250.00;
        risparmi.prelievo(p€);
        System.out.println();

        //sal = 5000;
        //SaldoAttuale saldoattuale = new SaldoAttuale("Sal2024", sal);
        //System.out.println("Saldo attuale €: " + saldoattuale);
        //d€ = 2500.00;
        //saldoattuale.deposito(10000.0);
		//p€ = .00;
        //saldoattuale.prelievo(.0);
		//p€ = .00;

    }
}
