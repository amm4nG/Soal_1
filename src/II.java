
//pertama kita import dulu disini untuk keperluan scanner
import java.util.*;

public class II {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // buat variabel scan untuk scanner nya

        // terus kita deklarasikan type data variabelnya terlebih dahulu
        String namaDepan, namaBelakang, hp;
        int umur;
        double tinggi, beratBadan;
        boolean status;

        // nah disini kita akan buat inputannya

        System.out.print("Nama Depan : ");
        namaDepan = scan.next(); // karena type nya string jadi kita pake .next() saja

        System.out.print("Nama Belakang : ");
        namaBelakang = scan.next();

        System.out.print("Nomor Hp : ");
        hp = scan.next();

        System.out.print("Umur : ");
        umur = scan.nextInt(); // kita pake nextInt() karena type nya adalah Integer

        System.out.print("Tinggi : ");
        tinggi = scan.nextDouble(); // disini kita pake double

        System.out.print("Berat Badan : ");
        beratBadan = scan.nextDouble();

        System.out.print("Status : ");
        status = scan.nextBoolean(); // disini kita pake boolean

        // mencetak hasil inputan
        System.out.println("Nama : " + namaDepan + " " + namaBelakang);
        System.out.println("Umur : " + umur);
        System.out.println("No Hp : " + hp);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Berat Badan : " + beratBadan);
        System.out.println("Status Pernikahan : " + status);

        scan.close(); // yang ini abaikan saja
    }
}
