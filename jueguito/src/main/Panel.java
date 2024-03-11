package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Panel extends JPanel {

    private MouseInputs mouseInputs;
    private int xDelta = 0, yDelta = 0;
    public Panel() {

        mouseInputs = new MouseInputs();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }

    public void cambiarDelta_x(int valor) {

        this.xDelta += valor;
        repaint();

    }

    public void cambiarDelta_y(int valor) {

        this.yDelta += valor;
        repaint();

    }


    public void paintComponent(Graphics g) {

        // llama al paintComponent de la super clase JPanel
        super.paintComponent(g);

        g.fillRect(100 + xDelta,100 + yDelta,200,50);

    }
}
