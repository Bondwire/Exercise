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

