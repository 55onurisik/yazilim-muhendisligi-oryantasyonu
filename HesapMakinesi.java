
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int say1 = scanner.nextInt();
        System.out.print("Toplama için 1 , çıkarma için 2 , çarpma için 3 , bölme için 4 yazınız : ");
        int opr = scanner.nextInt();
        System.out.print("Sayı giriniz : ");
        int say2 = scanner.nextInt();

        switch(opr){
            case 1 :
                System.out.println("Sonuç : " +(say1 + say2) );
                break;
            case 2 :
                System.out.print("Sonuç : " +(say1 - say2) );
                break;
            case 3 :
                System.out.print("Sonuç : " +(say1 * say2));
                break;
            case 4 :
                System.out.print("Sonuç : " +(say1 / say2));
                break;
        }
    }
}