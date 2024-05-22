package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {

    JTextField textName,textFatherName,textEmail,textStatus,textAddress,textCity,textPin,textState;
    JDateChooser dateChooser;    //import jarfile
    Random ran=new Random();
    long first4=(ran.nextLong() % 9000L) + 1000L;

    String first=" "+Math.abs(first4);
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    SignUp()
    {
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.jpg"));
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO:"+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,20));
        add(label1);

        JLabel label2=new JLabel("Page No:1");
        label2.setBounds(600,10,500,30);
        label2.setFont(new Font("Raleway",Font.BOLD,10));
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setBounds(160,50,600,40);
        label3.setFont(new Font("Raleway",Font.BOLD,20));
        add(label3);

        JLabel labelName=new JLabel("NAME:");
        labelName.setFont(new Font("Raleway",Font.BOLD,15));
        labelName.setBounds(30,120,600,40);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Releway",Font.PLAIN,15));
        textName.setBounds(180,130,400,23);
        add(textName);

        JLabel labelFatherName=new JLabel("FATHERNAME:");
        labelFatherName.setFont(new Font("Raleway",Font.BOLD,15));
        labelFatherName.setBounds(30,150,600,40);
        add(labelFatherName);

        textFatherName=new JTextField();
        textFatherName.setFont(new Font("Releway",Font.PLAIN,15));
        textFatherName.setBounds(180,160,400,23);
        add(textFatherName);

        JLabel DOB=new JLabel("DATE OF BIRTH:");
        DOB.setFont(new Font("Raleway",Font.BOLD,15));
        DOB.setBounds(30,180,600,40);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(61, 75, 86, 255));
        dateChooser.setBounds(180,190,400,23);
        add(dateChooser);

        JLabel gender=new JLabel("GENDER:");
        gender.setFont(new Font("Raleway",Font.BOLD,15));
        gender.setBounds(30,210,600,40);
        add(gender);

        r1=new JRadioButton("M");
        r1.setFont(new Font("Raleway",Font.PLAIN,15));
        r1.setBackground(new Color(194, 253, 218, 179));
        r1.setBounds(180,220,50,30);
        add(r1);

        r2=new JRadioButton("F");
        r2.setFont(new Font("Raleway",Font.PLAIN,15));
        r2.setBackground(new Color(194, 253, 218, 179));
        r2.setBounds(290,220,50,30);
        add(r2);

        JLabel Email=new JLabel("Email address:");
        Email.setFont(new Font("Raleway",Font.BOLD,15));
        Email.setBounds(30,240,600,40);
        add(Email);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Releway",Font.PLAIN,15));
        textEmail.setBounds(180,250,400,23);
        add(textEmail);

        JLabel status=new JLabel("Marital status:");
        status.setFont(new Font("Raleway",Font.BOLD,15));
        status.setBounds(30,270,600,40);
        add(status);

        m1=new JRadioButton("married");
        m1.setBounds(180,280,80,23);
        m1.setFont(new Font("Raleway",Font.PLAIN,15));
        m1.setBackground(new Color(194, 253, 218, 179));
        add(m1);

        m2=new JRadioButton("unmarried");
        m2.setBounds(270,280,100,23);
        m2.setFont(new Font("Raleway",Font.PLAIN,15));
        m2.setBackground(new Color(194, 253, 218, 179));
        add(m2);

        m3=new JRadioButton("Other");
        m3.setBounds(380,280,70,23);
        m3.setFont(new Font("Raleway",Font.PLAIN,15));
        m3.setBackground(new Color(194, 253, 218, 179));
        add(m3);

//        textStatus=new JTextField();
//        textStatus.setFont(new Font("Releway",Font.PLAIN,20));
//        textStatus.setBounds(180,280,400,23);
//        add(textStatus);

        JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,15));
        address.setBounds(30,300,600,40);
        add(address);

        textAddress=new JTextField();
        textAddress.setFont(new Font("Releway",Font.PLAIN,15));
        textAddress.setBounds(180,310,400,23);
        add(textAddress);

        JLabel city=new JLabel("CITY:");
        city.setFont(new Font("Raleway",Font.BOLD,15));
        city.setBounds(30,330,600,40);
        add(city);

        textCity=new JTextField();
        textCity.setFont(new Font("Releway",Font.PLAIN,15));
        textCity.setBounds(180,340,400,23);
        add(textCity);

        JLabel pin=new JLabel("PIN CODE:");
        pin.setFont(new Font("Raleway",Font.BOLD,15));
        pin.setBounds(30,360,600,40);
        add(pin);

        textPin=new JTextField();
        textPin.setFont(new Font("Releway",Font.PLAIN,15));
        textPin.setBounds(180,370,400,23);
        add(textPin);

        JLabel state=new JLabel("STATE:");
        state.setFont(new Font("Raleway",Font.BOLD,15));
        state.setBounds(30,390,600,40);
        add(state);

        textState=new JTextField();
        textState.setFont(new Font("Releway",Font.PLAIN,15));
        textState.setBounds(180,400,400,23);
        add(textState);

        next=new JButton("NEXT"); 
        next.setFont(new Font("Raleway",Font.PLAIN,15));
        next.setBackground(new Color(6, 10, 10, 255));
        next.setForeground(Color.WHITE);
        next.setBounds(500,450,80,30);
        next.addActionListener(this);
        add(next);


        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        ButtonGroup buttongroup=new ButtonGroup();
        buttongroup.add(r1);
        buttongroup.add(r2);



        getContentPane().setBackground(new Color(194, 253, 218, 179));
        setLayout(null);
        setSize(750,580);
        setLocation(450,200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno=first;
        String name=textName.getName();
        String Fname=textFatherName.getName();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected())
        {
            gender="male";
        }
        else if(r2.isSelected())
        {
            gender="Female";
        }
        String email=textEmail.getText();
        String marital=null;
        if(m1.isSelected())
        {
            marital="married";
        }
        else if(m2.isSelected())
        {
            marital="unmarried";
        }
        else if(m3.isSelected()){
            marital="Other";
        }

        String city=textCity.getText();
        String address=textAddress.getText();
        String pincode=textPin.getText();
        String state=textState.getText();

        try{

            if(textName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }

            else
            {
                Con con1=new Con();

                String q="insert into sighup values('"+formno+"', '"+name+"', '"+Fname+"', '"+dob+"', '"+gender+"', '"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";

                String sql = "insert into sighup values('" + formno + "', '" + name + "', '" + Fname + "', '" + dob + "', '" + gender + "', '" + email + "','" + marital + "','" + address + "','" + city + "','" + pincode + "','" + state + "')";
                int executedUpdate = con1.statement.executeUpdate(sql);
                new SignUp2("");
                setVisible(false);
            }
        }

        catch (Exception E)

        {
            E.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
         new SignUp();
    }

}
