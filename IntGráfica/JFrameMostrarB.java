import javax.swing.*;
import java.awt.*;

public class JFrameMostrarB extends JFrame
{
   MostrarDatosB pdB = new MostrarDatosB();
   
   public JFrameMostrarB()
   {
     initComponents();
   }
   
   private void initComponents()
   {
     setSize(300,200);
     setTitle("Contactos Guardados");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setContentPane(pdB);
     setResizable(false);
     setVisible(true);
   }
}
