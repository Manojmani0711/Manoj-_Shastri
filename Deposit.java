package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.jar.JarEntry;

public class Deposit extends JFrame implements ActionListener {

    String pin;
    TextField textField;
    JButton b1,b2;
    Deposit(String pin)
    {

        this.pin=pin;

        ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/atm2.jpg"));
        Image i=im.getImage().getScaledInstance(700,1000, Image.SCALE_DEFAULT);
        ImageIcon i1=new ImageIcon(i);
        JLabel l1=new JLabel(i1);
        l1.setBounds(230,0,1000,700);
        add(l1);

        JLabel label1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.BLACK);
        label1.setBounds(340,150,350,15);
        label1.setFont(new Font("Relaway",Font.BOLD,15));
        l1.add(label1);

        textField=new TextField();
        textField.setBounds(380,180,200,25);
        textField.setFont(new Font("Ralaway",Font.BOLD,20));
        l1.add(textField);

        b1=new JButton("Deposit");
        b1.setBounds(650,210,80,15);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        l1.add(b1);

        b2=new JButton("Back");
        b2.setBounds(650,240,80,15);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        l1.add(b2);

        setLayout(null);
        setSize(1550,1580);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
            String amount= textField.getText();
            Date date=new Date();
            if(e.getSource()==b1)
            {
                if(textField.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please enter amount you want to deposit");
                }
                else {
                    Con con=new Con();
                    con.statement.executeUpdate("insert into deposit values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposit successfully");
                    setVisible(false);
                }
            }
            else if(e.getSource()==b2)
            {
                setVisible(false);
            }
        }catch (Exception Exx)
        {
            Exx.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
