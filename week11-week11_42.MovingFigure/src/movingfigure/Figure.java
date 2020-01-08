package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author thesh
 */
public abstract class Figure {
    
    private int x;  // x coord position
    private int y;  // y coord position

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // GETTER. Retrieve x coord
    public int getX() {
        return this.x;
    }
    
    // GETTER. retrieve y coord
    public int getY() {
        return this.y;
    }
    
    // METHOD. Moves figure by dx and dy
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    public abstract void draw(Graphics graphics);
}
