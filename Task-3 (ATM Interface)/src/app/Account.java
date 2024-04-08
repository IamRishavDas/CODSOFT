package app;


import javax.swing.JButton;
import javax.swing.JFrame;

public class Account extends JFrame{

    private JButton deposit;
    private JButton withdraw;
    private JButton checkBalance;
    private JButton logout;

    public Account(){
        init();
        this.setTitle("Account Holder Name");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void init(){
        deposit = new JButton("Deposit");
        deposit.setSize(200, 30);
        this.add(deposit);
        withdraw = new JButton("Withdraw");
        withdraw.setSize(200, 30);
        this.add(withdraw);
        checkBalance = new JButton("Check Balance");
        checkBalance.setSize(200, 30);
        this.add(checkBalance);
        logout = new JButton("Logout");
        logout.setSize(200, 30);
        this.add(logout);
    }

}
