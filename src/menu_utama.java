import java.util.Scanner;
public class menu_utama {
    // function judulprogram return type dengan parameter text
    static String judulprogram(String text) {
        return text;
    }

    // function garis return type tanpa parameter
    static String garis () {
        return "=========================================";
    }

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int pilih_menu;
        char ulang;
        ulang = 'S';

        do {
            System.out.println("");
            System.out.println("=========================================");
            //penggunaan function judulprogram return type dengan mengisikan nilai pada parameter text
            System.out.println(judulprogram("==    PROGRAM RESERVASI HOTEL KEL31    =="));
            System.out.println("=========================================");
            System.out.println("==   [1] List Tipe Kamar               ==");
            System.out.println("==   [2] Reservasi Kamar               ==");
            System.out.println("==   [3] Keluar Program                ==");
            System.out.println(garis()); //penggunaan function garis return type tanpa parameter

            try {
                System.out.print("Pilih menu di atas (1-3): ");
                pilih_menu = userinput.nextInt();
                System.out.println("");
                switch (pilih_menu) {
                    case 1:
                        //pemanggilan method list non-return type tanpa parameter dari class method.java
                        method objek = new method();
                        objek.list();
                        break;
                    case 2:
                        //pemanggilan method transaksi non-return type tanpa parameter dari class method.java
                        method objek2 = new method();
                        objek2.transaksi();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Inputan Anda salah!");
                        System.out.println("Pilih kembali menu di atas (1-3)!");
                }
            } catch (Exception e) {
                System.out.println("Inputan hanya angka!");
                System.out.println("Pilih kembali menu di atas (1-3)!");
                ulang = userinput.next().charAt(0);
            }
            System.out.print("Apakah Anda ingin kembali ke menu utama? (Y/T) ");
            ulang = userinput.next().charAt(0);
        } while (ulang == 'Y' || ulang == 'y');
    }
}