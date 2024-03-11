package inputs;

import main.Panel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {

    private Panel gamePanel;

    public KeyboardInputs(Panel gamePanel) {

        this.gamePanel = gamePanel;

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                System.out.println("s");
                gamePanel.cambiarDelta_y(-5);
                break;
            case KeyEvent.VK_S:
                gamePanel.cambiarDelta_y(5);
                break;
            case KeyEvent.VK_A:
                gamePanel.cambiarDelta_x(-5);
                break;
            case KeyEvent.VK_D:
                gamePanel.cambiarDelta_x(5);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
