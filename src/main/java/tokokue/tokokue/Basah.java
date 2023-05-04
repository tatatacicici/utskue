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
public class Basah {
    String nama_basah, kode_basah;
    int harga_basah;
    
    public Basah(String nama_basah, int harga_basah, String kode_basah){
        this.nama_basah=nama_basah;
        this.harga_basah = harga_basah;
        this.kode_basah=kode_basah;

    }
    public String getNama(){
        return nama_basah;
    }
    public int getHarga(){
        return harga_basah;
    }
    
    public String getKode(){
        return kode_basah;
    }
}
