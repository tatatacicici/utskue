package tokokue.tokokue;

/**
 *
 * @author Hussain & Bayu
 */
public class Elemen_jual {
    Jual info;
    Elemen_jual prev;
    Elemen_jual next;
    
    Elemen_jual(String nama_produk, int harga_produk, String kode_produk){
        info = new Jual(nama_produk, harga_produk, kode_produk);
        prev=null;
        next=null;
                
    }
}
