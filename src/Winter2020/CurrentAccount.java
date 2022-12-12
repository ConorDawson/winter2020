package Winter2020;

public class CurrentAccount extends BankAccount {

    String type;
    boolean chequeBook;




    public  CurrentAccount(String owner, int number, double balance , boolean chequeBook){
        super(owner, number, balance);
        type ="Current";
        setChequeBook(chequeBook);

    }



    public void setChequeBook(boolean chequeBook) {
        this.chequeBook = chequeBook;
    }


    public boolean getChequeBook() {
        return chequeBook;
    }

    @Override
    public String toString() {
        return "Account Type: "+type+"\nCheque Book: "+getChequeBook()+"\n"+ super.toString()+"\nThe tax on this account is: €"+getBalance()*0.15+"\n"+"\n";
    }
}
