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

    Elemen_kering(String nama, String harga, String id){
        info = new Kering(nama,harga,id);
        next=null;
        prev=null;
    }
}
