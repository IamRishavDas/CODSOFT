package app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Account extends JFrame implements ActionListener {

    private JLabel messageLabel;

    private JButton deposit;
    private JButton withdraw;
    private JButton checkBalance;
    private JButton logout;

    private static int cardNo;

    public Account(String accountHolderName, int enteredCardNo) {
        init();
        cardNo = enteredCardNo;
        this.setTitle(accountHolderName);
        this.setLayout(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(310, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public void resetMessageLabel(){
        messageLabel.setText("");
    }

    private void init() {

        messageLabel = new JLabel("");
        messageLabel.setBounds(50, 10, 300, 30);
        messageLabel.setForeground(Color.RED);
        this.add(messageLabel);


        deposit = new JButton("Deposit");
        deposit.setBounds(50, 50, 200, 30);
        deposit.addActionListener(this);
        this.add(deposit);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(50, 100, 200, 30);
        withdraw.addActionListener(this);
        this.add(withdraw);

        checkBalance = new JButton("Check Balance");
        checkBalance.setBounds(50, 150, 200, 30);
        checkBalance.addActionListener(this);
        this.add(checkBalance);

        logout = new JButton("Logout");
        logout.setBounds(50, 200, 200, 30);
        logout.addActionListener(this);
        this.add(logout);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logout) {
            this.dispose();
        } 
        
        
        else if (e.getSource() == deposit) {
            resetMessageLabel();
            try {
                int depostiAmount = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the deposit amount: ", "Deposit", JOptionPane.QUESTION_MESSAGE));
                DatabaseConnection.deposit(cardNo, depostiAmount);
            } catch (NumberFormatException numberFormatException) {
                messageLabel.setText("Enter a valid number!");
                return;
            }
        } 
        
        
        else if (e.getSource() == withdraw) {
            resetMessageLabel();
            try {
                int withdrawAmount = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the withdraw amount: ", "Withdraw", JOptionPane.QUESTION_MESSAGE));
                DatabaseConnection.withdraw(cardNo, withdrawAmount);
            } catch (NumberFormatException numberFormatException) {
                messageLabel.setText("Enter a valid number!");
                return;
            }
        }
        
        
        else if (e.getSource() == checkBalance) {
            resetMessageLabel();
            JOptionPane.showMessageDialog(this, "Balance is: " + DatabaseConnection
                    .getAccountBalance("select account_balance from atm.account_info where card_no = " + cardNo), "Balance Enquery", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
