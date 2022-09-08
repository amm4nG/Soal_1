
//keperluan
import java.util.*;

public class III {
    public static void main(String[] args) {
        // nomor 1
        double hargaKomputer = 55000000;
        double tabunganPerbulan = 1500000;
        // langsung saja kita tampilkan hasilnya
        // fungsi Math.ceil ini untuk membulatkan nilai ke atas
        System.out.println(Math.ceil(hargaKomputer / tabunganPerbulan));

        // nomor 2

        // deklarasikan variabel untuk harga tanahnya terlebih dahulu
        double hargaTanah = 500000;

        // jangan lupa import keperluan untuk scanner diatas public class
        // deklarasikan variabel untuk scanner nya lagi
        Scanner scan = new Scanner(System.in);

        // kita anggap panjang dan lebarnya itu dalam satuan meter/m
        // jadi disini kita pakai type data double saja
        System.out.print("Panjang : ");
        double panjang = scan.nextDouble();
        System.out.print("Lebar: ");
        double lebar = scan.nextDouble();

        // langsung saja kita tampilkan hasil penjualannya
        System.out.println(panjang * lebar * hargaTanah);

        // nomor 3
        // karena di nomor 2 kita sudah membuat scanner untuk inputannya kita tidak
        // perlu membuat lagi

        // langsung saja kita deklarasikan 2 buah variabel a dan b dengan type integer
        int a, b;

        // terus kita buat inputannya
        System.out.print("Nilai a : ");
        a = scan.nextInt();
        System.out.print("Nilai b : ");
        b = scan.nextInt();

        // buat operasi aritmatikanya dan cetak
        System.out.println(a + b); // tambah
        System.out.println(a - b); // kurang
        System.out.println(a * b); // kali
        System.out.println(a / b); // bagi
        System.out.println(a % b); // moduulus

        scan.close(); // abaikan
    }
}
