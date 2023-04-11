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
        int pilihan;
        Scanner s = new Scanner(System.in);
        boolean lagi = false;
        
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
            pilihan = Integer.parseInt(s.nextLine());
            
            switch(pilihan){
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
                    lihat = Integer.parseInt(s.nextLine());
                    if(lihat == 1){
                        list_cake.print();
                    }else if(lihat == 2){
                        list_kering.print();
                    }else if(lihat == 3){
                        list_basah.print();
                    }else if(lihat == 0){
                        System.out.println("kEMBALI KE MENU UTAMA");
                    }
                    System.out.println();
                    }while(lihat != 0);
                    break;
                case 2:
                    int tambah;
                    do{
                        System.out.println("=============================");
                        System.out.println("|       MAU TAMBAH DIMANA    |");
                        System.out.println("==============================");
                        System.out.println("|1.Tambah Depan              |");
                        System.out.println("|2.Tambah Belakang           |");
                        System.out.println("|3.Tambah Pada               |");
                        System.out.println("|0.Kembali ke menu sebelumnya|");
                        System.out.print("|Pilih:                        |");
                        tambah = Integer.parseInt(s.nextLine());
                        if(tambah == 1){
                            int tambahFirst;
                            do{
                                System.out.println("=============================");
                                System.out.println("|       MAU TAMBAH APA?      |");
                                System.out.println("==============================");
                                System.out.println("|1.Cake                      |");
                                System.out.println("|2.Kue Kering                |");
                                System.out.println("|3.Kue Basah                 |");
                                System.out.println("|0.Kembali ke menu sebelumnya|");
                                System.out.print("|Pilih:                        |");
                                tambahFirst = Integer.parseInt(s.nextLine());
                                if(tambahFirst == 1){
                                    System.out.println("Cake");
                                    System.out.println("Red Velvet: A1: 680K*"
                                            +           "Black Forest: A2: 280K*"
                                            +           "Carrot Cake: A3: 150K"
                                            +           "Chocolatte Fudge: A4: 190k"
                                            +           "Tiramissu Cake: A5: 150K"
                                            +           "Banana Cake: A6 : 70K"
                                            +           "Vanilla Sponge: A7: 200k"
                                            +           "Strawberry Shortcake: A8: 120k"
                                            +           "Coffee Cake: A9: 60k"
                                            +           "FruitCake: A10: 200k");
                                    System.out.println("Nama Cake: ");
                                    String nama_cake = s.nextLine();
                                    System.out.println("Harga Cake: ");
                                    int harga_cake = s.nextInt();
                                    System.out.println("Kode Cake: ");
                                    String kode_cake = s.nextLine();
                                    cake.insertFirst(nama_cake, harga_cake, kode_cake);
                                }else if(tambahFirst == 2){
                                    System.out.println("Kue Kering");
                                    System.out.println("Nastar: B1: 40K*"
                                            +           "Kue Lumpur: B2: 58K*"
                                            +           "Kue Bawang: B3: 50K"
                                            +           "Croissant: B4: 15k"
                                            +           "Banana Chococheese: B5: 30K"
                                            +           "Kastengel: B6 : 60K"
                                            +           "Putri Salju: B7: 50k"
                                            +           "Sagu Keju: B8: 20k"
                                            +           "Kue Gendon: B9: 60k"
                                            +           "Kuker Kacang: B10: 20k");
                                    System.out.println("Nama Kue Kering: ");
                                    String nama_kering = s.nextLine();
                                    System.out.println("Harga Kue Kering: ");
                                    int harga_kering = s.nextInt();
                                    System.out.println("Kode Kue Kering: ");
                                    String kode_kering = s.nextLine();
                                    kering.insertFirst(nama_kering, harga_kering, kode_kering);
                                }else if(tambahFirst == 3){
                                    System.out.println("Kue Basah");
                                    System.out.println("Lapis: C1: 70K*"
                                            +           "Onde-onde: C2: 15K*"
                                            +           "Kue Cucur: C3: 17K"
                                            +           "Dadar Gulung: C4: 15k"
                                            +           "Nagasari: C5: 7K"
                                            +           "Kue Cubit: C6 : 20K"
                                            +           "Molen: C7: 12k"
                                            +           "Kue Pukis: C8: 12k"
                                            +           "Roti Bantal: C9: 20k"
                                            +           "Surabi: C10: 12k");
                                    System.out.println("Nama Kue Basah: ");
                                    String nama_basah = s.nextLine();
                                    System.out.println("Harga Kue Basah: ");
                                    int harga_basah = s.nextInt();
                                    System.out.println("Kode Kue Basah: ");
                                    String kode_basah = s.nextLine();
                                    basah.insertFirst(nama_basah, harga_basah, kode_basah);
                                }else if(tambahFirst == 0){
                                    System.out.println("KEMBALI KE MENU SEBELUMNYAS");
                                }System.out.println();
                            }while(tambahFirst !=0);
                        }else if(tambah == 2){
                            int tambahLast;
                            do{
                                System.out.println("=============================");
                                System.out.println("|       MAU TAMBAH APA?      |");
                                System.out.println("==============================");
                                System.out.println("|1.Cake                      |");
                                System.out.println("|2.Kue Kering                |");
                                System.out.println("|3.Kue Basah                 |");
                                System.out.println("|0.Kembali ke menu sebelumnya|");
                                System.out.print("|Pilih:                        |");
                                tambahLast = Integer.parseInt(s.nextLine());
                                if(tambahLast == 1){
                                    System.out.println("Cake");
                                    System.out.println("Red Velvet: A1: 680K*"
                                            +           "Black Forest: A2: 280K*"
                                            +           "Carrot Cake: A3: 150K"
                                            +           "Chocolatte Fudge: A4: 190k"
                                            +           "Tiramissu Cake: A5: 150K"
                                            +           "Banana Cake: A6 : 70K"
                                            +           "Vanilla Sponge: A7: 200k"
                                            +           "Strawberry Shortcake: A8: 120k"
                                            +           "Coffee Cake: A9: 60k"
                                            +           "FruitCake: A10: 200k");
                                    System.out.println("Nama Cake: ");
                                    String nama_cake = s.nextLine();
                                    System.out.println("Harga Cake: ");
                                    int harga_cake = s.nextInt();
                                    System.out.println("Kode Cake: ");
                                    String kode_cake = s.nextLine();
                                    cake.insertLast(nama_cake, harga_cake, kode_cake);
                                }else if(tambahLast == 2){
                                    System.out.println("Kue Kering");
                                    System.out.println("Nastar: B1: 40K*"
                                            +           "Kue Lumpur: B2: 58K*"
                                            +           "Kue Bawang: B3: 50K"
                                            +           "Croissant: B4: 15k"
                                            +           "Banana Chococheese: B5: 30K"
                                            +           "Kastengel: B6 : 60K"
                                            +           "Putri Salju: B7: 50k"
                                            +           "Sagu Keju: B8: 20k"
                                            +           "Kue Gendon: B9: 60k"
                                            +           "Kuker Kacang: B10: 20k");
                                    System.out.println("Nama Kue Kering: ");
                                    String nama_kering = s.nextLine();
                                    System.out.println("Harga Kue Kering: ");
                                    int harga_kering = s.nextInt();
                                    System.out.println("Kode Kue Kering: ");
                                    String kode_kering = s.nextLine();
                                    kering.insertLast(nama_kering, harga_kering, kode_kering);
                                }else if(tambahLast == 3){
                                    System.out.println("Kue Basah");
                                    System.out.println("Lapis: C1: 70K*"
                                            +           "Onde-onde: C2: 15K*"
                                            +           "Kue Cucur: C3: 17K"
                                            +           "Dadar Gulung: C4: 15k"
                                            +           "Nagasari: C5: 7K"
                                            +           "Kue Cubit: C6 : 20K"
                                            +           "Molen: C7: 12k"
                                            +           "Kue Pukis: C8: 12k"
                                            +           "Roti Bantal: C9: 20k"
                                            +           "Surabi: C10: 12k");
                                    System.out.println("Nama Kue Basah: ");
                                    String nama_basah = s.nextLine();
                                    System.out.println("Harga Kue Basah: ");
                                    int harga_basah = s.nextInt();
                                    System.out.println("Kode Kue Basah: ");
                                    String kode_basah = s.nextLine();
                                    basah.insertLast(nama_basah, harga_basah, kode_basah);
                                }else if(tambahLast == 0){
                                    System.out.println("KEMBALI KE MENU SEBELUMNYAS");
                                }System.out.println();
                            }while(tambahLast !=0);
                        }else if(tambah == 3){
                            int tambahAt;
                            do{
                                System.out.println("=============================");
                                System.out.println("|       MAU TAMBAH APA?      |");
                                System.out.println("==============================");
                                System.out.println("|1.Cake                      |");
                                System.out.println("|2.Kue Kering                |");
                                System.out.println("|3.Kue Basah                 |");
                                System.out.println("|0.Kembali ke menu sebelumnya|");
                                System.out.print("|Pilih:                        |");
                                tambah = Integer.parseInt(s.nextLine());
                                if(tambahAt == 1){
                                    System.out.println("Cake");
                                    System.out.println("Red Velvet: A1: 680K*"
                                            +           "Black Forest: A2: 280K*"
                                            +           "Carrot Cake: A3: 150K"
                                            +           "Chocolatte Fudge: A4: 190k"
                                            +           "Tiramissu Cake: A5: 150K"
                                            +           "Banana Cake: A6 : 70K"
                                            +           "Vanilla Sponge: A7: 200k"
                                            +           "Strawberry Shortcake: A8: 120k"
                                            +           "Coffee Cake: A9: 60k"
                                            +           "FruitCake: A10: 200k");
                                    System.out.println("Nama Cake: ");
                                    String nama_cake = s.nextLine();
                                    System.out.println("Harga Cake: ");
                                    int harga_cake = s.nextInt();
                                    System.out.println("Kode Cake: ");
                                    String kode_cake = s.nextLine();
                                    System.out.println("Mau ditaruh disetelah? ");
                                    String cake_dicari = s.nextLine();
                                    cake.insertAt(nama_cake, harga_cake, kode_cake, cake_dicari);
                                }else if(tambahAt == 2){
                                    System.out.println("Kue Kering");
                                    System.out.println("Nastar: B1: 40K*"
                                            +           "Kue Lumpur: B2: 58K*"
                                            +           "Kue Bawang: B3: 50K"
                                            +           "Croissant: B4: 15k"
                                            +           "Banana Chococheese: B5: 30K"
                                            +           "Kastengel: B6 : 60K"
                                            +           "Putri Salju: B7: 50k"
                                            +           "Sagu Keju: B8: 20k"
                                            +           "Kue Gendon: B9: 60k"
                                            +           "Kuker Kacang: B10: 20k");
                                    System.out.println("Nama Kue Kering: ");
                                    String nama_kering = s.nextLine();
                                    System.out.println("Harga Kue Kering: ");
                                    int harga_kering = s.nextInt();
                                    System.out.println("Kode Kue Kering: ");
                                    String kode_kering = s.nextLine();
                                    System.out.println("Ditambah Setelah? ");
                                    String kering_dicari = s.nextLine();
                                    kering.insertLast(nama_kering, harga_kering, kode_kering, kering_dicari);
                                }else if(tambahAt == 3){
                                    System.out.println("Kue Basah");
                                    System.out.println("Lapis: C1: 70K*"
                                            +           "Onde-onde: C2: 15K*"
                                            +           "Kue Cucur: C3: 17K"
                                            +           "Dadar Gulung: C4: 15k"
                                            +           "Nagasari: C5: 7K"
                                            +           "Kue Cubit: C6 : 20K"
                                            +           "Molen: C7: 12k"
                                            +           "Kue Pukis: C8: 12k"
                                            +           "Roti Bantal: C9: 20k"
                                            +           "Surabi: C10: 12k");
                                    System.out.println("Nama Kue Basah: ");
                                    String nama_basah = s.nextLine();
                                    System.out.println("Harga Kue Basah: ");
                                    int harga_basah = s.nextInt();
                                    System.out.println("Kode Kue Basah: ");
                                    String kode_basah = s.nextLine();
                                    System.out.println("Ditambah setelah? ");
                                    String basah_dicari = s.nextLine();
                                    basah.insertLast(nama_basah, harga_basah, kode_basah, basah_dicari);
                                }else if(tambahAt == 0){
                                    System.out.println("KEMBALI KE MENU SEBELUMNYAS");
                                }System.out.println();
                            }while(tambahAt !=0);
                        }else if(tambah == 0){
                            System.out.println("kEMBALI KE MENU UTAMA");
                        }
                        System.out.println("");
                    }while(tambah !=0);
                    break;
                    
            }
        }while(pilihan != 0);
    }
}
