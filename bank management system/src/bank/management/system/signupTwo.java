/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import javax.swing.*; // frame class
import java.awt.*; // color class
import java.util.*; // random class
import java.awt.event.*; // ActionListener ke liye import kiye hain take sction ko monitor kr paye

public class signupTwo extends JFrame implements ActionListener {
    
    JTextField pan,aadhar;
    JRadioButton syes ,sno , eyes ,eno ;
    JButton next;
    JComboBox religion,category, occupation , education,income;
    String formno;
    
    
      signupTwo(String formno) {
        this.formno = formno;
        setLayout(null);
        
       
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2 ");
        
    
        JLabel Additoinaletails = new JLabel("page 2: Additional Details");
        Additoinaletails.setFont(new Font("Raleway", Font.BOLD, 22));
        Additoinaletails.setBounds(290,80,400,30);
        add(Additoinaletails);
        
        JLabel name = new JLabel("Religion  : ");
        name.setFont(new Font("Raleway",Font.BOLD, 20));
        name.setBounds(100,140,150,30);
        add(name);


        String valReligion[] = { "Hindu" , "Muslim","Christian","Sikh", "other"};
         religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        
                   
        JLabel fname = new JLabel("Category: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String[] valCategory = {"SC","ST","GENERAL","OBC"};
         category= new JComboBox(valCategory);
        category.setFont(new Font("Ralway", Font.BOLD, 14));
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel gender = new JLabel("Income : ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,240,200,30);
        add(gender);
       
        String[] incomeCategory = {"Null","<1,50,000","2,50,000","3,50,000"};
         income= new JComboBox(incomeCategory);
        income.setBounds(300,240 ,400, 30);
        income.setBackground(Color.WHITE);
        add(income);

       
        JLabel dob = new JLabel("Education : ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,290,200,30);
        add(dob);
        
        JLabel email = new JLabel("Qualification : ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,310,200,30);
        add(email);
        
        
        String[] valeducation = {"B.TECH", "B.COM"," B.CA", "B.A"};
         education= new JComboBox(valeducation);
        education.setBounds(300,290,400,30);
        add(education);
        
        

        
        JLabel marital = new JLabel("Occupation : ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String[] valOccupation = {"Farmer","Doctor","Teacher","Scientist","Gammer","unEmployed","Other"};
         occupation= new JComboBox(valOccupation);
        occupation.setBounds(300,390,400,30);
        add(occupation);
  
        
        JLabel address = new JLabel("PAN N0. : ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440, 400,30);
        add(address);
        
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway" , Font.BOLD,20));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel city = new JLabel("Adhar no. ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD,20));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        
        JLabel state = new JLabel("cinior citizen  : ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);
        
         syes = new JRadioButton("YES");
        syes.setFont(new Font("Raleway",Font.BOLD, 20));
        syes.setBounds(300,540,180,30);
        add(syes);
        
        sno = new JRadioButton("NO");
        sno.setFont(new Font("Raleway",Font.BOLD, 20));
        sno.setBounds(480,540,200,30);
        add(sno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(syes);
        emaritalgroup.add(sno);
        
        
        JLabel pincode = new JLabel("Eisting account : ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        eyes = new JRadioButton("YES");
        eyes.setFont(new Font("Raleway",Font.BOLD, 20));
        eyes.setBounds(300,590,180,30);
        add(eyes);
        
        eno = new JRadioButton("NO");
        eno.setFont(new Font("Raleway",Font.BOLD, 20));
        eno.setBounds(480,590,200,30);
        add(eno);
        
        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);
        
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
        String formno = this.formno ;
        String sreligion =(String) religion.getSelectedItem(); //getSelectedItem(); is function ki help se drop down se value nikal sakte hain.
        String scategory  =(String) category.getSelectedItem();
        String sincome  = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        
        
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        } else if (sno.isSelected()){
            seniorcitizen = "No";
        }   
        
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
            
        } else if (eno.isSelected()){
            existingaccount = "No";
        }
      
        String span = pan.getText();
        String saadhar = aadhar.getText();
       
        
        try {             
        
               Conn c = new Conn();
               String query = "insert into signuptwo values ('"+ formno + "','"+ sreligion + "', '"+ scategory+ "', '"+ sincome+ "','"+ seducation+"','"+soccupation+ "','"+ span+ "','"+ saadhar + "','"+ existingaccount + "','"+ seniorcitizen + "')";
               c.s.executeUpdate(query);
               
               setVisible(false);
               new signupTwo(formno).setVisible(true);
               
        } catch (Exception e) {
            System.out.println(e);
        }
        
            
        
    }   
        
    
    public static void main(String[] args){
        new signupTwo("");
    }
    
    
}

