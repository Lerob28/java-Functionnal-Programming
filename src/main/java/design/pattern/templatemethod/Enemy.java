package design.pattern.templatemethod;

public class Enemy {
    private String name;

    private String position;

    public static Enemy closestEnemy() {
        return null;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
