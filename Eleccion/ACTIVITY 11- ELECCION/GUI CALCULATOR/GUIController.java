/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author asus
 */
public class GUIController {
    GUIview guiView;
    GUIController(GUIview guiView){
        this.guiView = guiView;
        guiView.allListeners(new ActionButton());

    }

    
    class ActionButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

          if (e.getSource()==guiView.addBtn){
              int num1 = Integer.parseInt(guiView.num1TF.getText());
              int num2 = Integer.parseInt(guiView.num2TF.getText());
              int sum = GUIModel.addNumbers(num1, num2);

              guiView.label.setText(" "+ sum);

          }
          else if (e.getSource()==guiView.subtractBtn)
          {
              int num1 = Integer.parseInt(guiView.num1TF.getText());
              int num2 = Integer.parseInt(guiView.num2TF.getText());
              int dif = GUIModel.subNumbers(num1, num2);

              guiView.label.setText(" "+ dif); 
          }
           else if (e.getSource()==guiView.multiplyBtn)
          {
              int num1 = Integer.parseInt(guiView.num1TF.getText());
              int num2 = Integer.parseInt(guiView.num2TF.getText());
              int pro = GUIModel.multiplyNumbers(num1, num2);

              guiView.label.setText(" "+ pro); 
          }
          else if (e.getSource()==guiView.divideBtn)
          {
              int num1 = Integer.parseInt(guiView.num1TF.getText());
              int num2 = Integer.parseInt(guiView.num2TF.getText());
              int quo = GUIModel.divideNumbers(num1, num2);

              guiView.label.setText(" "+ quo); 
          }
           else if (e.getSource()==guiView.remainderBtn)
          {
              int num1 = Integer.parseInt(guiView.num1TF.getText());
              int num2 = Integer.parseInt(guiView.num2TF.getText());
              int rem = GUIModel.remainderNumbers(num1, num2);

              guiView.label.setText(" "+ rem); 
          }
          else if (e.getSource()==guiView.remainderBtn)
          {
              int num1 = Integer.parseInt(guiView.num1TF.getText());
              int num2 = Integer.parseInt(guiView.num2TF.getText());
              int res = GUIModel.resetNumbers(num1, num2);

              guiView.label.setText(" "+ res); 
          }







        }

    }
}