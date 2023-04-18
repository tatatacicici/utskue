package tokokue.tokokue;

/**
 *
 * @author Hussain & Bayu
 */
public class List_jual {
   Elemen_cake cake;
    Elemen_kering kering;
    Elemen_basah basah;
    Elemen_jual first;
    
    List_jual(){
        cake = new Elemen_cake(nama_cake, harga_cake, kode_cake);
        kering = new Elemen_kering(nama_kering, harga_kering, kode_kering);
        basah = new Elemen_basah(nama_basah, harga_basah, kode_basah);
        first = null;
    }
    
    
}
