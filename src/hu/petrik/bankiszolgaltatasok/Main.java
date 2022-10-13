package hu.petrik.bankiszolgaltatasok;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Tulajdonos tulajdonos = new Tulajdonos("Bodor István");

        bank.szamlanyitas(tulajdonos,0);
        bank.szamlanyitas(tulajdonos,100000);
        System.out.println(bank.getOsszegyenleg(tulajdonos));
        System.out.println(bank.getOsszHitelKeret());
        HitelSzamla xd =(HitelSzamla) bank.szamlanyitas(tulajdonos,1000000000);
        xd.befizet(1000000000);
        xd.kivesz(100045);
        xd.ujKartya("xdadadadada12345");
        System.out.println(xd.aktualisEgyenleg);
        System.out.println(bank.getOsszegyenleg(tulajdonos));
        System.out.println(bank.getOsszHitelKeret());
        xd.befizet(555);
        System.out.println(xd.aktualisEgyenleg);
        xd.kivesz(3333333);
        System.out.println(xd.getAktualisEgyenleg());




    }
}
