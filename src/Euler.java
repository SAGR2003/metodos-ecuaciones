public class Euler extends Main{
    public void euler(double x0, double y0, double h, double xMax) {
        double xNuevo = x0 + h;
        double yNuevo;

        while (xNuevo < xMax) {
            xNuevo = x0 + h;
            yNuevo = y0 + (h * this.funcion(x0, y0));

            System.out.println("x =" + xNuevo + ", y = " + yNuevo + " error aproximado =" + this.calculaErrorAproximado(yNuevo, y0) + "%");

            x0 = xNuevo;
            y0 = yNuevo;
        }
    }
}
