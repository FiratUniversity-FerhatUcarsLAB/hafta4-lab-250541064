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

        if (ogrenciAgno < 0 || ogrenciAgno > 4) {
            System.out.println("Hatali AGNO! Lutfen 0 ile 4 arasinda bir deger giriniz.");
        } else {
            System.out.printf("\nAd Soyad     : %s %s\n", ogrenciAdi, ogrenciSoyadi);
            System.out.printf("Numara       : %d\n", ogrenciNumarasi);
            System.out.printf("Yas          : %d\n", ogrenciYasi);
            System.out.printf("AGNO (GPA)   : %.2f\n", ogrenciAgno);
        }

        scanner.close();
    }
}
