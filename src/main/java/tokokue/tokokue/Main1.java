/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokokue.tokokue;

/**
 *
 * @author LENOVO
 */
public class Main1 {
    public static void main(String[] args) {
        List_jual jual = new List_jual();
        List_cake cake = new List_cake ();
        List_kering kering = new List_kering ();
        List_basah basah = new List_basah ();
        Carian cari = new Carian();
        
        cake.insertLast("Red velvet", 680000, "A1");
        cake.insertLast("Black Forest", 280000, "A2");
        cake.insertLast("Carrot Cake", 150000, "A3");
        cake.insertLast("Chocolatte Fudge", 190000, "A4");
        cake.insertLast("Tiramissu Cake", 150000, "A5");
        cake.insertLast("Banana Cake", 70000, "A6");
        cake.insertLast("Vanilla Sponge", 200000, "A7");
        cake.insertLast("Strawberry Short Cake", 120000, "A8");
        cake.insertLast("Coffe Cake", 60000, "A9");
        cake.insertLast("Fruit Cake", 200000, "A10");
        kering.insertLast("Nastar", 40000, "B1");
        kering.insertLast("Kue Lumpur", 58000, "B2");
        kering.insertLast("Kue Bawang", 50000, "B3");
        kering.insertLast("Croissant", 15000, "B4");
        kering.insertLast("Banana Chococheese", 30000, "B5");
        kering.insertLast("Kastengel", 60000, "B6");
        kering.insertLast("Putri Salju", 50000, "B7");
        kering.insertLast("Sagu Keju", 20000, "B8");
        kering.insertLast("Kue Gendong", 60000, "B9");
        kering.insertLast("Kuker Kacang", 20000, "B10");
        basah.insertLast("Lapis", 70000, "C2");
        basah.insertLast("Onde-Onde", 15000, "C2");
        basah.insertLast("Kue Cucur", 17000, "C3");
        basah.insertLast("Dadar Gulung", 15000, "C4");
        basah.insertLast("Nagasari", 7000, "C5");
        basah.insertLast("Kue cubit", 20000, "C6");
        basah.insertLast("Molen", 12000, "C7");
        basah.insertLast("Kue Pukis", 12000, "C8");
        basah.insertLast("Roti Bantal", 20000, "C9");
        basah.insertLast("Serabi", 12000, "C10");
   
        
        cake.print();
        kering.print();
        basah.print();
        cari.pindah("B1");
        kering.print();
        jual.print();
       }
}
