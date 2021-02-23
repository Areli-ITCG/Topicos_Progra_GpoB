import javax.swing.*;
import java.awt.*;

public class JFrameIngresoB extends JFrame
{
   IngresoB ingreso = new IngresoB();
   
    public JFrameIngresoB()
   {  
      initComponents();
   }
   
   private void initComponents()
   {
      setSize(250, 150);
      setTitle("Usuario y Contraseña");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(ingreso);
      setVisible(true);
       
   }   
}
