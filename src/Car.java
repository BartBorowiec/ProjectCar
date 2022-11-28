import java.util.Arrays;

public class Car implements ShiftingGear {
    private int rpm;
    private final Transmission transmission;
    private float speed;
    private float direction;
    private boolean isEngineOn;
    private double fuelLevel;
    private float fuelUsage = 0.1f;
    private boolean throttle;
    private boolean isBraking;
    private int x;
    private int y;

    public Car() {
        speed = 0;
        direction = 0;
        isEngineOn = false;
        fuelLevel = 100;
        throttle = false;
        x = 800;
        y = 600;
        transmission = new Transmission();
        transmission.setCurrentGear(1);
    }

    public void update() throws FuelTankEmptyException {
        if (isEngineOn) {
            if(currentGearNumber() == 1) rpm = Math.max(rpm, transmission.getIdleRpm());
            fuelLevel -= fuelUsage;
            if(fuelLevel <= 0) throw new FuelTankEmptyException("You ran out of fuel!");
        }

        if (throttle && fuelLevel > 0) accellerate();
        else decellerate();
        if (isBraking) {
            brake();
        }
        else if (rpm>700) {
            speed = transmission.getCurrentGear().getSpeedPerRpm()*rpm/1000;
        }
        else
            speed = Math.max(0, speed - 2);

        if (rpm < transmission.getIdleRpm() && isEngineOn && currentGearNumber() != 1) toggleEngine();
        translate();
    }
    public void translate() {
        if(currentGearNumber()!=0) {
            x += Math.sin(Math.toRadians(direction))*speed*0.33f;
            y -= Math.cos(Math.toRadians(direction))*speed*0.33f;
        }
        else {
            x -= Math.sin(Math.toRadians(direction))*speed*0.33f;
            y += Math.cos(Math.toRadians(direction))*speed*0.33f;
        }
    }

    public void brake() {
        if (speed > 0) {
            rpm = Math.max(0, rpm - 100);
            speed = transmission.getCurrentGear().getSpeedPerRpm()*rpm/1000;
        }
        else speed = 0;
    }

    public void setThrottle(boolean throttle) {
        this.throttle = throttle;
    }

    public void accellerate() {
        if (isEngineOn && rpm < transmission.getMaxRpm()) rpm += 30;
    }

    public void decellerate() {
        if (rpm > 0) rpm -= 20;
        else rpm = 0;
    }

    public void changeDirection(int angle) {
        if(speed != 0) direction += angle;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public float getDirection() {
        return direction;
    }

    @Override
    public void shiftUp() {
        rpm *= 0.7;
        transmission.shiftUp();
    }

    @Override
    public void shiftDown() {
        rpm = (int)Math.min(transmission.getMaxRpm(), rpm*1.3);
        transmission.shiftDown();
    }

    public void toggleEngine() {
        isEngineOn = !isEngineOn;
    }

    public boolean getIsEngineOn() {
        return isEngineOn;
    }

    public float getSpeed() {
        return speed;
    }

    public int getRpm() {
        return rpm;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void reset() {
        rpm = 0;
        transmission.setCurrentGear(1);
        speed = 0;
        direction = 0;
        isEngineOn = false;
        fuelLevel = 100;
        throttle = false;
        x = 800;
        y = 600;
    }
    public int currentGearNumber() {
        return Arrays.asList(transmission.getGears()).indexOf(transmission.getCurrentGear());
    }

    public void setIsBraking(boolean braking) {
        isBraking = braking;
    }
}
