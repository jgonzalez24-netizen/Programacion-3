package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pestaña extends JFrame {

	public Pestaña() {

        // configuracion Ventana
        setTitle("Login");
        setSize(400, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // panel principal
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 400, 450);
        panel.setBackground(new Color(30, 30, 60)); // azul oscuro
        panel.setLayout(null);
        add(panel);

        // titulo
        JLabel titulo = new JLabel("INICIAR SESIÓN");
        titulo.setBounds(90, 30, 220, 40);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD, 22)); //tipo de letra
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titulo);

        // usuario(interfaz)
        JLabel lblUsuario = new JLabel("Nombre de Usuario:");
        lblUsuario.setBounds(50, 100, 200, 25);
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setFont(new Font("Arial", Font.PLAIN, 14)); //tipo de letra
        panel.add(lblUsuario);

        // TEXTFIELD USUARIO
        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(50, 130, 280, 30);
        panel.add(txtUsuario);

        // LABEL CONTRASEÑA
        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setBounds(50, 180, 200, 25);
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Arial", Font.PLAIN, 14)); //tipo de letra
        panel.add(lblPassword);

        // Contraseña
        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(50, 210, 280, 30);
        panel.add(txtPassword);

        // boton "RECORDARME"
        JCheckBox recordar = new JCheckBox("Recordarme");
        recordar.setBounds(50, 260, 150, 25);
        recordar.setForeground(Color.WHITE);
        recordar.setBackground(new Color(30, 30, 60));
        panel.add(recordar);

        // boton acceder
        JButton btnAcceder = new JButton("ACCEDER");
        btnAcceder.setBounds(110, 310, 160, 40);
        btnAcceder.setBackground(new Color(28, 118, 210)); // azul
        btnAcceder.setForeground(Color.WHITE);
        btnAcceder.setFont(new Font("Arial", Font.BOLD, 16)); //tipo de letra
        btnAcceder.setFocusPainted(false);
        panel.add(btnAcceder);

        // accion del boton 
        btnAcceder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String usuario = txtUsuario.getText();
                String password = new String(txtPassword.getPassword());

                if (usuario.equals("Jesus") && password.equals("12345")) {   //usuario y contraseña predeterminada
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
            }
        });

        setVisible(true);
    }
}