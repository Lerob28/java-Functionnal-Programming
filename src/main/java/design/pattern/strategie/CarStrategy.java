package design.pattern.strategie;

public class CarStrategy implements  RouteStrategy {
    @Override
    public String buildRoute(String initialPoint, String finalPoint) {
        return "Build Route from "+initialPoint+" to "+finalPoint+" with Car ...";
    }
}
