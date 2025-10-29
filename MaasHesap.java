/*
 * Ad Soyad: Muhammet Eren Alptekin
 * Ogrenci No: 250541064
 * Tarih: 29.10.2025
 * Aciklama: Gorev 3 - Maaş Hesaplama
 * 
 * Bu program çalışanın bilgilerini alıp, detaylı maaş bodrosu oluşturacak.
 */


import java.util.Scanner;

public class MaasBordrosu {
    public static void main(String[] args) {
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;
        final int AYLIK_NORMAL_SAAT = 160;
        final int AYLIK_TOPLAM_SAAT = 176;
        final int AYLIK_GUN = 22;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Calisan Adi Soyadi: ");
        String adSoyad = scanner.nextLine();

        System.out.print("Aylik Brut Maas (TL): ");
        double brutMaas = scanner.nextDouble();

        System.out.print("Mesai Saati Sayisi: ");
        int mesaiSaat = scanner.nextInt();

        // Gelirler
        double mesaiUcreti = (brutMaas / AYLIK_NORMAL_SAAT) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // Kesintiler
        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        // Net Maaş
        double netMaas = toplamGelir - toplamKesinti;

        // İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / AYLIK_TOPLAM_SAAT;
        double gunlukNetKazanc = netMaas / AYLIK_GUN;

        // Çıktı
        System.out.printf("\n%-25s: %s\n", "Calisan", adSoyad);
        System.out.print("--------------------------------------------\n");
        System.out.printf("%-25s: %.2f TL\n", "Brut Maas", brutMaas);
        System.out.printf("%-25s: %.2f TL\n", "Mesai Ucreti", mesaiUcreti);
        System.out.printf("%-25s: %.2f TL\n", "Toplam Gelir", toplamGelir);
        System.out.printf("%-25s: %.2f TL\n", "SGK Kesintisi", sgk);
        System.out.printf("%-25s: %.2f TL\n", "Gelir Vergisi", gelirVergisi);
        System.out.printf("%-25s: %.2f TL\n", "Damga Vergisi", damgaVergisi);
        System.out.printf("%-25s: %.2f TL\n", "Toplam Kesinti", toplamKesinti);
        System.out.printf("%-25s: %.2f TL\n", "Net Maas", netMaas);
        System.out.printf("%-25s: %.2f %%\n", "Kesinti Orani", kesintiOrani);
        System.out.printf("%-25s: %.2f TL/saat\n", "Saatlik Net Kazanc", saatlikNetKazanc);
        System.out.printf("%-25s: %.2f TL/gun\n", "Günlük Net Kazanc", gunlukNetKazanc);

        scanner.close();
    }
}
