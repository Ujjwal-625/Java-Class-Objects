class Bank{
    int acountNumber,balance;
    String acountHolder;

    Bank(String acountHolder,int acountNumber,int balance){
        this.acountNumber=acountNumber;
        this.acountHolder=acountHolder;
        this.balance=balance;
    }
    void displayBalance(){
        System.out.println("Balance in Account with Acount number "+acountNumber +" is "+balance);
    }

    void depositBalance(int balance){
        this.balance+=balance;
    }
    void withdrawBalance(int balance){
        if(balance>this.balance){
            System.out.println("Not enough balance in your account");
            return ;
        }
        this.balance-=balance;
    }
    public static void main(String[] args) {

        Bank b1=new Bank("ABC",8980808,89076);

        b1.displayBalance();

        b1.depositBalance(109);

        b1.displayBalance();

        b1.withdrawBalance(109);

        b1.displayBalance();

        b1.withdrawBalance(1000000);

    }
}