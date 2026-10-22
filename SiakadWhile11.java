import java.util.Scanner;

public class SiakadWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai;
        int jml;
        int i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }

            String huruf;

            if (nilai > 80) {
                huruf = "A";
            } else if (nilai > 73) {
                huruf = "B+";
            } else if (nilai > 65) {
                huruf = "B";
            } else if (nilai > 60) {
                huruf = "C+";
            } else if (nilai > 50) {
                huruf = "C";
            } else if (nilai > 39) {
                huruf = "D";
            } else {
                huruf = "E";
            }

            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah " + huruf);

            if (huruf.equals("A")) {
                System.out.println("Bagus, pertahankan nilainya!");
            }

            i++;
        }

        sc.close();
    }
}