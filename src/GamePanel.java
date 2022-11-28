import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class GamePanel extends Component implements ActionListener {
    private BufferedImage img;
    private Timer timer;
    private int updateInterval = 33;
    private int pause = 0;
    private Car car;
    public GamePanel(Car car) {
        this.car = car;
        timer = new Timer(updateInterval, this);
        timer.setInitialDelay(pause);
        timer.start();
        try {
            img = ImageIO.read(new File("img/car.png"));

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        drawBackground(g2d);
        drawUI(g2d);
        drawCar(g2d);
    }

    public String parseGearNumber(int gearNumber) {
        switch (car.currentGearNumber()) {
            case 0:
                return "R";
            case 1:
                return "N";
            default:
                return String.valueOf(gearNumber-1);
        }
    }

    public String formatFloat(float number) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(number);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            car.update();
        }
        catch(FuelTankEmptyException exception) {
            JOptionPane.showMessageDialog(this, exception.getMessage()
            , "Fuel tank empty!", JOptionPane.WARNING_MESSAGE);
            car.reset();
        }
        repaint();
    }

    private void drawBackground(Graphics2D g2d) {
        g2d.setColor(Color.darkGray);
        g2d.fillRect(0,0, getWidth(), getHeight());
    }

    private void drawUI(Graphics2D g2d) {
        g2d.setFont(new Font("default", Font.BOLD, 20));
        g2d.setColor(Color.white);
        g2d.drawString("speed: " + formatFloat(car.getSpeed()), 20, 25);
        g2d.drawString("gear: " + parseGearNumber(car.currentGearNumber()), 200, 25);
        g2d.drawString("rpm: " + car.getRpm(), 20,52);
        g2d.drawString("fuel", 12,327);
        g2d.drawString("engine " + (car.getIsEngineOn() ? "on" : "off"), 46, 85);
        g2d.drawString("Press F1 for help", getWidth()-200, 25);
        if(car.getIsEngineOn()) g2d.setColor(Color.green);
        else g2d.setColor(Color.red);
        g2d.fill(new Ellipse2D.Double(20, 70, 20, 20));
        g2d.setColor(Color.red);
        g2d.fill(new Rectangle2D.Double(20, 305-2*car.getFuelLevel(), 20, 2*car.getFuelLevel()));
        g2d.setColor(Color.black);
        g2d.draw(new Rectangle2D.Double(20, 105, 20, 200));
    }

    private void drawCar(Graphics2D g2d) {
        g2d.rotate(Math.toRadians(car.getDirection()),
                car.getX()+(float)img.getWidth()/2,
                car.getY() +(float)img.getHeight()/2);
        g2d.drawImage(img, car.getX(), car.getY(),null);
    }
}
