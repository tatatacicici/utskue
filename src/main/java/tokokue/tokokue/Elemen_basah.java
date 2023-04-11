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

    Elemen_basah(String nama, String harga, String id){
        info = new Basah(nama,harga,id);
        next = null;
        prev = null;
    }
}
