package design.pattern.templatemethod;

public abstract class GameAI {
    void turn() {
       collectResource();
       buildStructure();
       buildUnits();
       attack();
    }

    void collectResource() {
        System.out.println("collect Resource in GameAI");
    }

    abstract void buildStructure();

    abstract void buildUnits();

    void attack() {
        System.out.println("attack in GameAI");
        Enemy enemy = Enemy.closestEnemy();
        if (enemy == null) {
            sendScouts(String.valueOf(2));
        }else {
            sendMarriors(enemy.getPosition());
        }
    }

    void sendScouts(String position) {
        System.out.println("send Scouts in GameAI");
    }
    void sendMarriors(String position) {
        System.out.println("send Marriors in GameAI");
    }
}