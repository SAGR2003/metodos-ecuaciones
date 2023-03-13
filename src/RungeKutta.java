public class RungeKutta {
    Main main = new Main();
    public double y;
    public double x;
    public double h;
    public double k1;
    public double k2;
    public double k3;
    public double k4;

    public void metodoRungeKutta(double xInicial, double yInicial, double hDado, double xMaximo) {
        h = hDado;
        x = xInicial;
        y = yInicial;

        System.out.println("x =" + x + ", y = " + y);
        while (x < xMaximo) {

            calculaK1(x, y);
            calculaK2(x, y);
            calculaK3(x, y);
            calculaK4(x, y);

            y = calculaY(x, y);
            x = calculaX();
            System.out.println("x =" + x + ", y = " + y + ", k1 = " + k1 + ", k2 = " + k2 + ", k3 = " + k3 + ", k4 = " + k4);
        }
    }

    private double calculaX() {
        x = x + h;
        return x;
    }

    private double calculaY(double xViejo, double yViejo) {
        y = yViejo + (h / 6) * (k1 + 2 * k2 + 2 * k3 + k4);
        return y;
    }

    private double calculaK1(double xViejo, double yViejo) {
        k1 = main.funcion(xViejo, yViejo);
        return k1;
    }

    private double calculaK2(double xViejo, double yViejo) {
        k2 = main.funcion((xViejo + h / 2), yViejo + k1 * h / 2);
        return k2;
    }

    private double calculaK3(double xViejo, double yViejo) {
        k3 = main.funcion(xViejo + h / 2, yViejo + k2 * h / 2);
        return k3;
    }

    private double calculaK4(double xViejo, double yViejo) {
        k4 = main.funcion(xViejo + h, yViejo + h * k3);
        return k4;
    }

}
