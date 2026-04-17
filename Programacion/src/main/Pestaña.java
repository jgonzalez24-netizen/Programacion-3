package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Pestaña extends JFrame {

   JTextField usuario;
    JPasswordField password;

    JTextField txtNombreReg;
    JTextArea bio_text;

    JCheckBox opt_sweet, opt_salty, opt_healthy;

    JRadioButton accept_terms, reject_terms;

    JButton ingresar, register_btn;

    public Pestaña() {

        setTitle("Sistema");
        setSize(1200, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        menu();

        try {
            Image iconImage = ImageIO.read(getClass().getResource("/imagen/gato.png"));
            this.setIconImage(iconImage);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.router("login");

        setVisible(true);
    }

    public void router(String target) {
        this.getContentPane().removeAll();

        if (target.equals("login"))
            this.login();

        if (target.equals("registrarse"))
            this.registro();
        
        if (target.equals("recuperacion"))
            this.recuperacion(); 

        if (target.equals("alta")) 
            this.altaUsuario(); 

        if (target.equals("baja"))
            this.bajaUsuario();

        if (target.equals("consulta")) 
            this.consultarUsuario(); 

        if (target.equals("ayuda_crear")) 
            this.ayudaCrearUsuario(); 

        if (target.equals("ayuda_acceso")) 
            this.ayudaAccesoSistema();

        if (target.equals("ayuda_recuperar"))  
            this.ayudaRecuperarContraseña();
        this.repaint();
        this.revalidate();
    }

    public void login() {

        JPanel panelLogin = new JPanel();
        panelLogin.setBounds(0, 0, 400, 450);
        panelLogin.setLayout(null);
        this.add(panelLogin);

        ImageIcon fondo = new ImageIcon(getClass().getResource("/imagen/fondo.jpg"));
        JLabel fondoLabel = new JLabel(fondo);
        fondoLabel.setBounds(0, 0, 400, 450);
        panelLogin.add(fondoLabel);

        JLabel titulo = new JLabel("Login");
        titulo.setBounds(150, 40, 200, 40);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setForeground(Color.WHITE);
        fondoLabel.add(titulo);

        JLabel lblUser = new JLabel("Usuario:");
        lblUser.setBounds(100, 100, 200, 20);
        lblUser.setForeground(Color.WHITE);
        fondoLabel.add(lblUser);

        usuario = new JTextField();
        usuario.setBounds(100, 130, 200, 32);
        fondoLabel.add(usuario);

        JLabel lblPass = new JLabel("Contraseña:");
        lblPass.setBounds(100, 160, 200, 20);
        lblPass.setForeground(Color.WHITE);
        fondoLabel.add(lblPass);

        password = new JPasswordField();
        password.setBounds(100, 180, 200, 32);
        fondoLabel.add(password);

        ingresar = new JButton("Acceder");
        ingresar.setBounds(140, 240, 120, 35);
        fondoLabel.add(ingresar);

        JButton registrarse = new JButton("Registrarse");
        registrarse.setBounds(140, 290, 120, 35);
        fondoLabel.add(registrarse);
        
        JButton recuperar = new JButton("Recuperar"); 
        recuperar.setBounds(140, 340, 120, 35); 
        fondoLabel.add(recuperar);

        registrarse.addActionListener(e -> {
            router("registrarse");
        });
        
        recuperar.addActionListener(e -> { 
            router("recuperacion"); 
        });

        ingresar.addActionListener(e -> {

            String user = usuario.getText();
            String pass = new String(password.getPassword());

            boolean valido = true;

            if (user.trim().isEmpty() || user.contains(" ")) {
                usuario.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                valido = false;
            } else {
                usuario.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
            }

            if (pass.length() < 6 || pass.contains(" ")) {
                password.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                valido = false;
            } else {
                password.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
            }

            if (valido) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
            } else {
                JOptionPane.showMessageDialog(null, "Verifica los datos");
            }
        });
    }

    public void registro() {

        JPanel panelRegistro = new JPanel();
        panelRegistro.setBounds(0, 0, 400, 450);
        panelRegistro.setBackground(new Color(25, 42, 86));
        panelRegistro.setLayout(null);
        this.add(panelRegistro);

        JPanel rgs_container = new JPanel();
        rgs_container.setBounds(0, 0, 400, 450);
        rgs_container.setBackground(new Color(25, 42, 86));
        rgs_container.setLayout(null);
        panelRegistro.add(rgs_container);

        JLabel tituloRegistro = new JLabel("REGISTRO");
        tituloRegistro.setBounds(90, 15, 220, 45);
        tituloRegistro.setHorizontalAlignment(SwingConstants.CENTER);
        tituloRegistro.setOpaque(true);
        tituloRegistro.setBackground(new Color(30, 30, 30));
        tituloRegistro.setForeground(Color.WHITE);
        tituloRegistro.setFont(new Font("Arial", Font.BOLD, 24));
        rgs_container.add(tituloRegistro);

        JLabel lblNombreReg = new JLabel("NOMBRE DE USUARIO:");
        lblNombreReg.setBounds(50, 75, 300, 28);
        lblNombreReg.setOpaque(true);
        lblNombreReg.setBackground(new Color(255, 200, 0));
        lblNombreReg.setHorizontalAlignment(SwingConstants.CENTER);
        lblNombreReg.setFont(new Font("Arial", Font.BOLD, 13));
        rgs_container.add(lblNombreReg);

        txtNombreReg = new JTextField();
        txtNombreReg.setBounds(50, 108, 300, 28);
        txtNombreReg.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        rgs_container.add(txtNombreReg);

        JLabel bio_tag = new JLabel("BIO");
        bio_tag.setBounds(50, 145, 300, 25);
        bio_tag.setHorizontalAlignment(SwingConstants.CENTER);
        bio_tag.setFont(new Font("Arial", Font.BOLD, 14));
        bio_tag.setForeground(Color.WHITE);
        rgs_container.add(bio_tag);

        bio_text = new JTextArea();
        bio_text.setBounds(50, 175, 300, 65);
        bio_text.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        rgs_container.add(bio_text);

        JLabel preferencias = new JLabel("Preferencias");
        preferencias.setBounds(50, 250, 300, 25);
        preferencias.setHorizontalAlignment(SwingConstants.CENTER);
        preferencias.setFont(new Font("Arial", Font.BOLD, 14));
        preferencias.setForeground(Color.WHITE);
        rgs_container.add(preferencias);

        opt_sweet = new JCheckBox("Dulces");
        opt_sweet.setBounds(50, 280, 90, 25);
        opt_sweet.setBackground(new Color(60, 180, 170));
        rgs_container.add(opt_sweet);

        opt_salty = new JCheckBox("Salado");
        opt_salty.setBounds(155, 280, 90, 25);
        opt_salty.setBackground(new Color(60, 180, 170));
        rgs_container.add(opt_salty);

        opt_healthy = new JCheckBox("Saludable");
        opt_healthy.setBounds(260, 280, 100, 25);
        opt_healthy.setBackground(new Color(60, 180, 170));
        rgs_container.add(opt_healthy);

        JLabel terminosLabel = new JLabel("TÉRMINOS");
        terminosLabel.setBounds(50, 310, 300, 25);
        terminosLabel.setOpaque(true);
        terminosLabel.setBackground(new Color(255, 200, 0));
        terminosLabel.setHorizontalAlignment(SwingConstants.CENTER);
        terminosLabel.setFont(new Font("Arial", Font.BOLD, 14));
        rgs_container.add(terminosLabel);

        accept_terms = new JRadioButton("Acepto los términos");
        accept_terms.setBounds(50, 340, 160, 25);
        accept_terms.setBackground(new Color(60, 180, 170));
        rgs_container.add(accept_terms);

        reject_terms = new JRadioButton("No acepto los términos");
        reject_terms.setBounds(210, 340, 180, 25);
        reject_terms.setBackground(new Color(60, 180, 170));
        rgs_container.add(reject_terms);

        ButtonGroup terms = new ButtonGroup();
        terms.add(accept_terms);
        terms.add(reject_terms);

        register_btn = new JButton("Crear cuenta");
        register_btn.setBounds(50, 380, 300, 35);
        register_btn.setFont(new Font("Arial", Font.BOLD, 16));
        register_btn.setBackground(Color.WHITE);
        register_btn.setFocusPainted(false);
        register_btn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        rgs_container.add(register_btn);

        JButton volver = new JButton("Volver");
        volver.setBounds(50, 420, 300, 30);
        rgs_container.add(volver);

        volver.addActionListener(e -> {
            router("login");
        });

        register_btn.addActionListener(e -> {

            boolean valido = true;

            if (txtNombreReg.getText().trim().isEmpty() || txtNombreReg.getText().contains(" ")) {
                txtNombreReg.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                valido = false;
            } else {
                txtNombreReg.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
            }

            String bio = bio_text.getText().trim();
            if (!bio.isEmpty() && bio.length() < 5) {
                bio_text.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                valido = false;
            } else {
                bio_text.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
            }

            if (!opt_sweet.isSelected() && !opt_salty.isSelected() && !opt_healthy.isSelected()) {
                opt_sweet.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                opt_salty.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                opt_healthy.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                valido = false;
            } else {
                opt_sweet.setBorder(null);
                opt_salty.setBorder(null);
                opt_healthy.setBorder(null);
            }

            if (!accept_terms.isSelected()) {
                accept_terms.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                valido = false;
            } else {
                accept_terms.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
            }

            if (valido) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }
        });
    }
    
    public void recuperacion() { 
        JPanel panel = new JPanel();
        panel.setBounds(0,0,400,450); 
        panel.setLayout(null); 
        panel.setBackground(new Color(52, 152, 219)); 
        this.add(panel); 

        JLabel titulo = new JLabel("Recuperar Contraseña");
        titulo.setBounds(50,30,300,40);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setFont(new Font("Arial",Font.BOLD,22)); 
        panel.add(titulo); 

        JTextField correo = new JTextField(); 
        correo.setBounds(50,100,300,30);
        panel.add(correo); 
        JButton volver = new JButton("Volver"); 
        volver.setBounds(50,150,300,30); 
        panel.add(volver);

        volver.addActionListener(e -> router("login"));
    }
    public JPanel ayudaUsuario (String tituloTxt) {
        JPanel panel = new JPanel();
        panel.setBounds(0,0,400,450);
        panel.setLayout(null);
        this.add(panel);

        JLabel titulo = new JLabel(tituloTxt);
        titulo.setBounds(50,20,300,40);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setFont(new Font("Arial",Font.BOLD,22));
        panel.add(titulo);

        JButton volver = new JButton("Volver");
        volver.setBounds(50,350,300,30);
        panel.add(volver);

        volver.addActionListener(e -> router("login"));

        return panel;
    }

    public void altaUsuario() {
        JPanel panel = ayudaUsuario ("Dar de alta");
        JTextField t = new JTextField();
        t.setBounds(50,100,300,30);
        panel.add(t);
    }

    public void bajaUsuario() {
        JPanel panel = ayudaUsuario ("Dar de baja");
        JTextField t = new JTextField();
        t.setBounds(50,100,300,30);
        panel.add(t);
    }

    public void consultarUsuario() {
        JPanel panel = ayudaUsuario ("Consultar Usuario");
        JTextField t = new JTextField();
        t.setBounds(50,100,300,30);
        panel.add(t);
    }

    public void ayudaCrearUsuario() {
        JPanel panel = ayudaUsuario ("Ayudar a crear usuario");
        JTextArea t = new JTextArea();
        t.setBounds(50,100,300,150);
        panel.add(t);
    }

    public void ayudaAccesoSistema() {
        JPanel panel = ayudaUsuario ("Ayuda acceso sistema");
        JTextArea t = new JTextArea();
        t.setBounds(50,100,300,150);
        panel.add(t);
    }

    public void ayudaRecuperarContraseña() {
        JPanel panel = ayudaUsuario ("Ayuda recuperar contraseña");
        JTextArea t = new JTextArea();
        t.setBounds(50,100,300,150);
        panel.add(t);
    }
    

    public void menu() {

        JMenuBar menuBar = new JMenuBar();

        JMenu archivo = new JMenu("Archivo");
        JMenu ayuda = new JMenu("Ayuda");
        JMenu cuenta = new JMenu("Cuenta");
        JMenu usuarios = new JMenu("Usuarios"); 

        JMenuItem acceder = new JMenuItem("Acceder");
        JMenuItem registrar = new JMenuItem("Registrar");
        JMenuItem recuperar = new JMenuItem("Recuperar");

        acceder.addActionListener(e -> {
            router("login");
        });

        registrar.addActionListener(e -> {
            router("registrarse");    
        });
        
        recuperar.addActionListener(e -> {
            router("recuperacion"); 
        }); 

        

        cuenta.add(acceder);
        cuenta.add(registrar);
        cuenta.add(recuperar); 
        
        JMenuItem alta = new JMenuItem("Alta");
        JMenuItem baja = new JMenuItem("Baja"); 
        JMenuItem consulta = new JMenuItem("Consultar"); 

        alta.addActionListener(e -> router("alta")); 
        baja.addActionListener(e -> router("baja")); 
        consulta.addActionListener(e -> router("consulta"));
        usuarios.add(alta);
        usuarios.add(baja);
        usuarios.add(consulta); 

        menuBar.add(archivo);
        menuBar.add(ayuda);
        menuBar.add(cuenta);
        menuBar.add(usuarios);

        setJMenuBar(menuBar);
    }  
}