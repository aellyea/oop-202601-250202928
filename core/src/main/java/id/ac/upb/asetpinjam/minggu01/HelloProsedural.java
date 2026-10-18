
package id.ac.upb.asetpinjam.minggu01;

import id.ac.upb.asetpinjam.config.Varian;

/**
 * Minggu 1, gaya PROSEDURAL: hanya fungsi statis dan data primitif, tanpa objek buatan sendiri.
 */
public final class HelloProsedural {

    private HelloProsedural() {
    }

    public static String sapa(String nama, String nim) {
        return "Hello Aset-Pinjam, saya " + nama + " (" + nim + ")";
    }

    public static void main(String[] args) {
        Varian v = Varian.aktif();
        System.out.println(sapa(v.nama, v.nim));
    }
}
