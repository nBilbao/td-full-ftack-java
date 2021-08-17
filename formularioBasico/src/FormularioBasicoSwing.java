import javax.swing.*;
import java.awt.*;

public class FormularioBasicoSwing extends JFrame {

    public FormularioBasicoSwing() {
        super("Formulario de Atención al Cliete");
        getContentPane().setLayout(new FlowLayout());
        JLabel label = new JLabel("Introduce tu nombre:");
        JTextField textfield = new JTextField("nombre",20);
        JLabel label2 = new JLabel("Introduce tu RUT:");
        JTextField textfield2 = new JTextField("rut",20);
        JLabel label3 = new JLabel("Introduce tu Teléfono:");
        JTextField textfield3 = new JTextField("telefono",20);
        JLabel label4 = new JLabel("Introduce tu Dirección:");
        JTextField textfield4 = new JTextField("direccion",20);

        JLabel label5 = new JLabel("Introduce tu Región:");
        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem("Arica y Parinacota");
        jComboBox.addItem("Tarapacá");
        jComboBox.addItem("Antofagasta");
        jComboBox.addItem("Atacama");
        jComboBox.addItem("Coquimbo");
        jComboBox.addItem("Valparaíso");
        jComboBox.addItem("Metropolitana");
        jComboBox.addItem("O'Higgins");
        jComboBox.addItem("Maule");
        jComboBox.addItem("Ñuble");
        jComboBox.addItem("Biobío");
        jComboBox.addItem("Araucanía");
        jComboBox.addItem("Los Ríos");
        jComboBox.addItem("Los Lagos");
        jComboBox.addItem("Aysén");
        jComboBox.addItem("Magallanes");
        JLabel label6 = new JLabel("Motivo de contacto:");
        JTextArea textArea = new JTextArea(10,35);
        JLabel label7 = new JLabel("Satisfacción:");
        JRadioButton r1=new JRadioButton("A) Buena");
        JRadioButton r2=new JRadioButton("B) Regular");
        JRadioButton r3=new JRadioButton("C) Mala");
        r1.setBounds(75,50,100,30);
        r2.setBounds(75,100,100,30);
        r3.setBounds(75,100,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        JButton boton = new JButton("Enviar");
        getContentPane().add(label);
        getContentPane().add(textfield);
        getContentPane().add(label2);
        getContentPane().add(textfield2);
        getContentPane().add(label3);
        getContentPane().add(textfield3);
        getContentPane().add(label4);
        getContentPane().add(textfield4);
        getContentPane().add(label5);
        getContentPane().add(jComboBox);
        getContentPane().add(label6);
        getContentPane().add(textArea);
        getContentPane().add(label7);
        getContentPane().add(r1);
        getContentPane().add(r2);
        getContentPane().add(r3);

        getContentPane().add(boton);
        setSize(470,600);
        setVisible(true);
    }
}
