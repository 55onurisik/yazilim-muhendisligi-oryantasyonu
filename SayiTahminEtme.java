import java.util.Scanner;
import java.lang.Math;

public class SayiTahminEtme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = (int)(Math.random() * 100);
        int kullanici = 0 ;
        int i = 1;
        System.out.print("Sayı 0 ile 100 arasındadır , tahmin etmeye çalışın : ");
        kullanici = scanner.nextInt();
        boolean a = true;
        while ( a ){
            if (sayi == scanner.nextInt()){
                System.out.print("Doğru bildin! Sayı : " +sayi);
                a = false;
            }else if (sayi > kullanici ){
                i++;
                kullanici = 0 ;
                System.out.print("Daha büyük değerler dene! Tahmin : ");
                kullanici = scanner.nextInt();

                if (i>4){
                    System.out.println("Deneme hakkınız doldu , kaybettiniz.");
                    System.exit(0);
                }
            }else {
                i++;
                kullanici = 0 ;
                System.out.print("Daha küçük değerler dene! Tahmin : ");
                kullanici = scanner.nextInt();
                if (i>4){
                    System.out.println("Deneme hakkınız doldu , kaybettiniz.");
                    System.exit(0);
                }
            }
        }
    }
}