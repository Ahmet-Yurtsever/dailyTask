import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Lütfen bir sayı giriniz:");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum=0;

        for (int i=0;i<count;i++){
            System.out.println((i+1)+".sayıyı giriniz:)");
            int number=scanner.nextInt();
            sum+=number;


        }

        System.out.println("Girilen sayıların toplamı: "+sum);
        scanner.close();
    }
}
