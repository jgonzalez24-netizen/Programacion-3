package control_escolar.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Escolar extends JFrame {

    private JLabel lblTitulo;
    private JLabel lblSubtitulo;
    private JTextField txtCorreo;
    private JTextField txtPassword;
    private JButton btnIngresar;
    private JButton btnAtras;
    private JLabel lblOlvide;

    public Login_Escolar() {
        setTitle("Control Escolar");
        setSize(400, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        btnAtras = new JButton("Atras");
        btnAtras.setBounds(15, 15, 80, 25);
        btnAtras.setBackground(new Color(8, 41, 173));
        btnAtras.setForeground(Color.WHITE);
        btnAtras.setFocusable(false);
        btnAtras.setBorderPainted(false);
        add(btnAtras);
        
        btnAtras.addActionListener(e -> {
            new LoginView().setVisible(true);
            dispose();
        });

        lblTitulo = new JLabel("CONTROL ESCOLAR", SwingConstants.CENTER);
        lblTitulo.setBounds(50, 60, 300, 40);
        lblTitulo.setFont(new Font("Serif", Font.PLAIN, 28));
        add(lblTitulo);

        lblSubtitulo = new JLabel("Bienvenid@ al sistema de Gestión Escolar", SwingConstants.CENTER);
        lblSubtitulo.setBounds(20, 110, 350, 20);
        lblSubtitulo.setFont(new Font("Serif", Font.PLAIN, 14));
        add(lblSubtitulo);

        txtCorreo = new JTextField(" Correo Electrónico");
        txtCorreo.setBounds(50, 180, 300, 45);
        txtCorreo.setBackground(new Color(210, 205, 205));
        txtCorreo.setBorder(null);
        add(txtCorreo);

        txtPassword = new JTextField(" Contraseña");
        txtPassword.setBounds(50, 250, 300, 45);
        txtPassword.setBackground(new Color(210, 205, 205));
        txtPassword.setBorder(null);
        add(txtPassword);

        btnIngresar = new JButton("INGRESAR");
        btnIngresar.setBounds(80, 340, 240, 45);
        btnIngresar.setBackground(new Color(8, 41, 173));
        btnIngresar.setForeground(Color.WHITE);
        btnIngresar.setFont(new Font("Serif", Font.BOLD, 16));
        btnIngresar.setFocusable(false);
        btnIngresar.setBorderPainted(false);
        add(btnIngresar);

        lblOlvide = new JLabel("¿Olvidaste tu contraseña", SwingConstants.CENTER);
        lblOlvide.setBounds(50, 430, 300, 30);
        lblOlvide.setForeground(new Color(8, 41, 173));
        lblOlvide.setFont(new Font("Serif", Font.PLAIN, 18));
        add(lblOlvide);

        btnIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                validarLogin();
            }
        });
    }

    private void Mensaje_validacion(String tituloTxt, String cuerpoTxt, Color fondo, Color tituloColor) {
        JDialog mensajeVentana = new JDialog(this, true); 
        mensajeVentana.setUndecorated(true); 
        mensajeVentana.setSize(320, 160);
        mensajeVentana.setLocationRelativeTo(this); 

        JPanel panel = new JPanel();
        panel.setBackground(fondo);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createLineBorder(new Color(8, 41, 173), 1));

        if (tituloTxt != null) {
            panel.add(Box.createRigidArea(new Dimension(0, 20)));
            JLabel lblT = new JLabel(tituloTxt);
            lblT.setForeground(tituloColor);
            lblT.setFont(new Font("Serif", Font.BOLD, 22));
            lblT.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(lblT);
        }

        if (tituloTxt == null) panel.add(Box.createRigidArea(new Dimension(0, 45)));
        else panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JLabel lblC = new JLabel(cuerpoTxt);
        lblC.setFont(new Font("Serif", Font.PLAIN, 16));
        lblC.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(lblC);

        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnAceptar.addActionListener(e -> mensajeVentana.dispose());
        panel.add(btnAceptar);

        mensajeVentana.add(panel);
        mensajeVentana.setVisible(true);
    }

    private void validarLogin() {

        String correo = txtCorreo.getText().trim();
        String contraseña = txtPassword.getText().trim();

        if (correo.equals("admin") && contraseña.equals("123")) {//usuario y contraseña provicional
        	
            Mensaje_validacion(null,"Sesión iniciada con Éxito",new Color(202, 240, 185),Color.BLACK);

            new Dashboard().setVisible(true);
            dispose();

        } else {

            Mensaje_validacion("ERROR",
                    "Correo o contraseña incorrectos",new Color(170, 170, 170),new Color(224, 69, 69));
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Login_Escolar().setVisible(true);
        });
    }
}