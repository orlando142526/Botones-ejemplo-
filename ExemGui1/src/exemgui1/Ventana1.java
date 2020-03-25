
package exemgui1;

import javax.swing.JFrame;

public class Ventana1 {
   JFrame marco;
   public Ventana1(){
       
       marco=new JFrame("ventana1");
       
      //tamaño
      marco.setBounds(0,0,800,600);
       
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       marco.setVisible(true);
   }
}
