import javax.swing.*;

public class EjemInterfaz extends JFrame
{
  public EjemInterfaz()
  {
    initComponents();
  }
  
  private void initComponents()
  {//configurar los parámetros de la ventana
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    //Crear los componentes
    JLabel etiqueta = new JLabel("Nombre: ");
    JTextField texto = new JTextField(20);
    JButton boton = new JButton("Aceptar");
    
    //Crear el contenedor
    JPanel panel = new JPanel();
    
    //Añadir los componentes al contenedor
    panel.add(etiqueta);
    panel.add(texto);
    panel.add(boton);
    
    //Asociar el contenedor a la ventana
    setContentPane(panel);
    setVisible(true);
  }
  
}
