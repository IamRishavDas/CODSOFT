package app;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ATM_Interface extends JFrame implements ActionListener {
    private static ATM_Interface atm_interface = new ATM_Interface();

    public static ATM_Interface getAtm_Interface() {
        return ATM_Interface.atm_interface;
    }

    private JLabel label1;
    private JLabel label2;
    private JLabel message;
    private JTextField cardNo;
    private JPasswordField cardPin;
    private JButton login;
    private JButton logout;
    private Container container;
    private Font font = new Font("Arial", Font.BOLD, 16);

    private ATM_Interface() {
        init();
        this.setLayout(null);
        this.setTitle("ATM Interface");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(600, 450);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void init() {
        container = this.getContentPane();
        container.setBackground(Color.LIGHT_GRAY);

        label1 = new JLabel("Enter the Card No: ");
        label1.setBounds(100, 100, 300, 30);
        label1.setFont(font);
        this.add(label1);

        cardNo = new JTextField();
        cardNo.setBounds(100, 130, 300, 30);
        cardNo.setFont(font);
        this.add(cardNo);

        label2 = new JLabel("Enter the Pin  No: ");
        label2.setBounds(100, 160, 300, 30);
        label2.setFont(font);
        this.add(label2);

        cardPin = new JPasswordField();
        cardPin.setBounds(100, 190, 300, 30);
        cardPin.setFont(font);
        this.add(cardPin);

        message = new JLabel("");
        message.setBounds(100, 225, 400, 30);
        message.setFont(new Font("Calibri", Font.BOLD, 15));
        this.add(message);

        login = new JButton("Log In");
        login.setBounds(100, 260, 100, 30);
        login.setFont(new Font("Calibri", Font.BOLD, 16));
        login.addActionListener(this);
        this.add(login);

        logout = new JButton("Logout");
        logout.setBounds(300, 260, 100, 30);
        logout.setFont(new Font("Calibri", Font.BOLD, 16));
        logout.addActionListener(this);
        this.add(logout);
    }

    public void setMessageText(String message) {
        this.message.setText(message);
    }

    public void setMessageColorRed() {
        this.message.setForeground(Color.RED);
    }

    public void setMessageColorDefault() {
        this.message.setForeground(Color.BLACK);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            try {
                int pin = DatabaseConnection.getCardPinIfExists(
                        "select card_pin from atm.card_info where card_no = " + Integer.parseInt(cardNo.getText()));
                if (pin == Integer.parseInt(String.valueOf(cardPin.getPassword()))) {
                    new Account(DatabaseConnection.getAccountHolderNameIfExists(
                            "select account_holder_name from atm.account_info where card_no = "
                                    + Integer.parseInt(cardNo.getText())), Integer.parseInt(cardNo.getText()));
                    setMessageText("");
                } else /*if (pin == Integer.MIN_VALUE)*/ {
                    setMessageColorRed();
                    setMessageText("Wrong card no or password!!");
                }
            } catch (NumberFormatException ex) {
                setMessageColorRed();
                message.setText("Enter valid credentials!");
            }

        } else if (e.getSource() == logout) {
            cardNo.setText("");
            cardPin.setText("");
            setMessageText("");
            setMessageColorDefault();
        }
    }

}