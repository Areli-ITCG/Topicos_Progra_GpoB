import javax.swing.*;
import java.awt.*;

public class JFrameDatosB extends JFrame
{
   PanelDatosB pdB = new PanelDatosB();
   public JFrameDatosB()
   {
     initComponents();
   }
   
   private void initComponents()
   {
     super.setVisible(false);
     super.dispose();
     setSize(300,200);
     setTitle("Datos Personales");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setContentPane(pdB);
     setResizable(false);
     setVisible(true);
   }
}
