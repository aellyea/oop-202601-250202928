
package id.ac.upb.asetpinjam.model;

import id.ac.upb.asetpinjam.kontrak.DapatDipinjam;

/**
 * Aset yang dapat dipinjam.
 *
 * <p>Minggu 2: lengkapi field, konstruktor, getter/setter, dan validasi (encapsulation).
 * Minggu 3: tambahkan getJenis() di tiap subclass.
 * Minggu 4: hitungDenda() dioverride di tiap subclass.
 * Minggu 5: isi bisaDipinjam() dan ubah menjadi class abstrak
 * (TestSupport.aset(...) di folder test menyesuaikan sendiri, lihat docs/minggu-05.md).
 */
public class Aset implements DapatDipinjam {

    // Field private untuk menjaga encapsulation.
    // Status default TERSEDIA dan kondisi default BAIK.
    private String kode;
    private String nama;
    private StatusAset status = StatusAset.TERSEDIA;
    private Kondisi kondisi = Kondisi.BAIK;

    /**
     * Konstruktor Aset.
     * Kode dan nama tidak boleh null atau kosong.
     */
    public Aset(String kode, String nama) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode tidak boleh kosong");
        }

        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }

        // Normalisasi kode dan nama dengan menghapus spasi di awal dan akhir.
        this.kode = kode.trim();
        this.nama = nama.trim();
    }

    // Getter untuk mengambil kode aset.
    public String getKode() {
        return kode;
    }

    // Getter untuk mengambil nama aset.
    public String getNama() {
        return nama;
    }

    // Getter untuk mengambil status aset.
    public StatusAset getStatus() {
        return status;
    }

    // Getter untuk mengambil kondisi aset.
    public Kondisi getKondisi() {
        return kondisi;
    }

    /**
     * Mengubah nama aset.
     * Nama baru tidak boleh null atau kosong.
     */
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }

        this.nama = nama.trim();
    }

    /**
     * Mengubah status aset.
     * Status tidak boleh null.
     */
    public void setStatus(StatusAset status) {
        if (status == null) {
            throw new IllegalArgumentException("Status tidak boleh null");
        }

        this.status = status;
    }

    /**
     * Mengubah kondisi aset.
     * Kondisi tidak boleh null.
     */
    public void setKondisi(Kondisi kondisi) {
        if (kondisi == null) {
            throw new IllegalArgumentException("Kondisi tidak boleh null");
        }

        this.kondisi = kondisi;
    }

    /**
     * Minggu 5: true hanya jika status TERSEDIA
     * dan kondisi bukan RUSAK_BERAT.
     */
    @Override
    public boolean bisaDipinjam() {
        throw new UnsupportedOperationException("TODO minggu 5");
    }

    /**
     * Minggu 3: dioverride tiap subclass agar
     * mengembalikan jenis yang benar.
     */
    public JenisAset getJenis() {
        throw new UnsupportedOperationException("TODO minggu 3");
    }

    /**
     * Minggu 4: denda keterlambatan.
     * Dioverride tiap subclass sesuai aturan bisnis.
     */
    public long hitungDenda(int hariTerlambat) {
        throw new UnsupportedOperationException("TODO minggu 4");
    }
}
