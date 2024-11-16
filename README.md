

# Simulador SJF (Shortest Job First)

Un simulador gráfico del algoritmo de planificación SJF desarrollado en Java, que te permite visualizar cómo funciona la planificación de procesos por tiempo más corto primero.

## 🚀 Características Principales

- Interfaz gráfica amigable
- Visualización en tiempo real
- Diagrama de Gantt colorido
- Cálculo automático de tiempos de espera

## 🛠️ Tecnologías Utilizadas

- Java
- Swing (GUI)
- NetBeans IDE

## 📁 Estructura del Proyecto

```
SimuladorSJF/
│
├── 🎯 src/so2/
│   ├── SimulatorSFJ.java    # Interfaz principal y lógica
│   ├── DiagramaGantt.java   # Visualización del diagrama
│   └── SO2.java            # Punto de entrada

```

## 💡 Componentes Principales

### 1. Clase Principal (SimulatorSFJ)

```19:60:src/so2/SimulatorSFJ.java
public class SimulatorSFJ extends javax.swing.JPanel {
    private DefaultTableModel tableModel; // Modelo para manejar la tabla
    private int processCounter = 1; // Contador de procesos (P1, P2, ...)
    private DefaultTableModel tableModel; // Modelo para manejar la tabla
    // Lista para almacenar los procesos internamente
    private List<Proceso> listaProcesos = new ArrayList<>();
    public SimulatorSFJ() {
        initComponents();
    }
        tableModel = new DefaultTableModel(new Object[]{"Procesos", "Tiempo de Ráfaga"}, 0);
        TableProcesos.setModel(tableModel);
    }
        private String nombre; 
    public class Proceso {
       
        }
```


### 2. Diagrama de Gantt

```1:24:src/so2/DiagramaGantt.java
package so2;
package so2;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import so2.SimulatorSFJ.Proceso;
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
        Graphics2D g2d = (Graphics2D) g;
```


## 🎮 Ejemplo de Uso

1. Ingresa el tiempo de ráfaga (ejemplo: 5)
2. Click en "Añadir Proceso"
3. Repite para más procesos
4. ¡Observa el diagrama de Gantt!

## 🎨 Capturas de Pantalla



https://github.com/user-attachments/assets/d878fdef-b80f-4833-bab7-a2bcc59dbdd0



## 👨‍💻 Desarrollador

Desarrollado con ❤️ por Maicol Vivero
