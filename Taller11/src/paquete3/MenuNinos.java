package paquete3;

import paquete2.Menu;

public class MenuNinos extends Menu {

    private double helado;
    private double pastel;

    public MenuNinos(String n, double vI, double h, double p) {
        super(n, vI);
        helado = h;
        pastel = p;
    }

    public void setHelado(double n) {
        helado = n;
    }

    public void setPastel(double n) {
        pastel = n;
    }

    @Override
    public void setValorMenu() {
        valorMenu = valorInicial + helado + pastel;
    }

    public double getHelado() {
        return helado;
    }

    public double getPastel() {
        return pastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú de Niños\n"
                + "Nombre del Plato: %s\n"
                + "Valor Inicial del menú: %.2f\n"
                + "Valor helado: %.2f\n"
                + "Valor Pastel: %.2f\n"
                + "Valor del Menú: %.2f\n",
                getNombrePlato(),
                getValorInicial(),
                getHelado(),
                getPastel(),
                getValorMenu());

        return cadena;
    }

}
