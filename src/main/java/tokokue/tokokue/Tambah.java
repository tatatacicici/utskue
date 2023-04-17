package tokokue.tokokue;
import java.util.Scanner;

/**
 *
 * @author Hussain&Bayu
 */
public class Tambah {
       void Tambah() {
        Scanner scanner = new Scanner(System.in);
        List_cake cake = new List_cake();
        List_kering kering = new List_kering();
        List_basah basah = new List_basah();
        int tambah;
        do {
            System.out.println("=============================");
            System.out.println("|       MAU TAMBAH DIMANA    |");
            System.out.println("==============================");
            System.out.println("|1.Tambah Depan              |");
            System.out.println("|2.Tambah Belakang           |");
            System.out.println("|3.Tambah Pada               |");
            System.out.println("|0.Kembali ke menu sebelumnya|");
            System.out.print("|Pilih:                        |");
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
                    System.out.print("|Pilih:                        |");
                    tambahFirst = Integer.parseInt(scanner.nextLine());
                    if (tambahFirst == 1) {
                        System.out.println("Cake");
                        System.out.println("Red Velvet: A1: 680K*"
                                + "Black Forest: A2: 280K*"
                                + "Carrot Cake: A3: 150K"
                                + "Chocolatte Fudge: A4: 190k"
                                + "Tiramissu Cake: A5: 150K"
                                + "Banana Cake: A6 : 70K"
                                + "Vanilla Sponge: A7: 200k"
                                + "Strawberry Shortcake: A8: 120k"
                                + "Coffee Cake: A9: 60k"
                                + "FruitCake: A10: 200k");
                        System.out.println("Nama Cake: ");
                        String nama_cake = scanner.nextLine();
                        System.out.println("Harga Cake: ");
                        int harga_cake = scanner.nextInt();
                        System.out.println("Kode Cake: ");
                        String kode_cake = scanner.nextLine();
                        cake.insertFirst(nama_cake, harga_cake, kode_cake);
                    } else if (tambahFirst == 2) {
                        System.out.println("Kue Kering");
                        System.out.println("Nastar: B1: 40K*"
                                + "Kue Lumpur: B2: 58K*"
                                + "Kue Bawang: B3: 50K"
                                + "Croissant: B4: 15k"
                                + "Banana Chococheese: B5: 30K"
                                + "Kastengel: B6 : 60K"
                                + "Putri Salju: B7: 50k"
                                + "Sagu Keju: B8: 20k"
                                + "Kue Gendon: B9: 60k"
                                + "Kuker Kacang: B10: 20k");
                        System.out.println("Nama Kue Kering: ");
                        String nama_kering = scanner.nextLine();
                        System.out.println("Harga Kue Kering: ");
                        int harga_kering = scanner.nextInt();
                        System.out.println("Kode Kue Kering: ");
                        String kode_kering = scanner.nextLine();
                        kering.insertFirst(nama_kering, harga_kering, kode_kering);
                    } else if (tambahFirst == 3) {
                        System.out.println("Kue Basah");
                        System.out.println("Lapis: C1: 70K*"
                                + "Onde-onde: C2: 15K*"
                                + "Kue Cucur: C3: 17K"
                                + "Dadar Gulung: C4: 15k"
                                + "Nagasari: C5: 7K"
                                + "Kue Cubit: C6 : 20K"
                                + "Molen: C7: 12k"
                                + "Kue Pukis: C8: 12k"
                                + "Roti Bantal: C9: 20k"
                                + "Surabi: C10: 12k");
                        System.out.println("Nama Kue Basah: ");
                        String nama_basah = scanner.nextLine();
                        System.out.println("Harga Kue Basah: ");
                        int harga_basah = scanner.nextInt();
                        System.out.println("Kode Kue Basah: ");
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
                    System.out.print("|Pilih:                        |");
                    tambahLast = Integer.parseInt(scanner.nextLine());
                    if (tambahLast == 1) {
                        System.out.println("Cake");
                        System.out.println("Red Velvet: A1: 680K*"
                                + "Black Forest: A2: 280K*"
                                + "Carrot Cake: A3: 150K"
                                + "Chocolatte Fudge: A4: 190k"
                                + "Tiramissu Cake: A5: 150K"
                                + "Banana Cake: A6 : 70K"
                                + "Vanilla Sponge: A7: 200k"
                                + "Strawberry Shortcake: A8: 120k"
                                + "Coffee Cake: A9: 60k"
                                + "FruitCake: A10: 200k");
                        System.out.println("Nama Cake: ");
                        String nama_cake = scanner.nextLine();
                        System.out.println("Harga Cake: ");
                        int harga_cake = scanner.nextInt();
                        System.out.println("Kode Cake: ");
                        String kode_cake = scanner.nextLine();
                        cake.insertLast(nama_cake, harga_cake, kode_cake);
                    } else if (tambahLast == 2) {
                        System.out.println("Kue Kering");
                        System.out.println("Nastar: B1: 40K*"
                                + "Kue Lumpur: B2: 58K*"
                                + "Kue Bawang: B3: 50K"
                                + "Croissant: B4: 15k"
                                + "Banana Chococheese: B5: 30K"
                                + "Kastengel: B6 : 60K"
                                + "Putri Salju: B7: 50k"
                                + "Sagu Keju: B8: 20k"
                                + "Kue Gendon: B9: 60k"
                                + "Kuker Kacang: B10: 20k");
                        System.out.println("Nama Kue Kering: ");
                        String nama_kering = scanner.nextLine();
                        System.out.println("Harga Kue Kering: ");
                        int harga_kering = scanner.nextInt();
                        System.out.println("Kode Kue Kering: ");
                        String kode_kering = scanner.nextLine();
                        kering.insertLast(nama_kering, harga_kering, kode_kering);
                    } else if (tambahLast == 3) {
                        System.out.println("Kue Basah");
                        System.out.println("Lapis: C1: 70K*"
                                + "Onde-onde: C2: 15K*"
                                + "Kue Cucur: C3: 17K"
                                + "Dadar Gulung: C4: 15k"
                                + "Nagasari: C5: 7K"
                                + "Kue Cubit: C6 : 20K"
                                + "Molen: C7: 12k"
                                + "Kue Pukis: C8: 12k"
                                + "Roti Bantal: C9: 20k"
                                + "Surabi: C10: 12k");
                        System.out.println("Nama Kue Basah: ");
                        String nama_basah = scanner.nextLine();
                        System.out.println("Harga Kue Basah: ");
                        int harga_basah = scanner.nextInt();
                        System.out.println("Kode Kue Basah: ");
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
                    System.out.print("|Pilih:                        |");
                    tambahAt = Integer.parseInt(scanner.nextLine());
                    if (tambahAt == 1) {
                        System.out.println("Cake");
                        System.out.println("Red Velvet: A1: 680K*"
                                + "Black Forest: A2: 280K*"
                                + "Carrot Cake: A3: 150K"
                                + "Chocolatte Fudge: A4: 190k"
                                + "Tiramissu Cake: A5: 150K"
                                + "Banana Cake: A6 : 70K"
                                + "Vanilla Sponge: A7: 200k"
                                + "Strawberry Shortcake: A8: 120k"
                                + "Coffee Cake: A9: 60k"
                                + "FruitCake: A10: 200k");
                        System.out.println("Nama Cake: ");
                        String nama_cake = scanner.nextLine();
                        System.out.println("Harga Cake: ");
                        int harga_cake = scanner.nextInt();
                        System.out.println("Kode Cake: ");
                        String kode_cake = scanner.nextLine();
                        System.out.println("Mau ditaruh disetelah? ");
                        String cake_dicari = scanner.nextLine();
                        cake.insertAt(nama_cake, harga_cake, kode_cake, cake_dicari);
                    } else if (tambahAt == 2) {
                        System.out.println("Kue Kering");
                        System.out.println("Nastar: B1: 40K*"
                                + "Kue Lumpur: B2: 58K*"
                                + "Kue Bawang: B3: 50K"
                                + "Croissant: B4: 15k"
                                + "Banana Chococheese: B5: 30K"
                                + "Kastengel: B6 : 60K"
                                + "Putri Salju: B7: 50k"
                                + "Sagu Keju: B8: 20k"
                                + "Kue Gendon: B9: 60k"
                                + "Kuker Kacang: B10: 20k");
                        System.out.println("Nama Kue Kering: ");
                        String nama_kering = scanner.nextLine();
                        System.out.println("Harga Kue Kering: ");
                        int harga_kering = scanner.nextInt();
                        System.out.println("Kode Kue Kering: ");
                        String kode_kering = scanner.nextLine();
                        System.out.println("Ditambah Setelah? ");
                        String kering_dicari = scanner.nextLine();
                        kering.insertAt(nama_kering, harga_kering, kode_kering, kering_dicari);
                    } else if (tambahAt == 3) {
                        System.out.println("Kue Basah");
                        System.out.println("Lapis: C1: 70K*"
                                + "Onde-onde: C2: 15K*"
                                + "Kue Cucur: C3: 17K"
                                + "Dadar Gulung: C4: 15k"
                                + "Nagasari: C5: 7K"
                                + "Kue Cubit: C6 : 20K"
                                + "Molen: C7: 12k"
                                + "Kue Pukis: C8: 12k"
                                + "Roti Bantal: C9: 20k"
                                + "Surabi: C10: 12k");
                        System.out.println("Nama Kue Basah: ");
                        String nama_basah = scanner.nextLine();
                        System.out.println("Harga Kue Basah: ");
                        int harga_basah = scanner.nextInt();
                        System.out.println("Kode Kue Basah: ");
                        String kode_basah = scanner.nextLine();
                        System.out.println("Ditambah setelah? ");
                        String basah_dicari = scanner.nextLine();
                        basah.insertAt(nama_basah, harga_basah, kode_basah, basah_dicari);
                    } else if (tambahAt == 0) {
                        System.out.println("KEMBALI KE MENU SEBELUMNYAS");
                    }
                    System.out.println();
                } while (tambahAt != 0);
            } else if (tambah == 0) {
                System.out.println("KEMBALI KE MENU UTAMA");
            }
            System.out.println("");
        }while(tambah!=0);
    }
}

