import java.util.Scanner;

public class Faktoriyel{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int say = scanner.nextInt();
        int fakt = 1 ;
        for (int a = say ; a >0 ; a-- ){
             fakt = fakt * a ;

        }
        System.out.println("Sayının faktöriyeli : " +fakt +"'dir.");
    }
}