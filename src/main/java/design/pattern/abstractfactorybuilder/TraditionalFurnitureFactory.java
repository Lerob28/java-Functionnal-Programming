package design.pattern.abstractfactorybuilder;

public class TraditionalFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new EatingTable();
    }
}
