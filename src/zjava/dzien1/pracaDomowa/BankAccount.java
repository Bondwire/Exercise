package zjava.dzien1.pracaDomowa;

public class BankAccount {
    private int number;
    private int cash = 0;


    public BankAccount(int number) {
        this.number = number;
    }

    Integer getcash() {
        return cash;
    }

    Integer getnumber() {
        return number;
    }

    int PodajNumerKonta () {
        return 437543;
    }

    void depositCash(int amount) {
        if (amount > 0)
            System.out.println("stan konta większy od zera");
        this.cash += amount;
    }
    void withdrawCash (int amount) {
        if (cash > amount);
        this.cash -= amount;
    }

    public static void main(String[] args) {
        BankAccount[] BankAccount = new BankAccount[0];

    }
}
//package zjava.inneZadania.BankKonto;
//
//public class BankKonto {
//    private int number;
//    private double cash;
//
//    BankKonto(double amount) {
//        this.cash = amount;
//    }
//
//    double getCash() {
//        return cash;
//    }
//
//    void depositCash(double amount) {
//        this.cash = cash + amount;
//    }
//
//    double withdrawCash(double amount) {
//        double value = 0;
//        if (amount < 0)
//            if (cash > amount) {
//                cash = cash - amount;
//                value = amount;
//            } else {
//                value = cash;
//                cash = 0;
//            }
//        return value;
//    }
//
//    String printInfo() {
//        return "Nr konta:" + number + "środki na koncie zostały pobrane" + cash;
//    }
//}
