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
        try {
            java.net.URL imgURL = getClass().getResource("/imagenes/Logo.png");
            
            if (imgURL != null) {
                ImageIcon icon = new ImageIcon(imgURL);
                Image scaledImg = icon.getImage().getScaledInstance(330, 191, Image.SCALE_SMOOTH);
                logo.setIcon(new ImageIcon(scaledImg));
                logo.setBounds(85, 10, 330, 191);
            } else {
                logo.setText("Logo no encontrado en /imagenes/Logo.png");
                logo.setBounds(50, 10, 400, 200);
                logo.setHorizontalAlignment(SwingConstants.CENTER);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        
        JButton btnLogin = new JButton("Iniciar sesión");
        btnLogin.setBounds(120, 320, 250, 45);
        btnLogin.setBackground(new Color(8, 41, 173));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFont(new Font("Serif", Font.BOLD, 18));
        add(btnLogin);
        
        btnLogin.addActionListener(e -> {
            new Login_Escolar().setVisible(true);
            dispose();
        });

        JButton btnRegistro = new JButton("Registrarse");
        btnRegistro.setBounds(120, 390, 250, 45);
        btnRegistro.setBackground(new Color(8, 41, 173));
        btnRegistro.setForeground(Color.WHITE);
        btnRegistro.setFont(new Font("Serif", Font.BOLD, 18));
        add(btnRegistro);
        
        btnRegistro.addActionListener(e -> {
            new RegisterView().setVisible(true);
            dispose();
        });

    }

}