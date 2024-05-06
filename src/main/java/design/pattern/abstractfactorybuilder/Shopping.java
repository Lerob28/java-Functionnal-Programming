package design.pattern.abstractfactorybuilder;

public class Shopping {
    private FurnitureFactory furnitureFactory;
    private Chair chair;
    private Table table;

    public Shopping(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public void createCommand() {
        this.chair = furnitureFactory.createChair();
        this.table = furnitureFactory.createTable();
    }


    public void showCommand() {
        System.out.println();
        System.out.println("chair has legs : "+getChair().hasLengs());
        System.out.println("table can sleep on : "+getTable().canSleepOn());
        System.out.println("table can read on : "+getTable().canReadOn());
        System.out.println("table can eat on : "+getTable().canEatON());
    }

    public FurnitureFactory getFurnitureFactory() {
        return furnitureFactory;
    }

    public void setFurnitureFactory(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public Chair getChair() {
        return chair;
    }

    public Table getTable() {
        return table;
    }
}
