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
      
       if (first == null){
           first = elemenbaru;
       }
        Elemen_jual elemensementara = first;
        while(elemensementara.next != null){
            elemensementara = elemensementara.next;
        }
        elemensementara.next = elemenbaru;
        elemenbaru.prev = elemensementara;
       }
    void tambahKering(Kering kkering){
       Elemen_jual elemenbaru= new Elemen_jual(kkering);
       if (first == null){
           first = elemenbaru;
       }
        Elemen_jual elemensementara = first;
        while(elemensementara.next != null){
            elemensementara = elemensementara.next;
        }
        elemensementara.next = elemenbaru;
        elemenbaru.prev = elemensementara;
       }
    void tambahBasah(Basah kbasah){
        Elemen_jual elemenbaru = new Elemen_jual(kbasah);
        
       if (first == null){
           first = elemenbaru;
       }
       Elemen_jual elemensementara = first;
        while(elemensementara.next != null){
            elemensementara = elemensementara.next;
        }
        elemensementara.next = elemenbaru;
        elemenbaru.prev = elemensementara;
       }
    void print(){
        int i = 1;
        Elemen_jual elemenSementara = first;
        if(elemenSementara == null){
            System.out.println("Tidak ada Pesanan");
        }else{
            while(elemenSementara != null){
                System.out.println(i+""+elemenSementara.info);
                i++;
                elemenSementara = elemenSementara.next;
            }   
        }
    }
    }
    
    

