/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokokue.tokokue;

/**
 *
 * @author LENOVO
 */
public class Elemen {
    public static class Elemen_cake{
        Info.Cake info_cake;
        Elemen_cake next;
        Elemen_cake prev;
        
        public Elemen_cake(String nama_cake, int harga_cake, String kode_cake){
            info_cake = new Info.Cake(nama_cake, harga_cake, kode_cake);
            next = null;
            prev = null;
        }
                
    }
    public static class Elemen_kering{
        Info.Kering info_kering;
        Elemen_kering next;
        Elemen_kering prev;
        
        public Elemen_kering(String nama_kering, int harga_kering, String kode_kering){
            info_kering = new Info.Kering(nama_kering, harga_kering, kode_kering);
            next = null;
            prev = null;
        }
                
    }
    public static class Elemen_basah{
        Info.Basah info_basah;
        Elemen_basah next;
        Elemen_basah prev;
        
        public Elemen_basah(String nama_basah, int harga_basah, String kode_basah){
            info_basah = new Info.Basah(nama_basah, harga_basah, kode_basah);
            next = null;
            prev = null;
        }
                
    }
    public static class Move_cake{
        Info.Cake info_cake;
        Move_cake next;
        Move_cake prev;

        public Move_cake(String nama_cake, int harga_cake, String kode_cake){
            info_cake = new Info.Cake(nama_cake, harga_cake, kode_cake);
            next = null;
            prev = null;
        }
    }
    public static class Move_kering{
        Info.Kering info_kering;
        Move_kering next;
        Move_kering prev;

        public Move_kering(String nama_kering, int harga_kering, String kode_kering){
            info_kering = new Info.Kering(nama_kering, harga_kering, kode_kering);
            next = null;
            prev = null;
        }
      
    }
    public static class Move_basah{
        Info.Basah info_basah;
        Move_basah next;
        Move_basah prev;

        public Move_basah(String nama_basah, int harga_basah, String kode_basah){
            info_basah = new Info.Basah(nama_basah, harga_basah, kode_basah);
            next = null;
            prev = null;
        }

    }
}