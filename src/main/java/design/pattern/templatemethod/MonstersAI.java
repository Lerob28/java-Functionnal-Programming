package design.pattern.templatemethod;

public class MonstersAI extends  GameAI {

    @Override
    void collectResource() {
        System.out.println("collect Resource in MonstersAI");
    }

    @Override
    void buildStructure() {
        System.out.println("build Structure in MonstersAI");
    }

    @Override
    void buildUnits() {
        System.out.println("build Units in MonstersAI");
    }

}
