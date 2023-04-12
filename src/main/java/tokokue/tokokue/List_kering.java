/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokokue.tokokue;

/**
 *
 * @author Hussain&Bayu
 */
public class List_kering {
    Elemen_kering first;
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
    
    void insertAt(String nama_kering, int harga_kering, String kode_kering, String cake_dicari){
        Elemen_kering elemenSementara = first;
        Elemen_kering elemenBaru = new Elemen_kering(nama_kering, harga_kering, kode_kering);
        if (first == null){
            first = elemenBaru;
        }
        while (elemenSementara.next != null){
            if(elemenSementara.info.nama_kering.equals(cake_dicari)){
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
        Elemen_kering elemenSementara = first;
        while(!elemenSementara.info.nama_kering.equals(cake_dicari)){
            elemenSementara = elemenSementara.next;
        if(elemenSementara.next == null){
            System.out.println("TIDAK ADA DI STOK");
            break;
            }
        }
        if(elemenSementara.info.nama_kering.equals(cake_dicari)){
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
    void deleteAt(String cake_dicari){
     Elemen_kering elemensementara = first;
        if(elemensementara == null) {
            System.out.println("List Kosong");
        }else if(first.info.nama_kering.equals(cake_dicari)) {
            first = first.next;
            first.prev = null;
        }else{
            while(elemensementara != null){
                if(elemensementara.info.nama_kering.equals(cake_dicari)){
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
        Elemen_kering elemenSementara = first;
        if(elemenSementara == null){
            System.out.println("KUE KERING KOSONG");
        }else{
            while(elemenSementara != null){
                System.out.println("Nama Kue Kering: "+(elemenSementara.info.nama_kering));
                System.out.println("Harga Kue Kering: "+(elemenSementara.info.harga_kering));
                System.out.println("Kode Kue Kering"+(elemenSementara.info.kode_kering));
                elemenSementara = elemenSementara.next;
            }   
        }
    }
    
}
