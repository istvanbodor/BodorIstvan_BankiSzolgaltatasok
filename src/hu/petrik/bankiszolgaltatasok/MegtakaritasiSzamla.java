package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    public static double alapKamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat;
    }


    @Override
    public boolean kivesz(int osszeg) {
        if (super.getAktualisEgyenleg() - osszeg >0) {
            super.aktualisEgyenleg -=osszeg;
            return true;
        }else {
            return false;
        }
    }


    public void kamatJovairas() {
        super.aktualisEgyenleg =(int) (aktualisEgyenleg*(1+kamat/100));
    }


}
