package Winter2020;

public  class BankAccount {

    String owner;
    int number;
    double balance;




    public  BankAccount(String owner, int number, double balance){
        setOwner(owner);
        setNumber(number);
        setBalance(balance);

    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }


    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return"The account owner is: "+ getOwner()+"\nThe account number is: "+ getNumber()+ "The balanance is: €"+getBalance();
    }
}


