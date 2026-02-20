package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pestaña extends JFrame {

    public Pestaña() {
        // CONFIGURACIONES BASICAS
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(200, 200));
        this.setMaximumSize(new Dimension(800, 800));
        this.setLocationRelativeTo(null);

        this.getContentPane().setBackground(Color.blue);
        this.setLayout(null); 
        // AÑADIDO DE ELEMENTOS
        JLabel tag_title = new JLabel();
        tag_title.setText("Bienvenido");
        tag_title.setSize(200, 40);
        tag_title.setLocation(150, 200);
        tag_title.setBackground(Color.white);
        tag_title.setOpaque(true);
        tag_title.setFont(new Font("Arial", Font.PLAIN, 22));
        tag_title.setVerticalAlignment(JLabel.CENTER);
        tag_title.setHorizontalAlignment(JLabel.CENTER);

        this.add(tag_title);
    }

    public static void main(String[] args) {
        new Pestaña();
    }
}