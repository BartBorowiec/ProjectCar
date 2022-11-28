public class Transmission implements ShiftingGear {
    private Gear[] gears;
    private int currentGear;
    private final int maxRpm;
    private final int idleRpm;
    public Transmission() {
        gears = new Gear[8];
        gears[0] = new Gear(7.7f);
        gears[1] = new Gear(0);
        gears[2] = new Gear(7.7f);
        gears[3] = new Gear(11f);
        gears[4] = new Gear(15.9f);
        gears[5] = new Gear(22.7f);
        gears[6] = new Gear(27.1f);
        gears[7] = new Gear(40.6f);
        currentGear = 1;
        maxRpm = 2500;
        idleRpm = 500;
    }

    public Gear getCurrentGear() {
        return gears[currentGear];
    }

    public void setCurrentGear(int gear) {
        this.currentGear = gear;
    }

    @Override
    public void shiftUp() {
        if (currentGear < 7) currentGear++;
    }

    @Override
    public void shiftDown() {
        if (currentGear > 0) currentGear--;
    }

    public Gear[] getGears() {
        return gears;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public int getIdleRpm() {
        return idleRpm;
    }
}
