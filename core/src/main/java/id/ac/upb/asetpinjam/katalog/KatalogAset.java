
package id.ac.upb.asetpinjam.katalog;

import java.util.ArrayList;
import java.util.List;

import id.ac.upb.asetpinjam.model.Aset;
import id.ac.upb.asetpinjam.model.JenisAset;

public class KatalogAset {

    private final List<Aset> daftar = new ArrayList<>();

    public void tambah(Aset aset) {
        daftar.add(aset);
    }

    public List<Aset> semua() {
        return List.copyOf(daftar);
    }

    // Mencari aset berdasarkan nama
    public List<Aset> cari(String kata) {
        List<Aset> hasil = new ArrayList<>();

        for (Aset aset : daftar) {
            if (aset.getNama().toLowerCase().contains(kata.toLowerCase())) {
                hasil.add(aset);
            }
        }

        return hasil;
    }

    // Mencari aset berdasarkan nama dan jenis
    public List<Aset> cari(String kata, JenisAset jenis) {
        List<Aset> hasil = new ArrayList<>();

        for (Aset aset : daftar) {
            if (aset.getNama().toLowerCase().contains(kata.toLowerCase())
                    && aset.getJenis() == jenis) {
                hasil.add(aset);
            }
        }

        return hasil;
    }
}
