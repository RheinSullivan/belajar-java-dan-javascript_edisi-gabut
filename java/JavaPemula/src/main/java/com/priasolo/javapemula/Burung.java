/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.priasolo.javapemula; // "package" adalah alamat Class di dalam project. Kalau project dianggap seperti sekolah, package ini seperti nama gedung dan ruang kelas tempat file Java disimpan.

/**
 *
 * @author rheinsullivan
 */
public class Burung { // "Burung" adalah nama Class. Class ini bisa dianggap sebagai Blueprint untuk membuat object burung yg punya data dan aksi sendiri.

    int panjangBurung; // "panjangBurung" adalah variabel Instance. Variabel Instance adalah data yg menempel ke object. Contoh sehari-hari seperti tinggi badan yg dimiliki tiap orang dan bisa beda-beda.

    public Burung(String nama) { // "Burung" yg ini adalah Constructor. Constructor ini otomatis dijalankan saat ada object baru dibuat dari Class "Burung".
        // "String nama" adalah parameter Constructor. Parameter ini menerima nama "Burung" dari luar saat object baru dibuat.
        // "nama" hanya hidup di dalam Constructor ini. Setelah Constructor selesai, parameter ini tidak dipakai lagi kecuali nilainya disimpan ke variabel lain.
        System.out.println("Nama burung RAUL: " + nama); // Baris ini menampilkan nama "Burung" ke Terminal. Contoh gampangnya seperti mesin kasir mencetak nama pembeli di struk.
    }

    public void aturPanjang(int panjang) { // "aturPanjang" adalah Method. Method adalah aksi yg bisa dilakukan object. Contoh sehari-hari seperti tombol volume yg bisa mengubah keras suara, jadi keras/besar atau jadi kecil.
        // "void" berarti Method ini tidak mengembalikan nilai. Method ini hanya bekerja mengubah data di dalam object.
        // "int panjang" adalah parameter Integer bertipe angka bulat. "int" cocok untuk angka seperti 1, 10, 15, dan 100.
        // "panjang" adalah data yg dikirim dari luar Method. Contoh gampangnya seperti orang memberi angka untuk ukuran ke tukang jahit.
        panjangBurung = panjang; // "panjangBurung" diisi dengan nilai dari parameter "panjang". Ibarat formulir kosong yg kolom panjangnya diisi angka baru.
        // Setelah baris ini berjalan, object "Burung" punya data "panjangBurung" yg nilainya sama dengan "panjang".
    }

    public int lebarBurung() { // "lebarBurung" adalah Method yg mengembalikan nilai bertipe "int". Karena tidak pakai "void", Method ini wajib punya "return".
        // Walau namanya "lebarBurung", data yg dikembalikan sebenarnya "panjangBurung". Jadi nama Method ini bisa bikin bingung kalau dibaca orang lain.
        // Method return itu seperti Kalkulator. Lu kasih proses, lalu Kalkulator mengembalikan hasil angka.
        System.out.println("Panjang Burung: " + panjangBurung + " MM"); // Baris ini menampilkan nilai "panjangBurung" ke Terminal supaya manusia bisa lihat hasilnya.
        return panjangBurung; // "return panjangBurung" mengembalikan nilai variabel "panjangBurung" ke tempat Method ini dipanggil.
        // "return" juga menghentikan Method. Kalau ada kode setelah return di Method yg sama, kode itu biasanya tidak akan dijalankan.
    }

    public static void main(String[] args) { // "main" adalah Method utama yg pertama kali dijalankan Java saat file ini di jalankan.
        Burung burungRaul = new Burung("Jony RAUL :v"); // "burungRaul" adalah variabel object yg menyimpan object baru dari Class "Burung".
        // "new Burung" membuat object baru dan memanggil Constructor "Burung".
        // "Jony RAUL :v" dikirim ke parameter "nama" di Constructor. Jadi Constructor akan mencetak nama itu.
        burungRaul.aturPanjang(15); // "burungRaul.aturPanjang" memanggil Method "aturPanjang" dari object "burungRaul".
        // Angka "15" dikirim ke parameter "panjang". Setelah masuk Method, nilai itu disimpan ke variabel "panjangBurung".
        burungRaul.lebarBurung(); // "burungRaul.lebarBurung" memanggil Method yg mencetak dan mengembalikan nilai "panjangBurung".
        // Karena hasil Return tidak ditampung ke variabel lain, hasil Return tidak dipakai lanjut. Tapi teks tetap muncul karena ada "System.out.println" di dalam Method.
        System.out.println("Lebar Burung RAUL: " + burungRaul.panjangBurung); // Baris ini membaca langsung variabel "panjangBurung" dari object "burungRaul".
        // Membaca variabel langsung seperti ini bisa dilakukan karena "panjangBurung" tidak diberi Modifier "private".
        // Untuk project yg lebih rapi, biasanya data dibuat "private" lalu diakses pakai Getter dan Setter.
    }
}

/*
 * Bab - Kesimpulan
 * - "Burung" adalah Class yg menjadi cetakan object.
 * - "panjangBurung" adalah variabel Instance yg menempel ke object.
 * - "Burung" pada "public Burung" adalah Constructor.
 * - "nama" adalah parameter Constructor yg menerima teks nama burung.
 * - "aturPanjang" adalah Method void yg tugasnya mengubah data.
 * - "panjang" adalah parameter Method yg menerima angka dari luar.
 * - "lebarBurung" adalah Method return yg mengembalikan angka.
 * - "return" dipakai saat Method harus memberi hasil balik.
 * - Contoh sehari hari Method void seperti tombol lampu yg hanya menyalakan lampu
 * - Contoh sehari hari Method return seperti kalkulator yg memberi hasil hitungan
 * - "burungRaul" adalah object nyata yg dibuat dari class "Burung"
 * - Object bisa punya data sendiri dan bisa menjalankan Method sendiri
 */
