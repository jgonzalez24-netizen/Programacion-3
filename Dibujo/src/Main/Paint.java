package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Paint {

    static Color colorActual = Color.BLACK;
    static int grosorActual = 5;
    static boolean usandoBrocha = false;

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Paint - Diseño");
        ventana.setSize(700, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        JPanel herramientas = new JPanel();

        JButton pincel = new JButton("Pincel");
        JButton borrador = new JButton("Borrador");

        herramientas.add(pincel);
        herramientas.add(borrador);

        JPanel panelFormas = new JPanel();
        panelFormas.setBorder(BorderFactory.createTitledBorder("Formas"));
        panelFormas.setLayout(new GridLayout(4, 1));

        JRadioButton rectangulo = new JRadioButton("Rectángulo", true);
        JRadioButton circulo = new JRadioButton("Círculo");
        JRadioButton triangulo = new JRadioButton("Triángulo");
        JRadioButton linea = new JRadioButton("Línea");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rectangulo);
        grupo.add(circulo);
        grupo.add(triangulo);
        grupo.add(linea);

        panelFormas.add(rectangulo);
        panelFormas.add(circulo);
        panelFormas.add(triangulo);
        panelFormas.add(linea);

        ventana.add(panelFormas, BorderLayout.WEST);

        herramientas.add(new JLabel("Grosor"));

        JSlider slider = new JSlider(1, 20, 5);
        herramientas.add(slider);

        JButton limpiar = new JButton("Limpiar");
        herramientas.add(limpiar);

        ventana.add(herramientas, BorderLayout.NORTH);

        JPanel contenedorColores = new JPanel(new BorderLayout());
        contenedorColores.setBackground(new Color(200,200,200));
        contenedorColores.setPreferredSize(new Dimension(90,0));

        JPanel colores = new JPanel(new GridLayout(3,2,6,6));
        colores.setBackground(new Color(160,160,160));
        colores.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        Dimension tam = new Dimension(25,25);

        JButton negro = new JButton();
        negro.setBackground(Color.BLACK);
        negro.setPreferredSize(tam);
        negro.setOpaque(true);
        negro.setBorderPainted(false);

        JButton blanco = new JButton();
        blanco.setBackground(Color.WHITE);
        blanco.setPreferredSize(tam);
        blanco.setOpaque(true);
        blanco.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JButton gris = new JButton();
        gris.setBackground(Color.GRAY);
        gris.setPreferredSize(tam);
        gris.setOpaque(true);
        gris.setBorderPainted(false);

        JButton azul = new JButton();
        azul.setBackground(Color.BLUE);
        azul.setPreferredSize(tam);
        azul.setOpaque(true);
        azul.setBorderPainted(false);

        JButton rojo = new JButton();
        rojo.setBackground(Color.RED);
        rojo.setPreferredSize(tam);
        rojo.setOpaque(true);
        rojo.setBorderPainted(false);

        JButton verde = new JButton();
        verde.setBackground(Color.GREEN);
        verde.setPreferredSize(tam);
        verde.setOpaque(true);
        verde.setBorderPainted(false);

        colores.add(negro);
        colores.add(blanco);
        colores.add(gris);
        colores.add(azul);
        colores.add(rojo);
        colores.add(verde);

        contenedorColores.add(colores, BorderLayout.NORTH);
        ventana.add(contenedorColores, BorderLayout.EAST);

        Lienzo lienzo = new Lienzo();
        ventana.add(lienzo, BorderLayout.CENTER);

        pincel.addActionListener(e -> usandoBrocha = true);

        borrador.addActionListener(e -> {
            usandoBrocha = true;
            colorActual = Color.WHITE;
        });

        slider.addChangeListener(e ->
                grosorActual = slider.getValue()
        );

        limpiar.addActionListener(e ->
                lienzo.limpiar()
        );

        negro.addActionListener(e -> colorActual = Color.BLACK);
        blanco.addActionListener(e -> colorActual = Color.WHITE);
        gris.addActionListener(e -> colorActual = Color.GRAY);
        azul.addActionListener(e -> colorActual = Color.BLUE);
        rojo.addActionListener(e -> colorActual = Color.RED);
        verde.addActionListener(e -> colorActual = Color.GREEN);

        ventana.setVisible(true);
    }
}

class Lienzo extends JPanel {

    ArrayList<Punto> puntos = new ArrayList<>();

    public Lienzo() {

        setBackground(Color.WHITE);

        addMouseMotionListener(new MouseMotionAdapter() {

            public void mouseDragged(MouseEvent e) {

                if(Paint.usandoBrocha){

                    puntos.add(new Punto(
                            e.getX(),
                            e.getY(),
                            Paint.colorActual,
                            Paint.grosorActual
                    ));

                    repaint();
                }
            }
        });
    }

    public void limpiar(){
        puntos.clear();
        repaint();
    }

    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for(Punto p : puntos){
            g2.setColor(p.color);
            g2.fillOval(p.x,p.y,p.grosor,p.grosor);
        }
    }
}

class Punto{

    int x,y;
    Color color;
    int grosor;

    public Punto(int x,int y,Color color,int grosor){
        this.x=x;
        this.y=y;
        this.color=color;
        this.grosor=grosor;
    }
}