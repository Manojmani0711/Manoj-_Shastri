package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField2;
    JButton button1,button2,button3;
    Login()
    {
        super("BANK MANAGEMENT SYSTEM");   // super is always at top in the constructor

//        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank2.png"));
//        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
//        ImageIcon i3=new ImageIcon(i2);
//        JLabel image=new JLabel(i3);
//        image.setBounds(380,10,100,100);
//        add(image);
//
//        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icons/cards.jpg"));
//        Image ii2= ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
//        ImageIcon ii3=new ImageIcon(ii2);
//        JLabel image1=new JLabel(ii3);
//        image1.setBounds(630,350,100,100);
//        add(image1);




        label1=new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("AvantGarde",Font.BOLD,30));
        label1.setBounds(290,30,550,100);
        add(label1);

        label2=new JLabel("Card No:");
        label2.setFont(new Font("Ralway",Font.BOLD,20));
        label2.setForeground(Color.BLACK);
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2=new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,20));
        add(textField2);


        label3=new JLabel("PIN: ");
        label3.setFont(new Font("Ralway",Font.BOLD,20));
        label3.setForeground(Color.BLACK);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField2=new JPasswordField(15);
        passwordField2.setBounds(325,250,230,30);
        passwordField2.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField2);

        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(450,300,100,30);
        button2.addActionListener(this);
        add(button2);


        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(310,350,230,30);

        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icons/backbg.jpg"));
        Image iii2= iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel image2=new JLabel(iii3);
        image2.setBounds(0,0,850,450);
        add(image2);

        button2.addActionListener(this);
        add(button3);

        setLayout(null);
        setSize(850 , 480);
        setLocation(450, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      try{
         if(e.getSource()==button1)
         {
             new SignUp();
             setVisible(true);

         }
         else if (e.getSource()==button2)
         {
             textField2.setText("");
             passwordField2.setText("");
         }
         else if (e.getSource()==button3)
         {

             new SignUp();
             setVisible(true);

         }
      }catch (Exception E)
      {
          E.printStackTrace();
      }
    }

    public static void main(String[] args) {
         new Login();
    }
}
