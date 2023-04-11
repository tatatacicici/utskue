/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokokue.tokokue;

/**
 *
 * @author Asus
 */
public class Elemen_cake {
    Cake info;
    Elemen_cake next;
    Elemen_cake prev;
    Elemen_cake(String nama_cake, int harga_cake, String kode_cake){
        info = new Cake(nama_cake,harga_cake,kode_cake);
        next=null;
        prev=null;
    }
}
