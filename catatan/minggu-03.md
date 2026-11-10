# Catatan Minggu 3: Inheritance

## Yang saya kerjakan
Minggu ini, Saya membuat tiga class yang meliputi Ruang, Laptop, dan Alat Lab dengan menggunakan class induk. Masing-masing class memiliki atribut dan validasi setiap kebutuhan dan juga melengkapi konstruktor, getter, dan method getJenis() agar setiap jenis aset dapat dikenali.

## Keputusan desain
Saya menaruh atribut seperti kode, nama, status, dan kondisi di class Aset karena semua jenis aset memilikinya, sedangkan untuk atribut kapasitas, spesifikasi, nomor inventaris, laboratorium, dan tingkat risiko diletakkan di class turunan masing-masing

Inheritance kurang tepat digunakan karena KategoriAset bukan merupakan jenis dari Aset, melainkan hanya mengelompokkan aset berdasarkan kategori bukan menjadi salah satu jenis.

## Kendala
Saya sempat kesulitan memahami extends, super, @override saat membuat inheritence lalu setelah itu bisa melakukan pengujian.

## Penggunaan AI
- Alat yang dipakai: Claude, ChatGPT
- Bagian yang dibantu AI: Membantu memahami konsep inheritance serta kelengkapan code
- Prompt utama: Jelaskan kepada saya dengan rinci tentang tugas ini dan Perbaikan error
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Tidak ada
- Satu hal yang saya pahami lebih baik sekarang:
Saya jadi lebih memahami cara kerja inheritance dan bagaimana cara menggunakan atribut dan method dari kelas induk dengan extend, super, serta @override dan memahami semua yang tertera sesuai kebutuhan.

