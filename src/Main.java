import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        /*
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 .
tutar 1000tl'den büyük ise KDV oranını %8 olarak kdv tutarını hesaplayan programı yazınız .
 */




        Scanner input = new Scanner(System.in);
        System.out.println("Tutar giriniz");

        int girilenTutar = input.nextInt();


        double kdvOrani = (girilenTutar>0 && girilenTutar < 1000) ? 0.18 : 0.08;
        double kdvTutari = girilenTutar * kdvOrani;

        System.out.println("Tutar" + kdvTutari);

    }
}