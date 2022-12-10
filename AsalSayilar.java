import java.util.Scanner;

public class AsalSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = scanner.nextInt();
        if(sayi == 1){
            System.out.print("1 asal sayı değildir.");
            System.exit(0);
        }
        boolean a = true;
        for (int i = 2 ; i<sayi ; i++){
            if(sayi % i == 0){
               a = false;
            }
        }
        if(a){
            System.out.println(+sayi +" asal sayıdır.");
        } else{
            System.out.print(+sayi +" asal sayı değildir.");
        }
    }
}