/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

public class MainClass {
    public static void main(String[] args){
        GUIview guiView = new GUIview();
        new GUIController(guiView);
    }

}