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
        String cadena = String.format("Menú de Niños:\n"
                + "\tNombre del Plato: %s\n"
                + "\tValor Inicial del menú: %.2f\n"
                + "\tValor helado: %.2f\n"
                + "\tValor Pastel: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                getNombrePlato(),
                getValorInicial(),
                getHelado(),
                getPastel(),
                getValorMenu());

        return cadena;
    }

}
