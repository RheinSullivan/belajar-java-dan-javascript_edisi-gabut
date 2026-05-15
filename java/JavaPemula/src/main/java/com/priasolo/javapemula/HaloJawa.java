/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.priasolo.javapemula; // "Package" ini seperti nama rak di lemari, jadi "Class HaloJawa" ditaruh di tempat yg jelas dan tidak nyasar.

/**
 *
 * @author rheinsullivan
 */
public class HaloJawa { // "HaloJawa" adalah nama "Class", nama "Class" biasanya pakai gaya "Pascal Case", jadi huruf awal tiap kata dibuat besar supaya gampang dibaca.
    public static void main(String[] args) { // "main" adalah "Method" utama, Java bakal cari bagian ini dulu saat program dijalankan, jadi ini seperti pintu masuk utama rumah.
        System.out.println("Halo Jawa"); // "println" dipakai buat nampilin teks ke "Terminal", kalau di JavaScript mirip "console.log", bedanya ini gaya penulisan Java.
    } // Kurung kurawal ini nutup "Method Main", jadi perintah utama program selesai di sini.
} // Kurung kurawal ini nutup "Class HaloJawa", jadi semua isi "Class" selesai di sini.

// "Class", "Variable", dan "Method" termasuk "Identifier", artinya nama buatan Programmer buat menandai sesuatu di dalam Code.
// "Identifier" itu mirip nama kontak di HP, kalau tidak ada nama kontak kita bakal susah tahu nomor itu punya siapa.
// "Identifier" bisa diawali huruf besar atau huruf kecil, contohnya "HaloJawa", "namaSiswa", "umurAyah", dan "dataBelanja".
// "Identifier" boleh pakai gabungan huruf dan angka, tapi untuk pemula lebih aman pakai nama yg jelas, contohnya "totalHarga2" masih bisa dibaca.
// "Identifier" bisa pakai tanda garis bawah, contohnya "nama_siswa", tapi gaya Java umumnya lebih sering pakai "Camel Case" seperti "namaSiswa".
// "Identifier" juga bisa pakai tanda dolar, tapi buat pemula sebaiknya jangan dipakai dulu karena jarang dibutuhkan di Code belajar biasa.
// "Case Sensitive" berarti huruf besar dan huruf kecil dianggap beda, jadi "nama", "Nama", dan "NAMA" dianggap tiga nama berbeda oleh Java.
// "Pascal Case" biasa dipakai buat nama "Class", contohnya "HaloJawa", "DataSiswa", dan "DaftarBelanja".
// "Camel Case" biasa dipakai buat nama "Variable" dan "Method", contohnya "namaSiswa", "hitungTotal", dan "ambilData".
// "Reserved Word" adalah kata bawaan Java yg sudah punya tugas resmi, jadi tidak boleh dipakai sembarangan sebagai nama "Variable".
// "public" adalah "Reserved Word" buat akses umum, bayangin kayak pintu toko yg boleh dimasuki orang dari luar.
// "private" adalah "Reserved Word" buat akses tertutup, bayangin kayak laci pribadi yg cuma pemiliknya boleh buka.
// "protected" adalah "Reserved Word" buat akses keluarga turunan "Class", bayangin kayak dokumen keluarga yg tidak untuk umum tapi masih boleh dipakai keluarga sendiri.
// "default" adalah akses bawaan kalau tidak ditulis "public", "private", atau "protected", biasanya hanya nyaman dipakai di kelompok "Package" yg sama.
// "static" berarti milik "Class", bukan milik satu "Object" tertentu, bayangin kayak papan pengumuman di depan rumah yg bisa dibaca semua orang.
// "final" berarti nilainya tidak boleh diganti setelah ditetapkan, contohnya kayak tanggal lahir di KTP yg tidak berubah sesuka hati.
// "abstract" berarti masih berupa konsep dasar, contohnya kayak rancangan umum kendaraan sebelum ditentukan jadi mobil, motor, atau bus.
// "strictfp" adalah "Reserved Word" lama yg berhubungan dengan hitungan angka pecahan supaya konsisten di berbagai perangkat.
// "Compiler" adalah alat yg membaca Code Java lalu ngecek apakah aturan bahasanya sudah benar atau belum.
// "Single Line Comment" adalah komentar satu baris yg diawali tanda garis miring dua, komentar ini dibaca manusia tapi diabaikan oleh "Compiler".
// "Multi Line Comment" adalah komentar panjang yg bisa menampung banyak baris, di sini hanya dipakai buat bagian kesimpulan biar rapi.
// "Object" adalah benda nyata hasil dari "Class", contohnya "Class" seperti formulir kosong, sedangkan "Object" seperti formulir yg sudah diisi data orang.
// "State" adalah keadaan atau data yg dimiliki "Object", contohnya sebuah sepeda punya warna, ukuran ban, dan jumlah gigi.
// "Behavior" adalah aksi yg bisa dilakukan "Object", contohnya sepeda bisa maju, direm, dan dibelokkan.
// "Field" adalah tempat menyimpan "State", contohnya kolom nama, kolom alamat, dan kolom umur di formulir.
// "Method" adalah tempat menyimpan "Behavior", contohnya tombol bel rumah punya aksi bunyi saat ditekan.
// "Object" biasanya berkomunikasi lewat "Method", contohnya orang tidak mengambil isi dompet orang lain langsung, tapi bertanya dulu dengan cara yg benar.

/*
 * Kesimpulan:
 * - "Identifier" adalah nama yg dibuat Programmer buat menandai "Class", "Variable", atau "Method".
 * - "Case Sensitive" berarti huruf besar dan kecil dianggap beda oleh Java.
 * - "Class" umumnya pakai "Pascal Case" seperti "HaloJawa".
 * - "Variable" dan "Method" umumnya pakai "Camel Case" seperti "namaSiswa" atau "hitungTotal".
 * - "Reserved Word" adalah kata khusus Java yg tidak boleh dijadikan nama bebas.
 * - "State" adalah data atau keadaan milik "Object".
 * - "Behavior" adalah aksi yg bisa dilakukan "Object".
 * - "Field" menyimpan data, sedangkan "Method" menjalankan aksi.
 * - Contoh awamnya adalah formulir kosong sebagai "Class", formulir yg sudah diisi sebagai "Object", isi kolom sebagai "State", dan proses mengisi atau membaca formulir sebagai "Behavior".
 * - Kalau bagian ini dipahami, konsep dasar Java bakal jauh lebih masuk akal karena Java banyak memakai "Class", "Object", "Field", dan "Method".
 */