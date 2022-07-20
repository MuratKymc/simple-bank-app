import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Customer c1 = new Customer("12345", "Murat", "Kuyumcu", 10000);


        while (true) {
            islemleriG�ster();
            Scanner input = new Scanner(System.in);
            System.out.println("Yapmak istedi�iniz i�lemi se�in : ");
            int islem = input.nextInt();
            double amount;

            if (islem == 0) {
                System.out.println("��k�� yap�l�yor...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            } else if (islem == 1) {
                c1.showCustomerInfo();
            } else if (islem == 2) {
                System.out.println("�ekmek istedi�iniz tutar� girin.");
                amount = input.nextDouble();
                c1.withdrawMoney(amount);

            } else if (islem == 3) {
                System.out.println("Yat�rmak istedi�iniz tutar� girin.");
                amount = input.nextDouble();

                c1.depositMoney(amount);

            } else{
                System.out.println("Yanl�� i�lem se�tiniz!");
            }


        }
    }

    public static void islemleriG�ster() {

        System.out.println("1 - Bilgileri g�ster" +
                "\n2- Para �ek" +
                "\n3- Para yat�r" +
                "\n0- ��k��");

    }

}
