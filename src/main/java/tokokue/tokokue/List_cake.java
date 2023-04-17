package tokokue.tokokue;

/**
 *
 * @author Hussain&Bayu
 */
public class List_cake {
    Elemen_cake first;
    List_cake(){
        first = null;
    }
    void insertFirst(String nama_cake, int harga_cake, String kode_cake){
        Elemen_cake elemenbaru = new Elemen_cake(nama_cake, harga_cake, kode_cake);
        if(first == null){
            first = elemenbaru;
        }else{
            elemenbaru.next = first;
            first.prev = elemenbaru;
            first = elemenbaru;
        }
    }
    
    void insertLast(String nama_cake, int harga_cake, String kode_cake){
     Elemen_cake elemenbaru = new Elemen_cake(nama_cake, harga_cake, kode_cake);  
     if(first == null){
         first = elemenbaru;
     }else{
         Elemen_cake elemensementara = first;
        while(elemensementara.next != null){
            elemensementara = elemensementara.next;
        }
        elemensementara.next = elemenbaru;
        elemenbaru.prev = elemensementara;
     }
    }
    
    void insertAt(String nama_cake, int harga_cake, String kode_cake, String cake_dicari){
        Elemen_cake elemenSementara = first;
        Elemen_cake elemenBaru = new Elemen_cake(nama_cake, harga_cake, kode_cake);
        if (first == null){
            first = elemenBaru;
        }
        while (elemenSementara.next != null){
            if(elemenSementara.info.kode_cake.equals(cake_dicari)){
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
    
    void cari(String cake_dicari){
        Elemen_cake elemenSementara = first;
        while(!elemenSementara.info.kode_cake.equals(cake_dicari)){
            elemenSementara = elemenSementara.next;
        if(elemenSementara.next == null){
            System.out.println("TIDAK ADA DI STOK");
            break;
            }
        }
        if(elemenSementara.info.kode_cake.equals(cake_dicari)){
            System.out.println("Cake: "+elemenSementara.info.nama_cake);
            System.out.println("Harga: "+elemenSementara.info.harga_cake);
            System.out.println("Kode: "+elemenSementara.info.kode_cake);
            System.out.println("Cake Sebelumnya: "+elemenSementara.prev.info.nama_cake);
            System.out.println("Harga Cake Sebelumnya: "+elemenSementara.prev.info.harga_cake);
            System.out.println("Kode Cake Sebelumnya: "+elemenSementara.prev.info.kode_cake);
            System.out.println("Cake Setelahnya: "+elemenSementara.next.info.nama_cake);
            System.out.println("Harga Cake Setelahnya: "+elemenSementara.next.info.harga_cake);
            System.out.println("Kode Cake Setelahnya: "+elemenSementara.next.info.kode_cake);
        }
    }
    void deleteFirst(){
        if (first == null){
            System.out.println("CAKE KOSONG");
        }else if (first.next == null){
            first = null;
        }else{
            first = first.next;
            first.prev = null;
        }
    }
    void deleteLast(){
        if(first == null){
            System.out.println("CAKE KOSONG");  
        }else if (first.next == null){
            first = null;
        }else{
            Elemen_cake elemenSementara = first;
            Elemen_cake beforeLast = null;
            while(elemenSementara.next != null){
                beforeLast = elemenSementara;
                elemenSementara = elemenSementara.next;
            }
            beforeLast.next=null;
            elemenSementara.prev = null;
        }
    }
    void deleteAt(String cake_dicari){
     Elemen_cake elemensementara = first;
        if(elemensementara == null) {
            System.out.println("List Kosong");
        }else if(first.info.nama_cake.equals(cake_dicari)) {
            first = first.next;
            first.prev = null;
        }else{
            while(elemensementara != null){
                if(elemensementara.info.nama_cake.equals(cake_dicari)){
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
        Elemen_cake elemenSementara = first;
        if(elemenSementara == null){
            System.out.println("CAKE KOSONG");
        }else{
            while(elemenSementara != null){
                System.out.println("Nama Cake: "+(elemenSementara.info.nama_cake));
                System.out.println("Harga Cake: "+(elemenSementara.info.harga_cake));
                System.out.println("Kode Cake"+(elemenSementara.info.kode_cake));
                elemenSementara = elemenSementara.next;
            }   
        }
    }
            
}
