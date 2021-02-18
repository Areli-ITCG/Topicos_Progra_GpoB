import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDatosB extends JPanel implements ActionListener
{
  JButton btnGuardar, btnSalir;//visibilidad a nivel de clase
  JTextField txtNombre, txtApellidos, txtTelefono;
  JRadioButton amigo, conocido;
  ManejoPersona datos;
  
  public PanelDatosB()
  {
    setLayout(new GridLayout(5,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(20);
    add(lblNombre);
    add(txtNombre);
    
    JLabel lblApellidos = new JLabel("Apellidos: ", JLabel.RIGHT);
    txtApellidos = new JTextField(30);
    add(lblApellidos);
    add(txtApellidos);
    
    JLabel lblTelefono = new JLabel("Telefono: ", JLabel.RIGHT);
    txtTelefono = new JTextField(15);
    add(lblTelefono);
    add(txtTelefono);
    
    ButtonGroup gpoRBotones = new ButtonGroup();
    amigo = new JRadioButton("Amigo", true);
    conocido = new JRadioButton("Conocido");
    gpoRBotones.add(amigo);
    gpoRBotones.add(conocido);
    add(amigo);
    add(conocido);
    
    btnGuardar = new JButton("Guardar");
    btnGuardar.addActionListener(this);
    btnSalir   = new JButton("Salir");
    btnSalir.addActionListener(this);
    add(btnGuardar);
    add(btnSalir);
  }//Método Constructor
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == btnGuardar) {
         datos = new ManejoPersona(txtNombre.getText(), txtApellidos.getText(),
         txtTelefono.getText(),"Amigo");
         datos.imprimir();
         JOptionPane.showMessageDialog(null, "Se guardarán los datos",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);		
          }
		if (e.getSource() == btnSalir) {
			System.exit(0);
        }
  }
}//Clase
