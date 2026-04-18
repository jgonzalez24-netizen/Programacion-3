package control_escolar.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class DetallesAlumno extends JFrame {

    Color azul1 = Color.decode("#0829AD");
    Color azulOscuro = Color.decode("#1E2864");
    Color grisFondo = Color.decode("#D2CDCD");
    Color grisInput = Color.decode("#ABA6A6");
    Color blanco = Color.decode("#FFFFFF");
    Color blancoSuave = Color.decode("#FFFBFB");
    Color rojo = Color.decode("#E04545");

    public DetallesAlumno() {
        setTitle("Sistema");
        setSize(1000, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(grisFondo);

        JPanel menu = new JPanel(null);
        menu.setBounds(0, 0, 200, 750);
        menu.setBackground(azulOscuro);
        add(menu);

        String[] items = {"Inicio", "Estudiantes", "Docentes", "Cursos", "Calificaciones"};
        for (int i = 0; i < items.length; i++) {
            JButton b = new JButton(items[i]);
            b.setBounds(10, 150 + i * 55, 180, 50);
            b.setForeground(blanco);
            b.setBackground(i == 0 ? azul1 : azulOscuro);
            b.setBorder(null);
            menu.add(b);
        }

        JButton salir = new JButton("Cerrar sesion");
        salir.setBounds(0, 650, 200, 50);
        salir.setBackground(grisFondo);
        menu.add(salir);

        JPanel top = new JPanel(null);
        top.setBounds(200, 0, 800, 150);
        top.setBackground(blanco);
        add(top);

        JLabel titulo = new JLabel("AGREGAR ALUMNO", SwingConstants.CENTER);
        titulo.setBounds(0, 60, 800, 40);
        titulo.setForeground(azul1);
        titulo.setFont(new Font("Serif", 0, 30));
        top.add(titulo);

        JPanel base = new JPanel(null);
        base.setBounds(200, 150, 800, 600);
        base.setBackground(grisFondo);
        add(base);

        JPanel form = new JPanel(null);
        form.setBounds(40, 30, 720, 280);
        form.setBackground(blancoSuave);
        base.add(form);

        JPanel foto = new JPanel();
        foto.setBounds(40, 35, 140, 150);
        foto.setBackground(blanco);
        form.add(foto);

        JButton sel = new JButton("Seleccionar");
        sel.setBounds(45, 195, 130, 40);
        sel.setBackground(grisInput);
        sel.setForeground(blanco);
        form.add(sel);

        input(form, "Nombre", 210, 35);
        input(form, "Apellido", 420, 35);
        input(form, "Teléfono", 210, 120);
        input(form, "Correo", 420, 120);

        JButton c = new JButton("Cancelar");
        c.setBounds(350, 230, 130, 40);
        c.setBackground(grisInput);
        c.setForeground(blanco);
        form.add(c);

        JButton g = new JButton("Guardar");
        g.setBounds(500, 230, 130, 40);
        g.setBackground(azul1);
        g.setForeground(blanco);
        form.add(g);

        JPanel zonaTabla = new JPanel(null);
        zonaTabla.setBounds(40, 330, 720, 240);
        zonaTabla.setBackground(blanco);
        base.add(zonaTabla);

        JPanel head = new JPanel(null);
        head.setBounds(0, 0, 720, 35);
        head.setBackground(azul1);
        zonaTabla.add(head);

        JLabel t = new JLabel("Últimos Estudiantes");
        t.setBounds(20, 5, 200, 25);
        t.setForeground(blanco);
        head.add(t);

        JTextField buscador = new JTextField();
        buscador.setBounds(430, 5, 150, 25);
        head.add(buscador);

        JButton baja = new JButton("Baja");
        baja.setBounds(590, 5, 110, 25);
        baja.setBackground(rojo);
        baja.setForeground(blanco);
        head.add(baja);

        String[] col = {"Nombres", "Apellidos", "Telefono", "Carrera"};
        Object[][] data = {
                {"Laura", "Morales", "76442260", "Derecho"},
                {"Gabriela", "González", "255456280", "Sistemas"},
                {"Hugo", "Martínez", "75552930", "Agrónomo"},
                {"Luis", "Castellano", "76442260", "Derecho"}
        };

        DefaultTableModel tablaAlumnos = new DefaultTableModel(data, col);
        JTable tabla = new JTable(tablaAlumnos);
        tabla.setRowHeight(40);

        tabla.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable t, Object v, boolean s, boolean f, int r, int c) {
                Component comp = super.getTableCellRendererComponent(t, v, s, f, r, c);
                comp.setBackground(r % 2 == 0 ? new Color(210,210,210) : new Color(240,240,240));
                comp.setForeground(Color.BLACK);
                return comp;
            }
        });

        JScrollPane sp = new JScrollPane(tabla);
        sp.setBounds(0, 35, 520, 205);
        zonaTabla.add(sp);

        JPanel acciones = new JPanel(null);
        acciones.setBounds(520, 35, 200, 205);
        acciones.setBackground(blanco);
        zonaTabla.add(acciones);

        for (int i = 0; i < tablaAlumnos.getRowCount(); i++) {

            int y = i * 40;

            JButton editar = new JButton("Editar");
            editar.setBounds(5, y + 5, 60, 30);
            editar.setBackground(new Color(40,167,69));
            editar.setForeground(Color.WHITE);

            JButton borrar = new JButton("Borrar");
            borrar.setBounds(70, y + 5, 60, 30);
            borrar.setBackground(new Color(224,69,69));
            borrar.setForeground(Color.WHITE);

            JButton detalles = new JButton("Detalles");
            detalles.setBounds(135, y + 5, 60, 30);
            detalles.setBackground(azul1);
            detalles.setForeground(Color.WHITE);

            acciones.add(editar);
            acciones.add(borrar);
            acciones.add(detalles);
        }
    }

    void input(JPanel p, String t, int x, int y) {
        JLabel l = new JLabel(t);
        l.setBounds(x, y, 200, 20);
        p.add(l);

        JTextField f = new JTextField();
        f.setBounds(x, y + 25, 190, 40);
        f.setBackground(grisInput);
        f.setForeground(Color.WHITE);
        f.setBorder(null);
        p.add(f);
    }

    public static void main(String[] args) {
        new DetallesAlumno().setVisible(true);
    }
}