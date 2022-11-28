import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameWindow extends JFrame implements KeyListener {
    private final Car car;
    public GameWindow() {
        car = new Car();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        add(new GamePanel(car));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_F1:
                displayHelp();
                break;
            case KeyEvent.VK_UP:
                car.setThrottle(true);
                break;
            case KeyEvent.VK_DOWN:
                car.setIsBraking(true);
                break;
            case KeyEvent.VK_LEFT:
                car.changeDirection(-10);
                break;
            case KeyEvent.VK_RIGHT:
                car.changeDirection(10);
                break;
            case KeyEvent.VK_A:
                car.shiftUp();
                break;
            case KeyEvent.VK_Z:
                car.shiftDown();
                break;
            case KeyEvent.VK_E:
                car.toggleEngine();
                break;
            case KeyEvent.VK_R:
                car.reset();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_UP:
                car.setThrottle(false);
                break;
            case KeyEvent.VK_DOWN:
                car.setIsBraking(false);
                break;
        }
    }

    private void displayHelp() {
        JOptionPane.showMessageDialog(this,
    "E - toggle engine on / off\n" +
            "UP / DOWN - accellerate / brake\n" +
            "LEFT / RIGHT - steer left / right\n" +
            "A / Z - shift gear up/down\n" +
            "R - reset simulation\n", "Help", JOptionPane.INFORMATION_MESSAGE);
    }
}
