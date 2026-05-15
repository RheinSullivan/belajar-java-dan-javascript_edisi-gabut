/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.priasolo.javapemula; // "Package" ini adalah alamat rumah buat File Java ini, jadi Java tahu kalau "Anjing" tinggal di dalam kelompok "com.priasolo.javapemula".

/**
 *
 * @author rheinsullivan
 */
public class Anjing { // "Anjing" adalah nama "Class", bayangin "Class" itu kayak cetakan kue, cetakannya belum bisa dimakan, tapi dari cetakan itu kita bisa bikin banyak kue nyata atau dalam Java disebut "Object".
    public Anjing(String nama){ // "Anjing" di baris ini adalah "Constructor", bentuknya mirip "Method", tapi tugasnya khusus buat nyambut "Object" baru pas dibuat, kayak petugas loket yg langsung nanya nama orang begitu orang itu daftar.
        System.out.println("Nama anjing gw: "+nama); // "System.out.println" dipakai buat nampilin tulisan ke "Terminal", jadi kalau di dunia nyata ini kayak papan pengumuman kecil yg ngasih tahu hasil dari program ke orang yg lagi belajar.
    } // Kurung kurawal ini nutup isi "Constructor" bernama "Anjing", jadi semua kerjaan awal pas bikin "Object" baru selesai di sini.
    
    public static void main(String[] args) { // "main" adalah pintu masuk utama program Java, bayangin kayak pintu depan rumah, orang masuk lewat pintu ini dulu sebelum bisa lihat isi rumahnya.
        Anjing namaAnjing = new Anjing("RAUL Iqbal :'v"); // "namaAnjing" adalah nama "Variable" yg nyimpen "Object" baru, "new Anjing" artinya bikin "Object" baru dari "Class" Anjing, sedangkan "RAUL Iqbal :'v" masuk ke "Parameter" bernama "nama".
    } // Kurung kurawal ini nutup "Method Main", jadi alur utama program berhenti di sini kalau tidak ada perintah lain.
} // Kurung kurawal ini nutup "Class Anjing", jadi semua isi tentang cetakan "Anjing" selesai di sini.

/*
 * Kesimpulan:
 * - "Class" itu cetakan atau rancangan, contohnya kayak formulir kosong di kantor kelurahan, formulirnya belum punya data siapa pun.
 * - "Object" itu hasil nyata dari "Class", contohnya formulir kosong tadi sudah diisi nama warga, alamat warga, dan umur warga.
 * - "Constructor" itu bagian yg langsung jalan saat "Object" dibuat, contohnya kayak petugas pendaftaran yg langsung nanya nama begitu ada orang baru datang.
 * - "Parameter" itu data titipan yg masuk ke "Constructor" atau "Method", contohnya kayak nama orang yg ditulis di formulir pendaftaran.
 * - "String nama" berarti "Parameter" bernama "nama" hanya cocok diisi teks, contohnya nama orang, nama hewan, nama toko, atau nama jalan.
 * - "System.out.println" itu alat buat nampilin hasil ke "Terminal", contohnya kayak struk belanja yg keluar setelah kasir selesai menghitung.
 * - "new Anjing" berarti bikin benda baru dari cetakan "Anjing", contohnya kayak ambil gelas baru dari rak lalu gelas itu bisa dipakai sendiri.
 * - "namaAnjing" adalah "Variable" yg nyimpen alamat "Object", contohnya kayak label di kardus supaya kita tahu kardus itu isinya apa.
 * - Alur gampangnya adalah Java masuk lewat "main", lalu Java bikin "Object" baru dari "Anjing", lalu "Constructor" langsung jalan, lalu tulisan muncul di "Terminal".
 */