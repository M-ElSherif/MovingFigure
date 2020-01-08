package movingfigure;

import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author thesh
 */
public class CompoundFigure extends Figure {

    private List<Figure> compoundFigure = new ArrayList<Figure>();

    public CompoundFigure() {
        super(0,0);
    }

    // METHOD. Add the figure to the figure list
    public void add(Figure f) {
        this.compoundFigure.add(f);
    }

    // METHOD. Move each figure in figure list
    public void move(int dx, int dy) {
        for (Figure f : this.compoundFigure) {
            f.move(dx, dy);
        }
    }

    // INHERITED METHOD. Draw each figure in figure list
    @Override
    public void draw(Graphics graphics) {
        for (Figure f : this.compoundFigure) {
            f.draw(graphics);
        }
    }

}
