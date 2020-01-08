package movingfigure;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author thesh
 */
public class DrawingBoard extends JPanel {
    
    Figure figure;
    
    public DrawingBoard(Figure figure) {
        this.figure = figure;
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.figure.draw(graphics);
    }
}

