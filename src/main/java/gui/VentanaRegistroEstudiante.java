package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaRegistroEstudiante implements ActionListener {
    // Componentes de la ventana
    private JFrame ventana;
    private JTextField nombreTextField;
    private JTextField rutTextField;
    private JTextField matriculaTextField;
    private JComboBox<String> carreraComboBox;
    private JButton registrarButton;
    private JButton cancelarButton;

    // Constructor de la ventana
    public VentanaRegistroEstudiante() {
        // Crear la ventana y establecer sus propiedades
        ventana = new JFrame("Registro de Estudiante");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);

        // Crear los componentes de la ventana
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreTextField = new JTextField(20);
        JLabel rutLabel = new JLabel("RUT:");
        rutTextField = new JTextField(20);
        JLabel matriculaLabel = new JLabel("N° Matrícula:");
        matriculaTextField = new JTextField(20);
        JLabel carreraLabel = new JLabel("Carrera:");
        carreraComboBox = new JComboBox<String>(new String[]{"Ingeniería", "Derecho", "Medicina"});
        registrarButton = new JButton("Registrar");
        cancelarButton = new JButton("Cancelar");

        // Agregar los componentes a la ventana
        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(nombreLabel);
        panel.add(nombreTextField);
        panel.add(rutLabel);
        panel.add(rutTextField);
        panel.add(matriculaLabel);
        panel.add(matriculaTextField);
        panel.add(carreraLabel);
        panel.add(carreraComboBox);
        panel.add(registrarButton);
        panel.add(cancelarButton);
        ventana.getContentPane().add(panel);

        // Agregar ActionListener a los botones
        registrarButton.addActionListener(this);
        cancelarButton.addActionListener(this);
    }

    // Método para mostrar la ventana
    public void mostrar() {
        ventana.setVisible(true);
    }

    // Implementación de ActionListener
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registrarButton) {
            // Acción a realizar al presionar el botón "Registrar"
            String nombre = nombreTextField.getText();
            String rut = rutTextField.getText();
            String matricula = matriculaTextField.getText();
            String carrera = carreraComboBox.getSelectedItem().toString();
            System.out.println("Nombre: " + nombre);
            System.out.println("RUT: " + rut);
            System.out.println("N° Matrícula: " + matricula);
            System.out.println("Carrera: " + carrera);
        } else if (e.getSource() == cancelarButton) {
            // Acción a realizar al presionar el botón "Cancelar"
            ventana.dispose();
        }
    }

    // Método main para probar la ventana
    public static void main(String[] args) {
        VentanaRegistroEstudiante ventanaRegistroEstudiante = new VentanaRegistroEstudiante();
        ventanaRegistroEstudiante.mostrar();
    }
}
