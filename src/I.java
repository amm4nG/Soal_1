public class I {
    public static void main(String[] args) throws Exception {
        // I
        // nomor 1
        // deklarasi variabel
        String namaDepan, namaBelakang;
        int umur;
        double tinggi, beratBadan;
        char ukuranBaju;
        boolean status;
        // memberi nilai/value pada variabel
        namaDepan = "Arman";
        namaBelakang = "Umar";
        umur = 20;
        tinggi = 1.63;
        beratBadan = 43;
        ukuranBaju = 'L'; // karena type datanya adalah char maka kita menggunakan tanda petik satu -> ''
        status = false;
        // mencetak variabel
        System.out.println("Nama : " + namaDepan + " " + namaBelakang);
        System.out.println("Umur : " + umur);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Berat Badan : " + beratBadan);
        System.out.println("Ukuran Baju : " + ukuranBaju);
        System.out.println("Status Pernikahan : " + status);

        // nomor 2
        // pertama buat variabel dan beri nilai
        String nama_depan = "ahmad";
        String nama_belakang = "junaedi";
        // terus kita update value/nilai nya
        nama_depan = "Muhammad";
        nama_belakang = "Hamdani";
        // cetak hasil update
        System.out.println(nama_depan + nama_belakang);
    }
}
