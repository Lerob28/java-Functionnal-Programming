package design.pattern.templatemethod;


/**
 * Patron de Méthode est un patron de conception comportemental qui permet de mettre le squelette d’un algorithme dans la classe mère,
 * mais laisse les sous-classes redéfinir certaines étapes de l’algorithme sans changer sa structure.
 */
public class Main {
    public static void main(String[] args) {
        OrcsAI orcsAI = new OrcsAI();
        MonstersAI monstersAI = new MonstersAI();

        orcsAI.turn();
        System.out.println();
        monstersAI.turn();
    }
}
