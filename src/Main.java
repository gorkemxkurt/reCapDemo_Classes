import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplama İşlemi");
        System.out.print("Lütfen 1. Sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Lütfen 2. Sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        int toplam = dortIslem.Topla(sayi1,sayi2);
        System.out.println("Toplam : " + toplam);

        System.out.println("Bölme İşlemi ");
        System.out.print("Lütfen 1. Sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();
        System.out.print("Lütfen 2. Sayıyı giriniz: ");
        int sayi4 = scanner.nextInt();
        double bolum = dortIslem.Bol(sayi3,sayi4);
        System.out.println("Bolum : " + bolum);

        System.out.println("Çarpma İşlemi ");
        System.out.print("Lütfen 1. Sayıyı giriniz: ");
        int sayi5 = scanner.nextInt();
        System.out.print("Lütfen 2. Sayıyı giriniz: ");
        int sayi6 = scanner.nextInt();
        int carpma = dortIslem.Carp(sayi5,sayi6);
        System.out.println("Çarpım : " + carpma);

        System.out.println("Çıkarma İşlemi ");
        System.out.print("Lütfen 1. Sayıyı giriniz: ");
        int sayi7 = scanner.nextInt();
        System.out.print("Lütfen 2. Sayıyı giriniz: ");
        int sayi8 = scanner.nextInt();
        int cikarma = dortIslem.Cikar(sayi7,sayi8);
        System.out.println("Çıkar : " + cikarma);




    }
}
