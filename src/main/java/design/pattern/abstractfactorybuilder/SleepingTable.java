package design.pattern.abstractfactorybuilder;

public class SleepingTable implements Table {
    @Override
    public boolean canEatON() {
        return false;
    }

    @Override
    public boolean canReadOn() {
        return false;
    }

    @Override
    public boolean canSleepOn() {
        return true;
    }
}
