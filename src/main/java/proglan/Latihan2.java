package proglan;
import java.util.Scanner;
import java.util.SortedMap;

public class Latihan2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teks = "";

        while (true) {
            System.out.println("Menu Program:");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membuang karakter newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan teks: ");
                    teks = scanner.nextLine();
                    break;
                case 2:
                    int jumlahKarakter = hitungJumlahKarakter(teks);
                    System.out.println("Jumlah karakter: " + jumlahKarakter);
                    break;
                case 3:
                    int jumlahKata = hitungJumlahKataYangDitemukan(teks, "");
                    System.out.println("Jumlah kata: " + jumlahKata);
                    break;
                case 4:
                    System.out.print("Masukkan kata yang ingin dicari: ");
                    String kataCari = scanner.next();
                    cariKata(teks, kataCari);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini. Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    private static int hitungJumlahKarakter(String teks) {
        return teks.length();
    }

    private static int hitungJumlahKataYangDitemukan(String teks, String kata) {
        if (teks.isEmpty()) {
            return 0;
        }

        // If the search word is empty, return the total number of words
        if (kata.isEmpty()) {
            // Split teks menjadi array kata-kata
            String[] kataArray = teks.split("\\s+");
            return kataArray.length;
        }

        // Split teks menjadi array kata-kata
        String[] kataArray = teks.split("\\s+");

        int count = 0;
        // Mencari kata dalam array
        for (String k : kataArray) {
            if (k.equalsIgnoreCase(kata)) {
                count++;
            }
        }

        return count;
    }

    private static boolean cariKata(String teks, String kata) {
        if (teks.trim().isEmpty() || kata.trim().isEmpty()) {
            return false;
        }

        int jumlahKataDitemukan = hitungJumlahKataYangDitemukan(teks, kata);

        if (jumlahKataDitemukan > 0) {
            System.out.println("Kata '" + kata + "' ditemukan sebanyak " + jumlahKataDitemukan + " kali dalam teks.");
            return true;
        } else {
            // Omit the output here
            return false;
        }
    }
}

