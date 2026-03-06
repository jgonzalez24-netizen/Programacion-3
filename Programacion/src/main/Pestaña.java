package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Pestaña extends JFrame {

    JPanel panel_user;

    public Pestaña() {

        setTitle("Sistema");
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        try {
            Image iconImage = ImageIO.read(getClass().getResource("/imagen/gato.png"));
            this.setIconImage(iconImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
       // login();
       // registro();
        
        calculadora();  

        setVisible(true);
    }

    private void JMenu() {
    	 //barra
        JMenuBar barra = new JMenuBar();
        this.setJMenuBar(barra);

        JMenu menu1 = new JMenu("Archivo");
        barra.add(menu1);

        JMenuItem opt1_mi = new JMenuItem("Abrir");
        menu1.add(opt1_mi);

        JMenuItem opt2_mi = new JMenuItem("Nuevo");
        menu1.add(opt2_mi);

        JMenuItem opt3_mi = new JMenuItem("Cerrar");
        menu1.add(opt3_mi);

        menu1.addSeparator();

        JMenu menu2 = new JMenu("Guardar");
        menu1.add(menu2);

        JMenu opt4_mi = new JMenu("Guardar");
        menu2.add(opt4_mi);

        JMenu opt5_mi = new JMenu("Guardar como");
        menu2.add(opt5_mi);

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

        ImageIcon userIcon = new ImageIcon(getClass().getResource("/imagen/user.png"));
        Image imgUser = userIcon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        JLabel iconUser = new JLabel(new ImageIcon(imgUser));
        iconUser.setBounds(60, 130, 24, 24);
        fondoLabel.add(iconUser);

        JTextField usuario = new JTextField();
        usuario.setBounds(100, 130, 200, 32);
        fondoLabel.add(usuario);

        ImageIcon passIcon = new ImageIcon(getClass().getResource("/imagen/password.png"));
        Image imgPass = passIcon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        JLabel iconPass = new JLabel(new ImageIcon(imgPass));
        iconPass.setBounds(60, 180, 24, 24);
        fondoLabel.add(iconPass);

        JPasswordField password = new JPasswordField();
        password.setBounds(100, 180, 200, 32);
        fondoLabel.add(password);

        JButton ingresar = new JButton("Ingresar");
        ingresar.setBounds(140, 240, 120, 35);
        ingresar.setFont(new Font("Arial", Font.BOLD, 14));
        ingresar.setBackground(new Color(52,152,219));
        ingresar.setForeground(Color.WHITE);
        ingresar.setFocusPainted(false);
        ingresar.setBorder(BorderFactory.createLineBorder(new Color(41,128,185),2,true));
        fondoLabel.add(ingresar);

        ingresar.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent evt) {
                ingresar.setBackground(new Color(41,128,185));
            }

            public void mouseExited(MouseEvent evt) {
                ingresar.setBackground(new Color(52,152,219));
            }

        });

        panelLogin.setVisible(true);
    }

    public void registro() {

        JPanel panelRegistro = new JPanel();
        panelRegistro.setBounds(400, 0, 400, 450);
        panelRegistro.setBackground(new Color(25, 42, 86));
        panelRegistro.setLayout(null);
        this.add(panelRegistro);

        panelRegistro.setVisible(true);

        JPanel rgs_contaniner = new JPanel();
        rgs_contaniner.setBounds(0, 0, 400, 450);
        rgs_contaniner.setBackground(new Color(25, 42, 86));
        rgs_contaniner.setLayout(null);
        panelRegistro.add(rgs_contaniner);

        JLabel tituloRegistro = new JLabel("REGISTRO");
        tituloRegistro.setBounds(90, 15, 220, 45);
        tituloRegistro.setHorizontalAlignment(SwingConstants.CENTER);
        tituloRegistro.setOpaque(true);
        tituloRegistro.setBackground(new Color(30, 30, 30));
        tituloRegistro.setForeground(Color.WHITE);
        tituloRegistro.setFont(new Font("Arial", Font.BOLD, 24));
        rgs_contaniner.add(tituloRegistro);

        JLabel lblNombreReg = new JLabel("NOMBRE DE USUARIO:");
        lblNombreReg.setBounds(50, 75, 300, 28);
        lblNombreReg.setOpaque(true);
        lblNombreReg.setBackground(new Color(255, 200, 0));
        lblNombreReg.setHorizontalAlignment(SwingConstants.CENTER);
        lblNombreReg.setFont(new Font("Arial", Font.BOLD, 13));
        rgs_contaniner.add(lblNombreReg);

        JTextField txtNombreReg = new JTextField();
        txtNombreReg.setBounds(50, 108, 300, 28);
        txtNombreReg.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        rgs_contaniner.add(txtNombreReg);

        JLabel bio_tag = new JLabel("BIO");
        bio_tag.setBounds(50, 145, 300, 25);
        bio_tag.setHorizontalAlignment(SwingConstants.CENTER);
        bio_tag.setFont(new Font("Arial", Font.BOLD, 14));
        bio_tag.setForeground(Color.WHITE);
        rgs_contaniner.add(bio_tag);

        JTextArea bio_text = new JTextArea();
        bio_text.setBounds(50, 175, 300, 65);
        bio_text.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        rgs_contaniner.add(bio_text);

        JLabel preferencias = new JLabel("Preferencias");
        preferencias.setBounds(50, 250, 300, 25);
        preferencias.setHorizontalAlignment(SwingConstants.CENTER);
        preferencias.setFont(new Font("Arial", Font.BOLD, 14));
        preferencias.setForeground(Color.WHITE);
        rgs_contaniner.add(preferencias);

        JCheckBox opt_sweet = new JCheckBox("Dulces");
        opt_sweet.setBounds(50, 280, 90, 25);
        opt_sweet.setBackground(new Color(60, 180, 170));
        rgs_contaniner.add(opt_sweet);

        JCheckBox opt_salty = new JCheckBox("Salado");
        opt_salty.setBounds(155, 280, 90, 25);
        opt_salty.setBackground(new Color(60, 180, 170));
        rgs_contaniner.add(opt_salty);

        JCheckBox opt_healthy = new JCheckBox("Saludable");
        opt_healthy.setBounds(260, 280, 100, 25);
        opt_healthy.setBackground(new Color(60, 180, 170));
        rgs_contaniner.add(opt_healthy);

        JLabel terminosLabel = new JLabel("TÉRMINOS");
        terminosLabel.setBounds(50, 310, 300, 25);
        terminosLabel.setOpaque(true);
        terminosLabel.setBackground(new Color(255, 200, 0));
        terminosLabel.setHorizontalAlignment(SwingConstants.CENTER);
        terminosLabel.setFont(new Font("Arial", Font.BOLD, 14));
        rgs_contaniner.add(terminosLabel);

        JRadioButton accept_terms = new JRadioButton("Acepto los términos");
        accept_terms.setBounds(50, 340, 160, 25);
        accept_terms.setBackground(new Color(60, 180, 170));
        rgs_contaniner.add(accept_terms);

        JRadioButton reject_terms = new JRadioButton("No acepto los términos");
        reject_terms.setBounds(210, 340, 180, 25);
        reject_terms.setBackground(new Color(60, 180, 170));
        rgs_contaniner.add(reject_terms);

        ButtonGroup terms = new ButtonGroup();
        terms.add(accept_terms);
        terms.add(reject_terms);

        String[] colonias = {"Camino Real", "Arcoiris", "8 de Octubre"};
        JComboBox colonias_combos = new JComboBox(colonias);
        colonias_combos.setBounds(50, 370, 300, 28);
        colonias_combos.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        rgs_contaniner.add(colonias_combos);

        JButton register_btn = new JButton("Crear cuenta");
        register_btn.setBounds(50, 405, 300, 35);
        register_btn.setFont(new Font("Arial", Font.BOLD, 16));
        register_btn.setBackground(Color.WHITE);
        register_btn.setFocusPainted(false);
        register_btn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        rgs_contaniner.add(register_btn);

        this.repaint();
    }

    public void users() {

        panel_user = new JPanel();
        panel_user.setSize(900, 500);
        panel_user.setLocation(50, 50);
        panel_user.setBackground(new Color(220, 230, 240));
        panel_user.setLayout(null);
        this.add(panel_user);

        panel_user.setVisible(false);

        JLabel titulo = new JLabel("Usuarios");
        titulo.setBounds(50, 20, 400, 60);
        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setForeground(Color.BLACK);
        panel_user.add(titulo);

        JButton descargar = new JButton("Descargar");
        descargar.setBounds(600, 40, 120, 35);
        descargar.setFont(new Font("Arial", Font.PLAIN, 14));
        panel_user.add(descargar);

        JButton añadir = new JButton("Añadir");
        añadir.setBounds(740, 40, 100, 35);
        añadir.setFont(new Font("Arial", Font.PLAIN, 14));
        panel_user.add(añadir);
    }


    public void tabla() {

        JPanel panel_user = new JPanel();
        panel_user = new JPanel();
        panel_user.setSize(900, 500);
        panel_user.setLocation(50, 50);
        panel_user.setBackground(new Color(220, 230, 240));
        panel_user.setLayout(null);
        this.add(panel_user);

        // titulo
        panel_user.setVisible(false);

        JLabel titulo = new JLabel("Usuarios");
        titulo.setBounds(50, 20, 400, 60);
        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setForeground(Color.BLACK);
        panel_user.add(titulo);

        // botones
        JButton descargar = new JButton("Descargar");
        descargar.setBounds(600, 40, 120, 35);
        descargar.setFont(new Font("Arial", Font.PLAIN, 14));
        panel_user.add(descargar);

        JButton añadir = new JButton("Añadir");
        añadir.setBounds(740, 40, 100, 35);
        añadir.setFont(new Font("Arial", Font.PLAIN, 14));
        panel_user.add(añadir);

    }

    public void datos() {

        String[] table_head = {"ID","Nombre","Correo electrónico","Edad","Estado"};

        // dinámico solo lectura
        javax.swing.table.DefaultTableModel modelo =
                new javax.swing.table.DefaultTableModel(table_head, 0) {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };

        // Datos
        modelo.addRow(new Object[]{"1", "Carlos Ramírez", "carlos.ramirez@gmail.com", 20, "Activo"});
        modelo.addRow(new Object[]{"2", "María Hernández", "maria.hernandez@gmail.com", 22, "Inactivo"});
        modelo.addRow(new Object[]{"3", "Luis García", "luis.garcia@gmail.com", 19, "Activo"});
        modelo.addRow(new Object[]{"4", "Ana Martínez", "ana.martinez@gmail.com", 23, "Activo"});
        modelo.addRow(new Object[]{"5", "Pedro López", "pedro.lopez@gmail.com", 21, "Activo"});
        modelo.addRow(new Object[]{"6", "Sofía Torres", "sofia.torres@gmail.com", 24, "Inactivo"});
        modelo.addRow(new Object[]{"7", "Jorge Mendoza", "jorge.mendoza@gmail.com", 20, "Activo"});
        modelo.addRow(new Object[]{"8", "Valeria Cruz", "valeria.cruz@gmail.com", 22, "Activo"});

        JTable students = new JTable(modelo);
        students.setRowHeight(25);
        students.setFont(new Font("Arial", Font.PLAIN, 13));
        students.setForeground(Color.BLACK);
        students.setBackground(Color.WHITE);

        students.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        // encabezado
        javax.swing.table.JTableHeader header = students.getTableHeader();
        header.setFont(new Font("Arial", Font.BOLD, 14));
        header.setBackground(new Color(40, 40, 40)); 
        header.setForeground(Color.WHITE);

        JScrollPane final_table = new JScrollPane(students);
        final_table.setSize(800, 250);
        final_table.setLocation(50, 110);

        panel_user.add(final_table);
    }
    


    	public void calculadora()   {
    		JPanel Panel_users = new JPanel();
    	    Panel_users.setSize(500, 500);
    	    Panel_users.setLocation(250, 50);
    	    Panel_users.setBackground(Color.black);
    	    Panel_users.setLayout(null);
    	    this.add(Panel_users);

    	    JLabel field = new JLabel("180.00");
    	    field.setSize(480, 40);
    	    field.setLocation(10, 10);
    	    field.setOpaque(true);
    	    field.setBackground(Color.white);
    	    field.setFont(new Font("Arial", Font.BOLD, 22));
    	    field.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
    	    Panel_users.add(field);

    	    int cor_x = 10, cor_y = 60;

    	    String[] botones = {
    	        "7","8","9","/",
    	        "4","5","6","*",
    	        "1","2","3","-",
    	        "0","C","=","+"
    	    };

    	    for(int i = 0; i < 16; i++) {

    	        JButton ce = new JButton(botones[i]);
    	        ce.setSize(100, 100);
    	        ce.setLocation(cor_x, cor_y);
    	        Panel_users.add(ce);

    	        cor_x += 110;

    	        if(cor_x >= 420) {
    	            cor_x = 10;
    	            cor_y += 110;
    	        }
    	    }
    	}
}