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
public class Cake {
    String nama_cake,kode_cake;
    int harga_cake;
    
    public Cake(String nama_cake, int harga_cake, String kode_cake){
        this.nama_cake=nama_cake;
        this.harga_cake = harga_cake;
        this.kode_cake=kode_cake;
    }
    public String getNama(){
        return nama_cake;
    }
    public int getHarga(){
        return harga_cake;
    }
    public String getKode(){
        return kode_cake;
    }

}
