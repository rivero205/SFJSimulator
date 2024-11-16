package so2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import so2.SimulatorSFJ.Proceso;

public class DiagramaGantt extends JPanel {
    private List<Proceso> procesos;
    private final int MARGEN = 50;
    private final int ALTURA_PROCESO = 40;
    private final int ESCALA = 50;
    private final Color[] COLORES = {
        new Color(51, 153, 255),    // Azul
        new Color(255, 102, 102),   // Rojo
        new Color(102, 255, 102),   // Verde
        new Color(255, 204, 102),   // Naranja
        new Color(153, 102, 255),   // Morado
        new Color(255, 153, 204),   // Rosa
        new Color(102, 255, 255),   // Cyan
        new Color(255, 255, 102)    // Amarillo
    };

    public DiagramaGantt(List<Proceso> procesos) {
        this.procesos = new ArrayList<>(procesos);
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int y = MARGEN;
        int tiempoAcumulado = 0;

        // Dibujar línea de tiempo
        g2d.drawLine(MARGEN, y, getWidth() - MARGEN, y);

        // Dibujar procesos
        for (int i = 0; i < procesos.size(); i++) {
            Proceso proceso = procesos.get(i);
            // Seleccionar color del arreglo de colores
            g2d.setColor(COLORES[i % COLORES.length]);
            
            // Dibujar nombre del proceso
            g2d.drawString(proceso.getNombre(), 10, y + ALTURA_PROCESO/2);
            
            // Dibujar barra del proceso
            g2d.fillRect(MARGEN + (tiempoAcumulado * ESCALA), 
                        y, 
                        proceso.getTiempoRafaga() * ESCALA, 
                        ALTURA_PROCESO);
            
            // Borde de la barra
            g2d.setColor(Color.BLACK);
            g2d.drawRect(MARGEN + (tiempoAcumulado * ESCALA), 
                        y, 
                        proceso.getTiempoRafaga() * ESCALA, 
                        ALTURA_PROCESO);
            
            // Mostrar tiempo de inicio y fin
            g2d.drawString(String.valueOf(tiempoAcumulado), 
                          MARGEN + (tiempoAcumulado * ESCALA), 
                          y + ALTURA_PROCESO + 15);
            
            tiempoAcumulado += proceso.getTiempoRafaga();
            y += ALTURA_PROCESO + 20;
        }

        // Mostrar tiempo final
        g2d.drawString(String.valueOf(tiempoAcumulado), 
                      MARGEN + (tiempoAcumulado * ESCALA), 
                      MARGEN + ALTURA_PROCESO + 15);
    }

    @Override
    public Dimension getPreferredSize() {
        int maxTiempo = procesos.stream()
                               .mapToInt(Proceso::getTiempoRafaga)
                               .sum();
        
        return new Dimension(
            MARGEN * 2 + maxTiempo * ESCALA + 100,
            MARGEN * 2 + procesos.size() * (ALTURA_PROCESO + 20) + 50
        );
    }
}