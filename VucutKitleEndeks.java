import java.util.Scanner;

public class VucutKitleEndeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Boy giriniz(ondalıklı olarak örn. 1.85) : ");
        double boy = scanner.nextDouble();
        System.out.print("Kilo giriniz : ");
        int kilo = scanner.nextInt();

        double endeks = kilo / (boy*boy);

        if(endeks > 25){
            System.out.print("Kilolu");
        }else if(endeks < 25) {
            System.out.print("Zayıf");
        }else{
            System.out.print("İdeal");
        }


    }
}