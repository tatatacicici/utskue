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
            if (elemensementara.info_cake.kode_cake.equals(cake_dicari)) {
                System.out.println("===================================================");
                System.out.println("|             Informasi " + elemensementara.info_cake.nama_cake + "             |");
                System.out.println("===================================================");
                System.out.println("  Nama Cake           : " + elemensementara.info_cake.nama_cake);
                System.out.println("  Harga Cake          : " + elemensementara.info_cake.harga_cake);
                System.out.println("  Kode Cake           : " + elemensementara.info_cake.kode_cake);
                System.out.println("===================================================");
            
                if (elemensementara.prev == null) {
                    System.out.println("  Nama Cake Setelahnya : " + elemensementara.next.info_cake.nama_cake);
                    System.out.println("  Harga Cake Setelahnya: " + elemensementara.next.info_cake.harga_cake);
                    System.out.println("  Kode Cake Setelahnya : " + elemensementara.next.info_cake.kode_cake);
                } else if (elemensementara.next == null) {
                    System.out.println("  Nama Cake Sebelumnya : " + elemensementara.prev.info_cake.nama_cake);
                    System.out.println("  Harga Cake Sebelumnya: " + elemensementara.prev.info_cake.harga_cake);
                    System.out.println("  Kode Cake Sebelumnya : " + elemensementara.prev.info_cake.kode_cake);
                } else {
                    System.out.println("  Nama Cake Sebelumnya : " + elemensementara.prev.info_cake.nama_cake);
                    System.out.println("  Harga Cake Sebelumnya: " + elemensementara.prev.info_cake.harga_cake);
                    System.out.println("  Kode Cake Sebelumnya : " + elemensementara.prev.info_cake.kode_cake);
                    System.out.println("  Nama Cake Setelahnya : " + elemensementara.next.info_cake.nama_cake);
                    System.out.println("  Harga Cake Setelahnya: " + elemensementara.next.info_cake.harga_cake);
                    System.out.println("  Kode Cake Setelahnya : " + elemensementara.next.info_cake.kode_cake);
                }
                System.out.println("===================================================");
            }
            
        }
        void pindahCake(String cake_dicari){
            Elemen.Elemen_cake elemensementara = first;
            while(!elemensementara.info_cake.kode_cake.equals(cake_dicari)){
                elemensementara = elemensementara.next;
                if (elemensementara == first){
                    System.out.println("Stok Cake Kosong");
                    break;
                }else if(elemensementara.next == null){
                    System.out.println("Cake Sudah dibeli/Kode Salah");
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
        void hitungcake(){
            cake.hitungcake();
        }
        int hitungtotal(){
            cake.hitungtotal();
            return cake.hitungtotal();
        }
        void print(){
            int i = 1;
            Elemen.Elemen_cake elemenSementara = first;
            if(elemenSementara == null){
                System.out.println("CAKE KOSONG");
            } else {
                System.out.println("+---+-------------------------+--------------+--------------+");
                System.out.println("|No |   Nama Cake             |  Harga Cake  |   Kode Cake  |");
                System.out.println("+---+-------------------------+--------------+--------------+");
                while (elemenSementara != null) {
                    System.out.printf("|%-3d|%-25s|Rp %-11d|%-14s|%n", i, elemenSementara.info_cake.nama_cake,
                        elemenSementara.info_cake.harga_cake, elemenSementara.info_cake.kode_cake);
                    i++;
                    elemenSementara = elemenSementara.next;
                }
                System.out.println("+---+-------------------------+--------------+--------------+");
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
            if (elemensementara.info_kering.kode_kering.equals(kering_dicari)) {
                System.out.println("===================================================");
                System.out.println("|             Informasi " + elemensementara.info_kering.nama_kering + "             |");
                System.out.println("===================================================");
                System.out.println("  Nama Kue Kering           : " + elemensementara.info_kering.nama_kering);
                System.out.println("  Harga Kue Kering          : " + elemensementara.info_kering.harga_kering);
                System.out.println("  Kode Kue Kering           : " + elemensementara.info_kering.kode_kering);
                System.out.println("===================================================");
            
                if (elemensementara.prev == null) {
                    System.out.println("  Nama Kue Kering Setelahnya : " + elemensementara.next.info_kering.nama_kering);
                    System.out.println("  Harga Kue Kering Setelahnya: " + elemensementara.next.info_kering.harga_kering);
                    System.out.println("  Kode Kue Kering Setelahnya : " + elemensementara.next.info_kering.kode_kering);
                } else if (elemensementara.next == null) {
                    System.out.println("  Nama Kue Kering Sebelumnya : " + elemensementara.prev.info_kering.nama_kering);
                    System.out.println("  Harga Kue Kering Sebelumnya: " + elemensementara.prev.info_kering.harga_kering);
                    System.out.println("  Kode Kue Kering Sebelumnya : " + elemensementara.prev.info_kering.kode_kering);
                } else {
                    System.out.println("  Nama Kue Kering Sebelumnya : " + elemensementara.prev.info_kering.nama_kering);
                    System.out.println("  Harga Kue Kering Sebelumnya: " + elemensementara.prev.info_kering.harga_kering);
                    System.out.println("  Kode Kue Kering Sebelumnya : " + elemensementara.prev.info_kering.kode_kering);
                    System.out.println("  Nama Kue Kering Setelahnya : " + elemensementara.next.info_kering.nama_kering);
                    System.out.println("  Harga Kue Kering Setelahnya: " + elemensementara.next.info_kering.harga_kering);
                    System.out.println("  Kode Kue Kering Setelahnya : " + elemensementara.next.info_kering.kode_kering);
                }
                System.out.println("===================================================");
            }
            
        }
        public void pindahkering(String kering_dicari){
            Elemen.Elemen_kering elemensementara = first;
            while(!elemensementara.info_kering.kode_kering.equals(kering_dicari)){
                elemensementara = elemensementara.next; 
                if (elemensementara == first){
                    System.out.println("Stok Kue Kering Kosong");
                    break;
                }else if(elemensementara.next == null){
                    System.out.println("Kue Kering Kosong/Kode Salah");
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
        void hitungkering(){
            kering.hitungkering();
        }
        int hitungtotal(){
            kering.hitungtotal();
            return kering.hitungtotal();
        }
        void print(){
            int i = 1;
            Elemen.Elemen_kering elemenSementara = first;
            if(elemenSementara == null){
                System.out.println("Kue Kering KOSONG");
            } else {
                System.out.println("+---+------------------+--------------+--------------+");
                System.out.println("|No |   Nama Kue Kering| Harga Kue    | Kode Kue     |");
                System.out.println("+---+------------------+--------------+--------------+");
                while (elemenSementara != null) {
                    System.out.printf("|%-3d|%-18s|Rp %-11d|%-14s|%n", i, elemenSementara.info_kering.nama_kering,
                        elemenSementara.info_kering.harga_kering, elemenSementara.info_kering.kode_kering);
                    i++;
                    elemenSementara = elemenSementara.next;
                }
                System.out.println("+---+------------------+--------------+--------------+");
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
            if (elemensementara.info_basah.kode_basah.equals(basah_dicari)) {
                System.out.println("===================================================");
                System.out.println("|             Informasi " + elemensementara.info_basah.nama_basah + "             |");
                System.out.println("===================================================");
                System.out.println("| Nama Kue Basah           : " + elemensementara.info_basah.nama_basah);
                System.out.println("| Harga Kue Basah          : " + elemensementara.info_basah.harga_basah);
                System.out.println("| Kode Kue Basah           : " + elemensementara.info_basah.kode_basah);
                System.out.println("===================================================");
            
                if (elemensementara.prev == null) {
                    System.out.println("  Nama Kue Basah Setelahnya : " + elemensementara.next.info_basah.nama_basah);
                    System.out.println("  Harga Kue Basah Setelahnya: " + elemensementara.next.info_basah.harga_basah);
                    System.out.println("  Kode Kue Basah Setelahnya : " + elemensementara.next.info_basah.kode_basah);
                } else if (elemensementara.next == null) {
                    System.out.println("  Nama Kue Basah Sebelumnya : " + elemensementara.prev.info_basah.nama_basah);
                    System.out.println("  Harga Kue Basah Sebelumnya: " + elemensementara.prev.info_basah.harga_basah);
                    System.out.println("  Kode Kue Basah Sebelumnya : " + elemensementara.prev.info_basah.kode_basah);
                } else {
                    System.out.println("  Nama Kue Basah Sebelumnya : " + elemensementara.prev.info_basah.nama_basah);
                    System.out.println("  Harga Kue Basah Sebelumnya: " + elemensementara.prev.info_basah.harga_basah);
                    System.out.println("  Kode Kue Basah Sebelumnya : " + elemensementara.prev.info_basah.kode_basah);
                    System.out.println("  Nama Kue Basah Setelahnya : " + elemensementara.next.info_basah.nama_basah);
                    System.out.println("  Harga Kue Basah Setelahnya: " + elemensementara.next.info_basah.harga_basah);
                    System.out.println("  Kode Kue Basah Setelahnya : " + elemensementara.next.info_basah.kode_basah);
                }
                System.out.println("===================================================");
            }
        }
        void pindahbasah(String basah_dicari){
            Elemen.Elemen_basah elemensementara = first;
            while(!elemensementara.info_basah.kode_basah.equals(basah_dicari)){
                elemensementara = elemensementara.next;
                if (elemensementara == first){
                    System.out.println("Stok Kue Basah Kosong");
                    break;
                }else if(elemensementara.next == null){
                    System.out.println("Kode Salah/Sudah dibeli");
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
        void hitungbasah(){
            basah.hitungbasah();
        }
        int hitungtotal(){
            basah.hitungtotal();
            return basah.hitungtotal();
        }
        void print(){
            int i = 1;
            Elemen.Elemen_basah elemenSementara = first;
            if(elemenSementara == null){
                System.out.println("Kue Basah KOSONG");
            }else {
                System.out.println("+---+------------------+--------------+--------------+");
                System.out.println("|No |   Nama Kue Basah  | Harga Kue    | Kode Kue     |");
                System.out.println("+---+------------------+--------------+--------------+");
                while (elemenSementara != null) {
                    System.out.printf("|%-3d|%-18s|Rp %-11d|%-14s|%n", i, elemenSementara.info_basah.nama_basah,
                        elemenSementara.info_basah.harga_basah, elemenSementara.info_basah.kode_basah);
                    i++;
                    elemenSementara = elemenSementara.next;
                }
                System.out.println("+---+------------------+--------------+--------------+");
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
                System.out.println("+-----------+------------------+--------------+--------------+");
                System.out.println("|No Pesanan |   Nama Cake      |   Harga Cake |   Kode Cake  |");
                System.out.println("+-----------+------------------+--------------+--------------+");
                while(elemenSementara != null){
                    System.out.printf("|%-3d|%-20s|Rp %-11d|%-14s|%n", i, elemenSementara.info_cake.nama_cake,elemenSementara.info_cake.harga_cake, elemenSementara.info_cake.kode_cake);
                    i++;
                    elemenSementara = elemenSementara.next;
                }  
                System.out.println("+----------+------------------+--------------+--------------+");
            }
        }
        void hitungcake(){
            Elemen.Move_cake elemensementara = first;
            if(elemensementara == null){
                System.out.println("Tidak ada Cake terjual");
            }else{
                int total = 0;
                while(elemensementara != null){
                    total += elemensementara.info_cake.harga_cake;
                    elemensementara = elemensementara.next;
                }
                System.out.println("Total Penjualan Cake: Rp."+ total);
                System.out.println("+---------------------------------------------------------+");

            }
        }
        public int hitungtotal(){
            Elemen.Move_cake elemensementara = first;
            int total = 0;
            while (elemensementara != null) {
                total += elemensementara.info_cake.harga_cake;
                elemensementara = elemensementara.next;
            }
            if (total == 0) {
                System.out.println("Tidak ada Cake terjual");
                return -1;  // or throw an exception here
            } else {
                return total;
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
            System.out.println("+-----------+------------------+--------------+-----------------+");
            System.out.println("|No Pesanan |Nama Kue Kering   |Harga Kue     |Kode Kue Kering  |");
            System.out.println("+-----------+------------------+--------------+-----------------+");
            while(elemenSementara != null){
                System.out.printf("|%-3d|%-20s|Rp %-11d|%-14s|%n", i, elemenSementara.info_kering.nama_kering,elemenSementara.info_kering.harga_kering, elemenSementara.info_kering.kode_kering);
                i++;
                elemenSementara = elemenSementara.next;
            }  
            System.out.println("+-----------+------------------+--------------+----------------+");
        }
        }
        void hitungkering(){
            Elemen.Move_kering elemensementara = first;
            if(elemensementara ==  null){
                System.out.println("Kue Kering Tidak Terjual");
            }else{
                int total = 0;
                while(elemensementara != null){
                    total += elemensementara.info_kering.harga_kering;
                    elemensementara = elemensementara.next;
                }
                System.out.println("Total penjualan Kue Kering: Rp."+ total);
                System.out.println("+-----------+------------------+--------------+----------------+");

            }
        }
        public int hitungtotal(){
            Elemen.Move_kering elemensementara = first;
            int total = 0;
            while (elemensementara != null) {
                total += elemensementara.info_kering.harga_kering;
                elemensementara = elemensementara.next;
            }
            if (total == 0) {
                System.out.println();
                return 0;  // or throw an exception here
            } else {
                return total;
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
        void hitungbasah(){
            Elemen.Move_basah elemensementara = first;
            if(elemensementara == null){
                System.out.println("Kue Basah tidak terjual");
            }else{
                int total =  0;
                while(elemensementara != null){
                    total += elemensementara.info_basah.harga_basah;
                    elemensementara = elemensementara.next;
                }
                System.out.println("Total penjualan Kue Basah: Rp."+total);
                System.out.println("+-----------+------------------+--------------+-----------------+");

            }
        }
        void print(){
            int i = 1;
            Elemen.Move_basah elemenSementara = first;
            if(elemenSementara == null){
                System.out.println("Kue Basah KOSONG");
            }else{
                System.out.println("+-----------+------------------+--------------+-----------------+");
                System.out.println("|No Pesanan |Nama Kue Basah    |Harga Kue     |Kode Kue Basah   |");
                System.out.println("+-----------+------------------+--------------+-----------------+");
                while(elemenSementara != null){
                    System.out.printf("|%-3d|%-20s|Rp %-11d|%-14s|%n", i, elemenSementara.info_basah.nama_basah,elemenSementara.info_basah.harga_basah, elemenSementara.info_basah.kode_basah);
                    i++;
                    elemenSementara = elemenSementara.next;
                }  
                System.out.println("+-----------+------------------+--------------+-----------------+");
            }
        }
        public int hitungtotal(){
            Elemen.Move_basah elemensementara = first;
            int total = 0;
            while (elemensementara != null) {
                total += elemensementara.info_basah.harga_basah;
                elemensementara = elemensementara.next;
            }
            if (total == 0) {
                return -1;  // or throw an exception here
            } else {
                return total;
            }
        }
    }
}

