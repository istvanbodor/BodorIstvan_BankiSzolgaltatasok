package hu.petrik.bankiszolgaltatasok;

import java.util.InputMismatchException;

public class HitelSzamla extends Szamla {

    public int getHitelKeret() {
        return hitelKeret;
    }

    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);

        if (hitelKeret < 0) {
            throw new RuntimeException("A hitelkeret nem lehet negatív");
        } else
        {
            this.hitelKeret = hitelKeret;
        }



    }

    @Override
    public boolean kivesz(int osszeg) {
        if (super.getAktualisEgyenleg()-osszeg > 0 - this.hitelKeret){
            super.aktualisEgyenleg -= osszeg;
            return true;
        }else {
            return false;
        }
    }



}
