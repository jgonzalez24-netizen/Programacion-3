package control_escolar.view;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    private JPanel menuLateral;
    private JPanel barraSuperior;
    private JPanel contenidoPrincipal;
    private JPanel panelAlumnos, panelDocentes, panelCursos, panelIngresos;

    public Dashboard() {

        setTitle("Control Escolar - Dashboard");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        barraSuperior = new JPanel();
        barraSuperior.setBounds(180, 0, 820, 80);
        barraSuperior.setBackground(new Color(30, 40, 100));
        barraSuperior.setLayout(null);
        add(barraSuperior);

        JLabel lblTitulo = new JLabel("CONTROL ESCOLAR", SwingConstants.CENTER);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Serif", Font.PLAIN, 24));
        lblTitulo.setBounds(0, 20, 820, 40);
        barraSuperior.add(lblTitulo);

        menuLateral = new JPanel();
        menuLateral.setBounds(0, 0, 180, 700);
        menuLateral.setBackground(new Color(30, 40, 100));
        menuLateral.setLayout(null);
        add(menuLateral);

        JButton btnMenu = new JButton("Menu");
        btnMenu.setBounds(0, 0, 180, 80);
        btnMenu.setBackground(new Color(45, 55, 115));
        btnMenu.setForeground(Color.WHITE);
        btnMenu.setFont(new Font("Arial", Font.BOLD, 20));
        btnMenu.setBorderPainted(false);
        menuLateral.add(btnMenu);

        JButton btnHome = new JButton("Inicio");
        btnHome.setBounds(0, 80, 180, 70);
        btnHome.setBackground(new Color(200, 200, 200));
        btnHome.setBorder(null);
        menuLateral.add(btnHome);

        String[] opciones = {"Estudiantes", "Docentes", "Cursos", "Calificaciones"};

        for (int i = 0; i < opciones.length; i++) {
            JButton btn = new JButton(opciones[i]);
            btn.setBounds(0, 150 + (i * 80), 180, 80);
            btn.setBackground(new Color(30, 40, 100));
            btn.setForeground(Color.WHITE);
            btn.setFont(new Font("SansSerif", Font.BOLD, 14));
            btn.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.DARK_GRAY));
            menuLateral.add(btn);
        }

        JButton btnCerrar = new JButton("Cerrar Sesion");
        btnCerrar.setBounds(0, 600, 180, 60);
        btnCerrar.setBackground(new Color(220, 220, 220));
        btnCerrar.setFont(new Font("SansSerif", Font.BOLD, 12));
        menuLateral.add(btnCerrar);

        contenidoPrincipal = new JPanel();
        contenidoPrincipal.setBounds(180, 80, 820, 620);
        contenidoPrincipal.setBackground(new Color(140, 145, 155));
        contenidoPrincipal.setLayout(null);
        add(contenidoPrincipal);

        JPanel barraBlanca = new JPanel();
        barraBlanca.setBounds(0, 0, 820, 100);
        barraBlanca.setBackground(Color.WHITE);
        barraBlanca.setLayout(null);
        contenidoPrincipal.add(barraBlanca);

        JLabel lblBienvenido = new JLabel("Bienvenido a Dashboard");
        lblBienvenido.setBounds(30, 30, 400, 40);
        lblBienvenido.setFont(new Font("Serif", Font.PLAIN, 32));
        lblBienvenido.setForeground(new Color(50, 60, 120));
        barraBlanca.add(lblBienvenido);

        panelAlumnos = crearTarjeta("Total Alumnos", new Color(110, 100, 200), 30);
        contenidoPrincipal.add(panelAlumnos);

        panelDocentes = crearTarjeta("Total Docentes", new Color(100, 150, 230), 225);
        contenidoPrincipal.add(panelDocentes);

        panelCursos = crearTarjeta("Total Cursos", new Color(100, 70, 140), 420);
        panelCursos.setBorder(BorderFactory.createLineBorder(new Color(0, 150, 255), 2));
        contenidoPrincipal.add(panelCursos);

        panelIngresos = crearTarjeta("Ultimos Ingresos", new Color(70, 90, 175), 615);
        contenidoPrincipal.add(panelIngresos);
    }

    private JPanel crearTarjeta(String texto, Color color, int x) {

        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(x, 150, 180, 100);
        p.setBackground(color);

        JLabel lbl = new JLabel(texto);
        lbl.setBounds(10, 10, 160, 20);
        lbl.setForeground(Color.WHITE);
        lbl.setFont(new Font("Arial", Font.BOLD, 12));
        p.add(lbl);

        return p;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Dashboard().setVisible(true));
    }
}