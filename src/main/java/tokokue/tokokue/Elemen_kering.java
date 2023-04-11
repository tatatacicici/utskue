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
public class Elemen_kering {
    Kering info;
    Elemen_kering next;
    Elemen_kering prev;

    Elemen_kering(String nama_kering, int harga_kering, String kode_kering){
        info = new Kering(nama_kering,harga_kering,kode_kering);
        next=null;
        prev=null;
    }
}
