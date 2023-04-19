package tokokue.tokokue;

/**
 *
 * @author Hussain & Bayu
 */
public class List_jual {

Elemen_jual first;
List_jual(){
    first = null;
}
    
    void tambahCake(Cake cake){
       Elemen_jual elemenbaru= new Elemen_jual(cake);
       Elemen_jual elemensementara = first;
       if (first == null){
           first = elemenbaru;
       }
        while(elemensementara.next != null){
            elemensementara = elemensementara.next;
        }
        elemensementara.next = elemenbaru;
        elemenbaru.prev = elemensementara;
       }
    void tambahKering(Kering kkering){
       Elemen_jual elemenbaru= new Elemen_jual(kkering);
       Elemen_jual elemensementara = first;
       if (first == null){
           first = elemenbaru;
       }
        while(elemensementara.next != null){
            elemensementara = elemensementara.next;
        }
        elemensementara.next = elemenbaru;
        elemenbaru.prev = elemensementara;
       }
    void tambahBasah(Basah kbasah){
        Elemen_jual elemenbaru = new Elemen_jual(kbasah);
        Elemen_jual elemensementara = first;
       if (first == null){
           first = elemenbaru;
       }
        while(elemensementara.next != null){
            elemensementara = elemensementara.next;
        }
        elemensementara.next = elemenbaru;
        elemenbaru.prev = elemensementara;
       }
    
    }
    
    

