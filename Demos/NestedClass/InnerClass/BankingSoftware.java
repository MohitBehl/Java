package Demos.NestedClass.InnerClass;

public class BankingSoftware {
    String name;
    private BankUser bankUser;
    private CreditCard creditCard;
    private DebitCard debitCard;
    private BankAccount bankAccount;

    BankingSoftware(String name){
        this.name = name;
        this.bankUser = new BankUser();
        this.creditCard = new CreditCard();
        this.debitCard = new DebitCard();
        this.bankAccount = new BankAccount();
    }

    public void issueDebitCard(){
        debitCard.issueCard();
    }

    private class BankUser{
        String name;
        int age;
    }

    class ATM{
        void getCash(){
            System.out.println("Taking cash out from ATM using banking soft. : "+name);
        }
    }

    private class CreditCard{

    }

    private  class DebitCard{
        void issueCard(){
            System.out.println("Debit card is issued by Banking Software");
        }
    }

    private class BankAccount{
        void createBankAccount(){
            System.out.println("creating bank account");
        }
    }
}

class BankingSoftwareClient{
    public static void main(String[] args) {
        BankingSoftware s1 = new BankingSoftware("axel");
        BankingSoftware.ATM obj = s1.new ATM();
        obj.getCash();
        s1.issueDebitCard();
    }
}
