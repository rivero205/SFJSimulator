package so2;

import java.awt.*;
import javax.swing.JFrame;
import so2.SimulatorSFJ;

public class SO2 {

    public static void main(String[] args) {
        // Crear un JFrame (ventana)
        JFrame frame = new JFrame("Simulador");

        // Crear el JPanel SimulatorSFJ
        SimulatorSFJ simulatorPanel = new SimulatorSFJ();

        // Configura el JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la ventana al hacer clic en la "X"
        frame.getContentPane().add(simulatorPanel); // Agrega el JPanel al JFrame
        frame.pack(); // Ajusta el tamaño del JFrame al tamaño preferido del JPanel
        frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        frame.setVisible(true); // Muestra la ventana
    }
}
