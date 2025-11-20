package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

  JRadioButton r1,r2,m1,m2,m3;
  JButton next;

  JTextField textName, textFname, textEmail,textAdd,textCity,textPin,textState;
  JDateChooser dateChooser;

  Random ran = new Random();
  long first4 = (ran.nextLong() % 9000L) +1000L;
  String first = " " + Math.abs(first4);
  Signup(){
    super("APPLICATION FORM");

    ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
    Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(25,10,100,100);
    add(image);

    JLabel label1  = new JLabel("APPLICATION FORM NO."+this.first);
    label1.setBounds(160,20,600,40);
    label1.setFont(new Font("Ralway",Font.BOLD,26));
    add(label1);

    JLabel label2 = new JLabel("Page 1");
    label2.setFont(new Font("Ralway", 1, 22));
    label2.setBounds(330, 70, 600, 30);
    add(label2);

    JLabel label3 = new JLabel("Personal Details");
    label3.setFont(new Font("Raleway", 1, 22));
    label3.setBounds(290, 100, 600, 30);
    add(label3);
//Name
    JLabel labelName = new JLabel("Name :");
    labelName.setFont(new Font("Raleway", 1, 20));
    labelName.setBounds(100, 190, 100, 30);
    add(labelName);
    textName = new JTextField();
    textName.setFont(new Font("Raleway", 1, 14));
    textName.setBounds(300, 190, 400, 30);
    add(textName);
//Fathhers Name
    JLabel labelfName = new JLabel("Father's Name :");
    labelfName.setFont(new Font("Raleway", 1, 20));
    labelfName.setBounds(100, 240, 200, 30);
    this.add(labelfName);
    this.textFname = new JTextField();
    this.textFname.setFont(new Font("Raleway", 1, 14));
    this.textFname.setBounds(300, 240, 400, 30);
    this.add(this.textFname);
//DOB
    JLabel DOB = new JLabel("Date of Birth");
    DOB.setFont(new Font("Raleway", Font.BOLD, 20));
    DOB.setBounds(100, 340, 200, 30);
    add(DOB);
//Date chooser
    dateChooser = new JDateChooser();
    dateChooser.setForeground(new Color(105,105,105));
    dateChooser.setBounds(300,340,400,30);
    add(dateChooser);

    JLabel labelG = new JLabel("Gender:");
    labelG.setFont(new Font("Raleway", 1, 20));
    labelG.setBounds(100, 290, 200, 30);
    add(labelG);

//Radioo Buttons
    this.r1 = new JRadioButton("Male");
    this.r1.setFont(new Font("Raleway", 1, 14));
    this.r1.setBackground(new Color(225, 255, 226));
    this.r1.setBounds(300, 290, 80, 30);
    this.add(this.r1);

    this.r2 = new JRadioButton("Female");
    this.r2.setFont(new Font("Raleway", 1, 14));
    this.r2.setBackground(new Color(225, 255, 226));
    this.r2.setBounds(400, 290, 100, 30);
    this.add(this.r2);

    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(r1);
    buttonGroup.add(r2);

    //Email
    JLabel labelEmail = new JLabel("Email Address:");
    labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
    labelEmail.setBounds(100,390,200,30);
    add(labelEmail);
    textEmail = new JTextField();
    textEmail.setFont(new Font("Raleway", 1, 14));
    textEmail.setBounds(300, 390, 400, 30);
    add(textEmail);

//Marital Status
    JLabel labelMs = new JLabel("Marital Status:");
    labelMs.setFont(new Font("Raleway", 1, 20));
    labelMs.setBounds(100, 440, 200, 30);
    add(labelMs);

    m1 = new JRadioButton("Married");
    m1.setBounds(300,440,100,30);
    m1.setBackground(new Color(225, 255, 226));
    m1.setFont(new Font("Raleway",Font.BOLD,14));
    add(m1);

    m2 = new JRadioButton("UnMarried");
    m2.setBounds(450,440,100,30);
    m2.setBackground(new Color(225, 255, 226));
    m2.setFont(new Font("Raleway",Font.BOLD,14));
    add(m2);

    m3 = new JRadioButton("Other");
    m3.setBounds(635,440,100,30);
    m3.setBackground(new Color(225, 255, 226));
    m3.setFont(new Font("Raleway",Font.BOLD,14));
    add(m3);

    ButtonGroup buttonGroup1 = new ButtonGroup();
    buttonGroup1.add(m1);
    buttonGroup1.add(m2);
    buttonGroup1.add(m3);
//Addresss
    JLabel labelAdd = new JLabel("Address:");
    labelAdd.setFont(new Font("Raleway", 1, 20));
    labelAdd.setBounds(100, 490, 200, 30);
    add(labelAdd);
    textAdd =  new JTextField();
    textAdd.setFont(new Font("Raleway", 1, 14));
    textAdd.setBounds(300, 490, 400, 30);
    add(textAdd);

//City
    JLabel labelC = new JLabel("City:");
    labelC.setFont(new Font("Raleway", 1, 20));
    labelC.setBounds(100, 540, 200, 30);
    add(labelC);
    textCity =  new JTextField();
    textCity.setFont(new Font("Raleway", 1, 14));
    textCity.setBounds(300, 540, 400, 30);
    add(textCity);

//Pin Code
    JLabel labelPC = new JLabel("Pin Code:");
    labelPC.setFont(new Font("Raleway", 1, 20));
    labelPC.setBounds(100, 590, 200, 30);
    add(labelPC);
    textPin =  new JTextField();
    textPin.setFont(new Font("Raleway", 1, 14));
    textPin.setBounds(300, 590, 400, 30);
    add(textPin);

//State
    JLabel labelState = new JLabel("State:");
    labelState.setFont(new Font("Raleway", 1, 20));
    labelState.setBounds(100, 640, 200, 30);
    add(labelState);
    textState =  new JTextField();
    textState.setFont(new Font("Raleway", 1, 14));
    textState.setBounds(300, 640, 400, 30);
    add(textState);

//next Button
    next = new JButton("Next");
    next.setFont(new Font("Raleway", 1, 14));
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setBounds(620, 710, 80, 30);
    next.addActionListener(this);
    add(next);
    getContentPane().setBackground(new Color(225, 255, 226));  // Misty Rose
    setLayout(null);
    setSize(850,800);
    setLocation(360,40);
    setUndecorated(true);
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
      String formno  = first;
      String name = textName.getText();
      String fname = textFname.getText();
      String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
      String gender = null;
      if (r1.isSelected())
      {
        gender="Male";

      } else if (r2.isSelected()) {
        gender="Female";
      }
      String email = textEmail.getText();
      String martial = null;
      if (m1.isSelected()){
        martial = "Married";
      }else if(m2.isSelected()){
        martial = "Unmarried";
      } else if (m3.isSelected()) {
        martial = "Other";
      }
      String address = textAdd.getText();
      String city = textCity.getText();
      String pincode = textPin.getText();
      String state = textState.getText();

      try{
        if(textName.getText().equals("")){
          JOptionPane.showMessageDialog(null,"Fill all the fields");
        }else{
          Conn con1 = new Conn();
          String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+martial+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
          con1.statement.executeUpdate(q);
          new Signup2(formno);
          setVisible(false);
        }
      } catch (Exception E) {
        E.printStackTrace();;
      }
  }
  public static void main(String[] args) {
    new Signup();
  }
}
