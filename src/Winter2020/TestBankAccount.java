package Winter2020;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public  class TestBankAccount extends JFrame  {
   static ArrayList<BankAccount> bankaccounts = new ArrayList<BankAccount>();

    public static void main(String[] args) {


        BankAccount accountref;
        CurrentAccount current1 = new CurrentAccount("Isaac Newton", 52345532, 3757432.44 ,true);

        accountref= current1;
        bankaccounts.add(accountref);

        SavingsAccount saving1 = new SavingsAccount("Albert Einstein", 14256738, 203872.37, 0.04);
        accountref= saving1;
        bankaccounts.add(accountref);


        new TestBankAccount();



    }

    public TestBankAccount(){
        JFrame frame = new JFrame("My First GUI");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        JButton  add= new JButton("add");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addAccount();

            }
        });
        add.setSize(300,300);

        JButton view = new JButton("view");
        view.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String view="\n";
               for(int i=0; i< bankaccounts.size(); i++){

                   view+=bankaccounts.get(i)+"\n";
               }
              JOptionPane.showMessageDialog(null, view);


            }
        });
        view.setSize(300,300);

        JButton remove = new JButton("Remove");
        remove.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String iAsString = JOptionPane.showInputDialog("Please enter the index of the account you wish to remove");
                int i = Integer.parseInt(iAsString);
                bankaccounts.remove(i);
            }
        });

        JButton exit = new JButton("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exit.setSize(300,300);
        frame.getContentPane().add(add);
        frame.getContentPane().add(view);
        frame.getContentPane().add(remove);
        frame.getContentPane().add(exit);// Adds Button to content pane of frame
        frame.setVisible(true);



    }

    public void addAccount(){

        JFrame frame2 = new JFrame("My First GUI");
        frame2.setLayout(new FlowLayout());
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(1000,1000);
        JButton  current= new JButton("Current Account");
        current.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BankAccount accountref;
                String owner =JOptionPane.showInputDialog("The owner of the account");
                String accNumasString =JOptionPane.showInputDialog("The number of the account");
                String accBalanceasString =JOptionPane.showInputDialog("The balance of the account");
                String accChequeasString =JOptionPane.showInputDialog("Cheque True or False");
                int accNum = Integer.parseInt(accNumasString);
                double accBalance = Double.parseDouble(accBalanceasString);
                boolean accCheque = Boolean.parseBoolean(accChequeasString);
                CurrentAccount current1 = new CurrentAccount(owner, accNum,accBalance, accCheque);


                accountref= current1;
                bankaccounts.add(accountref);
                frame2.setVisible(false);
            }
        });
        JButton  savings= new JButton("Savings Account");
        savings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BankAccount accountref;
                String owner =JOptionPane.showInputDialog("The owner of the account");
                String accNumasString =JOptionPane.showInputDialog("The number of the account");
                String accBalanceasString =JOptionPane.showInputDialog("The balance of the account");
                String accTaxRateasString =JOptionPane.showInputDialog("Tax Rate");
                int accNum = Integer.parseInt(accNumasString);
                double accBalance = Double.parseDouble(accBalanceasString);
                double accTaxRate = Double.parseDouble(accTaxRateasString);
                SavingsAccount savings1 = new SavingsAccount(owner, accNum,accBalance, accTaxRate);


                accountref= savings1;
                bankaccounts.add(accountref);
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(current);
        frame2.getContentPane().add(savings);// Adds Button to content pane of frame
        frame2.setVisible(true);

    }




}
