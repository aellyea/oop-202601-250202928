# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan
Minggu ini, saya menggunakan konsep polymorphism di Java. Salah satunya implentasinya adalah melakukan overriding pada fungsi hitungDenda(int)
yang terdapat di ruang, laptop, alatlab. Pada aset Ruang, perhitungan menggunakan tarif normal, sedangkan Laptop memiliki tarif dua kali lebih besar dan Alat Lab empat kali lebih besar. Jumlah denda juga tetap memperhitungkan berapa lama aset terlambat dikembalikan serta tarif yang sudah ditetapkan. Kemudian saya memperbarui fitur pencarian di kelas KatalogAset dan membuat dua method cari dengan parameter berbeda, yaitu pencarian berdasarkan kata kunci dan pencarian berdasarkan nama dan jenis aset.


## Keputusan desain
Menggunakan overriding pada method HitungDenda(int) agar setiap subclass dapat mmeiliki perhitungan denda sesuai jenis aset.

Menggunakan overloading pada method cari() agar pencarian aset lebih fleksibel, sehingga pengguna dapat mencari berdasarkan kata kunci maupun jenis aset.

## Kendala
Kendalanya pada saat menjalankan script pengujian uji.sh menggunakan PowerShell karena perintah bash tidak dikenali lalu mengatasi dengan cara menjalankan git bash melalui lokasi bash.exe dan mengubah minggu-aktif.txt agar pengujian bisa dilakukan

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: Implementasi method pada kelas dan juga method cari.
- Prompt utama: "Bantu periksa cara menjalankan dan memahami pengujian Minggu 4" 
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Tidak ada
- Satu hal yang saya pahami lebih baik sekarang:
Saya mulai sedikit memahami perbedaan antara overriding dan juga overloading

Overriding = Penulisan ulang method dari class pada subclass dengan parameter yang sama, namun beda implementasi.

Overloading = Penggunaan nama method yang sama tetapi parameternya yang beda.