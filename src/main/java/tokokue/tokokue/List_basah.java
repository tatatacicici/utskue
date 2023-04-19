package tokokue.tokokue;

/**
 *
 * @author Hussain&Bayu
 */
public class List_basah {
    Elemen_basah first;  
    List_jual jual = new List_jual();
    List_basah(){
        first = null;
    }
    void insertFirst(String nama_basah, int harga_basah, String kode_basah){
        Elemen_basah elemenbaru = new Elemen_basah(nama_basah, harga_basah, kode_basah);
        if(first == null){
            first = elemenbaru;
        }else{
            elemenbaru.next = first;
            first.prev = elemenbaru;
            first = elemenbaru;
        }
    }
    
    void insertLast(String nama_basah, int harga_basah, String kode_basah){
     Elemen_basah elemenbaru = new Elemen_basah(nama_basah, harga_basah, kode_basah);  
     if(first == null){
         first = elemenbaru;
     }else{
         Elemen_basah elemensementara = first;
        while(elemensementara.next != null){
            elemensementara = elemensementara.next;
        }
        elemensementara.next = elemenbaru;
        elemenbaru.prev = elemensementara;
     }
    }
    
    void insertAt(String nama_basah, int harga_basah, String kode_basah, String basah_dicari){
        Elemen_basah elemenSementara = first;
        Elemen_basah elemenBaru = new Elemen_basah(nama_basah, harga_basah, kode_basah);
        if (first == null){
            first = elemenBaru;
        }
        while (elemenSementara.next != null){
            if(elemenSementara.info.kode_basah.equals(basah_dicari)){
                elemenBaru.next = elemenSementara.next;
                elemenSementara.next.prev = elemenBaru;
                elemenBaru.prev = elemenSementara;
                elemenSementara.next = elemenBaru;
                break;
            }else{
                elemenSementara = elemenSementara.next;
                
            }
        }
    
    }
    
    void cari(String basah_dicari){
        Elemen_basah elemenSementara = first;
        while(!elemenSementara.info.kode_basah.equals(basah_dicari)){
            elemenSementara = elemenSementara.next;
        if(elemenSementara.next == null){
            System.out.println("TIDAK ADA DI STOK");
            break;
            }
        }
        if(elemenSementara.info.kode_basah.equals(basah_dicari)){
            System.out.println("Kue Basah: "+elemenSementara.info.nama_basah);
            System.out.println("Harga: "+elemenSementara.info.harga_basah);
            System.out.println("Kode: "+elemenSementara.info.kode_basah);
            System.out.println("Kue Basah Sebelumnya: "+elemenSementara.prev.info.nama_basah);
            System.out.println("Harga Kue Basah Sebelumnya: "+elemenSementara.prev.info.harga_basah);
            System.out.println("Kode Kue Basah Sebelumnya: "+elemenSementara.prev.info.kode_basah);
            System.out.println("Kue Basah Setelahnya: "+elemenSementara.next.info.nama_basah);
            System.out.println("Harga Kue Basah Setelahnya: "+elemenSementara.next.info.harga_basah);
            System.out.println("Kode Kue Basah Setelahnya: "+elemenSementara.next.info.kode_basah);
        }
    }
    public void pindahBasah(String basah_dicari, List_jual jual) {
    Elemen_basah elemen = first;
    if(elemen == null) {
        System.out.println("List Kosong");
    }
    while (elemen != null) {
        if (elemen.info.kode_basah.equals(basah_dicari)) {
            if (elemen == first) {
                first = elemen.next;
                if (first != null) {
                    first.prev = null;
                }
            } else {
                elemen.prev.next = elemen.next;
                elemen.next.prev = elemen.prev;
            }
            jual.tambahBasah(elemen.info);
            System.out.println("Kue Basah " + basah_dicari + " berhasil dipindahkan ke linked list jual");
            return;
        }
        elemen = elemen.next;
    }
    System.out.println("Kue Basah " + basah_dicari + " tidak ditemukan di linked list ini");
    }
    void deleteFirst(){
        if (first == null){
            System.out.println("KUE BASAH KOSONG");
        }else if (first.next == null){
            first = null;
        }else{
            first = first.next;
            first.prev = null;
        }
    }
    void deleteLast(){
        if(first == null){
            System.out.println("KUE BASAH KOSONG");  
        }else if (first.next == null){
            first = null;
        }else{
            Elemen_basah elemenSementara = first;
            Elemen_basah beforeLast = null;
            while(elemenSementara.next != null){
                beforeLast = elemenSementara;
                elemenSementara = elemenSementara.next;
            }
            beforeLast.next=null;
            elemenSementara.prev = null;
        }
    }
    void deleteAt(String basah_dicari){
     Elemen_basah elemensementara = first;
        if(elemensementara == null) {
            System.out.println("List Kosong");
        }else if(first.info.kode_basah.equals(basah_dicari)) {
            first = first.next;
            first.prev = null;
        }else{
            while(elemensementara != null){
                if(elemensementara.info.kode_basah.equals(basah_dicari)){
                    elemensementara.prev.next = elemensementara.next;
                    if (elemensementara.next != null){
                    elemensementara.next.prev = elemensementara.prev;}
                    break;

                }   
                elemensementara = elemensementara.next;
            }if(elemensementara.next == null){
                elemensementara.prev.next = null;
           
            }
        }
        
    }
     void print(){
        Elemen_basah elemenSementara = first;
        if(elemenSementara == null){
            System.out.println("KUE BASAH KOSONG");
        }else{
            while(elemenSementara != null){
                System.out.println("Nama Kue Basah: "+(elemenSementara.info.nama_basah));
                System.out.println("Harga Kue Basah: "+(elemenSementara.info.harga_basah));
                System.out.println("Kode Kue Basah"+(elemenSementara.info.kode_basah));
                elemenSementara = elemenSementara.next;
            }   
        }
    }
}
