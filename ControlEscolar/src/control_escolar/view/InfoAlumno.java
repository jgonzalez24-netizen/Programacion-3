package control_escolar.view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class InfoAlumno extends JFrame {

    public InfoAlumno() {

        setTitle("Detalles del Estudiante");
        setSize(850, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(158, 158, 158));

        JPanel header = new JPanel();
        header.setBackground(new Color(211, 211, 211));
        header.setBounds(10, 10, 810, 120);
        header.setLayout(null);

        JLabel titulo = new JLabel("DETALLES DEL ESTUDIANTE", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 36));
        titulo.setForeground(Color.BLUE);
        titulo.setBounds(0, 40, 810, 40);
        header.add(titulo);
        add(header);

        JLabel lblNombreGrande = new JLabel("");
        lblNombreGrande.setFont(new Font("Arial", Font.BOLD, 32));
        lblNombreGrande.setForeground(new Color(40, 45, 100));
        lblNombreGrande.setBounds(30, 140, 400, 40);
        add(lblNombreGrande);

        JLabel lblActivo = new JLabel("");
        lblActivo.setForeground(new Color(34, 177, 76));
        lblActivo.setFont(new Font("Arial", Font.BOLD, 18));
        lblActivo.setBounds(45, 180, 100, 25);
        add(lblActivo);

        textoTitulo("Nombre:", 30, 220, 80);
        textoDato("", 110, 220, 150);

        textoTitulo("Apellido:", 210, 220, 80);
        textoDato("", 295, 220, 150);

        textoTitulo("Institución:", 30, 260, 100);
        textoDato("", 135, 260, 400);

        textoTitulo("Materias:", 30, 310, 100);
        materia("", 125, 305);
        materia("", 215, 305);
        materia("", 305, 305);
        materia("", 125, 330);
        materia("", 215, 330);
        materia("", 305, 330);

        textoTitulo("Semestre:", 30, 380, 100);
        textoDato("", 130, 380, 100);

        textoTitulo("ID:", 30, 420, 40);
        textoDato("", 65, 420, 150);

        textoTitulo("Correo Institucional:", 30, 460, 180);
        textoDato("", 215, 460, 350);

        textoTitulo("Nacionalidad:", 30, 500, 120);
        textoDato("", 155, 500, 200);

        JPanel foto = new JPanel();
        foto.setBounds(580, 165, 200, 250);
        foto.setBorder(new LineBorder(Color.WHITE, 10));
        foto.setBackground(new Color(190, 190, 190));
        add(foto);

        JLabel lblDescargar = new JLabel("Descargar PDF");
        lblDescargar.setBounds(580, 440, 120, 30);
        lblDescargar.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblDescargar);

        JButton btnAqui = new JButton("Aquí");
        btnAqui.setBounds(700, 435, 90, 40);
        btnAqui.setBackground(Color.BLUE);
        btnAqui.setForeground(Color.WHITE);
        btnAqui.setFont(new Font("Arial", Font.BOLD, 14));
        add(btnAqui);

        JButton btnAtras = new JButton("Atras");
        btnAtras.setBounds(15, 600, 130, 45);
        btnAtras.setBackground(new Color(211, 211, 211));
        add(btnAtras);
        
        btnAtras.addActionListener(e -> {
            new DetallesAlumno().setVisible(true);
            dispose();
        });
    }

    private void textoTitulo(String texto, int x, int y, int w) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setForeground(new Color(40, 45, 100));
        etiqueta.setFont(new Font("Arial", Font.BOLD, 16));
        etiqueta.setBounds(x, y, w, 30);
        add(etiqueta);
    }

    private void textoDato(String texto, int x, int y, int w) {
        JLabel dato = new JLabel(texto);
        dato.setFont(new Font("Arial", Font.PLAIN, 16));
        dato.setForeground(Color.BLACK);
        dato.setBounds(x, y, w, 30);
        add(dato);
    }

    private void materia(String texto, int x, int y) {
        JLabel cuadro = new JLabel(texto, SwingConstants.CENTER);
        cuadro.setBounds(x, y, 90, 25);
        cuadro.setBorder(LineBorder.createBlackLineBorder());
        cuadro.setFont(new Font("Arial", Font.PLAIN, 10));
        add(cuadro);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InfoAlumno().setVisible(true));
    }
}