/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.priasolo.javapemula;

/**
 *
 * @author rheinsullivan
 */
public class Burung {
    int panjangBurung; // Tipe data Integer tipe data angka atau numberik seperti bilangan bulat, desimal, dan pecahan.
    
    public Burung (String nama) { // Constuctor dengan nama Variabel "Burung" menggunakan 1 parameter "nama" dengan tipe data "String". Apabila Constructor ini dieksekusi, akan menampilkan teks yg didalam Object pada perintah "System.out.println".
        System.out.println("Nama burung RAUL: "+ nama);
    }
    
    public void aturPanjang (int panjang) { // Instance Variabel ini dibuat dalam Method dengan nama "aturPanjang" dengan menggunakan tipe data Integer, Method ini punya 1 parameter yaitu "Panjang" yg menyimpan data Integer Bilangan Bulat (BilBul). Kata kunci (Reserved Word) "Void" adalah Method yg tidak menghasilkan nilai balikan.
        panjangBurung = panjang; // nilai dalam parameter "Panjang" akan disimpan didalam variabel "panjangBurung".
    }
    
    public int lebarBurung () { // Instance Variabel ini dibuat dalam Method dengan naam "lebarBurung", dengan menggunakan tipe data Integer, tanpa menggunakan Kata kunci (Reserved Word) "Void" artinya ada nilai balikan "Return" yg bakal diharilkan didalam object pada perintah "System.out.println". Selain itu, nilai di dalam variabel "panjangBurung" akan dijadikan nilai balikan "Return".
        System.out.println("Panjang Burung: "+ panjangBurung + " MM");
        return panjangBurung; // Return adalah Kata Kunci (Reserverd Word) yg berfungsi untuk mengembalikan sebuah nilai hasil pemrosesan Method dari variabel yg dipanggil yaitu "panjangBurung", sekaligus menghentikan eksekusi Method tersebut.
    }
    
    public static void main (String[] args){ // Main Method ini untuk menampung objek baru yg akan dibuat dan Constructor "Burung" akan dijalankan, dimana "Jony Raul :v" yg mengisi parameter "nama" pada Constructor tersebut.
        Burung burungRaul = new Burung ("Jony RAUL :v");
        burungRaul.aturPanjang(15); // Method aturUmur dalam sebuah objek "burungRaul" digunakan untuk mengisi variabel "Panjang" dengan nilai "15".
        burungRaul.lebarBurung(); // Nilai "15" itu ditampilkan disini menggunakan "burungRaul.lebarBurung".
        
        System.out.println("Lebar Burung RAUL: " + burungRaul.panjangBurung);
    }
}

/* Kesimpulan perbedaan Method Void dan Return */
// Void: Keluar dari method void, atau method yg tidak menghasilkan nilai balikan.
// Return: Dapat mengembalikan hasil nilai sebuah pemrosesan Method dari variabel yg dipanggil.