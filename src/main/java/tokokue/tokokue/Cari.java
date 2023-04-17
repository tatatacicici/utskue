package tokokue.tokokue;
import java.util.Scanner;

/**
 *
 * @author Hussain&Bayu
 */
public class Cari {
     void Cari() {
        Scanner scanner = new Scanner(System.in);
        List_cake cake = new List_cake();
        List_kering kering = new List_kering();
        List_basah basah = new List_basah();
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
            }
            System.out.println("");
        }while(cari != 0);
    }
}
