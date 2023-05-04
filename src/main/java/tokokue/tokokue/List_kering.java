package tokokue.tokokue;

/**
 *
 * @author Hussain&Bayu
 */
public class List_kering {
    Elemen_kering first;
    List_jual jual = new List_jual();
    List_kering(){
        first = null;
    }
    void insertFirst(String nama_kering, int harga_kering, String kode_kering){
        Elemen_kering elemenbaru = new Elemen_kering(nama_kering, harga_kering, kode_kering);
        if(first == null){
            first = elemenbaru;
        }else{
            elemenbaru.next = first;
            first.prev = elemenbaru;
            first = elemenbaru;
        }
    }
    
    void insertLast(String nama_kering, int harga_kering, String kode_kering){
     Elemen_kering elemenbaru = new Elemen_kering(nama_kering, harga_kering, kode_kering);
     if(first == null){
         first = elemenbaru;
     }else{
         Elemen_kering elemensementara = first;
        while(elemensementara.next != null){
            elemensementara = elemensementara.next;
        }
        elemensementara.next = elemenbaru;
        elemenbaru.prev = elemensementara;
     }
    }
    
    void insertAt(String nama_kering, int harga_kering, String kode_kering, String kering_dicari){
        Elemen_kering elemenSementara = first;
        Elemen_kering elemenBaru = new Elemen_kering(nama_kering, harga_kering, kode_kering);
        if (first == null){
            first = elemenBaru;
        }
        while (elemenSementara.next != null){
            if(elemenSementara.info.kode_kering.equals(kering_dicari)){
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
    
    void cari(String kering_dicari){
        Elemen_kering elemenSementara = first;
        while(!elemenSementara.info.kode_kering.equals(kering_dicari)){
            elemenSementara = elemenSementara.next;
        if(elemenSementara.next == null){
            System.out.println("TIDAK ADA DI STOK");
            break;
            }
        }
        if(elemenSementara.info.kode_kering.equals(kering_dicari)){
            System.out.println("Kue Kering: "+elemenSementara.info.nama_kering);
            System.out.println("Harga: "+elemenSementara.info.harga_kering);
            System.out.println("Kode: "+elemenSementara.info.kode_kering);
            System.out.println("Kue Kering Sebelumnya: "+elemenSementara.prev.info.nama_kering);
            System.out.println("Harga Kue Kering Sebelumnya: "+elemenSementara.prev.info.harga_kering);
            System.out.println("Kode Kue Kering Sebelumnya: "+elemenSementara.prev.info.kode_kering);
            System.out.println("Kue Kering Setelahnya: "+elemenSementara.next.info.nama_kering);
            System.out.println("Harga Kue Kering Setelahnya: "+elemenSementara.next.info.harga_kering);
            System.out.println("Kode Kue Kering Setelahnya: "+elemenSementara.next.info.kode_kering);
        }
    }
    public void pindahKering(String kering_dicari) {
    Elemen_kering elemen = first;
    if(elemen == null) {
        System.out.println("List Kosong");
    }
    while (elemen != null) {
        if (elemen.info.kode_kering.equals(kering_dicari)) {
            if (elemen == first) {
                first = elemen.next;
                if (first != null) {
                    first.prev = null;
                }
            } else if(elemen.next == null){
                elemen.prev.next = null;
                elemen.prev = null;
            } else {
                elemen.prev.next = elemen.next;
                elemen.next.prev = elemen.prev;
            }
            jual.tambahKering(elemen.info);
            System.out.println("Kue Kering " + kering_dicari + " berhasil dipindahkan ke linked list jual");
            return;
        }
        elemen = elemen.next;
    }
    System.out.println("Kue Kering " + kering_dicari + " tidak ditemukan di linked list ini");
    }
    void deleteFirst(){
        if (first == null){
            System.out.println("KUE KERING KOSONG");
        }else if (first.next == null){
            first = null;
        }else{
            first = first.next;
            first.prev = null;
        }
    }
    void deleteLast(){
        if(first == null){
            System.out.println("KUE KERING KOSONG");  
        }else if (first.next == null){
            first = null;
        }else{
            Elemen_kering elemenSementara = first;
            Elemen_kering beforeLast = null;
            while(elemenSementara.next != null){
                beforeLast = elemenSementara;
                elemenSementara = elemenSementara.next;
            }
            beforeLast.next=null;
            elemenSementara.prev = null;
        }
    }
    void deleteAt(String kering_dicari){
     Elemen_kering elemensementara = first;
        if(elemensementara == null) {
            System.out.println("List Kosong");
        }else if(first.info.kode_kering.equals(kering_dicari)) {
            first = first.next;
            first.prev = null;
        }else{
            while(elemensementara != null){
                if(elemensementara.info.kode_kering.equals(kering_dicari)){
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
        int i = 1;
        Elemen_kering elemenSementara = first;
        if(elemenSementara == null){
            System.out.println("KUE KERING KOSONG");
        }else{
            while(elemenSementara != null){
                System.out.println(i+". Nama Kue Kering: "+(elemenSementara.info.nama_kering) + "; Harga Kue Kering: "+(elemenSementara.info.harga_kering)+"; Kode Kue Kering: "+(elemenSementara.info.kode_kering));
                i++;
                elemenSementara = elemenSementara.next;
            }   
        }
    }
    
}
