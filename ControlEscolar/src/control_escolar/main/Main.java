package control_escolar.main;

import javax.swing.SwingUtilities;
import control_escolar.view.LoginView;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new LoginView().setVisible(true);
        });

    }
}