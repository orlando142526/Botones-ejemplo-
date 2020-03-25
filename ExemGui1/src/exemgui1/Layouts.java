package exemgui1;

import java.awt.*;
import javax.swing.*;

public class Layouts {

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;

    public Layouts() {
        marco = new JFrame(" LAYOUTS ");
        panel = new JPanel();
        boton1 = new JButton("BOTON 1");
        boton2 = new JButton("BOTON 2");
        boton2.setBackground(Color.yellow);
        boton3 = new JButton("BOTON 3");
        boton4 = new JButton("BOTON 4");
        boton5 = new JButton("BOTON 5");

    }

    public void disFlowLayout() {
        // asociamos o panel o distribuidor de layout
        panel.setLayout(new FlowLayout());
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);

        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

    public void disBoxLayout() {

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    public void disBorderLayout() {
        panel.setLayout(new BorderLayout());
        panel.add(boton1, BorderLayout.NORTH);
        panel.add(boton2, BorderLayout.SOUTH);
        panel.add(boton3, BorderLayout.EAST);
        panel.add(boton4, BorderLayout.CENTER);
        panel.add(boton5, BorderLayout.WEST);
        marco.add(panel);
        marco.setSize(600, 400);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
public void disGridLayout(){
    panel.setLayout(new GridLayout(2,3));
    panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        
         marco.add(panel);
        marco.setSize(600, 400);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
}
        
    
    
}
