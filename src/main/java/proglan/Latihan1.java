package proglan;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Kalkulator ===");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma");
        System.out.println("4. Faktorial");
        System.out.println("5. Keluar");

        System.out.print("Pilih operasi (1/2/3/4/5) : ");
        int pilih = scanner.nextInt();

        switch (pilih){
            case 1:
                opakarkuadrat();
                break;
            case 2:
                oppangkat();
                break;
            case 3:
                oplogaritma();
                break;
            case 4:
                opfaktorial();
                break;
            case 5:
                System.out.println("Operasi berakhir");
                break;
            default:
                System.out.println("System tidak valid");
        }
        scanner.close();
    }
    private static void opakarkuadrat(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka :");
        double angka = scanner.nextDouble();
        double hasil = Math.sqrt(angka);
        System.out.println("Hasil dari akar kuadrat adalah : " +hasil);
    }
    private static void oppangkat(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        double angka = scanner.nextDouble();

        System.out.print("Masukkan Pangkat : ");
        double pangkat = scanner.nextDouble();
        double hasil = Math.pow(angka, pangkat);
        System.out.println("Hasil dari operasi pangkat adalah : " +hasil);

    }
    private static void oplogaritma(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        double angka = scanner.nextDouble();
        double hasil = Math.log(angka);
        System.out.println("Hasil dari operasi logaritma adalah :" +hasil);

    }
    private static void opfaktorial(){
        Scanner scanner = new Scanner(System.in);
        int faktorial = 1;
        int angka, i;
        System.out.print("Masukkan Angka : ");
        angka =scanner.nextInt();

        if (angka > 0){
            for (i = 1; i < angka; i++)
                faktorial = faktorial*(angka-i);
                faktorial = faktorial*angka;
        } else {
            faktorial = 1;
        }
        System.out.println(+angka+ "! = " +faktorial);

    }
}