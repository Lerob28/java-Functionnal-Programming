package design.pattern.strategie;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        RouteStrategy carStrategy     = new CarStrategy();
        RouteStrategy bicycleStrategy = new BicycleStrategy();
        RouteStrategy trainStrategy   = new TrainStrategy();

        navigator.setRouteStrategy(carStrategy);
        System.out.println(navigator.findRoute("Douala", "Yaounde"));

        navigator.setRouteStrategy(bicycleStrategy);
        System.out.println(navigator.findRoute("Douala", "Bafoussam"));

        navigator.setRouteStrategy(trainStrategy);
        System.out.println(navigator.findRoute("Dschang", "Douala"));
    }
}
