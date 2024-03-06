import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban ve üs değerleri alınır
        System.out.println("Taban değerini girin:");
        int taban = scanner.nextInt();

        System.out.println("Üs değerini girin:");
        int us = scanner.nextInt();

        // Sonuç için değişken tanımlanır ve 1'e eşitlenir
        int sonuc = 1;

        // Üs hesaplama işlemi için for döngüsü kullanılır
        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        // Sonuç ekrana yazdırılır
        System.out.println(taban + "^" + us + " = " + sonuc);
    }
}
