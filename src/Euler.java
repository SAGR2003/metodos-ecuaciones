public class Euler {
    Main main;
    public void euler() {
        double x0 = 2;
        double y0 = 4;
        double h = 0.1;

        double xviejo = x0;
        double yviejo = y0;
        double xnuevo = xviejo + h;
        double ynuevo;

        while (xnuevo <= 2.5) {
            xnuevo = xviejo + h;
            ynuevo = yviejo + (h * main.funcion(xviejo, yviejo));

            System.out.println("x =" + xnuevo + ", y = " + ynuevo + " error aproximado =" + main.calculaErrorAproximado(ynuevo, yviejo) + "%");

            xviejo = xnuevo;
            yviejo = ynuevo;

        }
    }
}
