package main;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Memorice extends JFrame {

	  private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	 public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    Memorice frame = new Memorice();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
	public Memorice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JLabel marcador = new JLabel("0");
        marcador.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(marcador, BorderLayout.NORTH);

        JPanel tablero = new JPanel();
        tablero.setLayout(new GridLayout(3, 4, 10, 10));
        contentPane.add(tablero, BorderLayout.CENTER);

        JButton c1 = new JButton("");
        tablero.add(c1);
        JButton c2 = new JButton("");
        tablero.add(c2);
        JButton c3 = new JButton("");
        tablero.add(c3);
        JButton c4 = new JButton("");
        tablero.add(c4);
        JButton c6 = new JButton("");
        tablero.add(c6);
        JButton c7 = new JButton("");
        tablero.add(c7);
        JButton c8 = new JButton("");
        tablero.add(c8);
        JButton c9 = new JButton("");
        tablero.add(c9);
        JButton c5 = new JButton("");
        tablero.add(c5);
        JButton c10 = new JButton("");
        tablero.add(c10);
        JButton c11 = new JButton("");
        tablero.add(c11);
        JButton c12 = new JButton("");
        tablero.add(c12);

        JPanel panelSur = new JPanel();
        contentPane.add(panelSur, BorderLayout.SOUTH);

        JButton reiniciar = new JButton("Reiniciar");
        panelSur.add(reiniciar);

        JButton pausa = new JButton("Pausa");
        panelSur.add(pausa); 
    }
}