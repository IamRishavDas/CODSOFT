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

public class ATM_Interface extends JFrame implements ActionListener{
    private static ATM_Interface atm_interface = new ATM_Interface();
    public  static ATM_Interface getAtm_Interface(){
        return ATM_Interface.atm_interface;
    }

    private JLabel label1;
    private JLabel label2;
    private JLabel message;
    private JTextField cardNo;
    private JPasswordField cardPin;
    private JButton login;
    private Container container;
    private Font font = new Font("Arial", Font.BOLD, 16);


    private ATM_Interface(){
        init();
        this.setLayout(null);
        this.setTitle("ATM Interface");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(600, 450);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void init(){
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
        
        message = new JLabel("message");
        message.setBounds(100, 225, 100, 30);
        message.setFont(new Font("Calibri", Font.PLAIN, 15));
        this.add(message);

        login = new JButton("Log In");
        login.setBounds(100, 260, 100, 30);
        login.setFont(new Font("Calibri", Font.BOLD, 16));
        login.addActionListener(this);
        this.add(login);
    }

    public void setMessage(String message){
        this.message.setText(message);
    }

    public void setMessageColorRed(){
        this.message.setForeground(Color.RED);
    }

    public void setMessageColorGreen(){
        this.message.setForeground(Color.GREEN);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login){
            new Account();
        }
    }

}