import javax.swing.*;
import java.awt.event.*;

public class EjemListener extends JFrame
{
  JTextField texto;
  JButton boton;
  JPanel panel;
  
  public EjemListener()
  {
   initComponents();
  }
  
  private void initComponents()
  {
    setSize(300, 100);
    texto = new JTextField("0",20);
    texto.setEditable(false);
    boton = new JButton("Pulsa para incrementar");
    boton.addMouseListener(new MyClickListener());
    panel = new JPanel();
    panel.add(texto);
    panel.add(boton);
    setContentPane(panel);
    setVisible(true);
  }
  
  private class MyClickListener extends MouseAdapter
  {
    int numClicks=0;
    
    public void mouseClicked(MouseEvent event)
    {
      numClicks++;
      texto.setText(String.valueOf(numClicks));
    }
  }
}
