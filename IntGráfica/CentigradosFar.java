import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CentigradosFar extends JFrame
{
  JTextField cent, far;
  JButton btnAceptar, btnSalir;
  JLabel lblLetrero, lblCent, lblFar;
  JPanel panel;
  
  public CentigradosFar()
  {
   initComponents();
  }
  
  private void initComponents()
  {
    setSize(400, 200);
    lblLetrero = new JLabel("Convertidor Grados Centigrados a Farenheit");
    lblCent = new JLabel("Grados Centigrados: ");
    cent = new JTextField(10);
    lblFar = new JLabel("Grados Farenheit: ");
    far = new JTextField("0.0", 10);
    far.setEditable(false);
    btnAceptar = new JButton("Aceptar");
    btnAceptar.setMnemonic('A');
    btnSalir = new JButton("Salir");
    btnSalir.setMnemonic('S');
   
    btnAceptar.addMouseListener(new MyClickListener());
    btnSalir.addMouseListener(new MyClick());
   
    panel = new JPanel();
    GridLayout gl = new GridLayout(0, 2);

    panel.setLayout(gl);
    //panel.add(lblLetrero);
    panel.add(lblCent);
    panel.add(cent);
    panel.add(lblFar);
    panel.add(far);
    panel.add(btnAceptar);
    panel.add(btnSalir);
    setContentPane(panel);
    setVisible(true);
  }
  
  private class MyClickListener extends MouseAdapter
  {
    double farenheit=0.0;
    int centigrados;
        
    public void mouseClicked(MouseEvent event)
    {
    try{
        centigrados = Integer.parseInt(cent.getText());
        farenheit = (centigrados * 9 / 5) + 32; //Conversión
        far.setText(String.valueOf(farenheit));
       } 
     catch(NumberFormatException e)
     {
       JOptionPane.showMessageDialog(null, "El valor de los grados centígrados es incorrecto",
         "Error", JOptionPane.ERROR_MESSAGE);
         far.setText("0.0");
         cent.setText("");
         cent.requestFocus();
      }
    }
  }
  
  private class MyClick extends MouseAdapter
  {
    public void mouseClicked(MouseEvent event)
    {
      System.exit(0);
    }
  }
}
