package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaBienvenida extends JFrame implements ActionListener {

    private JButton btnRegistroCarrera;
    private JButton btnRegistroEstudiante;
    private JButton btnBusquedaEstudiante;
    private JButton btnSalir;

    public VentanaBienvenida() {
        super("Menu Intranet");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes
        JLabel lblTitulo = new JLabel("Intranet");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);

        btnRegistroCarrera = new JButton("Registro Carrera");
        btnRegistroEstudiante = new JButton("Registro Estudiante");
        btnBusquedaEstudiante = new JButton("Busqueda Estudiante");
        btnSalir = new JButton("Salir");

        // Agregar componentes
        JPanel panelBotones = new JPanel(new GridLayout(4, 1, 10, 10));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelBotones.add(btnRegistroCarrera);
        panelBotones.add(btnRegistroEstudiante);
        panelBotones.add(btnBusquedaEstudiante);
        panelBotones.add(btnSalir);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(lblTitulo, BorderLayout.NORTH);
        getContentPane().add(panelBotones, BorderLayout.CENTER);

        // Agregar listeners
        btnRegistroCarrera.addActionListener(this);
        btnRegistroEstudiante.addActionListener(this);
        btnBusquedaEstudiante.addActionListener(this);
        btnSalir.addActionListener(this);

        // Mostrar ventana
        setSize(300, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistroCarrera) {
            // Acción del botón "Registro Carrera"

            VentanaRegistroCarrera ventanaRegistroCarrera = new VentanaRegistroCarrera();
            //Cierra la ventana actual
            this.dispose();
        } else if (e.getSource() == btnRegistroEstudiante) {
            // Acción del botón "Registro Estudiante"

            VentanaRegistroEstudiante ventanaRegistroEstudiante = new VentanaRegistroEstudiante();
            ventanaRegistroEstudiante.mostrar();
            this.dispose();

        } else if (e.getSource() == btnBusquedaEstudiante) {
            // Acción del botón "Búsqueda Estudiante"
            VentanaBusquedaEstudiante ventanaBusquedaEstudiante = new VentanaBusquedaEstudiante();

            this.dispose();
        } else if (e.getSource() == btnSalir) {
            // Acción del botón "Salir"
            this.dispose();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new VentanaBienvenida();
    }
}
