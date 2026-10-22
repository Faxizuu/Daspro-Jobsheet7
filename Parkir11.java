import java.util.Scanner;

public class Parkir11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPembayaran = 0;

        while (true) {
            System.out.print("Jenis kendaraan (mobil/motor): ");
            String jenis = sc.nextLine();

            System.out.print("Lama parkir dalam jam (0 untuk selesai): ");
            int jam = Integer.parseInt(sc.nextLine());

            if (jam == 0) {
                break;
            }

            int tarifPerJam;

            if (jenis.equalsIgnoreCase("mobil")) {
                tarifPerJam = 3000;
            } else if (jenis.equalsIgnoreCase("motor")) {
                tarifPerJam = 2000;
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
                continue;
            }

            int pembayaran = tarifPerJam * jam;
            totalPembayaran += pembayaran;

            System.out.println("Pembayaran kendaraan ini: Rp" + pembayaran);
        }

        System.out.println("Total pembayaran parkir: Rp" + totalPembayaran);

        sc.close();
    }
}
