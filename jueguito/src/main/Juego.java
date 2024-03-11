package main;

public class Juego {

    private Ventana ventana;
    private Panel gamePanel;

    public Juego () {

        gamePanel = new Panel();
        ventana = new Ventana(gamePanel);
        gamePanel.requestFocus();

    }

}
