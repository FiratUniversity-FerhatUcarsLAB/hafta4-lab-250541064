/*
 * Ad Soyad: Muhammet Eren Alptekin
 * Ogrenci No: 250541064
 * Tarih: 29.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ogrenci Adi: ");
        String ogrenciAdi = scanner.nextLine();

        System.out.print("Ogrenci Soyadi: ");
        String ogrenciSoyadi = scanner.nextLine();

        System.out.print("Ogrenci Numarasi: ");
        int ogrenciNumarasi = scanner.nextInt();

        System.out.print("Ogrenci Yasi: ");
        int ogrenciYasi = scanner.nextInt();

        System.out.print("Ogrenci AGNO (GPA): ");
        double ogrenciAgno = scanner.nextDouble();

        System.out.printf("\nAd Soyad     : %s %s\n", ogrenciAdi, ogrenciSoyadi);
        System.out.printf("Numara       : %d\n", ogrenciNumarasi);
        System.out.printf("Yas          : %d\n", ogrenciYasi);
        System.out.printf("AGNO (GPA)   : %.2f\n", ogrenciAgno);

        scanner.close();
    }
}
