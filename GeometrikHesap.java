/*
 * Ad Soyad: Muhammet Eren Alptekin
 * Ogrenci No: 250541064
 * Tarih: 29.10.2025
 * Aciklama: Gorev 2 - Geometrik Hesaplama
 * 
 * Bu program yarıçapı verilen daire üzerinden, daire ve küre hesaplamaları yapacak.
 */


import java.util.Scanner;

public class GeometriHesaplayici {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yarıçapı girin: ");
        double r = scanner.nextDouble();

        double daireAlan = PI * r * r;
        double daireCevre = 2 * PI * r;
        double daireCap = 2 * r;

        double kureYuzeyAlan = 4 * PI * r * r;
        double kureHacim = (4.0/3.0) * PI * r * r * r;

        System.out.printf("\n%-20s: %.2f\n", "Daire Alanı", daireAlan);
        System.out.printf("%-20s: %.2f\n", "Daire Çevresi", daireCevre);
        System.out.printf("%-20s: %.2f\n", "Daire Çapı", daireCap);
        System.out.printf("%-20s: %.2f\n", "Küre Yüzey Alanı", kureYuzeyAlan);
        System.out.printf("%-20s: %.2f\n", "Küre Hacmi", kureHacim);

        scanner.close();
    }
}
