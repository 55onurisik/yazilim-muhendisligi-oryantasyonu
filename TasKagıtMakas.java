import java.util.Scanner;

public class TasKagıtMakas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] tkm = {"Taş", "Kağıt", "Makas"};
            System.out.print("Taş için 0 , Kağıt için 1 , Makas için 2 yazınız : ");
            int b = 0;
            boolean a = true;
            while (a) {
                b = scanner.nextInt();
                if (b < 0 || b > 2) {
                    System.out.println("Lütfen 0 ile 2 arasında değerler giriniz.");
                    System.out.print("Taş için 0 , Kağıt için 1 , Makas için 2 yazınız : ");
                } else {
                    a = false;
                }
            }
            int kullanıcı = b;
            int bilgisayar = (int) (Math.random() * 3);
            if (kullanıcı == 0 && bilgisayar == 2 || kullanıcı == 1 && bilgisayar == 0 || kullanıcı == 2 && bilgisayar == 1) {
                System.out.println("***************************************************");
                System.out.println("Sen : " + tkm[kullanıcı] + " , " + "Bilgisayar : " + tkm[bilgisayar] + ".");
                System.out.println("Sen kazandın ! ");

            } else if (kullanıcı == 0 && bilgisayar == 1 || kullanıcı == 1 && bilgisayar == 2 || kullanıcı == 2 && bilgisayar == 0) {
                System.out.println("***************************************************");
                System.out.println( "Sen : " + tkm[kullanıcı] + " , " + "Bilgisayar : " + tkm[bilgisayar] + ".");
                System.out.println("Bilgisayar kazandı ! ");

            } else {
                System.out.println("***************************************************");
                System.out.println("Sen : " + tkm[kullanıcı] + " , " + "Bilgisayar : " + tkm[bilgisayar] + ".");
                System.out.println("Berabere ! ");
            }
        }
    }

