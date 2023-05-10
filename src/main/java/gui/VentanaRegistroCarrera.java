package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaRegistroCarrera extends JFrame implements ActionListener {

    private JTextField txtNombreCarrera;
    private JTextField txtCodigoCarrera;
    private JTextField txtCantidadSemestres;
    private JButton btnRegistrarCarrera;
    private JButton btnCancelar;

    public VentanaRegistroCarrera() {
        super("Registro de Carrera");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes
        JLabel lblNombreCarrera = new JLabel("Nombre de la carrera:");
        txtNombreCarrera = new JTextField(20);
        JLabel lblCodigoCarrera = new JLabel("Código de la carrera:");
        txtCodigoCarrera = new JTextField(10);
        JLabel lblCantidadSemestres = new JLabel("Cantidad de semestres:");
        txtCantidadSemestres = new JTextField(2);
        btnRegistrarCarrera = new JButton("Registrar Carrera");
        btnCancelar = new JButton("Cancelar");

        // Agregar componentes
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelFormulario.add(lblNombreCarrera);
        panelFormulario.add(txtNombreCarrera);
        panelFormulario.add(lblCodigoCarrera);
        panelFormulario.add(txtCodigoCarrera);
        panelFormulario.add(lblCantidadSemestres);
        panelFormulario.add(txtCantidadSemestres);
        panelPrincipal.add(panelFormulario, BorderLayout.CENTER);
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBotones.add(btnRegistrarCarrera);
        panelBotones.add(btnCancelar);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
        getContentPane().add(panelPrincipal);

        // Agregar listeners
        btnRegistrarCarrera.addActionListener(this);
        btnCancelar.addActionListener(this);

        // Mostrar ventana
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistrarCarrera) {
            // Acción del botón "Registrar Carrera"
            String nombreCarrera = txtNombreCarrera.getText();
            String codigoCarrera = txtCodigoCarrera.getText();
            int cantidadSemestres = Integer.parseInt(txtCantidadSemestres.getText());
            System.out.println("Se registró la carrera " + nombreCarrera + " con código " + codigoCarrera +
                    " y " + cantidadSemestres + " semestres.");
        } else if (e.getSource() == btnCancelar) {
            // Acción del botón "Cancelar"
            VentanaBienvenida ventanaBienvenida = new VentanaBienvenida();
            this.dispose();
        }
    }
    public static void main(String[] args) {
        new VentanaRegistroCarrera();
    }
}
