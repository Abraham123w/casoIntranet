package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaBusquedaEstudiante extends JFrame implements ActionListener {

    private JTextField txtNombreEstudiante;
    private JComboBox<String> cmbCarrera;
    private JButton btnBuscarEstudiante;
    private JButton btnRegresar;

    public VentanaBusquedaEstudiante() {
        super("Búsqueda de Estudiantes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes
        JLabel lblNombreEstudiante = new JLabel("Nombre del estudiante:");
        txtNombreEstudiante = new JTextField(20);
        String[] carreras = {"Carrera 1", "Carrera 2", "Carrera 3"};
        cmbCarrera = new JComboBox<>(carreras);
        btnBuscarEstudiante = new JButton("Buscar Estudiante");
        btnRegresar = new JButton("Regresar");

        // Agregar componentes
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        JPanel panelFormulario = new JPanel(new GridLayout(2, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelFormulario.add(lblNombreEstudiante);
        panelFormulario.add(txtNombreEstudiante);
        panelFormulario.add(new JLabel("Carrera:"));
        panelFormulario.add(cmbCarrera);
        panelPrincipal.add(panelFormulario, BorderLayout.CENTER);
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBotones.add(btnBuscarEstudiante);
        panelBotones.add(btnRegresar);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
        getContentPane().add(panelPrincipal);

        // Agregar listeners
        btnBuscarEstudiante.addActionListener(this);
        btnRegresar.addActionListener(this);

        // Mostrar ventana
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscarEstudiante) {
            // Acción del botón "Buscar Estudiante"
            String nombreEstudiante = txtNombreEstudiante.getText();
            String carreraSeleccionada = (String) cmbCarrera.getSelectedItem();
            System.out.println("Se buscó al estudiante " + nombreEstudiante + " de la carrera " + carreraSeleccionada);
        } else if (e.getSource() == btnRegresar) {
            // Acción del botón "Regresar"
            VentanaBienvenida ventanaBienvenida = new VentanaBienvenida();
            this.dispose();
        }
    }
    public static void main(String[] args) {
        new VentanaBusquedaEstudiante();
    }
}
