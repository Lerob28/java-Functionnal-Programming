package design.pattern.abstractfactorybuilder;

public class ModernChair implements Chair {
    @Override
    public boolean hasLengs() {
        return true;
    }

    @Override
    public boolean sitOn() {
        return false;
    }

}
