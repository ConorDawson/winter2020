package Winter2020;

public  class SavingsAccount extends BankAccount implements InterestRate {

    String type;

    double taxRate;




    public  SavingsAccount(String owner, int number, double balance, double taxRate){
        super(owner, number, balance);
        type= "Savings";
        setTaxRate(taxRate);

    }



    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }



    public double getTaxRate() {
        return taxRate;
    }

    @Override
    public String toString() {
        return "Account Type: "+ type+"\nTax Rate: "+getTaxRate()+ "\n"+super.toString()+"\nThe interest on this account is: €"+getBalance()*0.15+"\n"+"\n";
    }


}
