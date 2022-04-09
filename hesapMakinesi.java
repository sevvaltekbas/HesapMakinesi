import java.util.Scanner;

public class hesapMakinesi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        System.out.println("İSLEMİNİZİ SEÇİNİZ");
        System.out.println("1. TOPLAMA");
        System.out.println("2. ÇIKARMA");
        System.out.println("3. ÇARPMA");
        System.out.println("4. BÖLME");

        System.out.print("Secimininizi giriniz: ");
        int secim = scan.nextInt();

        if (secim == 1) {
            System.out.println("sonuc = " + (sayi1 + sayi2));
        } else if (secim == 4) {
            System.out.println("sonuc = " + (float) sayi1 / sayi2);
        }
    }
}
