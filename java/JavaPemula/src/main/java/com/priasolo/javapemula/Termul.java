/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.priasolo.javapemula; // "Package" ini adalah alamat kelompok buat "Class Termul", jadi Java tahu File ini bagian dari Project yg mana.

/**
 *
 * @author rheinsullivan
 */
public class Termul { // "Termul" adalah nama "Class", bayangin ini seperti formulir kosong yg punya kolom "jenis", "umur", dan "warna".
    String jenis; // "jenis" adalah "Variable Instance" bertipe "String", jadi isinya cocok buat teks seperti nama jenis benda, jenis hewan, atau jenis barang.
    int umur; // "umur" adalah "Variable Instance" bertipe "int", jadi isinya cocok buat angka bulat seperti umur orang, jumlah tahun, atau jumlah hari.
    String warna; // "warna" adalah "Variable Instance" bertipe "String", jadi isinya cocok buat teks warna seperti hitam, putih, merah, biru, atau cokelat.
    
    void emakEmak() // "emakEmak" adalah "Method Void", artinya ini tempat aksi, tapi saat ini belum ada isi perintahnya.
    { // Kurung kurawal ini membuka isi "Method emakEmak", bayangin kayak ruang kosong yg nanti bisa diisi kerjaan.
    } // Kurung kurawal ini nutup "Method emakEmak", karena isinya kosong maka saat dipanggil belum ngapa ngapain.
    
    void makan() // "makan" adalah "Method Void", namanya menunjukkan aksi, tapi isi aksinya belum ditulis.
    { // Kurung kurawal ini membuka isi "Method makan", tempat perintah makan bisa ditaruh nanti.
    } // Kurung kurawal ini nutup "Method makan", karena kosong maka tidak ada efek saat dijalankan.
    
    void turu () // "turu" adalah "Method Void", secara nama ini bisa dipahami sebagai aksi tidur, tapi Code di dalamnya belum ada.
    { // Kurung kurawal ini membuka isi "Method turu", tempat perintah tidur bisa ditaruh nanti.
    } // Kurung kurawal ini nutup "Method turu", jadi bagian aksi tidur masih berupa kerangka kosong.
    
    public static void main(String[] args) { // "main" adalah "Method" utama, Java mulai menjalankan program dari sini.
        System.out.println("Pengenalan class Termul"); // Baris ini menampilkan teks ke "Terminal", jadi kita tahu program "Termul" berhasil dijalankan.
    } // Kurung kurawal ini nutup "Method Main", jadi alur utama program selesai.
} // Kurung kurawal ini nutup "Class Termul", jadi semua data dan aksi di "Termul" selesai di sini.


// "Variable Lokal" adalah "Variable" yg dibuat di dalam "Method", "Constructor", atau blok, jadi hidupnya cuma sebentar selama bagian itu berjalan.
// "Variable Lokal" itu kayak catatan kecil di kertas parkir, setelah urusan parkir selesai catatan itu tidak dipakai lagi.
// "Variable Instance" adalah "Variable" yg dibuat di dalam "Class" tapi di luar "Method", jadi datanya nempel ke tiap "Object".
// "Variable Instance" itu kayak data di KTP, tiap orang punya nama, umur, dan alamat masing masing.
// "Variable Class" adalah "Variable" yg dibuat pakai "Static", jadi milik "Class", bukan milik satu "Object" tertentu.
// "Variable Class" itu kayak papan pengumuman RT, satu papan bisa dibaca banyak warga, bukan cuma milik satu orang.
// "Constructor" adalah blok Code khusus yg jalan saat "Object" dibuat.
// "Constructor" itu kayak petugas resepsionis yg langsung mencatat tamu baru saat tamu datang.
// "Object" dibuat dari "Class" dengan "Reserved Word" bernama "new".
// "new" itu kayak mengambil barang baru dari gudang, barang itu sekarang punya tempat sendiri dan bisa dipakai.
// "Deklarasi" adalah tahap menulis tipe dan nama "Variable", contohnya seperti menyiapkan kotak kosong lalu memberi label di luarnya.
// "Instansiasi" adalah tahap membuat "Object" baru dengan "new", contohnya seperti benar benar mengambil kotak baru dari rak.
// "Inisialisasi" adalah tahap memberi nilai awal ke "Object", contohnya seperti kotak baru langsung diisi dokumen pertama.
// "Method" adalah kumpulan aksi, contohnya seperti tombol mesin cuci yg kalau ditekan akan melakukan pekerjaan tertentu.
// "Field" adalah tempat data disimpan, contohnya seperti kolom nama, kolom umur, dan kolom warna di formulir.

/*
 * Kesimpulan:
 * - "Class" adalah cetakan atau formulir kosong.
 * - "Object" adalah hasil nyata dari cetakan atau formulir yg sudah diisi.
 * - "Variable" adalah tempat menyimpan data.
 * - "Method" adalah tempat menyimpan aksi.
 * - "Constructor" adalah bagian yg otomatis jalan saat "Object" dibuat.
 * - "Variable Lokal" hidup di dalam "Method" dan selesai setelah "Method" selesai.
 * - "Variable Instance" nempel ke setiap "Object" dan bisa beda beda nilainya.
 * - "Variable Class" memakai "Static" dan dipakai bersama di level "Class".
 * - Contoh awamnya adalah formulir pendataan warga.
 * - Formulir kosong adalah "Class".
 * - Formulir milik Pak Budi yg sudah diisi adalah "Object".
 * - Kolom nama, umur, dan warna favorit adalah "Variable".
 * - Proses mengisi, membaca, atau mengubah formulir adalah "Method".
 */