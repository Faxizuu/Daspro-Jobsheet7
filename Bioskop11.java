import java.util.Scanner;

public class Bioskop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        int jumlahPelanggan;
        int pelanggan = 1;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;

        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        jumlahPelanggan = sc.nextInt();

        while (pelanggan <= jumlahPelanggan) {
            System.out.print("Masukkan jumlah tiket pelanggan ke-" + pelanggan + ": ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang.");
                continue;
            }

            double subtotal = jumlahTiket * HARGA_TIKET;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = subtotal * 0.15;
            } else if (jumlahTiket > 4) {
                diskon = subtotal * 0.10;
            }

            double totalBayar = subtotal - diskon;

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalBayar;

            System.out.println("Tiket pelanggan ke-" + pelanggan + ": " + jumlahTiket);
            System.out.println("Diskon: Rp" + diskon);
            System.out.println("Total bayar: Rp" + totalBayar);

            pelanggan++;
        }

        System.out.println();
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan: Rp" + totalPenjualan);

        sc.close();
    }
}