package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.EstudianteController;

//package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.EstudianteController;

public class VentanaRegistroEstudiante implements ActionListener {
    // Componentes de la ventana
    private JFrame ventana;
    private JTextField nombreTextField;
    private JTextField apellidoTextField;
    private JTextField rutTextField;
    private JTextField matriculaTextField;
    private JTextField codigoCarreraTextField;
    private JComboBox<String> carreraComboBox;
    private JButton registrarButton;
    private JButton cancelarButton;

    // Constructor de la ventana
    public VentanaRegistroEstudiante() {
        // Crear la ventana y establecer sus propiedades
        ventana = new JFrame("Registro de Estudiante");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 350);

        // Crear los componentes de la ventana
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreTextField = new JTextField(20);
        JPanel panelNombre = new JPanel(new FlowLayout());
        panelNombre.add(nombreLabel);
        panelNombre.add(nombreTextField);

        JLabel apellidoLabel = new JLabel("Apellido:");
        apellidoTextField = new JTextField(20);
        JPanel panelApellido = new JPanel(new FlowLayout());
        panelApellido.add(apellidoLabel);
        panelApellido.add(apellidoTextField);

        JLabel rutLabel = new JLabel("RUT:");
        rutTextField = new JTextField(20);
        JPanel panelRut = new JPanel(new FlowLayout());
        panelRut.add(rutLabel);
        panelRut.add(rutTextField);

        JLabel matriculaLabel = new JLabel("N° Matrícula:");
        matriculaTextField = new JTextField(20);
        JPanel panelMatricula = new JPanel(new FlowLayout());
        panelMatricula.add(matriculaLabel);
        panelMatricula.add(matriculaTextField);

        JLabel codigoCarreraLabel = new JLabel("Código de Carrera:");
        codigoCarreraTextField = new JTextField(20);
        JPanel panelCodigoCarrera = new JPanel(new FlowLayout());
        panelCodigoCarrera.add(codigoCarreraLabel);
        panelCodigoCarrera.add(codigoCarreraTextField);

        JLabel carreraLabel = new JLabel("Carrera:");
        carreraComboBox = new JComboBox<String>(new String[]{"Ingeniería", "Derecho", "Medicina"});
        JPanel panelCarrera = new JPanel(new FlowLayout());
        panelCarrera.add(carreraLabel);
        panelCarrera.add(carreraComboBox);

        registrarButton = new JButton("Registrar");
        JPanel panelRegistrar = new JPanel(new FlowLayout());
        panelRegistrar.add(registrarButton);

        cancelarButton = new JButton("Cancelar");
        JPanel panelCancelar = new JPanel(new FlowLayout());
        panelCancelar.add(cancelarButton);

        // Agregar ActionListener a los botones
        registrarButton.addActionListener(this);
        cancelarButton.addActionListener(this);

        // Agregar los componentes a la ventana
        JPanel panelFormulario = new JPanel(new GridLayout(6, 1, 10, 10));
        panelFormulario.add(panelNombre);
        panelFormulario.add(panelApellido);
        panelFormulario.add(panelRut);
        panelFormulario.add(panelMatricula);
        panelFormulario.add(panelCodigoCarrera);
        panelFormulario.add(panelCarrera);
        ventana.getContentPane().add(panelFormulario, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(panelRegistrar);
        panelBotones.add(panelCancelar);
        ventana.getContentPane().add(panelBotones, BorderLayout.SOUTH);
    }

    // Método para mostrar la ventana
    public void mostrar() {
        ventana.setVisible(true);
    }

    // Método para registrar un estudiante
    private boolean registrarEstudiante() throws ClassNotFoundException {
        if(matriculaTextField.getText().length() == 0 || nombreTextField.getText().length() == 0 || rutTextField.getText().length() == 0 || carreraComboBox.getSelectedItem().equals("Error no existen carreras")) {
            return false;
        } else {
            //String nombre,String apellido, String rut, String matricula, String codigoCarrera
            return true;
            // return EstudianteController.registrarEstudiante(nombreTextField.getText(), rutTextField.getText(), matriculaTextField.getText(), carreraComboBox.getSelectedItem().toString());
        }
    }

    // Implementación de ActionListener
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registrarButton) {
            // Acción a realizar al presionar el botón "Registrar"
            String nombre = nombreTextField.getText();
            String apellido = apellidoTextField.getText();
            String rut = rutTextField.getText();
            String matricula = matriculaTextField.getText();
            String codigoCarrera = codigoCarreraTextField.getText();
            String carrera = carreraComboBox.getSelectedItem().toString();

            try {
                if (registrarEstudiante()) {
                    JOptionPane.showMessageDialog(ventana, "Estudiante registrado correctamente");
                    VentanaBienvenida ventanaBienvenida = new VentanaBienvenida();
                    ventana.dispose();
                } else {
                    JOptionPane.showMessageDialog(ventana, "Ingrese datos válidos");
                }
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        } else if (e.getSource() == cancelarButton) {
            VentanaBienvenida ventanaBienvenida = new VentanaBienvenida();
            ventana.dispose(); // Cerrar la ventana actual
        }
    }

    // Método main para probar la ventana
    public static void main(String[] args) {
        VentanaRegistroEstudiante ventanaRegistroEstudiante = new VentanaRegistroEstudiante();
        ventanaRegistroEstudiante.mostrar();
    }
}