package uts_praktik.no1;

import java.util.Scanner;

public class DemoHewan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        Hewan hewan = null;

        do {
            // Menampilkan menu
            System.out.println("===== Menu Pilihan =====");
            System.out.println("1. Pilih Hewan (Kucing/Anjing)");
            System.out.println("2. Exit");
            System.out.print("Pilih menu (1/2): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Pilih Hewan
                    System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
                    String jenisHewan = scanner.next().toLowerCase();
                    scanner.nextLine();

                    switch (jenisHewan) {
                        case "kucing":
                            hewan = new Kucing();
                            break;
                        case "anjing":
                            hewan = new Anjing();
                            break;
                        default:
                            System.out.println("Jenis hewan tidak dikenal.");
                            break;
                    }

                    if (hewan != null) {
                        hewan.bersuara();
                        if (hewan.mamalia()) {
                            System.out.println("Hewan ini adalah mamalia.");
                        } else {
                            System.out.println("Hewan ini bukan mamalia.");
                        }
                        System.out.println(); 
                    }
                    break;
                case 2:
                    System.out.println("Terima kasih. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }

        } while (pilihan != 2);
    }
}
