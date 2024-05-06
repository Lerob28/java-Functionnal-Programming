package design.pattern.strategie;

/**
 * Le contexte n’a pas la responsabilité de la sélection de l’algorithme adapté, c’est le client qui lui envoie la stratégie.
 * En fait, le contexte n’y connait pas grand-chose en stratégies, c’est l’interface générique qui lui permet de les utiliser.
 *
 * Le contexte devient indépendant des stratégies concrètes.
 */
public class Navigator {
    private RouteStrategy routeStrategy;

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy =  routeStrategy;
    }

    public String findRoute(String location, String destination) {
        return routeStrategy.buildRoute(location, destination);
    }
}
