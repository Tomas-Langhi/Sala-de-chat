/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjava_gui;

import javax.swing.*;


/**
 *
 * @author Tomas Langhi
 */
public class TpJava_GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    JTextField username = new JTextField();
    JTextField password = new JPasswordField();
    JCheckBox check = new JCheckBox();
    Object[] message = {
        "Username:", username,
        "Password:", password,
        check
    };
    
    check.setText("Recuerdame");

    int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (check.isSelected() == true){
                System.out.println("Login successful");
                Ventana miVentana = new Ventana();
            }
            if (username.getText().equals("Langhi06") && password.getText().equals("Lafacha")) {
                System.out.println("Login successful");
                Ventana miVentana = new Ventana();
                Usuario miUsuario = new Usuario("Langhi06", "Lafacha");
        }
            else {
                System.out.println("login failed");
        }
        }
        else{
            System.out.println("Login canceled");
        }   
    }
}
