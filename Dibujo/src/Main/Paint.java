package Main;

import javax.swing.*;
import java.awt.*;

public class Paint {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Paint - Diseño");
        ventana.setSize(700, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        JPanel herramientas = new JPanel();
        herramientas.add(new JButton("Pincel"));
        herramientas.add(new JButton("Borrador"));
        
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
        slider.setEnabled(true);
        herramientas.add(slider);
        herramientas.add(new JButton("Limpiar"));
        
        ventana.add(herramientas, BorderLayout.NORTH);
        
        JPanel colores = new JPanel();
        colores.add(new JButton("Negro"));
        colores.add(new JButton("Blanco"));
        colores.add(new JButton("Gris"));
        colores.add(new JButton("Azul"));
        colores.add(new JButton("Rojo"));
        colores.add(new JButton("Verde"));
        ventana.add(colores, BorderLayout.EAST);
        
        JPanel lienzo = new JPanel();
        lienzo.setBackground(Color.WHITE);
        ventana.add(lienzo, BorderLayout.CENTER);
        ventana.setVisible(true);
	}

}
