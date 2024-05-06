package design.pattern.strategie;

public class TrainStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String initialPoint, String finalPoint) {
        return "Build Route from "+initialPoint+" to "+finalPoint+" with Train ...";
    }
}
