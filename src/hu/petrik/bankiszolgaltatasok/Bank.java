package hu.petrik.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Szamla> szamlaLista = new ArrayList<>();

    public Bank() {
    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int HitelKeret) {
        if (HitelKeret == 0) {
            MegtakaritasiSzamla megtakaritasi = new MegtakaritasiSzamla(tulajdonos);
            szamlaLista.add(megtakaritasi);
            return megtakaritasi;
        } else {
            HitelSzamla hitelszamla = new HitelSzamla(tulajdonos, HitelKeret);
            return hitelszamla;

        }
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos) {
        int osszeg = 0;
        for (Szamla sz : szamlaLista) {
            if (sz.getTulajdonos() == tulajdonos) {
                osszeg += sz.getAktualisEgyenleg();
            }
        }
        return osszeg;
    }

    public Szamla LegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {

        int index = 0;
        int legnagyobb = szamlaLista.get(0).getAktualisEgyenleg();
        for (int i = 0; i < szamlaLista.size(); i++) {
            if (szamlaLista.get(i).getAktualisEgyenleg() > legnagyobb) {
                legnagyobb = szamlaLista.get(i).getAktualisEgyenleg();
                index = i;
            }
        }
        return szamlaLista.get(index);

    }

    public long getOsszHitelKeret() {
        long osszeg = 0;
        for (Szamla sz : szamlaLista) {
            if (sz instanceof HitelSzamla) {
                osszeg += ((HitelSzamla) sz).getHitelKeret();
            }
        }
        return osszeg;
    }


}
