package tokokue.tokokue;
import java.util.Scanner;
/**
 *
 * @author Hussain&Bayu
 */
public class Beli {
    void Beli(){
        Scanner scanner = new Scanner(System.in);
        List_cake cake = new List_cake();
        List_kering kering = new List_kering();
        List_basah basah = new List_basah();
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
    }
}
