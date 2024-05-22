package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;

    String formno;
    SignUp3(String formno)
    {
        this.formno=formno;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank2.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(30,5,100,100);
        add(image);

        JLabel l1=new JLabel("Page 3");
        l1.setBounds(700,10,400,40);
        l1.setFont(new Font("Relaway",Font.BOLD,20));
        add(l1);

        JLabel l2=new JLabel("Account details:");
        l2.setBounds(30,100,400,40);
        l2.setFont(new Font("Relaway",Font.BOLD,25));
        add(l2);

        JLabel l3=new JLabel("Account Type:");
        l3.setBounds(30,160,150,40);
        l3.setFont(new Font("Relaway",Font.BOLD,15));
        add(l3);

        r1=new JRadioButton("Saving Acc");
        r1.setBounds(150,160,130,40);
        r1.setFont(new Font("Relaway",Font.BOLD,15));
        r1.setBackground(new Color(243, 221, 110, 255));
        add(r1);

        r2=new JRadioButton("Fixed deposit Acc");
        r2.setBounds(300,160,200,40);
        r2.setFont(new Font("Relaway",Font.BOLD,15));
        r2.setBackground(new Color(243, 221, 110, 255));
        add(r2);

        r3=new JRadioButton("Current Acc");
        r3.setBounds(150,200,150,40);
        r3.setFont(new Font("Relaway",Font.BOLD,15));
        r3.setBackground(new Color(243, 221, 110, 255));
        add(r3);

        r4=new JRadioButton("Recurring deposit Acc");
        r4.setBounds(300,200,200,40);
        r4.setFont(new Font("Relaway",Font.BOLD,15));
        r4.setBackground(new Color(243, 221, 110, 255));
        add(r4);

        JLabel l4=new JLabel("Card No:");
        l4.setBounds(30,250,150,40);
        l4.setFont(new Font("Relaway",Font.BOLD,15));
        add(l4);

        JLabel l5=new JLabel("(Your 16-digit No)");
        l5.setBounds(30,270,150,40);
        l5.setFont(new Font("Relaway",Font.BOLD,13));
        add(l5);

        JLabel l6=new JLabel("XXXX-XXXX-XXXX-7072");
        l6.setBounds(160,250,200,40);
        l6.setFont(new Font("Relaway",Font.BOLD,15));
        add(l6);

        JLabel l7=new JLabel("(It would appear on atm card )");
        l7.setBounds(160,270,600,40);
        l7.setFont(new Font("Relaway",Font.BOLD,15));
        add(l7);

        JLabel l8=new JLabel("PIN: ");
        l8.setBounds(30,300,150,40);
        l8.setFont(new Font("Relaway",Font.BOLD,15));
        add(l8);

        JLabel l9=new JLabel("XXXX");
        l9.setBounds(160,300,150,40);
        l9.setFont(new Font("Relaway",Font.BOLD,15));
        add(l9);

        JLabel l10=new JLabel("(4-digit password)");
        l10.setBounds(30,320,150,40);
        l10.setFont(new Font("Relaway",Font.BOLD,13));
        add(l10);

        JLabel l11=new JLabel("Service required:");
        l11.setBounds(30,350,150,40);
        l11.setFont(new Font("Relaway",Font.BOLD,15));
        add(l11);

        c1= new JCheckBox("ATM card");
        c1.setBackground(new Color(243, 221, 110, 255));
        c1.setFont(new Font("Relaway",Font.BOLD,15));
        c1.setBounds(200,350,150,40);
        add(c1);

        c2= new JCheckBox("Internet Banking");
        c2.setBackground(new Color(243, 221, 110, 255));
        c2.setFont(new Font("Relaway",Font.BOLD,15));
        c2.setBounds(400,350,150,40);
        add(c2);

        c3= new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(243, 221, 110, 255));
        c3.setFont(new Font("Relaway",Font.BOLD,15));
        c3.setBounds(200,380,150,40);
        add(c3);

        c4= new JCheckBox("Email Alert");
        c4.setBackground(new Color(243, 221, 110, 255));
        c4.setFont(new Font("Relaway",Font.BOLD,15));
        c4.setBounds(400,380,150,40);
        add(c4);

        c5= new JCheckBox("Cheque");
        c5.setBackground(new Color(243, 221, 110, 255));
        c5.setFont(new Font("Relaway",Font.BOLD,15));
        c5.setBounds(200,410,150,40);
        add(c5);

        c6= new JCheckBox("E-Statement");
        c6.setBackground(new Color(243, 221, 110, 255));
        c6.setFont(new Font("Relaway",Font.BOLD,15));
        c6.setBounds(400,410,150,40);
        add(c6);

        JCheckBox c7=new JCheckBox("I here declares that the above entered details are correct");
        c7.setBackground(new Color(243, 221, 110, 255));
        c7.setFont(new Font("Relaway",Font.BOLD,15));
        c7.setBounds(50,450,500,40);
        add(c7);

        s=new JButton("Submit");
        s.setFont(new Font("Relaway",Font.BOLD,15));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(280,500,100,30);
        s.addActionListener(this);
        add(s);

        c=new JButton("Cancel");
        c.setFont(new Font("Relaway",Font.BOLD,15));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(150,500,100,30);
        c.addActionListener(this);
        add(c);




        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        getContentPane().setBackground(new Color(243, 221, 110, 255));
        setSize(800,650);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
          String atype=null;
          if(r1.isSelected())
          {
              atype="Saving Acc";
          }
          else if(r2.isSelected())
          {
              atype="Fixed deposit Acc";
          }
          else if(r3.isSelected())
          {
              atype="Current Acc";
          }
          else if(r4.isSelected())
          {
              atype="Recurring deposit Acc";
          }

           Random ran=new Random();
           long first7=(ran.nextLong() % 90000000L) + 1409963000000000L;
           String cardno=""+Math.abs(first7);

           long first3=(ran.nextLong() % 9000L)+1000L;
           String pin=""+Math.abs(first3);

           String fac="";
           if(c1.isSelected())
           {
               fac=fac+"ATM card";
           }
           else if(c2.isSelected())
           {
               fac=fac+"Internet Banking";
           }
           else if(c3.isSelected())
           {
               fac=fac+"Mobile Banking";
           }
           else if(c4.isSelected())
           {
               fac=fac+"Email Alert";
           }
           else if(c5.isSelected())
           {
               fac=fac+"Cheque";
           }
           else if(c6.isSelected())
           {
               fac=fac+"E-Statement";
           }

           try{

               if(e.getSource()==s)
               {
                   if(atype.equals("igikv"))
                   {
                       JOptionPane.showMessageDialog(null,"Fill all the fields");
                   }
                   else
                   {
                       Con c1=new Con();
                       String q1="insert in Signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                       String q2="insert in login values('"+formno+"','"+cardno+"','"+pin+"')";
                       c1.statement.executeUpdate("insert in Signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')");
                       c1.statement.executeUpdate("insert in login values('"+formno+"','"+cardno+"','"+pin+"')");
                       new Deposit(pin);
                       JOptionPane.showMessageDialog(null,"Card Number: "+cardno+"\n Pin: "+pin);
                       setVisible(false);
                   }
               }
               else if(e.getSource()==c)
               {
                   System.exit(0);
               }

           }catch (Exception E)
           {
               E.printStackTrace();
           }
    }


    public static void main(String[] args) {
        new SignUp3(" ");
    }
}
