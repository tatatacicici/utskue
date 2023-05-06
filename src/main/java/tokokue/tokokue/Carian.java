/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokokue.tokokue;

/**
 *
 * @author LENOVO
 */
public class Carian {
    Elemen_kering first;
    List_jual jual = new List_jual();
    Carian(){
        first = null;
    }
    void pindah(String kering_dicari){
        Elemen elemensementara = first;
        if(elemensementara == null) {
            System.out.println("List Kosong");
        }else if(first.info.nama_buah.equals(info_dicari)) {
            first = first.next;
            first.prev = null;
        }else{
            while(elemensementara != null){
                if(elemensementara.info.nama_buah.equals(info_dicari)){
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
}
