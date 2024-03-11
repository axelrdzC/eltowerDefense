package main;

import javax.swing.*;

public class Ventana extends JFrame
{

    public Ventana(Panel gamePanel) {

        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(gamePanel);
        setLocationRelativeTo(null);
        setVisible(true);

    }

}
