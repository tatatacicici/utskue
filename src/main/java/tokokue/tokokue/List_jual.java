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
        if (first != null){
            System.out.println("ADA ISINYA");
            
        }
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
    void print() {
    if (first == null) {
        System.out.println("Tidak ada Pesanan");
    } else {
        int i = 1;
        Elemen_jual elemenSementara = first;
        while (elemenSementara != null) {
            if (elemenSementara.info instanceof Cake) {
                Cake cake = (Cake) elemenSementara.info;
                System.out.println("Pesanan ke-" + i + " (Cake): " + cake.getKode());
            } else if (elemenSementara.info instanceof Kering) {
                Kering kering = (Kering) elemenSementara.info;
                System.out.println("Pesanan ke-" + i + " (Kering): " + kering.getKode());
            } else if (elemenSementara.info instanceof Basah) {
                Basah basah = (Basah) elemenSementara.info;
                System.out.println("Pesanan ke-" + i + " (Basah): " + basah.getKode());
            }
            elemenSementara = elemenSementara.next;
            i++;
        }
    }
}

}

