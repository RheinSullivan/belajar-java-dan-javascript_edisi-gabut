/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.priasolo.javapemula; // "Package" ini kayak nama map besar buat naro File Java, jadi File "Burung" tidak kecampur sembarangan sama File lain di Project.

/**
 *
 * @author rheinsullivan
 */
public class Burung { // "Burung" adalah "Class", bayangin ini kayak rancangan data burung di buku catatan, rancangan ini nanti bisa dipakai buat bikin data burung yg nyata dalam program.
    int panjangBurung; // "panjangBurung" adalah "Variable Instance" bertipe "int", artinya tempat nyimpen angka bulat milik tiap "Object Burung", kayak kolom panjang di formulir ukur barang.
    
    public Burung (String nama) { // "Burung" di sini adalah "Constructor", dia punya "Parameter" bernama "nama" bertipe "String", jadi pas bikin "Object Burung" baru kita bisa kasih nama burungnya.
        System.out.println("Nama burung RAUL: "+ nama); // Baris ini nampilin teks dan isi "Parameter nama" ke "Terminal", jadi orang yg jalanin program bisa lihat nama yg dikirim pas "Object" dibuat.
    } // Kurung kurawal ini nutup "Constructor Burung", jadi bagian sambutan awal buat "Object" baru selesai di sini.
    
    public void aturPanjang (int panjang) { // "aturPanjang" adalah "Method" bertipe "Void", artinya dia cuma melakukan kerja, bukan ngasih hasil balik, contohnya kayak kita nulis angka di kertas tapi tidak minta balasan dari kertas itu.
        panjangBurung = panjang; // Nilai dari "Parameter panjang" disimpan ke "Variable panjangBurung", contohnya kayak angka hasil ukur meja ditulis ke kolom panjang di catatan.
    } // Kurung kurawal ini nutup "Method aturPanjang", jadi proses menyimpan angka panjang selesai di sini.
    
    public int lebarBurung () { // "lebarBurung" adalah "Method" bertipe "int", artinya dia bisa ngasih angka balik, meskipun namanya lebar isi yg dipakai tetap "panjangBurung" sesuai Code asli.
        System.out.println("Panjang Burung: "+ panjangBurung + " MM"); // Baris ini nampilin isi "Variable panjangBurung" ke "Terminal", contohnya kayak orang ukur kain lalu ngomong hasil ukurannya dengan satuan.
        return panjangBurung; // "Return" mengembalikan nilai "panjangBurung" ke tempat "Method" dipanggil, contohnya kayak kasir ngasih total belanja setelah semua barang dihitung.
    } // Kurung kurawal ini nutup "Method lebarBurung", jadi proses nampilin dan mengembalikan nilai selesai di sini.
    
    public static void main (String[] args){ // "main" adalah "Method" utama, Java mulai jalan dari sini, kayak orang mulai baca buku dari halaman pertama yg ditunjuk.
        Burung burungRaul = new Burung ("Jony RAUL :v"); // "burungRaul" adalah "Variable" yg nyimpen "Object Burung" baru, "new Burung" bikin "Object" baru, dan "Jony RAUL :v" dikirim ke "Parameter nama".
        burungRaul.aturPanjang(15); // Baris ini manggil "Method aturPanjang" lewat "Object burungRaul", angka "15" dikirim ke "Parameter panjang", lalu disimpan ke "Variable panjangBurung".
        burungRaul.lebarBurung(); // Baris ini manggil "Method lebarBurung", lalu "Method" itu nampilin nilai "panjangBurung" dan juga mengembalikan nilai angka dari "Return".
        
        System.out.println("Lebar Burung RAUL: " + burungRaul.panjangBurung); // Baris ini membaca langsung "Variable panjangBurung" dari "Object burungRaul", contohnya kayak buka catatan lalu baca angka yg sudah ditulis sebelumnya.
    } // Kurung kurawal ini nutup "Method Main", jadi alur utama program selesai di sini.
} // Kurung kurawal ini nutup "Class Burung", jadi semua rancangan data dan aksi burung selesai di sini.

/*
 * Kesimpulan:
 * - "int" dipakai buat angka bulat, contohnya umur, jumlah barang, nomor antrian, jumlah kursi, atau panjang dalam angka tanpa koma.
 * - "String" dipakai buat teks, contohnya nama orang, alamat rumah, judul buku, nama toko, atau kalimat pesan.
 * - "Variable Instance" seperti "panjangBurung" adalah data yg nempel ke "Object", jadi tiap "Object Burung" bisa punya nilai panjang sendiri.
 * - "Constructor Burung" jalan otomatis saat "new Burung" dipanggil, jadi cocok buat aksi awal seperti nampilin nama atau nyiapin data pertama.
 * - "Parameter nama" adalah data titipan buat "Constructor", contohnya kayak kita ngasih nama pelanggan ke petugas supaya petugas bisa catat.
 * - "Method Void" seperti "aturPanjang" dipakai kalau tugasnya cuma melakukan aksi, contohnya menulis data, mengubah nilai, atau menyalakan lampu.
 * - "Method Return" seperti "lebarBurung" dipakai kalau tugasnya perlu ngasih hasil balik, contohnya menghitung total belanja lalu mengembalikan angka totalnya.
 * - "Return" itu bukan sekadar kata, tapi jalan pulang buat hasil dari "Method", jadi hasilnya bisa dipakai lagi oleh Code lain.
 * - "burungRaul.aturPanjang" artinya kita nyuruh "Object burungRaul" menjalankan aksi "aturPanjang", kayak kita nyuruh seseorang mencatat angka ke buku.
 * - "burungRaul.panjangBurung" artinya kita membaca data yg ada di dalam "Object burungRaul", kayak kita buka buku catatan lalu ambil isi kolom tertentu.
 * - Alur gampangnya adalah bikin "Object", isi panjangnya, panggil "Method" buat nampilin panjangnya, lalu baca lagi nilai panjangnya secara langsung.
 */