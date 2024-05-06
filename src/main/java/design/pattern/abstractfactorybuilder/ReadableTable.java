package design.pattern.abstractfactorybuilder;

public class ReadableTable implements Table {
    @Override
    public boolean canEatON() {
        return false;
    }

    @Override
    public boolean canReadOn() {
        return true;
    }

    @Override
    public boolean canSleepOn() {
        return false;
    }
}
