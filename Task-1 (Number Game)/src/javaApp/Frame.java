package javaApp;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener{
    private JLabel label1;
    private JLabel label2;
    private JLabel message;
    private JTextField text;
    private JButton submit;
    private JButton restart;
    private Font font = new Font(Font.SANS_SERIF, Font.BOLD, 18);

    private static Frame frame = new Frame();

    public static Frame getFrame(){
        return frame;
    }

    public String getText(){
        return this.text.getText();
    }

    public void setMessage(String message){
        this.message.setText(message);
    }

    public void setMessageColorToRed(){
        this.message.setForeground(Color.RED);
    }

    private Frame(){
        this.setTitle("Number Game");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        label1 = new JLabel("Welcome to the Number Game");
        label1.setBounds(150, 30, 300, 50);
        label1.setFont(new Font("Calibri (Body)", Font.BOLD, 20));
        this.add(label1);

        label2 = new JLabel("Enter a number between 1 to 100: ");
        label2.setBounds(30 + 80, 140, 300, 50);
        label2.setFont(font);
        this.add(label2);

        text = new JTextField();
        text.setBounds(350 + 80, 140 + 12, 60, 30);
        text.setFont(font);
        this.add(text);

        message = new JLabel();
        message.setBounds(30 + 110, 150 + 20, 400, 50);
        message.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
        this.add(message);

        submit = new JButton("Submit");
        submit.setBounds(200 - 30, 150 + 100, 100, 30);
        submit.setFont(new Font("Calibri (Body)", Font.BOLD, 20));
        submit.addActionListener(this);
        this.add(submit);

        restart = new JButton("restart");
        restart.setBounds(350 - 20, 150 + 100, 100, 30);
        restart.setFont(new Font("Calibri (Body)", Font.BOLD, 20));
        restart.addActionListener(this);
        this.add(restart);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit)
            GameLogic.checkForWin(getText());
        else if(e.getSource() == restart){
            setMessage("");
            text.setText("");
        }
    }
}
