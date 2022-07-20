public class Customer {

    private String customerID;
    private String name;
    private String surname;

    private double balance;


    public Customer(String customerID, String name, String surname, double balance) {
        this.customerID = customerID;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }


    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void showCustomerInfo() {

        System.out.println("------Müþteri Bilgileri------");

        System.out.println("ID : " + customerID);
        System.out.println("Ýsim : " + name);
        System.out.println("Soyisim : " + surname);
        System.out.println("Bakiye : " + balance);

    }

    public boolean checkOut(double amount) {
        if (balance - amount < 0) {
            return false;
        } else
            return true;
    }

    public void withdrawMoney(double amount) {

        if (checkOut(amount)){
            System.out.println("Ýþleminiz yapiliyor...");
            balance -= amount;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Ýþleminiz baþarýlý. Yeni bakiye : " + balance);
        }else{
            System.out.println("Ýþleminiz yapýlýyor...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Bakiyeniz yeterli degil.");

        }

    }


    public void depositMoney(double amount) {
        System.out.println("Ýþleminiz yapiliyor...");

        balance += amount;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Ýþleminiz baþarýlý. Yeni bakiye : " + balance);


    }


}
