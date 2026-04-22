package control_escolar.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Docentes extends JFrame {

    public Docentes() {
        setTitle("Docentes");
        setSize(1300, 850);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        getContentPane().setBackground(new Color(139, 143, 153));

        JPanel topBar = new JPanel(null);
        topBar.setBounds(0, 0, 1300, 180);
        topBar.setBackground(new Color(211, 211, 211));
        add(topBar);

        JPanel menuBox = new JPanel(null);
        menuBox.setBounds(10, 10, 180, 160);
        menuBox.setBackground(new Color(28, 29, 66));
        menuBox.setBorder(BorderFactory.createLineBorder(new Color(47, 69, 255), 3));
        topBar.add(menuBox);

        JLabel titulo = new JLabel("DOCENTES", SwingConstants.CENTER);
        titulo.setBounds(200, 70, 800, 60);
        titulo.setFont(new Font("Serif", Font.PLAIN, 50));
        titulo.setForeground(new Color(31, 43, 255));
        topBar.add(titulo);

        JPanel sidebar = new JPanel(null);
        sidebar.setBounds(10, 195, 180, 580);
        sidebar.setBackground(new Color(211, 211, 211));
        sidebar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        add(sidebar);
        String[] opciones = {"Inicio", "Estudiantes", "Docentes", "Cursos", "Calificaciones"};
        int yPos = 0;

        for (String opcion : opciones) {

            Color colorBoton =
                    opcion.equals("Inicio") ? new Color(15,0,255) :
                    opcion.equals("Estudiantes") ? new Color(160,166,214) :
                    new Color(110,115,168);

            JButton boton = crearBotonMenu(opcion, yPos, colorBoton);
            sidebar.add(boton);

            if(opcion.equals("Inicio")){
                boton.addActionListener(e -> {
                    new Dashboard().setVisible(true);
                    dispose();
                });
            }

            if(opcion.equals("Estudiantes")){
                boton.addActionListener(e -> {
                    new DetallesAlumno().setVisible(true);
                    dispose();
                });
            }

            yPos += 70;
        }

        JButton btnCerrar = new JButton("Cerrar Sesion");
        btnCerrar.setBounds(0, 520, 180, 60);
        btnCerrar.setBackground(new Color(220, 220, 220));
        btnCerrar.setFont(new Font("SansSerif", Font.BOLD, 12));
        btnCerrar.setFocusPainted(false);
        sidebar.add(btnCerrar);

        btnCerrar.addActionListener(e -> {
            new LoginView().setVisible(true);
            dispose();
        });

        JPanel marcoAzul = new JPanel(null);
        marcoAzul.setBounds(210, 210, 1000, 520); 
        marcoAzul.setBackground(new Color(35, 38, 82));
        add(marcoAzul);

        JPanel contenedorTabla = new JPanel(null);
        contenedorTabla.setBounds(5, 5, 990, 510);
        contenedorTabla.setBackground(new Color(191, 195, 205));
        marcoAzul.add(contenedorTabla);

        JButton btnFolder = new JButton();
        btnFolder.setBounds(60, 20, 60, 40);
        btnFolder.setBackground(new Color(255, 235, 59));
        contenedorTabla.add(btnFolder);

        JTextField txtSearch = new JTextField();
        txtSearch.setBounds(130, 20, 220, 40);
        contenedorTabla.add(txtSearch);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(400, 15, 150, 45);
        btnGuardar.setBackground(new Color(47, 100, 255));
        btnGuardar.setForeground(Color.BLACK);
        btnGuardar.setFont(new Font("Arial", Font.BOLD, 18));
        contenedorTabla.add(btnGuardar);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(580, 15, 150, 45);
        btnEliminar.setBackground(new Color(170, 170, 170));
        btnEliminar.setFont(new Font("Arial", Font.BOLD, 18));
        contenedorTabla.add(btnEliminar);

        String[] columnas = {"", "Nombre", "Apellidos", "Docente", "Asignatura", "Acciones"};
        Object[][] datos = {
            {"", "Laura", "Martínez", "Lic. Laura", "Desarrollo Sustentable", ""},
            {"", "Pedro", "Ramírez", "Prof. Pedro", "Matemáticas", ""},
            {"", "Jorge", "Gómez", "Lic. Jorge", "Base de Datos", ""},
            {"", "Carlos", "Torres", "Prof. Carlos", "Programación", ""},
            {"", "Roberto", "Ríos", "Lic. Roberto Ríos", "Estructura de Datos", ""},
            {"", "Gabriela", "Díaz", "Lic. Gabriela", "Inglés IV", ""}
        };

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);
        tabla.setRowHeight(58);
        tabla.setBackground(new Color(211, 213, 219));
        tabla.setGridColor(Color.GRAY);
        tabla.setShowVerticalLines(true);
        tabla.setShowHorizontalLines(true);

        tabla.getTableHeader().setBackground(new Color(158, 164, 209));
        tabla.getTableHeader().setPreferredSize(new Dimension(0, 50));
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

        JPanel panelTablaNormal = new JPanel(new BorderLayout());
        panelTablaNormal.setBounds(10, 75, 970, 395);
        panelTablaNormal.add(tabla.getTableHeader(), BorderLayout.NORTH);
        panelTablaNormal.add(tabla, BorderLayout.CENTER);
        contenedorTabla.add(panelTablaNormal);

        JLabel infoPagina = new JLabel("Mostrando 1 a 4 de 24 Docentes");
        infoPagina.setBounds(620, 475, 250, 30);
        contenedorTabla.add(infoPagina);

        JPanel panelPag = new JPanel();
        panelPag.setBounds(850, 475, 100, 25);
        panelPag.setBackground(new Color(230, 230, 230));
        contenedorTabla.add(panelPag);
    }

    private JButton crearBotonMenu(String texto, int y, Color color) {
        JButton b = new JButton(texto);
        b.setBounds(5, y, 170, 65);
        b.setBackground(color);
        b.setForeground(Color.WHITE);
        b.setFocusPainted(false);
        b.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100), 1));
        b.setFont(new Font("Arial", Font.PLAIN, 14));
        return b;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Docentes().setVisible(true));
    }
}