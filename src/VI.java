
//import ini jangan dilupa
import java.util.*;

public class VI {
    public static void main(String[] args) {
        // nomor 1
        // deklarasikan nama array terlebih dahulu
        ArrayList<String> namaArtis = new ArrayList<>();

        // buat variabel untuk scanner nya
        Scanner scan = new Scanner(System.in);

        // buat inputan untuk panjang array
        System.out.print("Panjang Array : ");
        int panjangArray = scan.nextInt();

        // lakukan perulangan sebanyak panjang array yang di inputkan
        for (int i = 0; i < panjangArray; i++) {
            // inputkan elemen array nya
            System.out.print("Nama Artis : ");
            String nama = scan.next();
            // setelah di inputkan masukkan value nya kedalam array
            namaArtis.add(nama);
        }

        // tampilkan nilai/value dari array nya
        for (int i = 0; i < panjangArray; i++) {
            // menampilkan value pada setiap index elemen array
            System.out.println(namaArtis.get(i));
        }

        // nomor 2
        System.out.println(namaArtis.get(namaArtis.size() - 1));

        // nomor 3
        namaArtis.remove(4);
        namaArtis.remove(8);

        // nomor 4
        // karena kita sudah hapus 2 index jadi kita tidak bisa update pada index ke 9
        // jadi disni saya akan update pada index terakhir pada array nya saja
        namaArtis.set(namaArtis.size() - 1, "Kaco");

        // kita lihat hasil akhir value dari array nya
        System.out.println("Setelah Melakukan Perubahan");
        for (int i = 0; i < namaArtis.size(); i++) {
            System.out.println(namaArtis.get(i));
        }

        // nomor 5
        // buat array nya terlebih dahulu
        int[] nilai = new int[10];
        // array nya
        nilai[0] = 1;
        nilai[1] = 3;
        nilai[2] = 5;
        nilai[3] = 7;
        nilai[4] = 9;
        nilai[5] = 11;
        nilai[6] = 13;
        nilai[7] = 15;
        nilai[8] = 17;
        nilai[9] = 19;

        int sum = 0; // nah kita buat variabel untuk menampung hasil penjumlahan arraynya
        for (int i = 0; i < nilai.length; i++) {
            sum += nilai[i];
        }
        // cetak hasil sum nya
        System.out.println("sum : " + sum);

        scan.close(); // abaikan
    }
}
