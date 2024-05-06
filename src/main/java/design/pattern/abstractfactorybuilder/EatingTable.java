package design.pattern.abstractfactorybuilder;

public class EatingTable implements Table {
    @Override
    public boolean canEatON() {
        return true;
    }

    @Override
    public boolean canReadOn() {
        return false;
    }

    @Override
    public boolean canSleepOn() {
        return false;
    }
}
