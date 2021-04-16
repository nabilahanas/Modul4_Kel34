package com.example;
import java.util.Scanner;
public class Tugas4_Kel34 {
    public static void menu() {
        System.out.println("################################################");
        System.out.println("Sisa pulsa Anda Rp50.000. Aktif s.d. 21/03/2034");
        System.out.println("################################################");
        System.out.println("");
        System.out.println("Paket Internet Bulanan");
        System.out.println("");
        System.out.println("1. 35GB/1Bln");
        System.out.println("2. 15GB/1Bln");
        System.out.println("3. 5GB/1Bln");
        System.out.println("4. 3GB/1Bln");
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
            System.out.print("Masukkan paket yang ingin Anda beli:");
            Scanner scan = new Scanner(System.in);
            pilih = Integer.parseInt(input.next());

            switch (pilih) {
                case 1:
        System.out.println("Anda akan membeli Paket 35 GB/1 bulan denganharga Rp85.000?");
        System.out.println("1. Beli");
        System.out.println("");
                    int i1=scan.nextInt();
                    if (i1==1) {
        System.out.println("Mohon maaf pulsa Anda tidak mencukupi. Silakan pilih paket lainnya.");
        System.out.println("");
                    }
                    else {
        System.out.println("Mohon maaf pilihan tidak tersedia.");
        System.out.println("");
                    }
        System.exit(0);
                    break;

        }
    }
}
