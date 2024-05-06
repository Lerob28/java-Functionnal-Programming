package design.pattern.abstractfactorybuilder;

public class VictorianChair implements Chair {
    @Override
    public boolean hasLengs() {
        return false;
    }

    @Override
    public boolean sitOn() {
        return true;
    }
}
