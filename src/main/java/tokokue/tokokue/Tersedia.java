package tokokue.tokokue;

public class Tersedia {
    public static class List_cake{
        Elemen.Elemen_cake first;
        List_cake(){
            first = null;
        }
        void insertFirst(String nama_cake, int harga_cake, String kode_cake){
            Elemen.Elemen_cake elemenbaru = new Elemen.Elemen_cake(nama_cake, harga_cake, kode_cake);
            if(first == null){
                first = elemenbaru;
            }else{
                elemenbaru.next = first;
                first.prev = elemenbaru;
                first = elemenbaru;
            }
        }
        void insertLast(String nama_cake, int harga_cake, String kode_cake){
            Elemen.Elemen_cake elemenbaru = new Elemen.Elemen_cake(nama_cake, harga_cake, kode_cake);  
            if(first == null){
                first = elemenbaru;
            }else{
                Elemen.Elemen_cake elemensementara = first;
               while(elemensementara.next != null){
                   elemensementara = elemensementara.next;
               }
               elemensementara.next = elemenbaru;
               elemenbaru.prev = elemensementara;
            }
        }
        void insertAt(String nama_cake, int harga_cake, String kode_cake, String cake_dicari){
            Elemen.Elemen_cake elemenSementara = first;
            Elemen.Elemen_cake elemenBaru = new Elemen.Elemen_cake(nama_cake, harga_cake, kode_cake);
            if (first == null){
                first = elemenBaru;
            }
            while (elemenSementara.next != null){
                if(elemenSementara.info_cake.kode_cake.equals(cake_dicari)){
                    elemenBaru.next = elemenSementara.next;
                    elemenSementara.next.prev = elemenBaru;
                    elemenBaru.prev = elemenSementara;
                    elemenSementara.next = elemenBaru;
                    break;
                }else{
                    elemenSementara = elemenSementara.next;
                    
                }
            }if (elemenSementara.next == null){
                elemenSementara.next = elemenBaru;
                elemenBaru.prev = elemenSementara;
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
                Elemen.Elemen_cake elemenSementara = first;
                Elemen.Elemen_cake beforeLast = null;
                while(elemenSementara.next != null){
                    beforeLast = elemenSementara;
                    elemenSementara = elemenSementara.next;
                }
                beforeLast.next=null;
                elemenSementara.prev = null;
            }
        }
        void deleteAt(String cake_dicari){
            Elemen.Elemen_cake elemensementara = first;
            if(elemensementara == null) {
                System.out.println("List Kosong");
            }else if(first.info_cake.nama_cake.equals(cake_dicari)) {
                first = first.next;
                first.prev = null;
            }else{
                while(elemensementara.next != null){
                    if(elemensementara.info_cake.kode_cake.equals(cake_dicari)){
                        elemensementara.prev.next = elemensementara.next;
                        elemensementara.next.prev = elemensementara.prev;
                        break;
                }else{
                    elemensementara = elemensementara.next;
                }
            }if(elemensementara.next == null){
                elemensementara.prev.next = null;
                elemensementara.prev = null;
            }
            }

        }
        void cari(String cake_dicari){
            Elemen.Elemen_cake elemensementara = first;
            if(elemensementara == null){
                System.out.println("Stok Kosong");
            }else if(first.info_cake.kode_cake.equals(cake_dicari)){
                System.out.println("Nama Cake: "+elemensementara.info_cake.nama_cake + "; Harga Cake: "+elemensementara.info_cake.harga_cake+"; Kode Cake: "+elemensementara.info_cake.kode_cake);
            } else{
                while(elemensementara.next != null){
                    if(elemensementara.info_cake.kode_cake.equals(cake_dicari)){
                        System.out.println("Nama Cake: "+elemensementara.info_cake.nama_cake + "; Harga Cake: "+elemensementara.info_cake.harga_cake+"; Kode Cake: "+elemensementara.info_cake.kode_cake);
                        System.out.println("Nama Cake Setelahnya: "+elemensementara.next.info_cake.nama_cake + "; Harga Cake Setelahnya: "+elemensementara.next.info_cake.harga_cake+"; Kode Cake Setelahnya: "+elemensementara.next.info_cake.kode_cake);
                        System.out.println("Nama Cake Sebelumnya: "+elemensementara.prev.info_cake.nama_cake + "; Harga Cake Sebelumnya: "+elemensementara.prev.info_cake.harga_cake+"; Kode Cake Sebelumnya: "+elemensementara.prev.info_cake.kode_cake);
                        break;
                    }else{
                        elemensementara = elemensementara.next;
                    }
                }if(elemensementara.next == null){
                    if(elemensementara.info_cake.kode_cake.equals(cake_dicari)){
                        System.out.println("Nama Cake: "+elemensementara.info_cake.nama_cake + "; Harga Cake: "+elemensementara.info_cake.harga_cake+"; Kode Cake: "+elemensementara.info_cake.kode_cake);
                        System.out.println("Nama Cake Sebelumnya: "+elemensementara.prev.info_cake.nama_cake + "; Harga Cake Sebelumnya: "+elemensementara.prev.info_cake.harga_cake+"; Kode Cake Sebelumnya: "+elemensementara.prev.info_cake.kode_cake);
                    }else{
                        System.out.println("Cake tidak ditemukan !!!");
                    }                
                }
            }
        }
        void pindahCake(String cake_dicari){
            Elemen.Elemen_cake elemensementara = first;
            Elemen.Elemen_cake wadah = elemensementara;
            if(elemensementara == null){
                System.out.println("Cake kosong");
            }else if(first.info_cake.nama_cake.equals(cake_dicari)) {
                //Beli.tambahCake(elemensementara.info_cake.nama_cake, elemensementara.info_cake.harga_cake, elemensementara.info_cake.kode_cake)
                first = first.next;
                first.prev = null;
            }else{
                while(elemensementara.next != null){
                    if (elemensementara.info_cake.nama_cake.equals(cake_dicari)){
                        //Beli.tambahCake(elemensementara.info_cake.nama_cake, elemensementara.info_cake.harga_cake, elemensementara.info_cake.kode_cake)
                        elemensementara.prev.next = elemensementara.next;
                        elemensementara.next.prev = elemensementara.prev;
                        break;
                    }else{
                        elemensementara = elemensementara.next;
                    }
                }if(elemensementara.next == null){
                    //Beli.tambahCake(elemensementara.info_cake.nama_cake, elemensementara.info_cake.harga_cake, elemensementara.info_cake.kode_cake)
                    elemensementara.prev.next = null;
                    elemensementara.prev = null;
                }else{
                    System.out.println("Kode SALAH!");
                }
            }
        }
        void print(){
            int i = 1;
            Elemen.Elemen_cake elemenSementara = first;
            if(elemenSementara == null){
                System.out.println("CAKE KOSONG");
            }else{
                while(elemenSementara != null){
                    System.out.println(i+". Nama Cake: "+(elemenSementara.info_cake.nama_cake) + "; Harga Cake: "+(elemenSementara.info_cake.harga_cake)+"; Kode Cake: "+(elemenSementara.info_cake.kode_cake));
                    i++;
                    elemenSementara = elemenSementara.next;
                }   
            }
        }
    }
    public static class List_kering{
        Elemen.Elemen_kering first;
        List_kering(){
            first = null;
        }
        void insertFirst(String nama_kering, int harga_kering, String kode_kering){
            Elemen.Elemen_kering elemenbaru = new Elemen.Elemen_kering(nama_kering, harga_kering, kode_kering);
            if(first == null){
                first = elemenbaru;
            }else{
                elemenbaru.next = first;
                first.prev = elemenbaru;
                first = elemenbaru;
            }
        }
        void insertLast(String nama_kering, int harga_kering, String kode_kering){
            Elemen.Elemen_kering elemenbaru = new Elemen.Elemen_kering(nama_kering, harga_kering, kode_kering);  
            if(first == null){
                first = elemenbaru;
            }else{
                Elemen.Elemen_kering elemensementara = first;
               while(elemensementara.next != null){
                   elemensementara = elemensementara.next;
               }
               elemensementara.next = elemenbaru;
               elemenbaru.prev = elemensementara;
            }
        }
        void insertAt(String nama_kering, int harga_kering, String kode_kering, String kering_dicari){
            Elemen.Elemen_kering elemenSementara = first;
            Elemen.Elemen_kering elemenBaru = new Elemen.Elemen_kering(nama_kering, harga_kering, kode_kering);
            if (first == null){
                first = elemenBaru;
            }
            while (elemenSementara.next != null){
                if(elemenSementara.info_kering.kode_kering.equals(kering_dicari)){
                    elemenBaru.next = elemenSementara.next;
                    elemenSementara.next.prev = elemenBaru;
                    elemenBaru.prev = elemenSementara;
                    elemenSementara.next = elemenBaru;
                    break;
                }else{
                    elemenSementara = elemenSementara.next;
                    
                }
            }if (elemenSementara.next == null){
                elemenSementara.next = elemenBaru;
                elemenBaru.prev = elemenSementara;
            }
        
        }
        void deleteFirst(){
            if (first == null){
                System.out.println("Kue Kering KOSONG");
            }else if (first.next == null){
                first = null;
            }else{
                first = first.next;
                first.prev = null;
            }
        }
        void deleteLast(){
            if(first == null){
                System.out.println("Kue Kering KOSONG");  
            }else if (first.next == null){
                first = null;
            }else{
                Elemen.Elemen_kering elemenSementara = first;
                Elemen.Elemen_kering beforeLast = null;
                while(elemenSementara.next != null){
                    beforeLast = elemenSementara;
                    elemenSementara = elemenSementara.next;
                }
                beforeLast.next=null;
                elemenSementara.prev = null;
            }
        }
        void deleteAt(String kering_dicari){
            Elemen.Elemen_kering elemensementara = first;
            if(elemensementara == null) {
                System.out.println("List Kosong");
            }else if(first.info_kering.nama_kering.equals(kering_dicari)) {
                first = first.next;
                first.prev = null;
            }else{
                while(elemensementara.next != null){
                    if(elemensementara.info_kering.kode_kering.equals(kering_dicari)){
                        elemensementara.prev.next = elemensementara.next;
                        elemensementara.next.prev = elemensementara.prev;
                        break;
                }else{
                    elemensementara = elemensementara.next;
                }
            }if(elemensementara.next == null){
                elemensementara.prev.next = null;
                elemensementara.prev = null;
            }
            }

        }
        void cari(String kering_dicari){
            Elemen.Elemen_kering elemensementara = first;
            if(elemensementara == null){
                System.out.println("Stok Kosong");
            }else if(first.info_kering.kode_kering.equals(kering_dicari)){
                System.out.println("Nama Kue Kering: "+elemensementara.info_kering.nama_kering + "; Harga Kue Kering: "+elemensementara.info_kering.harga_kering+"; Kode Kue Kering: "+elemensementara.info_kering.kode_kering);
            } else{
                while(elemensementara.next != null){
                    if(elemensementara.info_kering.kode_kering.equals(kering_dicari)){
                        System.out.println("Nama Kue Kering: "+elemensementara.info_kering.nama_kering + "; Harga Kue Kering: "+elemensementara.info_kering.harga_kering+"; Kode Kue Kering: "+elemensementara.info_kering.kode_kering);
                        System.out.println("Nama Kue Kering Setelahnya: "+elemensementara.next.info_kering.nama_kering + "; Harga Kue Kering Setelahnya: "+elemensementara.next.info_kering.harga_kering+"; Kode Kue Kering Setelahnya: "+elemensementara.next.info_kering.kode_kering);
                        System.out.println("Nama Kue Kering Sebelumnya: "+elemensementara.prev.info_kering.nama_kering + "; Harga Kue Kering Sebelumnya: "+elemensementara.prev.info_kering.harga_kering+"; Kode Kue Kering Sebelumnya: "+elemensementara.prev.info_kering.kode_kering);
                        break;
                    }else{
                        elemensementara = elemensementara.next;
                    }
                }if(elemensementara.next == null){
                    if(elemensementara.info_kering.kode_kering.equals(kering_dicari)){
                        System.out.println("Nama Kue Kering: "+elemensementara.info_kering.nama_kering + "; Harga Kue Kering: "+elemensementara.info_kering.harga_kering+"; Kode Kue Kering: "+elemensementara.info_kering.kode_kering);
                        System.out.println("Nama Kue Kering Sebelumnya: "+elemensementara.prev.info_kering.nama_kering + "; Harga Kue Kering Sebelumnya: "+elemensementara.prev.info_kering.harga_kering+"; Kode Kue Kering Sebelumnya: "+elemensementara.prev.info_kering.kode_kering);
                    }else{
                        System.out.println("Kue Kering tidak ditemukan !!!");
                    }                
                }
            }
        }
        void pindahkering(String kering_dicari){
            Elemen.Elemen_kering elemensementara = first;
            Elemen.Elemen_kering wadah = elemensementara;
            if(elemensementara == null){
                System.out.println("Kue Kering kosong");
            }else if(first.info_kering.nama_kering.equals(kering_dicari)) {
                //Beli.tambahkering(elemensementara.info_kering.nama_kering, elemensementara.info_kering.harga_kering, elemensementara.info_kering.kode_kering)
                first = first.next;
                first.prev = null;
            }else{
                while(elemensementara.next != null){
                    if (elemensementara.info_kering.nama_kering.equals(kering_dicari)){
                        //Beli.tambahkering(elemensementara.info_kering.nama_kering, elemensementara.info_kering.harga_kering, elemensementara.info_kering.kode_kering)
                        elemensementara.prev.next = elemensementara.next;
                        elemensementara.next.prev = elemensementara.prev;
                        break;
                    }else{
                        elemensementara = elemensementara.next;
                    }
                }if(elemensementara.next == null){
                    //Beli.tambahkering(elemensementara.info_kering.nama_kering, elemensementara.info_kering.harga_kering, elemensementara.info_kering.kode_kering)
                    elemensementara.prev.next = null;
                    elemensementara.prev = null;
                }else{
                    System.out.println("Kode SALAH!");
                }
            }
        }
        void print(){
            int i = 1;
            Elemen.Elemen_kering elemenSementara = first;
            if(elemenSementara == null){
                System.out.println("Kue Kering KOSONG");
            }else{
                while(elemenSementara != null){
                    System.out.println(i+". Nama Kue Kering: "+(elemenSementara.info_kering.nama_kering) + "; Harga Kue Kering: "+(elemenSementara.info_kering.harga_kering)+"; Kode Kue Kering: "+(elemenSementara.info_kering.kode_kering));
                    i++;
                    elemenSementara = elemenSementara.next;
                }   
            }
        }
    }

}
