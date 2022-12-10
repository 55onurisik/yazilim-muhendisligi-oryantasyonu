import java.util.Scanner;

public class TersYazi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz : ");
        String cumle = scanner.nextLine();
        int i ;
        for (i = cumle.length()-1 ; i>=0 ; i--){
            System.out.print(cumle.charAt(i));
        }
    }
}//