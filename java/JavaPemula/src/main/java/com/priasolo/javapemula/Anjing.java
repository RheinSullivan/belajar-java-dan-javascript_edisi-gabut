/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.priasolo.javapemula;

/**
 *
 * @author rheinsullivan
 */
public class Anjing { // Class ini disebut dengan kata kunci (Reserved Word) Class
    public Anjing(String nama){ // Bagian ini disebut dengan Constructor, nama Constructor wajib sama dengan nama class contoh: "public class Anjing", contoh constructor: "public Anjing (String nama){}", dan Constructor ini cuma punya 1 Parameter dengan tipe data String (""), nah Parameter nya itu nama.
        System.out.println("Nama anjing gw: "+nama); // Bagian ini disebut dengan Instance Object, bagian ini akan muncul apabila kita menjalankan program ini dan akan muncul didalam terminal.
    }
    
    public static void main(String[] args) { // Bagian ini disebut dengan Method Main, bagian ini dimana bakal diproses sama Java
        Anjing namaAnjing = new Anjing("RAUL Iqbal :'v"); // Bagian ini juga sama disebut dengan Instance Object yg diambil dari class Anjing, dengan memanfaatkan Constructor yg dibikin sebelum ini. Sebuah objek baru Anjing dibikin untuk paramenter "nama" dengan value "RAUL Iqbal :'v", hehe...
    }
}
