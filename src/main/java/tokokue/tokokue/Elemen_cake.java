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

    Elemen_cake(String nama, String harga, String id){
        info = new Cake(nama,harga,id);
        next=null;
        prev=null;
    }
}
