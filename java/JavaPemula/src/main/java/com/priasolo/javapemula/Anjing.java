/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.priasolo.javapemula; // "package" adalah alamat folder logis untuk file ini. Baygin project Java itu seperti komplek rumah. Package ini seperti alamat blok dan nomor rumah supaya Java tau class "Anjing" tinggal di bagian mana.

/**
 *
 * @author rheinsullivan
 */
public class Anjing { // "Anjing" adalah nama class. Class itu seperti cetakan atau blueprint. Contoh gampangnya seperti cetakan kue. Dari satu cetakan yg sama, kita bisa bikin banyak kue dengan bentuk yg mirip tapi isinya bisa beda.

    public Anjing(String nama) { // "Anjing" yg ini adalah constructor. Constructor itu Method khusus yg namanya wajib sama dengan nama class. Kalau class bernama "Anjing", constructor juga wajib bernama "Anjing".
        // "String nama" adalah parameter. Parameter itu seperti kotak titipan data yg dikirim dari luar ke dalam constructor. Contoh sehari hari seperti lu pesan minuman lalu kasir nanya nama pesanan yg mau dipesen lu.
        // "String" adalah tipe data untuk Teks. Kalau data bentuknya tulisan seperti "nama orang, nama hewan, alamat, atau kalimat", biasanya pakai "String".
        // "Nama" adalah nama parameter. Parameter ini akan menampung teks yg dikirim saat object "Anjing" dibuat.
        System.out.println("Nama anjing gw: " + nama); // "System.out.println" dipakai untuk menampilkan teks ke Terminal. Terminal itu seperti papan pengumuman kecil yg nunjukin hasil kerja program.
        // Tanda "+" di sini dipakai untuk menggabungkan teks tetap dengan isi parameter "nama". Contoh gampangnya seperti gabungin tulisan di stiker dengan nama asli di kartu pelajar.
    }

    public static void main(String[] args) { // "Main" adalah Method utama. Java mulai menjalankan program dari Method ini. Ibarat aplikasi punya tombol Start/Mulai, maka "main" adalah tempat Start/Mulai itu bekerja.
        // "public" artinya Method ini bisa dikenali dari luar Class. Ibarat pintu toko yg dibuka untuk umum.
        // "static" artinya Method ini bisa dipanggil tanpa harus membuat object dulu. Ibarat papan pengumuman sekolah yg bisa dibaca semua orang tanpa harus daftar jadi murid baru.
        // "void" artinya Method ini tidak mengembalikan nilai. Ibarat lu cuma nyalain lampu. Lampunya menyala tapi tidak ngasih barang balik ke tangan lu.
        // "String[] args" adalah parameter bawaan untuk menerima data dari luar saat program dijalankan lewat terminal. Untuk pemula, bagian ini cukup dipahami sebagai perlengkapan wajib Method "main".
        Anjing namaAnjing = new Anjing("RAUL Iqbal :'v"); // "namaAnjing" adalah variabel object. Variabel ini menyimpan object baru dari Class "Anjing".
        // "new" dipakai untuk membuat object baru. Contoh sehari hari seperti pabrik membuat barang baru dari cetakan.
        // "new Anjing" artinya Java membuat object baru berdasarkan Class "Anjing" dan langsung menjalankan Constructor "Anjing".
        // "RAUL Iqbal :'v" adalah value/nilai yg dikirim ke parameter "nama". Jadi isi parameter "nama" di Constructor akan menjadi teks ini.
        // Object "namaAnjing" sebenarnya tidak dipakai lagi setelah dibuat, tapi tetap penting untuk contoh awal supaya kelihatan cara bikin object dari Class.
    }
}

/*
 * Kesimpulan:
 * - "Anjing" yg pertama pada "public class Anjing" adalah nama dari Class.
 * - "Anjing" yg kedua pada "public Anjing" adalah nama dari Constructor.
 * - Constructor adalah kode yg otomatis berjalan saat object dibuat memakai "new".
 * - "nama" adalah parameter yg menerima data dari luar Constructor.
 * - "namaAnjing" adalah variabel object yg menyimpan hasil object baru.
 * - "new" adalah keyword/Kata Kunci untuk membuat object baru dari sebuah Class.
 * - Contoh sehari hari Class itu seperti cetakan kartu pelajar kosong.
 * - Object itu seperti kartu pelajar yg sudah jadi dan punya nama murid.
 * - Constructor itu seperti petugas sekolah yg langsung mengisi nama saat kartu dibuat.
 * - Parameter itu seperti kolom nama yg disiapkan untuk menerima isi.
 * - Value itu seperti tulisan asli yg dimasukkan ke kolom nama.
 * - "System.out.println" itu seperti speaker atau layar kecil yg menampilkan hasil program.
 */
