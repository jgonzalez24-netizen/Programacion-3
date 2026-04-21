package control_escolar.view;

import javax.swing.*;
import java.awt.*;

public class EditarAlumno extends JFrame {

    public EditarAlumno() {

        setTitle("Editar Alumno");
        setSize(900,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        getContentPane().setBackground(Color.decode("#C9CCD3"));

        JPanel top = new JPanel(null);
        top.setBounds(0,0,900,80);
        top.setBackground(Color.decode("#E2E2E2"));
        add(top);

        JLabel titulo = new JLabel("Editar Alumno",SwingConstants.CENTER);
        titulo.setBounds(0,20,900,40);
        titulo.setFont(new Font("Arial",Font.BOLD,26));
        top.add(titulo);

        JLabel pregunta = new JLabel("¿Dónde sugiere editar?");
        pregunta.setBounds(80,110,400,30);
        pregunta.setFont(new Font("Arial",Font.BOLD,22));
        add(pregunta);

        crearCampo("Nombre","Hugo",80,160);
        crearCampo("Apellido","Martínez",480,160);
        crearCampo("Teléfono","75552930",80,300);
        crearCampo("Correo Electrónico",
                "LMora434720@universidad.ed.edu",480,300);

        JButton cancelar = new JButton("Cancelar");
        cancelar.setBounds(300,470,200,45);
        cancelar.setBackground(Color.decode("#A8A8A8"));
        cancelar.setForeground(Color.WHITE);
        cancelar.setFont(new Font("Arial",Font.BOLD,18));
        add(cancelar);

        JButton guardar = new JButton("Guardar Cambios");
        guardar.setBounds(520,470,230,45);
        guardar.setBackground(Color.decode("#2F45FF"));
        guardar.setForeground(Color.WHITE);
        guardar.setFont(new Font("Arial",Font.BOLD,18));
        add(guardar);

        cancelar.addActionListener(e -> dispose());
    }

    private void crearCampo(String texto,String valor,int x,int y){

        JLabel label = new JLabel(texto);
        label.setBounds(x,y,250,25);
        label.setFont(new Font("Arial",Font.BOLD,22));
        add(label);

        JTextField campo = new JTextField(valor);
        campo.setBounds(x,y+40,370,55);
        campo.setBackground(Color.decode("#A8A8A8"));
        campo.setForeground(Color.decode("#1C2454"));
        campo.setBorder(null);
        campo.setFont(new Font("Arial",Font.PLAIN,18));
        add(campo);
    }
}