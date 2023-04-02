import java.util.Random;
import java.util.Scanner;

public class method {
    // function kodersv non-return type tanpa parameter
    public static void kodersv() {
        Random notrx = new Random();
        int b[];
        b = new int[5];
        for (int c = 0; c < b.length; c++) {
            char huruf = (char) (notrx.nextInt(26) + 'A');
            System.out.print(notrx.nextInt(9) + "-" + (notrx.nextInt(9)) + huruf);
        }
    }

    // method list non-return type tanpa parameter untuk digunakan di class menu_utama.java
    // kode di bawah selain menjadi method, dpt jg sbg function list untuk digunakan di class ini
    public static void list() {
        System.out.println("===========================================");
        System.out.println("===    Daftar Tipe Kamar Hotel Kel31    ===");
        System.out.println("===========================================");
        System.out.println("===   [1]STANDARD ROOM                  ===");
        System.out.println("===      Tarif Rp. 120.000 per malam    ===");
        System.out.println("===   [2]SUPERIOR ROOM                  ===");
        System.out.println("===      Tarif Rp. 230.000 per malam    ===");
        System.out.println("===   [3]DULUXE ROOM                    ===");
        System.out.println("===      Tarif Rp. 320.000 per malam    ===");
        System.out.println("===   [4]SUITE ROOM                     ===");
        System.out.println("===      Tarif Rp. 400.000 per malam    ===");
        System.out.println("===   [5]EXECUTIVE ROOM                 ===");
        System.out.println("===      Tarif Rp. 500.000 per malam    ===");
        System.out.println("===========================================");
    }

    // method transaksi non-return type tanpa parameter untuk digunakan di class menu_utama.java
    public static void transaksi() {
        Scanner userinput = new Scanner(System.in);

        int pesanan = 0;
        int lama = 0, bayar = 0, totaltarif = 0;

        System.out.println("------ PROGRAM RESERVASI HOTEL KEL31 ------");
        System.out.println("===========================================");
        System.out.print("Pesan berapa kamar : ");
        pesanan = userinput.nextInt();
        int[] biayapermalam = new int[pesanan];
        int[] tipekamar = new int[pesanan];
        String tarifkamar = null;
        String[] namakamar = new String[pesanan];

        System.out.print("Masukan nama pelanggan : ");
        String nama = userinput.next();
        System.out.println();
        // penggunaan function list non-return type tanpa parameter
        list();

        for (int i = 0; i < pesanan; i++) {
            System.out.print("Inputkan tipe kamar (1-5) = ");
            tipekamar[i] = userinput.nextInt();
                if (tipekamar[i] == 1) {
                    namakamar[i] = "STANDARD ROOM";
                    biayapermalam[i] = 120000;
                    tarifkamar = "Rp. 120.000 per malam";
                } else if (tipekamar[i] == 2) {
                    namakamar[i] = "SUPERIOR ROOM";
                    biayapermalam[i] = 230000;
                    tarifkamar = "Rp. 230.000 per malam";
                } else if (tipekamar[i] == 3) {
                    namakamar[i] = "DULUXE ROOM";
                    biayapermalam[i] = 320000;
                    tarifkamar = "Rp. 320.000 per malam";
                } else if (tipekamar[i] == 4) {
                    namakamar[i] = "SUITE ROOM";
                    biayapermalam[i] = 400000;
                    tarifkamar = "Rp. 400.000 per malam";
                } else if (tipekamar[i] == 5) {
                    namakamar[i] = "EXECUTIVE ROOM";
                    biayapermalam[i] = 500000;
                    tarifkamar = "Rp. 500.000 per malam";
                }
            while (tipekamar[i] <= 0 || tipekamar[i] > 5 ) {
                System.out.println("Tipe kamar tidak ditemukan!");
                System.out.print("Inputkan tipe kamar kembali (1-5): ");
                tipekamar[i] = userinput.nextInt();
                if (tipekamar[i] == 1) {
                    namakamar[i] = "STANDARD ROOM";
                    biayapermalam[i] = 120000;
                    tarifkamar = "Rp. 120.000 per malam";
                } else if (tipekamar[i] == 2) {
                    namakamar[i] = "SUPERIOR ROOM";
                    biayapermalam[i] = 230000;
                    tarifkamar = "Rp. 230.000 per malam";
                } else if (tipekamar[i] == 3) {
                    namakamar[i] = "DULUXE ROOM";
                    biayapermalam[i] = 320000;
                    tarifkamar = "Rp. 320.000 per malam";
                } else if (tipekamar[i] == 4) {
                    namakamar[i] = "SUITE ROOM";
                    biayapermalam[i] = 400000;
                    tarifkamar = "Rp. 400.000 per malam";
                } else if (tipekamar[i] == 5) {
                    namakamar[i] = "EXECUTIVE ROOM";
                    biayapermalam[i] = 500000;
                    tarifkamar = "Rp. 500.000 per malam";
                }
            }
            System.out.print("Inputkan lama pelanggan menginap (malam): ");
            lama = userinput.nextInt();
            totaltarif = (biayapermalam[i] * lama);
            System.out.println("Reservasi kamar hotel dengan tipe "+namakamar[i]+" selama "+lama+" malam");
            System.out.println("Tagihan pelanggan adalah sebesar Rp. " + totaltarif);
            System.out.print("Uang yang dibayarkan pelanggan: Rp. ");
            bayar = userinput.nextInt();
            System.out.println("");

            while (bayar < totaltarif) {
                System.out.println("Uang pelanggan kurang!");
                System.out.print("Masukan uang tambahan dari pelanggan: Rp.");
                int tambahan = userinput.nextInt();
                bayar = bayar + tambahan;
            }
        }

        for (int a = 0; a < pesanan; a++) {
            System.out.println("=============================================================");
            System.out.println("=============== Rincian Reservasi Hotel Kel31 ===============");
            System.out.println("=============================================================");
            System.out.print("Kode Reservasi\t\t\t\t\t:"); kodersv(); // pemanggilan function rsv non-return type tanpa parameter
            System.out.println();
            System.out.println("Nama Pemesan\t\t\t\t\t:" + nama);
            System.out.println("Tipe Kamar\t\t\t\t\t\t:" + namakamar[a]);
            System.out.println("Tarif Kamar\t\t\t\t\t\t:" + tarifkamar);
            System.out.println("Lama Menginap\t\t\t\t\t:"+lama+" malam");
            System.out.println("Total Tarif\t\t\t\t\t\t:Rp. " + totaltarif);
            System.out.println("Uang yang dibayarkan pelanggan\t:Rp. "+bayar);
            System.out.println("Uang kembalian pelanggan\t\t:Rp. "+(bayar-totaltarif));
            System.out.println("=============================================================");
            System.out.println("======== Terima Kasih Sudah Menginap di Hotel Kel31 =========");
            System.out.println("=============================================================");
            System.out.println();
        }
    }
}