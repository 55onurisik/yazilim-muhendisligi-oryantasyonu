import java.util.Scanner;
import java.lang.Math;
public class Pisagor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci kısa kenarı giriniz : ");
        int kn1 = scanner.nextInt();
        System.out.print("İkinci kısa kenarı giriniz : ");
        int kn2 = scanner.nextInt();

        double hip = Math.sqrt((kn1*kn1)+(kn2*kn2));
        System.out.print("Hipotenüs : " +hip );
    }
}