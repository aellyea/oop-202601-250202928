# Catatan Minggu 02 (Struktur OOP: Class, Object, Encapsulation)

## Yang saya kerjakan
Saya melengkapi class 'Aset.java' bersama field private, konstruktor, getter, dan setter lalu menambahkan validasi agar kode dan nama tidak kosong, dan juga status tidak null lalu menetapkan nilai status menjadi TERSEDIA dan kondisi menjadi baik.

## Keputusan desain
1. Kode dan nama ditambahkan validasi karena tidak boleh null atau kosong karena akan menghasilkan illegal exception 

2. Semua field menggunakan akses private dan tidak ada setter

3. Kode dinormalisasi menggunakan trim() untuk pembuangan spasi awal dan akhir. Tidak diubah menjadi huruf kapital agar tetap sesuai dengan data asli.

## Kendala
Saya mengalami banyak kesalahan dalam meneliti kode dan hampir menghapus yang diperlukan, serta menemui error saat menjalankan. Solusinya adalah saya mengecek kembali berkali kali.

## Penggunaan AI
- Alat yang dipakai: Claude, Codex
- Bagian yang dibantu AI: Implemenyasi class Aset.Java, validasi field, getter dan pehamaman pengujian
- Prompt utama: 

1. Jelaskan fungsi kode pengujian dari Minggu02AsetTest.java.

2. Cek kembali code yang sudah saya tambahkan dari terhapus, tidak bisa kembali lagi, dan diperbaiki
          
- Yang saya ubah atau tolak dari saran AI, dan alasannya: tidak ada
- Satu hal yang saya pahami lebih baik sekarang:
Penggunaan validasi di field private dan juga penjalanan pengujian untuk memastikan kode berfungsi.