package main;

import javax.swing.SwingUtilities;

public class ventana {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Pestaña();
            }
        });
    }
}