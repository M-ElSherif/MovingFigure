package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author thesh
 */
public class KeyboardListener implements KeyListener {
    
    private Component component;
    private Figure figure;
    
    public KeyboardListener(Component component, Figure figure) {
        this.figure = figure;
        this.component = component;
    }
    
    // METHOD. Detect the user input key and move the figure accordingly
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            figure.move(-1, 0);
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            figure.move(1, 0);
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            figure.move(0, -1);
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            figure.move(0, 1);
        }
        this.component.repaint();   // repaints the frame to reflect updated figure 
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }
}