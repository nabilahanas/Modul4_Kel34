package com.example;
import java.util.Scanner;
public class Tugas4_Kel34 {
    public static void menu() {
        System.out.println("################################################");
        System.out.println("Sisa pulsa Anda Rp 50.000. Aktif s.d. 21/03/2034");
        System.out.println("################################################");
        System.out.println("");
        System.out.println("Paket Internet Bulanan");
        System.out.println("");
        System.out.println("1. 35GB/1Bln        Rp 85.000");
        System.out.println("2. 15GB/1Bln        Rp 65.000");
        System.out.println("3. 5GB/1Bln         Rp 40.000");
        System.out.println("4. 3GB/1Bln         Rp 30.000");
        System.out.println("");
        System.out.println("################################################");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        System.out.println("Kelompok 34");
        String[][] anggota = {{"Fairuzsyah Naufal Fikri", "Nabila Hana Saphira", "Fadillah Hamdi Wanadi", "Muhammad Irhamsyah Arrahim"}, {"21120120130110", "21120120140112", "21120120120025", "21120120140157"}};
        System.out.println(anggota[0][0] + " (" + anggota[1][0] + ")");
        System.out.println(anggota[0][1] + " (" + anggota[1][1] + ")");
        System.out.println(anggota[0][2] + " (" + anggota[1][2] + ")");
        System.out.println(anggota[0][3] + " (" + anggota[1][3] + ")");
        System.out.println("");

        while (true) {
            menu();
            System.out.print("Masukkan paket yang ingin Anda beli: ");
            Scanner scan = new Scanner(System.in);
            pilih = Integer.parseInt(input.next());

            switch (pilih) {
                case 1:
                    System.out.println("Anda akan membeli Paket 35 GB / 1 bulan dengan harga Rp 85.000?");
                    System.out.println("1. Beli");
                    System.out.println("");
                    int i1 = scan.nextInt();
                    if (i1 == 1) {
                        System.out.println("Mohon maaf pulsa Anda tidak mencukupi. Silakan pilih paket lainnya.");
                        System.out.println("");
                    }
                    else {
                        System.out.println("Mohon maaf pilihan tidak tersedia.");
                        System.out.println("");
                    }
                    System.exit(0);
                    break;
                case 2:
                    System.out.println("Anda akan membeli Paket 15 GB / 1 bulan dengan harga Rp 65.000?");
                    System.out.println("1. Beli");
                    System.out.println("");
                    int i2 = scan.nextInt();
                    if (i2 == 1) {
                        System.out.println("Mohon maaf pulsa Anda tidak mencukupi. Silakan pilih paket lainnya.");
                        System.out.println("");
                    }
                    else {
                        System.out.println("Mohon maaf pilihan tidak tersedia.");
                        System.out.println("");
                    }
                    System.exit(0);
                    break;
                case 3:
                    System.out.println("Anda akan membeli Paket 5 GB / 1 bulan dengan harga Rp40.000?");
                    System.out.println("1. Beli");
                    System.out.println("");
                    int i3 = scan.nextInt();
                    if (i3 == 1) {
                        System.out.println("Selamat! Paket 5 GB / 1 bulan Anda telah aktif.");
                        System.out.println();
                    }
                    else {
                        System.out.println("Mohon maaf pilihan tidak tersedia.");
                        System.out.println();
                    }
                    System.exit(0);
                    break;
                case 4:
                    System.out.println("Anda akan membeli Paket 3 GB / 1 bulan dengan harga Rp30.000?");
                    System.out.println("1. Beli");
                    System.out.println("");
                    int i4 = scan.nextInt();
                    if (i4 == 1) {
                        System.out.println("Selamat! Paket 3 GB / 1 bulan Anda telah aktif.");
                        System.out.println();
                    }
                    else {
                        System.out.println("Mohon maaf pilihan tidak tersedia.");
                        System.out.println();
                    }
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mohon maaf pilihan tidak tersedia. Silakan pilih pilihan yang tersedia. ");
                    break;
            }
        }
    }
}
