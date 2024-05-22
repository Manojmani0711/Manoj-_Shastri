package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {

    String formno;
    TextField textpan,textaadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    JComboBox comboBox,comboBox1,comboBox2,comboBox3,comboBox4,comboBox5;
    SignUp2(String first)
    {
        super("APPLICATION FORM");

        String classLoader;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/backg2.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(380,5,100,100);
        add(image);

        this.formno=formno;

        JLabel l1=new JLabel("page No-2");
        l1.setFont(new Font("Raleway",Font.PLAIN,15));
        l1.setBounds(750,60,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional details");
        l2.setFont(new Font("Raleway",Font.BOLD,15));
        l2.setBounds(350,130,200,30);
        add(l2);

        JLabel l3=new JLabel("Religion: ");
        l3.setFont(new Font("Raleway",Font.BOLD,15));
        l3.setBounds(80,185,100,30);
        add(l3);

        String[] religion={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(255, 255, 255, 255));
        comboBox.setFont(new Font("Raleway",Font.PLAIN,15));
        comboBox.setBounds(200,190,200,25);
        add(comboBox);

        JLabel l4=new JLabel("Category: ");
        l4.setFont(new Font("Raleway",Font.BOLD,15));
        l4.setBounds(80,220,200,30);
        add(l4);

        String[] category={"General","SC","ST","OBC","Other"};
        comboBox1=new JComboBox(category);
        comboBox1.setBackground(new Color(255, 255, 255, 255));
        comboBox1.setFont(new Font("Raleway",Font.PLAIN,15));
        comboBox1.setBounds(200,225,200,25);
        add(comboBox1);

        JLabel l5=new JLabel("Income: ");
        l5.setFont(new Font("Raleway",Font.BOLD,15));
        l5.setBounds(80,255,200,30);
        add(l5);

        String[] income={"null","<1,50,000","<2,50,000","10,00,000",">10,00,000"};
        comboBox2=new JComboBox(income);
        comboBox2.setBackground(new Color(255, 255, 255, 255));
        comboBox2.setFont(new Font("Raleway",Font.PLAIN,15));
        comboBox2.setBounds(200,260,200,25);
        add(comboBox2);

        JLabel l6=new JLabel("Educational: ");
        l6.setFont(new Font("Raleway",Font.BOLD,15));
        l6.setBounds(80,290,250,30);
        add(l6);

        String[] educational={"Non-Graduate","Graduate","Post-Graduate","Doctorate","Other"};
        comboBox3=new JComboBox(educational);
        comboBox3.setBackground(new Color(255, 255, 255, 255));
        comboBox3.setFont(new Font("Raleway",Font.PLAIN,15));
        comboBox3.setBounds(200,290,200,25);
        add(comboBox3);

        JLabel l7=new JLabel("Occupation: ");
        l7.setFont(new Font("Raleway",Font.BOLD,15));
        l7.setBounds(80,320,200,30);
        add(l7);

        String[] occupation={"Salaried","Self-Employee","Business","Student","Retired","Other"};
        comboBox4=new JComboBox(occupation);
        comboBox4.setBackground(new Color(255, 255, 255, 255));
        comboBox4.setFont(new Font("Raleway",Font.PLAIN,15));
        comboBox4.setBounds(200,320,200,25);
        add(comboBox4);

        JLabel l8=new JLabel("PAN N0: ");
        l8.setFont(new Font("Raleway",Font.BOLD,15));
        l8.setBounds(80,350,80,30);
        add(l8);

        textpan=new TextField();
        textpan.setFont(new Font("Raleway",Font.PLAIN,15));
        textpan.setBounds(200,350,200,20);
        add(textpan);

        JLabel l9=new JLabel("Aadhar No: ");
        l9.setFont(new Font("Raleway",Font.BOLD,15));
        l9.setBounds(80,380,90,30);
        add(l9);

        textaadhar=new TextField();
        textaadhar.setFont(new Font("Raleway",Font.PLAIN,15));
        textaadhar.setBounds(200,380,200,20);
        add(textaadhar);

        JLabel l10=new JLabel("Senior citizen: ");
        l10.setFont(new Font("Raleway",Font.BOLD,15));
        l10.setBounds(80,410,130,30);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.PLAIN,15));
        r1.setBackground(new Color(255, 255, 255, 255));
        r1.setBounds(200,415,55,20);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.PLAIN,15));
        r2.setBackground(new Color(255, 255, 255, 255));
        r2.setBounds(300,415,55,20);
        add(r2);

        JLabel l11=new JLabel("Existing Acc: ");
        l11.setFont(new Font("Raleway",Font.BOLD,15));
        l11.setBounds(80,440,130,30);
        add(l11);

        e1=new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.PLAIN,15));
        e1.setBackground(new Color(255, 255, 255, 255));
        e1.setBounds(200,445,60,20);
        add(e1);

        e2=new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.PLAIN,15));
        e2.setBackground(new Color(255, 255, 255, 255));
        e2.setBounds(300,445,60,20);
        add(e2);

//        JLabel l12=new JLabel("form No: ");
//        l12.setFont(new Font("Raleway",Font.BOLD,15));
//        l12.setBounds(80,440,130,30);
//        add(l12);
//
//        JLabel l13=new JLabel(formno);
//        l13.setFont(new Font("Raleway",Font.BOLD,15));
//        l13.setBounds(80,440,130,30);
//        add(l13);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,15));
        next.setBounds(400,500,130,30);
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setLocation(450,80);
        setSize(850,750);
        getContentPane().setBackground(new Color(255, 255, 255, 255));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel=(String) comboBox.getSelectedItem();
        String cate=(String) comboBox1.getSelectedItem();
        String inc=(String) comboBox2.getSelectedItem();
        String edu=(String) comboBox3.getSelectedItem();
        String occ=(String) comboBox4.getSelectedItem();

        String pan=textpan.getText();
        String aadhar=textaadhar.getText();

        String scitizen=" ";
        if((r1.isSelected()))
        {
            scitizen="Yes";
        }
        else if((r2.isSelected()))
        {
            scitizen="No";
        }

        String eAccount=" ";
        if((e1.isSelected()))
        {
            eAccount="Yes";
        }
        else if((e2.isSelected()))
        {
            scitizen="No";
        }
        try{
            if(textpan.getText().equals(" ") || textaadhar.getText().equals(" "))
            {
                JOptionPane.showMessageDialog(null,"Fill all the details");
            }
            else {
                Con c1=new Con();
                String q="insert into Signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+occ+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate("insert into Signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+occ+"','"+scitizen+"','"+eAccount+"')");
                new SignUp3(formno);
                setVisible(false);
            }

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }



    public static void main(String[] args) {
        new SignUp2("");
    }
}
