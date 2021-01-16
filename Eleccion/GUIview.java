/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionListener;



/**
 *
 * @author asus
 */
public class GUIview {
     
     JLabel labell;
     JLabel label2;
     JTextField num1TF;
     JLabel label3;
     JLabel label4;
     JTextField num2TF;
     JLabel label5;
     JLabel label6;
     JLabel label;
     JButton addBtn;
     JButton subtractBtn;
     JButton multiplyBtn;
     JButton divideBtn;
     JButton remainderBtn;
     JButton resetBtn;
     
   
    public GUIview() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    
    
    labell = new JLabel("First Number");
    label2 = new JLabel (" ");
    label3 = new JLabel ("Second Number");
    label4 = new JLabel (" ");
    label5 = new JLabel ("Result");
    label6 = new JLabel (" ");
    label = new JLabel("  =");
    num1TF = new JTextField();
    num2TF = new JTextField();
    
    addBtn = new JButton("+");
    subtractBtn = new JButton("-");
    multiplyBtn = new JButton("*");
    divideBtn = new JButton("/");
    remainderBtn = new JButton ("%");
    resetBtn = new JButton ("c");
       
       
               
    panel.setBorder(BorderFactory.createEmptyBorder(4,4,4,4)); //border
    panel.setLayout(new GridLayout(5,3,5,5));
       
    panel.add(labell);  
    panel.add(label2);//
    panel.add(num1TF);
    panel.add(label3);
    panel.add(label4);
    panel.add(num2TF);
    panel.add(label5);
    panel.add(label6);
    panel.add(label);
    panel.add(addBtn);
    panel.add(subtractBtn);
    panel.add(multiplyBtn);
    panel.add(divideBtn);
    panel.add(remainderBtn);
    panel.add(resetBtn);
      
    
    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("GUI");
    frame.pack(); //total the components
    frame.setVisible(true);
}
    
 public void allListeners(ActionListener a ) {
 addBtn.addActionListener(a);
 subtractBtn.addActionListener(a);
 multiplyBtn.addActionListener(a);
 divideBtn.addActionListener(a);
 remainderBtn.addActionListener(a);
 resetBtn.addActionListener(a);


    
}
 
}
