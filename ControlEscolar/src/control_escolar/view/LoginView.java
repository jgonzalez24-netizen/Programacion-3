package control_escolar.view;


import javax.swing.*;
import java.awt.*;


public class LoginView extends JFrame {

    public LoginView() {

        setTitle("EduGestor");
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel logo = new JLabel();
        ImageIcon icon = new ImageIcon("src/main/resources/logo_control_escolar.png"); 
        logo.setIcon(new ImageIcon(icon.getImage().getScaledInstance(400, 200, Image.SCALE_SMOOTH)));
        logo.setBounds(50, 10, 400, 200);
        add(logo);
        
        getContentPane().setBackground(new Color(210, 205, 205));
        
        JLabel titulo = new JLabel("Bienvenido a EduGestor");
        titulo.setBounds(80, 210, 350, 40);
        titulo.setFont(new Font("Serif", Font.BOLD, 24));
        titulo.setForeground(new Color(8, 41, 173));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(titulo);
        
        JLabel frase = new JLabel("La educación es el viaje que transforma vidas");
        frase.setBounds(60, 250, 380, 30);
        frase.setHorizontalAlignment(SwingConstants.CENTER);
        add(frase);
        
        //login
        JButton btnLogin = new JButton("Iniciar sesión");
        btnLogin.setBounds(120, 320, 250, 45);
        btnLogin.setBackground(new Color(8, 41, 173));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFont(new Font("Serif", Font.BOLD, 18));
        add(btnLogin);

        //registro
        JButton btnRegistro = new JButton("Registrarse");
        btnRegistro.setBounds(120, 390, 250, 45);
        btnRegistro.setBackground(new Color(8, 41, 173));
        btnRegistro.setForeground(Color.WHITE);
        btnRegistro.setFont(new Font("Serif", Font.BOLD, 18));
        add(btnRegistro);

    }

}