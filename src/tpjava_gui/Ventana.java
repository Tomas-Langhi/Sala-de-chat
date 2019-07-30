/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjava_gui;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import main.ClienteChat;

/**
 *
 * @author Tomas Langhi
 */
public class Ventana extends JFrame {
    
    public Ventana(){
        iniciarVentana();
        iniciarComponentes();
        setVisible(true);
    }
    
    private void iniciarVentana(){
        setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500, 500);
        setResizable(false);
    }
    
    private void iniciarComponentes(){
        
        JTextArea areatxt = new JTextArea();
        areatxt.setBounds(30, 30, 415, 300);
        
        JScrollPane scroll = new JScrollPane(areatxt);    
        scroll.setBounds(new Rectangle(415,300,100,300));
        
        JCheckBox checkBox = new JCheckBox();
        checkBox.setBounds(30, 325, 415, 25);
        checkBox.setText("Agregar al final.");
        
        JTextField txtfield = new JTextField();
        txtfield.setBounds(30, 350, 415, 25);
        txtfield.setText("Ingrese texto");
        
        JButton boton = new JButton();
        boton.setBounds(355, 385, 90, 30);
        boton.setText("Borrar");
        
        ClienteChat cliente = new ClienteChat("192.168.61.11" , "2000" , areatxt);
        cliente.conectar();
        
        boton.addActionListener (new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                areatxt.setText("");
            }
            
        });
        
        JButton boton1 = new JButton();
        boton1.setBounds(245, 385, 90, 30);
        boton1.setText("Enviar");
        
        boton1.addActionListener (new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (checkBox.isSelected()){
                    cliente.EnviarMensaje("Langhi06", txtfield.getText()); 
                    txtfield.setText("");
                }
                else{
                    cliente.EnviarMensaje("Langhi06", txtfield.getText());
                    txtfield.setText("");
                }
            }
        });
        
        
        
        add(areatxt);
        add(checkBox);
        add(txtfield);
        add(boton);
        add(boton1);
        
        
    }
}
