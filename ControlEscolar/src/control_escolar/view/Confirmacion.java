package control_escolar.view;

import javax.swing.*;
import java.awt.*;

public class Confirmacion extends JFrame {

    private JLabel icono;
    private JLabel titulo;
    private JLabel mensaje1;
    private JLabel mensaje2;
    private JButton btnDashboard;

    public Confirmacion() {

        setTitle("Confirmación");
        setSize(600, 450);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(240,240,240));

        icono = new JLabel();
        icono.setBounds(260, 70, 80, 60);
        add(icono);

        titulo = new JLabel("¡Confirmación exitosa!", SwingConstants.CENTER);
        titulo.setFont(new Font("Serif", Font.BOLD, 22));
        titulo.setBounds(150, 140, 300, 40);
        add(titulo);

        mensaje1 = new JLabel("Registro validado correctamente.", SwingConstants.CENTER);
        mensaje1.setFont(new Font("Serif", Font.PLAIN, 16));
        mensaje1.setBounds(120, 190, 360, 25);
        add(mensaje1);

        mensaje2 = new JLabel("Bienvenido(a) al Sistema de Control Escolar.", SwingConstants.CENTER);
        mensaje2.setFont(new Font("Serif", Font.PLAIN, 16));
        mensaje2.setBounds(80, 215, 440, 25);
        add(mensaje2);

        btnDashboard = new JButton("Ir al Dashboard");
        btnDashboard.setBounds(225, 290, 150, 35);
        btnDashboard.setBackground(new Color(40,40,200));
        btnDashboard.setForeground(Color.WHITE);
        btnDashboard.setFocusPainted(false);
        add(btnDashboard);
        
        btnDashboard.addActionListener(e -> {
            new Dashboard().setVisible(true);
            dispose();
        });
    }
}