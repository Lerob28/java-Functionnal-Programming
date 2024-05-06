package design.pattern.abstractfactorybuilder;


/**
 * Fabrique abstraite est un patron de conception qui permet de créer des familles d’objets apparentés sans préciser leur classe concrète.
 */
public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFurnitureFactory      = new ModernFurnitureFactory();
        FurnitureFactory traditionalFurnitureFactory = new TraditionalFurnitureFactory();

        Shopping orca = new Shopping(modernFurnitureFactory);

        orca.createCommand();
        orca.showCommand();

        orca.setFurnitureFactory(traditionalFurnitureFactory);
        orca.createCommand();
        orca.showCommand();
    }
}
