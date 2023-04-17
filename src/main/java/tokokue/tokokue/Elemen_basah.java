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
public class Elemen_basah {
    Basah info;
    Elemen_basah next;
    Elemen_basah prev;

    Elemen_basah(String nama_basah, int harga_basah, String kode_basah){
        info = new Basah(nama_basah,harga_basah,kode_basah);
        next = null;
        prev = null;
    }
}
