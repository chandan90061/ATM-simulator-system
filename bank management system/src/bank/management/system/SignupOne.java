package bank.management.system;


import javax.swing.*; // frame class
import java.awt.*; // color class
import java.util.*; // random class
import com.toedter.calendar.JDateChooser;
import java.awt.event.*; // ActionListener ke liye import kiye hain take sction ko monitor kr paye

public class SignupOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField ,fnameTextField ,dobTextfield, emailTextField , addressTextField, cityTextField , stateTextField, pinTextField;
    JRadioButton male ,female , married ,unmarried;
    JDateChooser dateChooser ;
    JButton next;
    
      SignupOne() {
        setLayout(null);
        
        
        Random ran  = new Random();  // creating object of random class.
        random = Math.abs((ran.nextLong() % 9000L) +1000L) ;
        
        
        
        JLabel formno = new JLabel("APPLICATION FORM NO : " + random  );
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails = new JLabel("page 1: personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name = new JLabel("NAME : ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField  = new JTextField();
        nameTextField.setFont(new Font("Ralway", Font.BOLD, 14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
       
        JLabel fname = new JLabel("Father's name : ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Ralway", Font.BOLD, 14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel gender = new JLabel("GENDER : ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,240,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,240,150,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        
        
        female = new JRadioButton("female");
        female.setBounds(450,240 , 200, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
       
        JLabel dob = new JLabel("Date of Birth : ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,290,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);
        
        JLabel email = new JLabel("Email address: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD , 20));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel marital = new JLabel("MARITAL STATUS: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
   
        
        married = new JRadioButton("Married");
        married.setBounds(300,390,150,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390 , 200, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        
        JLabel address = new JLabel(" ADDRESS : ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440, 200,30);
        add(address);
        
        
         addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway" , Font.BOLD,20));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("CITY: ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        
         cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD,20));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        
        JLabel state = new JLabel("STATE : ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD, 20));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        
        JLabel pincode = new JLabel("PIN CODE: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway" ,Font.BOLD , 20));
        pinTextField.setBounds(300,590,400, 30);
        add(pinTextField);
        
        
        next  = new JButton("NEXT");
        next.setBounds(600,650,100,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
         
        
    }
    public void actionPerformed(ActionEvent ae){
        String formno = " " + random; // long me hai
        String name = nameTextField.getText(); //getText(); Function ki help se hum text field se valuse ko nikal sakte hain.
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        
        
        if(male.isSelected()){
            gender = "Male";
        } else if (female.isSelected()){
            gender = "Female";
        }   
            
        String email = emailTextField.getText();
        
        
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if (unmarried.isSelected()){
            marital = "Unmarred";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        
        try {             
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Fill the name TextField"); // ek message ya pop up dikha sakte hain, with help JOptionPane. 
            } else  {
               Conn c = new Conn();
               String query = "insert into signup values ('"+ formno + "','"+ name + "', '"+ fname+ "', '"+ dob+ "','"+ gender+"','"+email+ "','"+ marital+ "','"+ address + "','"+ city + "','"+ pin + "','"+ state + "')";
               c.s.executeUpdate(query);
               setVisible(false);
               new signupTwo(formno).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
            
        
    }   
        
    
    public static void main(String[] args){
        new SignupOne();
    }
    
    
}

