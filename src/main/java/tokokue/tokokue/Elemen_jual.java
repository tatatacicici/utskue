package tokokue.tokokue;

/**
 *
 * @author Hussain & Bayu
 */
public class Elemen_jual {
    Jual info;
    Elemen_jual prev;
    Elemen_jual next;
    
    Elemen_jual(Object info){
        info = new Jual(info);
        prev=null;
        next=null;
                
    }
}
