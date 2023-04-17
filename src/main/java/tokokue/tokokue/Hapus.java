/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokokue.tokokue;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Hapus {

    void Hapus() {

        Scanner scanner = new Scanner(System.in);
        List_cake cake = new List_cake();
        List_kering kering = new List_kering();
        List_basah basah = new List_basah();
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
                String kode_cake, nama_cake, harga_cake;
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
                    System.out.println();
                } while (hapuscake != 0);
            } else if (hapus == 2) {
                int hapuskering;
                String kode_kering, nama_kering, harga_kering;
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
                        cake.deleteFirst();
                    } else if (hapuskering == 2) {
                        cake.deleteLast();
                    } else if (hapuskering == 3) {
                        System.out.print("Masukkan kode Kue Kering yang akan di hapus: ");
                        kode_kering = scanner.nextLine();
                        kering.deleteAt(kode_kering);
                        System.out.println("Data Kue " + kode_kering + " Telah Dihapus");
                        break;

                    } else if (hapuskering == 0) {
                        System.out.println("KEMBALI KE MENU SEBELUMNYAS");
                    }
                    System.out.println();
                } while (hapuskering != 0);
            } else if (hapus == 3) {
                int hapusbasah;
                String kode_basah, nama_basah, harga_basah;
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
                    System.out.println();
                } while (hapusbasah != 0);
            } else if (hapus == 0) {
                System.out.println("KEMBALI KE MENU HAPUS");
            }
            System.out.println("");
        } while (hapus != 0);
    }
}
