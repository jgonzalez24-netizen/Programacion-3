package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JRadioButton;
					
public class Pestaña extends JFrame {

    public Pestaña() {

        setTitle("Sistema");
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        login();
        registro();
        users();   

        setVisible(true);
    }

    public void login() {

        JPanel panelLogin = new JPanel();
        panelLogin.setBounds(0, 0, 400, 450);
        panelLogin.setBackground(new Color(30, 30, 60));
        panelLogin.setLayout(null);
        this.add(panelLogin);

        panelLogin.setVisible(false); // oculto
    }

    public void registro() {

        JPanel panelRegistro = new JPanel();
        panelRegistro.setBounds(400, 0, 400, 450);
        panelRegistro.setBackground(new Color(25, 42, 86));
        panelRegistro.setLayout(null);
        this.add(panelRegistro);

        panelRegistro.setVisible(false); //oculto
    }
    public void users() {

        JPanel panel_user = new JPanel();
        panel_user.setSize(900, 500);
        panel_user.setLocation(50, 50);
        panel_user.setBackground(new Color(220, 230, 240));
        panel_user.setLayout(null);
        this.add(panel_user);

        // titulo
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
}