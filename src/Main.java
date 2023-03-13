public class Main {

    public static void main(String[] args) {
        Euler euler = new Euler();
        RungeKutta rungeKutta = new RungeKutta();
//        euler.euler();
        rungeKutta.metodoRungeKutta(2, 4, 0.5, 2.5);
    }

    public double funcion(double x, double y) {
        return 0.1 * Math.sqrt(y) + 0.4 * (x * x);
    }

    public double calculaErrorRelativo(double yVerdadero, double yAprox) {
        return ((yVerdadero - yAprox) / yVerdadero) * 100;
    }

    public double calculaErrorAproximado(double yNuevo, double yViejo) {
        return ((yNuevo - yViejo) / yNuevo) * 100;
    }
}