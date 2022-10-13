package hu.petrik.bankiszolgaltatasok;

public abstract class Kartya extends BankiSzolgaltatas {

    private Szamla szamla;
    private String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }


    public String getKartyaSzam() {
        return kartyaSzam;
    }
    //todo vasarlas
}