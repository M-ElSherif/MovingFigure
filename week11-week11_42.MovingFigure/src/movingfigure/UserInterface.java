package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure figure;

    public UserInterface(Figure figure) {
        this.figure = figure;
    }
    
    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(600, 600));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        addListeners();
        frame.pack();
        frame.setVisible(true);
    }

    // METHOD. Create a DrawingBoard panel instance with class figure
    private void createComponents(Container container) {
        DrawingBoard db = new DrawingBoard(this.figure);
        container.add(db);
    }

    // METHOD. Add the keyboard listeners to frame component
    private void addListeners() {
        KeyboardListener keyboardListener = new KeyboardListener(this.frame, this.figure );
        this.frame.addKeyListener(keyboardListener);
    }

    public JFrame getFrame() {
        return frame;
    }
}
