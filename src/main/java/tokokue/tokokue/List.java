package tokokue.tokokue;

public class List {
    public static class List_cake{
        Elemen.Elemen_cake first;
        List.Beli_cake cake = new List.Beli_cake();
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
            while(!elemensementara.info_cake.kode_cake.equals(cake_dicari)){
                elemensementara = elemensementara.next;
                if (elemensementara == first){
                    System.out.println("Stok Cake Kosong");
                    break;
                }
            }
            if(elemensementara.info_cake.kode_cake.equals(cake_dicari)){
                if(elemensementara.prev == null){
                    System.out.println("Nama Cake: "+elemensementara.info_cake.nama_cake + "; Harga Cake: "+elemensementara.info_cake.harga_cake+"; Kode Cake: "+elemensementara.info_cake.kode_cake);
                    System.out.println("Nama Cake Setelahnya: "+elemensementara.next.info_cake.nama_cake + "; Harga Cake Setelahnya: "+elemensementara.next.info_cake.harga_cake+"; Kode Cake Setelahnya: "+elemensementara.next.info_cake.kode_cake);
                }else if(elemensementara.next == null){
                    System.out.println("Nama Cake: "+elemensementara.info_cake.nama_cake + "; Harga Cake: "+elemensementara.info_cake.harga_cake+"; Kode Cake: "+elemensementara.info_cake.kode_cake);
                    System.out.println("Nama Cake Sebelumnya: "+elemensementara.prev.info_cake.nama_cake + "; Harga Cake Sebelumnya: "+elemensementara.prev.info_cake.harga_cake+"; Kode Cake Sebelumnya: "+elemensementara.prev.info_cake.kode_cake);
                }else{
                    System.out.println("Nama Cake: "+elemensementara.info_cake.nama_cake + "; Harga Cake: "+elemensementara.info_cake.harga_cake+"; Kode Cake: "+elemensementara.info_cake.kode_cake);
                    System.out.println("Nama Cake Setelahnya: "+elemensementara.next.info_cake.nama_cake + "; Harga Cake Setelahnya: "+elemensementara.next.info_cake.harga_cake+"; Kode Cake Setelahnya: "+elemensementara.next.info_cake.kode_cake);
                    System.out.println("Nama Cake Sebelumnya: "+elemensementara.prev.info_cake.nama_cake + "; Harga Cake Sebelumnya: "+elemensementara.prev.info_cake.harga_cake+"; Kode Cake Sebelumnya: "+elemensementara.prev.info_cake.kode_cake);
                }
            }
        }
        void pindahCake(String cake_dicari){
            Elemen.Elemen_cake elemensementara = first;
            while(!elemensementara.info_cake.kode_cake.equals(cake_dicari)){
                elemensementara = elemensementara.next;
                if (elemensementara == first){
                    System.out.println("Stok Cake Kosong");
                    break;
                }
            }
            if(elemensementara.info_cake.kode_cake.equals(cake_dicari)){
                Elemen.Elemen_cake wadah = elemensementara;
                cake.tambahCake(wadah.info_cake.nama_cake, wadah.info_cake.harga_cake, wadah.info_cake.kode_cake);
                if(elemensementara.prev == null){
                    first = elemensementara.next;
                    first.prev = null;
                }else if(elemensementara.next == null){
                    elemensementara.prev.next = null;
                    elemensementara.prev = null;
                }else{
                    elemensementara.prev.next = elemensementara.next;
                    elemensementara.next.prev = elemensementara.prev;
                }
            }
        }
        void printpindah(){
            cake.print();
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
        List.Beli_kering kering = new List.Beli_kering();
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
            while(!elemensementara.info_kering.kode_kering.equals(kering_dicari)){
                elemensementara = elemensementara.next;
                if (elemensementara == first){
                    System.out.println("Stok Kue Kering Kosong");
                    break;
                }
            }
            if(elemensementara.info_kering.kode_kering.equals(kering_dicari)){
                if(elemensementara.prev == null){
                    System.out.println("Nama Kue Kering: "+elemensementara.info_kering.nama_kering + "; Harga Kue Kering: "+elemensementara.info_kering.harga_kering+"; Kode Kue Kering: "+elemensementara.info_kering.kode_kering);
                    System.out.println("Nama Kue Kering Setelahnya: "+elemensementara.next.info_kering.nama_kering + "; Harga Kue Kering Setelahnya: "+elemensementara.next.info_kering.harga_kering+"; Kode Kue Kering Setelahnya: "+elemensementara.next.info_kering.kode_kering);
                }else if(elemensementara.next == null){
                    System.out.println("Nama Kue Kering: "+elemensementara.info_kering.nama_kering + "; Harga Kue Kering: "+elemensementara.info_kering.harga_kering+"; Kode Kue Kering: "+elemensementara.info_kering.kode_kering);
                    System.out.println("Nama Kue Kering Sebelumnya: "+elemensementara.prev.info_kering.nama_kering + "; Harga Kue Kering Sebelumnya: "+elemensementara.prev.info_kering.harga_kering+"; Kode Kue Kering Sebelumnya: "+elemensementara.prev.info_kering.kode_kering);
                }else{
                    System.out.println("Nama Kue Kering: "+elemensementara.info_kering.nama_kering + "; Harga Kue Kering: "+elemensementara.info_kering.harga_kering+"; Kode Kue Kering: "+elemensementara.info_kering.kode_kering);
                    System.out.println("Nama Kue Kering Setelahnya: "+elemensementara.next.info_kering.nama_kering + "; Harga Kue Kering Setelahnya: "+elemensementara.next.info_kering.harga_kering+"; Kode Kue Kering Setelahnya: "+elemensementara.next.info_kering.kode_kering);
                    System.out.println("Nama Kue Kering Sebelumnya: "+elemensementara.prev.info_kering.nama_kering + "; Harga Kue Kering Sebelumnya: "+elemensementara.prev.info_kering.harga_kering+"; Kode Kue Kering Sebelumnya: "+elemensementara.prev.info_kering.kode_kering);
                }
            }
            
        }
        public void pindahkering(String kering_dicari){
            Elemen.Elemen_kering elemensementara = first;
            while(!elemensementara.info_kering.kode_kering.equals(kering_dicari)){
                elemensementara = elemensementara.next;
                if (elemensementara == first){
                    System.out.println("Stok Kue Kering Kosong");
                    break;
                }
            }
            if(elemensementara.info_kering.kode_kering.equals(kering_dicari)){
                Elemen.Elemen_kering wadah = elemensementara;
                kering.tambahkering(wadah.info_kering.nama_kering, wadah.info_kering.harga_kering, wadah.info_kering.kode_kering);
                if(elemensementara.prev == null){
                    first = elemensementara.next;
                    first.prev = null;
                }else if(elemensementara.next == null){
                    elemensementara.prev.next = null;
                    elemensementara.prev = null;
                }else{
                    elemensementara.prev.next = elemensementara.next;
                    elemensementara.next.prev = elemensementara.prev;
                }
            }
        }
        void printpindah(){
            kering.print();
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


    public static class List_basah{
        Elemen.Elemen_basah first;
        List.Beli_basah basah = new List.Beli_basah();
        List_basah(){
            first = null;
        }
        void insertFirst(String nama_basah, int harga_basah, String kode_basah){
            Elemen.Elemen_basah elemenbaru = new Elemen.Elemen_basah(nama_basah, harga_basah, kode_basah);
            if(first == null){
                first = elemenbaru;
            }else{
                elemenbaru.next = first;
                first.prev = elemenbaru;
                first = elemenbaru;
            }
        }
        void insertLast(String nama_basah, int harga_basah, String kode_basah){
            Elemen.Elemen_basah elemenbaru = new Elemen.Elemen_basah(nama_basah, harga_basah, kode_basah);  
            if(first == null){
                first = elemenbaru;
            }else{
                Elemen.Elemen_basah elemensementara = first;
               while(elemensementara.next != null){
                   elemensementara = elemensementara.next;
               }
               elemensementara.next = elemenbaru;
               elemenbaru.prev = elemensementara;
            }
        }
        void insertAt(String nama_basah, int harga_basah, String kode_basah, String basah_dicari){
            Elemen.Elemen_basah elemenSementara = first;
            Elemen.Elemen_basah elemenBaru = new Elemen.Elemen_basah(nama_basah, harga_basah, kode_basah);
            if (first == null){
                first = elemenBaru;
            }
            while (elemenSementara.next != null){
                if(elemenSementara.info_basah.kode_basah.equals(basah_dicari)){
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
                System.out.println("Kue Basah KOSONG");
            }else if (first.next == null){
                first = null;
            }else{
                first = first.next;
                first.prev = null;
            }
        }
        void deleteLast(){
            if(first == null){
                System.out.println("Kue Basah KOSONG");  
            }else if (first.next == null){
                first = null;
            }else{
                Elemen.Elemen_basah elemenSementara = first;
                Elemen.Elemen_basah beforeLast = null;
                while(elemenSementara.next != null){
                    beforeLast = elemenSementara;
                    elemenSementara = elemenSementara.next;
                }
                beforeLast.next=null;
                elemenSementara.prev = null;
            }
        }
        void deleteAt(String basah_dicari){
            Elemen.Elemen_basah elemensementara = first;
            if(elemensementara == null) {
                System.out.println("List Kosong");
            }else if(first.info_basah.nama_basah.equals(basah_dicari)) {
                first = first.next;
                first.prev = null;
            }else{
                while(elemensementara.next != null){
                    if(elemensementara.info_basah.kode_basah.equals(basah_dicari)){
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
        void cari(String basah_dicari){
            Elemen.Elemen_basah elemensementara = first;
            while(!elemensementara.info_basah.kode_basah.equals(basah_dicari)){
                elemensementara = elemensementara.next;
                if (elemensementara == first){
                    System.out.println("Stok Kue Basah Kosong");
                    break;
                }
            }
            if(elemensementara.info_basah.kode_basah.equals(basah_dicari)){
                if(elemensementara.prev == null){
                    System.out.println("Nama Kue Basah: "+elemensementara.info_basah.nama_basah + "; Harga Kue Basah: "+elemensementara.info_basah.harga_basah+"; Kode Kue Basah: "+elemensementara.info_basah.kode_basah);
                    System.out.println("Nama Kue Basah Setelahnya: "+elemensementara.next.info_basah.nama_basah + "; Harga Kue Basah Setelahnya: "+elemensementara.next.info_basah.harga_basah+"; Kode Kue Basah Setelahnya: "+elemensementara.next.info_basah.kode_basah);
                }else if(elemensementara.next == null){
                    System.out.println("Nama Kue Basah: "+elemensementara.info_basah.nama_basah + "; Harga Kue Basah: "+elemensementara.info_basah.harga_basah+"; Kode Kue Basah: "+elemensementara.info_basah.kode_basah);
                    System.out.println("Nama Kue Basah Sebelumnya: "+elemensementara.prev.info_basah.nama_basah + "; Harga Kue Basah Sebelumnya: "+elemensementara.prev.info_basah.harga_basah+"; Kode Kue Basah Sebelumnya: "+elemensementara.prev.info_basah.kode_basah);
                }else{
                    System.out.println("Nama Kue Basah: "+elemensementara.info_basah.nama_basah + "; Harga Kue Basah: "+elemensementara.info_basah.harga_basah+"; Kode Kue Basah: "+elemensementara.info_basah.kode_basah);
                    System.out.println("Nama Kue Basah Setelahnya: "+elemensementara.next.info_basah.nama_basah + "; Harga Kue Basah Setelahnya: "+elemensementara.next.info_basah.harga_basah+"; Kode Kue Basah Setelahnya: "+elemensementara.next.info_basah.kode_basah);
                    System.out.println("Nama Kue Basah Sebelumnya: "+elemensementara.prev.info_basah.nama_basah + "; Harga Kue Basah Sebelumnya: "+elemensementara.prev.info_basah.harga_basah+"; Kode Kue Basah Sebelumnya: "+elemensementara.prev.info_basah.kode_basah);
                }
            }
        }
        void pindahbasah(String basah_dicari){
            Elemen.Elemen_basah elemensementara = first;
            while(!elemensementara.info_basah.kode_basah.equals(basah_dicari)){
                elemensementara = elemensementara.next;
                if (elemensementara == first){
                    System.out.println("Stok Kue Basah Kosong");
                    break;
                }
            }
            if(elemensementara.info_basah.kode_basah.equals(basah_dicari)){
                Elemen.Elemen_basah wadah = elemensementara;
                basah.tambahbasah(wadah.info_basah.nama_basah, wadah.info_basah.harga_basah, wadah.info_basah.kode_basah);
                if(elemensementara.prev == null){
                    first = elemensementara.next;
                    first.prev = null;
                }else if(elemensementara.next == null){
                    elemensementara.prev.next = null;
                    elemensementara.prev = null;
                }else{
                    elemensementara.prev.next = elemensementara.next;
                    elemensementara.next.prev = elemensementara.prev;
                }
            }
        }
        void printpindah(){
            basah.print();
        }
        void print(){
            int i = 1;
            Elemen.Elemen_basah elemenSementara = first;
            if(elemenSementara == null){
                System.out.println("Kue Basah KOSONG");
            }else{
                while(elemenSementara != null){
                    System.out.println(i+". Nama Kue Basah: "+(elemenSementara.info_basah.nama_basah) + "; Harga Kue Basah: "+(elemenSementara.info_basah.harga_basah)+"; Kode Kue Basah: "+(elemenSementara.info_basah.kode_basah));
                    i++;
                    elemenSementara = elemenSementara.next;
                }   
            }
        }
    }

    public static class Beli_cake{
        Elemen.Move_cake first;
        Beli_cake(){
            first = null;
        }
        void tambahCake(String nama_cake, int harga_cake, String kode_cake){
            Elemen.Move_cake elemenbaru = new Elemen.Move_cake(nama_cake, harga_cake, kode_cake);  
            if(first == null){
                first = elemenbaru;
            }else{
                Elemen.Move_cake elemensementara = first;
               while(elemensementara.next != null){
                   elemensementara = elemensementara.next;
               }
               elemensementara.next = elemenbaru;
               elemenbaru.prev = elemensementara;
            }
        }
        void print(){
            int i = 1;
            Elemen.Move_cake elemenSementara = first;
            if(elemenSementara == null){
                System.out.println("CAKE KOSONG");
            }else{
                while(elemenSementara != null){
                    System.out.println("Pesanan Ke."+i+". Nama Cake: "+(elemenSementara.info_cake.nama_cake) + "; Harga Cake: "+(elemenSementara.info_cake.harga_cake)+"; Kode Cake: "+(elemenSementara.info_cake.kode_cake));
                    i++;
                    elemenSementara = elemenSementara.next;
                }   
            }
        }
    }
    
    public static class Beli_kering{
        Elemen.Move_kering first;
        Beli_kering(){
            first = null;
        }
        public void tambahkering(String nama_kering, int harga_kering, String kode_kering){
            Elemen.Move_kering elemenbaru = new Elemen.Move_kering(nama_kering, harga_kering, kode_kering);
            if(first == null){
                first = elemenbaru;
            }else{
                Elemen.Move_kering elemensementara = first;
                while(elemensementara.next != null){
                    elemensementara = elemensementara.next;
                }
                elemensementara.next = elemenbaru;
                elemenbaru.prev = elemensementara;
            } 
        }
       public void cari(String kering_dicari){
        Elemen.Move_kering elemensementara = first;
            while(!elemensementara.info_kering.kode_kering.equals(kering_dicari)){
                elemensementara = elemensementara.next;
                if (elemensementara == first){
                    System.out.println("Stok Kue Kering Kosong");
                    break;
                }
            }
            if(elemensementara.info_kering.kode_kering.equals(kering_dicari)){
                System.out.println(elemensementara.info_kering.nama_kering);
            }
        }
       void print(){
        int i = 1;
        Elemen.Move_kering elemenSementara = first;
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

    public static class Beli_basah{
        Elemen.Move_basah first;
        Beli_basah(){
            first = null;
        }
        void tambahbasah(String nama_basah, int harga_basah, String kode_basah){
            Elemen.Move_basah elemenbaru = new Elemen.Move_basah(nama_basah, harga_basah, kode_basah);  
            if(first == null){
                first = elemenbaru;
            }else{
                Elemen.Move_basah elemen_sementara = first;
                while(elemen_sementara.next != null){
                   elemen_sementara = elemen_sementara.next;
               }
               elemen_sementara.next = elemenbaru;
               elemenbaru.prev = elemen_sementara;
            }
        }
        void print(){
            int i = 1;
            Elemen.Move_basah elemenSementara = first;
            if(elemenSementara == null){
                System.out.println("Kue Basah KOSONG");
            }else{
                while(elemenSementara != null){
                    System.out.println("Pesanan ke."+i+" Nama Kue Basah: "+(elemenSementara.info_basah.nama_basah) + "; Harga Kue Basah: "+(elemenSementara.info_basah.harga_basah)+"; Kode Kue Basah: "+(elemenSementara.info_basah.kode_basah));
                    i++;
                    elemenSementara = elemenSementara.next;
                }   
            }
        }
    }
}

