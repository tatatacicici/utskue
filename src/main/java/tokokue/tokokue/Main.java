package tokokue.tokokue;

import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Hussain&Bayu
 */
public class Main {

    public static void main(String[] args)throws IOException {
        List_jual jual = new List_jual();
        List_cake cake = new List_cake ();
        List_kering kering = new List_kering ();
        List_basah basah = new List_basah ();
//        Tambah tambah = new Tambah();
//        Cari cari = new Cari();
//        Hapus hapus = new Hapus();
//        Beli beli = new Beli();


        int pilihan;
        Scanner scanner = new Scanner(System.in);
        boolean lagi = false;
        cake.insertLast("Red velvet", 680000, "A1");
        cake.insertLast("Black Forest", 280000, "A2");
        cake.insertLast("Carrot Cake", 150000, "A3");
        cake.insertLast("Chocolatte Fudge", 190000, "A4");
        cake.insertLast("Tiramissu Cake", 150000, "A5");
        cake.insertLast("Banana Cake", 70000, "A6");
        cake.insertLast("Vanilla Sponge", 200000, "A7");
        cake.insertLast("Strawberry Short Cake", 120000, "A8");
        cake.insertLast("Coffe Cake", 60000, "A9");
        cake.insertLast("Fruit Cake", 200000, "A10");
        kering.insertLast("Nastar", 40000, "B1");
        kering.insertLast("Kue Lumpur", 58000, "B2");
        kering.insertLast("Kue Bawang", 50000, "B3");
        kering.insertLast("Croissant", 15000, "B4");
        kering.insertLast("Banana Chococheese", 30000, "B5");
        kering.insertLast("Kastengel", 60000, "B6");
        kering.insertLast("Putri Salju", 50000, "B7");
        kering.insertLast("Sagu Keju", 20000, "B8");
        kering.insertLast("Kue Gendong", 60000, "B9");
        kering.insertLast("Kuker Kacang", 20000, "B10");
        basah.insertLast("Lapis", 70000, "C2");
        basah.insertLast("Onde-Onde", 15000, "C2");
        basah.insertLast("Kue Cucur", 17000, "C3");
        basah.insertLast("Dadar Gulung", 15000, "C4");
        basah.insertLast("Nagasari", 7000, "C5");
        basah.insertLast("Kue cubit", 20000, "C6");
        basah.insertLast("Molen", 12000, "C7");
        basah.insertLast("Kue Pukis", 12000, "C8");
        basah.insertLast("Roti Bantal", 20000, "C9");
        basah.insertLast("Serabi", 12000, "C10");
        do{
            System.out.println("=======================");
            System.out.println("Kasir Baked by Two ");
            System.out.println("1.Lihat Stok");
            System.out.println("2.Tambah Stok");
            System.out.println("3.Lihat Menu");
            System.out.println("4.Cari");
            System.out.println("5.Hapus");
            System.out.println("6.Beli");
            System.out.println("7.Lihat Belanja");
            System.out.println("9.Jumlah Penjualan");
            System.out.println("10.Total Jumlah Penjualan");
            System.out.println("0.Keluar");
            System.out.print("Pilihan :  ");
            pilihan = Integer.parseInt(scanner.nextLine());
            
            switch(pilihan){
                case 0:
                    System.out.println("Time to wrap this up, folks! Thanks for making this experience as sweet as a\n "
                            + "freshly baked cake. Let's rise to the occasion and\n "
                            + "say our goodbyes - it's been a slice!");
                    break;
                case 1:
                    int lihat;
                    do{
                    System.out.println("=============================");
                    System.out.println("|       MENU STOK TERSEDIA   |");
                    System.out.println("==============================");
                    System.out.println("|1.Cake                      |");
                    System.out.println("|2.Kue Kering                |");
                    System.out.println("|3.Kue Basah                 |");
                    System.out.println("|0.Kembali ke menu sebelumnya|");
                    System.out.print("|Pilih:                        |");
                    lihat = Integer.parseInt(scanner.nextLine());
                    if(lihat == 1){
                        cake.print();
                    }else if(lihat == 2){
                        kering.print();
                    }else if(lihat == 3){
                        basah.print();

                    }else if(lihat == 0){
                        System.out.println("kEMBALI KE MENU UTAMA");
                    }
                    System.out.println();
                    }while(lihat != 0);
                    break;
                case 2:
                    int tambah;
                    do {
                        System.out.println("=============================");
                        System.out.println("|       MAU TAMBAH DIMANA    |");
                        System.out.println("==============================");
                        System.out.println("|1.Tambah Depan              |");
                        System.out.println("|2.Tambah Belakang           |");
                        System.out.println("|3.Tambah Pada               |");
                        System.out.println("|0.Kembali ke menu sebelumnya|");
                        System.out.print("|Pilih:   " +"                   |");
                        tambah = Integer.parseInt(scanner.nextLine());
                        if (tambah == 1) {
                            int tambahFirst;
                            do {
                                System.out.println("=============================");
                                System.out.println("|       MAU TAMBAH APA?      |");
                                System.out.println("==============================");
                                System.out.println("|1.Cake                      |");
                                System.out.println("|2.Kue Kering                |");
                                System.out.println("|3.Kue Basah                 |");
                                System.out.println("|0.Kembali ke menu sebelumnya|");
                                System.out.print("|Pilih:   " +"                   |");
                                tambahFirst = Integer.parseInt(scanner.nextLine());
                                if (tambahFirst == 1) {
                                    System.out.println("Cake");
                                    System.out.println("""
                                                       Red Velvet: A1: 680K
                                                       Black Forest: A2: 280K
                                                       Carrot Cake: A3: 150K
                                                       Chocolatte Fudge: A4: 190k
                                                       Tiramissu Cake: A5: 150K
                                                       Banana Cake: A6 : 70K
                                                       Vanilla Sponge: A7: 200k
                                                       Strawberry Shortcake: A8: 120k
                                                       Coffee Cake: A9: 60k
                                                       FruitCake: A10: 200k
                                                       """);
                                    System.out.print("Nama Cake: ");
                                    String nama_cake = scanner.nextLine();
                                    System.out.print("Harga Cake: ");
                                    int harga_cake = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Kode Cake: ");
                                    String kode_cake = scanner.nextLine();
                                    cake.insertFirst(nama_cake, harga_cake, kode_cake);
                                } else if (tambahFirst == 2) {
                                    System.out.println("Kue Kering");
                                    System.out.println("""
                                                       Nastar: B1: 40K
                                                       Kue Lumpur: B2: 58K
                                                       Kue Bawang: B3: 50K
                                                       Croissant: B4: 15K
                                                       Banana Chococheese: B5: 30K
                                                       Kastengel: B6 : 60K
                                                       Putri Salju: B7: 50K
                                                       Sagu Keju: B8: 20K
                                                       Kue Gendon: B9: 60K
                                                       Kuker Kacang: B10: 20K
                                                       """);
                                    System.out.print("Nama Kue Kering: ");
                                    String nama_kering = scanner.nextLine();
                                    System.out.print("Harga Kue Kering: ");
                                    int harga_kering = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Kode Kue Kering: ");
                                    String kode_kering = scanner.nextLine();
                                    kering.insertFirst(nama_kering, harga_kering, kode_kering);
                                } else if (tambahFirst == 3) {
                                    System.out.println("Kue Basah");
                                    System.out.println("""
                                                       Lapis: C1: 70K
                                                       Onde-onde: C2: 15K
                                                       Kue Cucur: C3: 17K
                                                       Dadar Gulung: C4: 15K
                                                       Nagasari: C5: 7K
                                                       Kue Cubit: C6 : 20K
                                                       Molen: C7: 12K
                                                       Kue Pukis: C8: 12K
                                                       Roti Bantal: C9: 20K
                                                       Surabi: C10: 12K
                                                       """);
                                    System.out.print("Nama Kue Basah: ");
                                    String nama_basah = scanner.nextLine();
                                    System.out.print("Harga Kue Basah: ");
                                    int harga_basah = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Kode Kue Basah: ");
                                    String kode_basah = scanner.nextLine();
                                    basah.insertFirst(nama_basah, harga_basah, kode_basah);
                                } else if (tambahFirst == 0) {
                                    System.out.println("KEMBALI KE MENU SEBELUMNYAS");
                                }
                                System.out.println();
                            } while (tambahFirst != 0);
                        } else if (tambah == 2) {
                            int tambahLast;
                            do {
                                System.out.println("=============================");
                                System.out.println("|       MAU TAMBAH APA?      |");
                                System.out.println("==============================");
                                System.out.println("|1.Cake                      |");
                                System.out.println("|2.Kue Kering                |");
                                System.out.println("|3.Kue Basah                 |");
                                System.out.println("|0.Kembali ke menu sebelumnya|");
                                System.out.print("|Pilih:   " +"                   |");
                                tambahLast = Integer.parseInt(scanner.nextLine());
                                if (tambahLast == 1) {
                                    System.out.print("Cake");
                                    System.out.print("""
                                                       Red Velvet: A1: 680K
                                                       Black Forest: A2: 280K
                                                       Carrot Cake: A3: 150K
                                                       Chocolatte Fudge: A4: 190k
                                                       Tiramissu Cake: A5: 150K
                                                       Banana Cake: A6 : 70K
                                                       Vanilla Sponge: A7: 200k
                                                       Strawberry Shortcake: A8: 120k
                                                       Coffee Cake: A9: 60k
                                                       FruitCake: A10: 200k
                                                       """);
                                    System.out.print("Nama Cake: ");
                                    String nama_cake = scanner.nextLine();
                                    System.out.print("Harga Cake: ");
                                    int harga_cake = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Kode Cake: ");
                                    String kode_cake = scanner.nextLine();
                                    cake.insertLast(nama_cake, harga_cake, kode_cake);
                                } else if (tambahLast == 2) {
                                    System.out.println("Kue Kering");
                                    System.out.println("""
                                                       Nastar: B1: 40K
                                                       Kue Lumpur: B2: 58K
                                                       Kue Bawang: B3: 50K
                                                       Croissant: B4: 15K
                                                       Banana Chococheese: B5: 30K
                                                       Kastengel: B6 : 60K
                                                       Putri Salju: B7: 50K
                                                       Sagu Keju: B8: 20K
                                                       Kue Gendon: B9: 60K
                                                       Kuker Kacang: B10: 20K
                                                       """);
                                    System.out.print("Nama Kue Kering: ");
                                    String nama_kering = scanner.nextLine();
                                    System.out.print("Harga Kue Kering: ");
                                    int harga_kering = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Kode Kue Kering: ");
                                    String kode_kering = scanner.nextLine();
                                    kering.insertLast(nama_kering, harga_kering, kode_kering);
                                } else if (tambahLast == 3) {
                                    System.out.println("Kue Basah");
                                    System.out.println("""
                                                       Lapis: C1: 70K
                                                       Onde-onde: C2: 15K
                                                       Kue Cucur: C3: 17K
                                                       Dadar Gulung: C4: 15K
                                                       Nagasari: C5: 7K
                                                       Kue Cubit: C6 : 20K
                                                       Molen: C7: 12K
                                                       Kue Pukis: C8: 12K
                                                       Roti Bantal: C9: 20K
                                                       Surabi: C10: 12K
                                                       """);
                                    System.out.print("Nama Kue Basah: ");
                                    String nama_basah = scanner.nextLine();
                                    System.out.print("Harga Kue Basah: ");
                                    int harga_basah = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Kode Kue Basah: ");
                                    String kode_basah = scanner.nextLine();
                                    basah.insertLast(nama_basah, harga_basah, kode_basah);
                                } else if (tambahLast == 0) {
                                    System.out.println("KEMBALI KE MENU SEBELUMNYAS");
                                }
                                System.out.println();
                            } while (tambahLast != 0);
                        } else if (tambah == 3) {
                            int tambahAt;
                            do {
                                System.out.println("=============================");
                                System.out.println("|       MAU TAMBAH APA?      |");
                                System.out.println("==============================");
                                System.out.println("|1.Cake                      |");
                                System.out.println("|2.Kue Kering                |");
                                System.out.println("|3.Kue Basah                 |");
                                System.out.println("|0.Kembali ke menu sebelumnya|");
                                System.out.print("|Pilih:   " +"                   |");;
                                tambahAt = Integer.parseInt(scanner.nextLine());
                                if (tambahAt == 1) {
                                    System.out.println("Cake");
                                    System.out.println("""
                                                       Red Velvet: A1: 680K
                                                       Black Forest: A2: 280K
                                                       Carrot Cake: A3: 150K
                                                       Chocolatte Fudge: A4: 190k
                                                       Tiramissu Cake: A5: 150K
                                                       Banana Cake: A6 : 70K
                                                       Vanilla Sponge: A7: 200k
                                                       Strawberry Shortcake: A8: 120k
                                                       Coffee Cake: A9: 60k
                                                       FruitCake: A10: 200k
                                                       """);
                                    System.out.print("Nama Cake: ");
                                    String nama_cake = scanner.nextLine();
                                    System.out.print("Harga Cake: ");
                                    int harga_cake = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Kode Cake: ");
                                    String kode_cake = scanner.nextLine();
                                    System.out.print("Mau ditaruh disetelah? ");
                                    String cake_dicari = scanner.nextLine();
                                    cake.insertAt(nama_cake, harga_cake, kode_cake, cake_dicari);
                                } else if (tambahAt == 2) {
                                    System.out.println("Kue Kering");
                                    System.out.println("""
                                                       Nastar: B1: 40K
                                                       Kue Lumpur: B2: 58K
                                                       Kue Bawang: B3: 50K
                                                       Croissant: B4: 15K
                                                       Banana Chococheese: B5: 30K
                                                       Kastengel: B6 : 60K
                                                       Putri Salju: B7: 50K
                                                       Sagu Keju: B8: 20K
                                                       Kue Gendon: B9: 60K
                                                       Kuker Kacang: B10: 20K
                                                       """);
                                    System.out.print("Nama Kue Kering: ");
                                    String nama_kering = scanner.nextLine();
                                    System.out.print("Harga Kue Kering: ");
                                    int harga_kering = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Kode Kue Kering: ");
                                    String kode_kering = scanner.nextLine();
                                    System.out.print("Ditambah Setelah? ");
                                    String kering_dicari = scanner.nextLine();
                                    kering.insertAt(nama_kering, harga_kering, kode_kering, kering_dicari);
                                } else if (tambahAt == 3) {
                                    System.out.println("Kue Basah");
                                    System.out.println("""
                                                       Lapis: C1: 70K
                                                       Onde-onde: C2: 15K
                                                       Kue Cucur: C3: 17K
                                                       Dadar Gulung: C4: 15K
                                                       Nagasari: C5: 7K
                                                       Kue Cubit: C6 : 20K
                                                       Molen: C7: 12K
                                                       Kue Pukis: C8: 12K
                                                       Roti Bantal: C9: 20K
                                                       Surabi: C10: 12K
                                                       """);
                                    System.out.print("Nama Kue Basah: ");
                                    String nama_basah = scanner.nextLine();
                                    System.out.print("Harga Kue Basah: ");
                                    int harga_basah = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Kode Kue Basah: ");
                                    String kode_basah = scanner.nextLine();
                                    System.out.print("Ditambah setelah? ");
                                    String basah_dicari = scanner.nextLine();
                                    basah.insertAt(nama_basah, harga_basah, kode_basah, basah_dicari);
                                } else if (tambahAt == 0) {
                                    System.out.println("KEMBALI KE MENU SEBELUMNYAS");
                                }
                                System.out.println();
                            } while (tambahAt != 0);
                        } else if (tambah == 0) {
                            System.out.println("KEMBALI KE MENU UTAMA");
                        }else{
                            System.out.println("INPUTAN SALAH!!!!");
                        }
                        System.out.println("");
                    }while(tambah!=0);
                    break;
                case 3:
                    int cari;
                    do {
                        System.out.println("=============================");
                        System.out.println("|       MAU CARI APA ?       |");
                        System.out.println("==============================");
                        System.out.println("|1.Cake                      |");
                        System.out.println("|2.Roti Kering               |");
                        System.out.println("|3.Roti Basah                |");
                        System.out.println("|0.Kembali ke menu sebelumnya|");
                        System.out.print("|Pilih:                        |");
                        cari = Integer.parseInt(scanner.nextLine());
                        if (cari == 1){
                            System.out.println("Kode Cake : A(angka)");
                            System.out.print("Masukkan kode Cake: ");
                            String cake_dicari = scanner.nextLine();
                            cake.cari(cake_dicari);
                        }else if(cari == 2){
                            System.out.println("Kode Kue Kering : B(angka)");
                            System.out.println("Masukkan Kode Kue Kering: ");
                            String kering_dicari = scanner.nextLine();
                            kering.cari(kering_dicari);
                        }else if(cari == 3){
                            System.out.println("Kode Kue Basah: C(Angka)");
                            System.out.println("Masukkan Kode Kue Basah: ");
                            String basah_dicari = scanner.nextLine();
                            basah.cari(basah_dicari);
                        }else if (cari == 0){
                            System.out.println("KEMBALI KE MENU UTAMA");
                        }else{
                            System.out.println("INPUTAN SALAHH!!!!!");
                        }
                        System.out.println("");
                    }while(cari != 0);
                    break;
                case 4:
                    int hapus;
                    do {
                        System.out.println("=============================");
                        System.out.println("|       MAU MENGHAPUS APA?      |");
                        System.out.println("==============================");
                        System.out.println("|1.Cake                      |");
                        System.out.println("|2.Kue Kering                |");
                        System.out.println("|3.Kue Basah                 |");
                        System.out.println("|0.Kembali ke menu sebelumnya|");
                        System.out.print("|Pilih:                        |");
                        System.out.print("|Pilih:                        |");
                        hapus = Integer.parseInt(scanner.nextLine());
                        if (hapus == 1) {
                            int hapuscake;
                            String kode_cake;
                            do {
                                System.out.println("=============================");
                                System.out.println("|       MAU HAPUS DIMANA    |");
                                System.out.println("==============================");
                                System.out.println("|1.Hapus Depan              |");
                                System.out.println("|2.Hapus Belakang           |");
                                System.out.println("|3.Hapus Pada               |");
                                System.out.println("|0.Kembali ke menu sebelumnya|");
                                hapuscake = Integer.parseInt(scanner.nextLine());
                                if (hapuscake == 1) {
                                    cake.deleteFirst();
                                } else if (hapuscake == 2) {
                                    cake.deleteLast();
                                } else if (hapuscake == 3) {
                                    System.out.print("Masukkan kode cake yang akan di hapus: ");
                                    kode_cake = scanner.nextLine();
                                    cake.deleteAt(kode_cake);
                                    System.out.println("Data cake Telah Dihapus");
                                    break;

                                } else if (hapuscake == 0) {
                                    System.out.println("KEMBALI KE MENU SEBELUMNYAS");
                                }
                                System.out.println("");
                            } while (hapuscake != 0);
                        } else if (hapus == 2) {
                            int hapuskering;
                            String kode_kering;
                            do {
                                System.out.println("=============================");
                                System.out.println("|       MAU HAPUS DIMANA    |");
                                System.out.println("==============================");
                                System.out.println("|1.Hapus Depan              |");
                                System.out.println("|2.Hapus Belakang           |");
                                System.out.println("|3.Hapus Pada               |");
                                System.out.println("|0.Kembali ke menu sebelumnya|");
                                hapuskering = Integer.parseInt(scanner.nextLine());
                                if (hapuskering == 1) {
                                    kering.deleteFirst();
                                } else if (hapuskering == 2) {
                                    kering.deleteLast();
                                } else if (hapuskering == 3) {
                                    System.out.print("Masukkan kode Kue Kering yang akan di hapus: ");
                                    kode_kering = scanner.nextLine();
                                    kering.deleteAt(kode_kering);
                                    System.out.println("Data Kue " + kode_kering + " Telah Dihapus");
                                    break;

                                } else if (hapuskering == 0) {
                                    System.out.println("KEMBALI KE MENU SEBELUMNYAS");
                                }
                                System.out.println("");
                            } while (hapuskering != 0);
                        } else if (hapus == 3) {
                            int hapusbasah;
                            String kode_basah;
                            do {
                                System.out.println("=============================");
                                System.out.println("|       MAU HAPUS DIMANA    |");
                                System.out.println("==============================");
                                System.out.println("|1.Hapus Depan              |");
                                System.out.println("|2.Hapus Belakang           |");
                                System.out.println("|3.Hapus Pada               |");
                                System.out.println("|0.Kembali ke menu sebelumnya|");
                                hapusbasah = Integer.parseInt(scanner.nextLine());
                                if (hapusbasah == 1) {
                                    basah.deleteFirst();
                                } else if (hapusbasah == 2) {
                                    basah.deleteLast();
                                } else if (hapusbasah == 3) {
                                    System.out.print("Masukkan kode Kue Basah yang akan di hapus: ");
                                    kode_basah = scanner.nextLine();
                                    basah.deleteAt(kode_basah);
                                    System.out.println("Data Kue " + kode_basah + " Telah Dihapus");
                                    break;

                                } else if (hapusbasah == 0) {
                                    System.out.println("KEMBALI KE MENU SEBELUMNYAS");
                                }
                                System.out.println("");
                            } while (hapusbasah != 0);
                        } else if (hapus == 0) {
                            System.out.println("KEMBALI KE MENU HAPUS");
                        }else{
                            System.out.println("INPUTAN SALAH!!!");
                        }
                        System.out.println("");
                    } while (hapus != 0);
                    break;
                case 5:
                   int beli;
                    do{
                        System.out.println("=============================");
                        System.out.println("|       SELAMAT BERBELANJA   |");
                        System.out.println("==============================");
                        System.out.println("|1.Cake                      |");
                        System.out.println("|2.Kue Kering                |");
                        System.out.println("|3.Kue Basah                 |");
                        System.out.println("|0.Kembali ke menu sebelumnya|");
                        System.out.print("|Pilih:   " +"                   |");
                        beli = Integer.parseInt(scanner.nextLine());
                        if (beli == 1){
                            String beliCake;
                            String lagiCake;
                            cake.print();
                            do{
                                System.out.print("Masukkan kode Cake yang diinginkan: ");
                                beliCake = scanner.nextLine();
                                cake.pindahCake(beliCake);
                                System.out.println("Lagi ?");
                                lagiCake = scanner.nextLine();
                            }while( lagiCake.equals("y"));
                            System.out.println();
                        }else if(beli == 2){
                            String beliKering;
                            String lagiKering;
                            kering.print();
                            do{
                                System.out.print("Masukkan kode Kue Kering yang diinginkan: ");
                                beliKering = scanner.nextLine();
                                kering.pindahKering(beliKering);
                                System.out.println("Lagi ?");
                                lagiKering = scanner.nextLine();
                            }while( lagiKering.equals("y"));
                            System.out.println();
                        }else if(beli == 3){
                            String beliBasah;
                            String lagiBasah;
                            basah.print();
                            do{
                                System.out.print("Masukkan kode Kue Basah yang diinginkan: ");
                                beliBasah = scanner.nextLine();
                                basah.pindahBasah(beliBasah);
                                System.out.println("Lagi ?");
                                lagiBasah = scanner.nextLine();
                            }while( lagiBasah.equals("y"));
                            System.out.println();
                        }else if(beli == 0){
                            System.out.println("KEMBALI KE MENU SEBELUMNYA");
                        }else{
                            System.out.println("INPUTAN SALAH!!!");
                        }
                        System.out.println();
                    }while(beli != 0);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("INPUTAN SALAH");
                    break;
            }
        }while(pilihan != 0);
    }
}

