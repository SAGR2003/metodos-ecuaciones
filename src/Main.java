public class Main {

    public static void main(String[] args) {
        Euler euler = new Euler();
        RungeKutta rungeKutta = new RungeKutta();
        euler.euler(1,1,0.05, 1.5);
//        rungeKutta.metodoRungeKutta(2, 4, 0.25, 2.5);
    }

    public double funcion(double x, double y) {
        return 0.2 * x * y;
//        return 0.1 * Math.sqrt(y) + 0.4 * (x * x);
    }

    public double calculaErrorRelativo(double yVerdadero, double yAprox) {
        return ((yVerdadero - yAprox) / yVerdadero) * 100;
    }

    public double calculaErrorAproximado(double yNuevo, double yViejo) {
        return ((yNuevo - yViejo) / yNuevo) * 100;
    }
}