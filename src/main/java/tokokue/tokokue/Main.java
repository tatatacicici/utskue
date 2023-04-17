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
        Tambah tambah = new Tambah();
        Cari cari = new Cari();
        Hapus hapus = new Hapus();


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
                case 0:
                    System.out.println("Time to wrap this up, folks! Thanks for making this experience as sweet as a "
                            + "freshly baked cake. Let's rise to the occasion and "
                            + "say our goodbyes - it's been a slice!");


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

                    tambah.Tambah();
                    break;
                case 3:
                    cari.Cari();
                    break;
                case 4:
                    hapus.Hapus();
                    break;
                

            }
        }while(pilihan != 0);
    }
}

