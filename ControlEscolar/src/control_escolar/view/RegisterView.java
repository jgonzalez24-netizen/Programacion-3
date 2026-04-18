package control_escolar.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class RegisterView extends JFrame {

    public RegisterView() {
        setTitle("Registro - EduGestor");
        setSize(900, 750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(210, 205, 205));

        JPanel contenedor = new JPanel();
        contenedor.setLayout(null);
        contenedor.setBackground(Color.WHITE);
        contenedor.setBounds(40, 20, 800, 650);
        add(contenedor);

        JLabel lblNombre = new JLabel("Nombre(s)");
        lblNombre.setBounds(50, 20, 200, 25);
        contenedor.add(lblNombre);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(50, 45, 200, 35);
        contenedor.add(txtNombre);

        JLabel lblApe1 = new JLabel("Primer Apellido");
        lblApe1.setBounds(280, 20, 200, 25);
        contenedor.add(lblApe1);

        JTextField txtApe1 = new JTextField();
        txtApe1.setBounds(280, 45, 200, 35);
        contenedor.add(txtApe1);

        JLabel lblApe2 = new JLabel("Segundo Apellido");
        lblApe2.setBounds(510, 20, 200, 25);
        contenedor.add(lblApe2);

        JTextField txtApe2 = new JTextField();
        txtApe2.setBounds(510, 45, 200, 35);
        contenedor.add(txtApe2);

        JLabel lblGenero = new JLabel("Genero");
        lblGenero.setBounds(50, 100, 100, 25);
        contenedor.add(lblGenero);

        JRadioButton rbMasculino = new JRadioButton("Masculino");
        rbMasculino.setBounds(50, 125, 100, 25);
        rbMasculino.setBackground(Color.WHITE);
        contenedor.add(rbMasculino);

        JRadioButton rbFemenino = new JRadioButton("Femenino");
        rbFemenino.setBounds(150, 125, 100, 25);
        rbFemenino.setBackground(Color.WHITE);
        contenedor.add(rbFemenino);

        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(rbMasculino);
        grupoGenero.add(rbFemenino);

        JLabel lblOtro = new JLabel("otro:");
        lblOtro.setBounds(70, 160, 40, 25);
        contenedor.add(lblOtro);

        JTextField txtOtro = new JTextField();
        txtOtro.setBounds(110, 160, 150, 25);
        txtOtro.setBackground(Color.WHITE);
        txtOtro.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        contenedor.add(txtOtro);

        JLabel lblDireccion = new JLabel("Direccion");
        lblDireccion.setBounds(450, 100, 100, 25);
        contenedor.add(lblDireccion);

        JTextField txtCalle = createPlaceholderField("Calle", 300, 125, 200, 35);
        contenedor.add(txtCalle);

        JTextField txtNum = createPlaceholderField("numero", 520, 125, 200, 35);
        contenedor.add(txtNum);

        JTextField txtColonia = createPlaceholderField("Colonia", 520, 170, 200, 35);
        contenedor.add(txtColonia);

        JLabel lblTel = new JLabel("Numero telefonico");
        lblTel.setBounds(50, 200, 200, 25);
        contenedor.add(lblTel);

        JTextField txtTel = createPlaceholderField("10 digitos", 50, 225, 200, 35);
        contenedor.add(txtTel);

        JLabel lblCorreo = new JLabel("Correo Electronico");
        lblCorreo.setBounds(300, 200, 200, 25);
        contenedor.add(lblCorreo);

        JTextField txtCorreo = new JTextField();
        txtCorreo.setBounds(300, 225, 300, 35);
        contenedor.add(txtCorreo);

        JLabel lblPass = new JLabel("Contraseña");
        lblPass.setBounds(50, 280, 200, 25);
        contenedor.add(lblPass);

        JPasswordField txtPass = new JPasswordField("Minimo 8 digitos");
        txtPass.setBounds(50, 305, 200, 35);
        txtPass.setForeground(Color.LIGHT_GRAY);
        txtPass.setEchoChar((char) 0);
        EchoChar(txtPass, "Minimo 8 digitos");
        contenedor.add(txtPass);

        JLabel lblConf = new JLabel("Confirmar Contraseña");
        lblConf.setBounds(280, 280, 200, 25);
        contenedor.add(lblConf);

        JPasswordField txtConf = new JPasswordField();
        txtConf.setBounds(280, 305, 200, 35);
        contenedor.add(txtConf);

        JLabel iconoPrivacidad = new JLabel();
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/lock.png"));
            iconoPrivacidad.setIcon(new ImageIcon(icon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        } catch(Exception e) {}
        iconoPrivacidad.setBounds(50, 360, 30, 30);
        contenedor.add(iconoPrivacidad);

        JLabel lblAvisoTit = new JLabel("Aviso de privacidad");
        lblAvisoTit.setBounds(85, 360, 200, 30);
        lblAvisoTit.setFont(new Font("SansSerif", Font.BOLD, 14));
        contenedor.add(lblAvisoTit);

        JTextArea txtAviso = new JTextArea("El presente Aviso de Privacidad tiene como finalidad informarle sobre el tratamiento que se dará a los datos personales recabados...");
        txtAviso.setBounds(85, 395, 400, 150);
        txtAviso.setFont(new Font("SansSerif", Font.PLAIN, 11));
        txtAviso.setEditable(false);
        txtAviso.setLineWrap(true);
        txtAviso.setWrapStyleWord(true);
        contenedor.add(txtAviso);

        JButton btnAtras = new JButton("Atras");
        btnAtras.setBounds(490, 570, 120, 45);
        btnAtras.setBackground(new Color(171, 166, 166));
        btnAtras.setForeground(Color.BLACK);
        contenedor.add(btnAtras);

        JButton btnRegistrar = new JButton("Registrarse");
        btnRegistrar.setBounds(620, 570, 160, 45);
        btnRegistrar.setBackground(new Color(8, 41, 173));
        btnRegistrar.setForeground(Color.WHITE);
        btnRegistrar.setFont(new Font("SansSerif", Font.BOLD, 16));
        contenedor.add(btnRegistrar);
    }

    private JTextField createPlaceholderField(String placeholder, int x, int y, int w, int h) {
        JTextField field = new JTextField(placeholder);
        field.setBounds(x, y, w, h);
        field.setForeground(Color.LIGHT_GRAY);
        field.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (field.getText().equals(placeholder)) {
                    field.setText("");
                    field.setForeground(Color.BLACK);
                }
            }
            public void focusLost(FocusEvent e) {
                if (field.getText().isEmpty()) {
                    field.setForeground(Color.LIGHT_GRAY);
                    field.setText(placeholder);
                }
            }
        });
        return field;
    }
    	//censura la contraseña
    private void EchoChar(JPasswordField field, String placeholder) {
        field.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                String pass = new String(field.getPassword());
                if (pass.equals(placeholder)) {
                    field.setText("");
                    field.setEchoChar('•');
                    field.setForeground(Color.BLACK);
                }
            }
            public void focusLost(FocusEvent e) {
                String pass = new String(field.getPassword());
                if (pass.isEmpty()) {
                    field.setEchoChar((char) 0);
                    field.setForeground(Color.LIGHT_GRAY);
                    field.setText(placeholder);
                }
            }
        });
    }

    public static void main(String[] args) {
        new RegisterView().setVisible(true);
    }
}