package id.ac.upb.asetpinjam.model;

/**
 * Minggu 3: aset berupa laptop.
 * Spesifikasi dan nomor inventaris tidak boleh kosong.
 */
public class Laptop extends Aset {

    // Field khusus Laptop
    private String spesifikasi;
    private String nomorInventaris;

    public Laptop(String kode, String nama, String spesifikasi, String nomorInventaris) {
        super(kode, nama);

        if (spesifikasi == null || spesifikasi.trim().isEmpty()) {
            throw new IllegalArgumentException("Spesifikasi tidak boleh kosong");
        }

        if (nomorInventaris == null || nomorInventaris.trim().isEmpty()) {
            throw new IllegalArgumentException("Nomor inventaris tidak boleh kosong");
        }

        this.spesifikasi = spesifikasi.trim();
        this.nomorInventaris = nomorInventaris.trim();
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public String getNomorInventaris() {
        return nomorInventaris;
    }

    @Override
    public JenisAset getJenis() {
        return JenisAset.LAPTOP;
    }
}