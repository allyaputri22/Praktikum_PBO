package tuprak8;
import java.util.Scanner;

public class Toko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("TOKO SERBA ADA");
        System.out.println("*****************");

        System.out.print("Masukkan Item Barang: ");
        int jumlahBarang = input.nextInt();

        String[] kodeBarang = new String[jumlahBarang];
        String[] namaBarang = {"Buku", "Pensil", "Pulpen", "Penggaris", "Spidol"};
        int[] hargaBarang = {3000, 4000, 5000, 10000, 7000};
        int[] jumlahBeli = new int[jumlahBarang];
        int[] jumlahBayar = new int[jumlahBarang];

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("\nData ke " + (i + 1));
            System.out.print("Masukkan Kode (a001-5): ");
            kodeBarang[i] = input.next();
            System.out.print("Masukkan jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();
            for (int j = 0; j < namaBarang.length; j++) {
                if (kodeBarang[i].equals("a00" + (j + 1))) {
                    jumlahBayar[i] = hargaBarang[j] * jumlahBeli[i];
                }
            }
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*******************");
        System.out.printf("%-4s %-15s %-15s %-10s %-15s %-15s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("===========================================================================");
        for (int i = 0; i < jumlahBarang; i++) {
            for (int j = 0; j < namaBarang.length; j++) {
                if (kodeBarang[i].equals("a00" + (j + 1))) {
                    System.out.printf("%-4d %-15s %-15s %-10d %-15d %-15d\n", (i + 1), kodeBarang[i], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar[i]);
                }
            }
        }

        int totalBayar = 0;
        for (int i = 0; i < jumlahBarang; i++) {
            totalBayar += jumlahBayar[i];
        }
        System.out.println("===========================================================================");
        System.out.println("Total Bayar \t\t\t\t\t\t\t" + totalBayar);
        System.out.println("===========================================================================");

        input.close();
    }
}