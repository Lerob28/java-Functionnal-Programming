package design.pattern.templatemethod;

public class OrcsAI extends GameAI {

    @Override
    void buildStructure() {
        System.out.println("build Structure in OrcsAI");
    }

    @Override
    void buildUnits() {
        System.out.println("build Units in OrcsAI");
    }

    @Override
    void sendScouts(String position) {
        System.out.println("send Scouts in OrcsAI");
    }

    @Override
    void sendMarriors(String position) {
        System.out.println("send Marriors in OrcsAI");
    }


}
