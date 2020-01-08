package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author thesh
 */
public class Square extends Figure {

    private int sideLength;

    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    public void draw(Graphics graphics) {
        graphics.fillRect(super.getX(), super.getY(), sideLength, sideLength);
    }
}
