/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokokue.tokokue;

/**
 *
 * @author Hussain  & Bayu
 */
public class Info {
    public static class Cake {
        String nama_cake, kode_cake;
        int harga_cake;

        public Cake(String nama_cake, int harga_cake, String kode_cake){
            this.nama_cake = nama_cake;
            this.harga_cake = harga_cake;
            this.kode_cake = kode_cake;
        }
    }

    public static class Kering {
        String nama_kering, kode_kering;
        int harga_kering;

        public Kering(String nama_kering, int harga_kering, String kode_kering){
            this.nama_kering = nama_kering;
            this.harga_kering = harga_kering;
            this.kode_kering = kode_kering;
        }
    }

    public static class Basah {
        String nama_basah, kode_basah;
        int harga_basah;

        public Basah(String nama_basah, int harga_basah, String kode_basah){
            this.nama_basah = nama_basah;
            this.harga_basah = harga_basah;
            this.kode_basah = kode_basah;
        }
    }
}

