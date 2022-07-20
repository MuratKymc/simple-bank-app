import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Customer c1 = new Customer("12345", "Murat", "Kuyumcu", 10000);


        while (true) {
            islemleriGöster();
            Scanner input = new Scanner(System.in);
            System.out.println("Yapmak istediðiniz iþlemi seçin : ");
            int islem = input.nextInt();
            double amount;

            if (islem == 0) {
                System.out.println("Çýkýþ yapýlýyor...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            } else if (islem == 1) {
                c1.showCustomerInfo();
            } else if (islem == 2) {
                System.out.println("Çekmek istediðiniz tutarý girin.");
                amount = input.nextDouble();
                c1.withdrawMoney(amount);

            } else if (islem == 3) {
                System.out.println("Yatýrmak istediðiniz tutarý girin.");
                amount = input.nextDouble();

                c1.depositMoney(amount);

            } else{
                System.out.println("Yanlýþ iþlem seçtiniz!");
            }


        }
    }

    public static void islemleriGöster() {

        System.out.println("1 - Bilgileri göster" +
                "\n2- Para çek" +
                "\n3- Para yatýr" +
                "\n0- Çýkýþ");

    }

}
