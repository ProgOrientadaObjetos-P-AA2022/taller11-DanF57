package paquete3;

import paquete2.Menu;

public class MenuDia extends Menu {

    private double postre;
    private double bebida;

    public MenuDia(String n, double vI, double vp, double vb) {
        super(n, vI);
        postre = vp;
        bebida = vb;
    }

    public void setPostre(double n) {
        postre = n;
    }

    public void setBebida(double n) {
        bebida = n;
    }

    @Override
    public void setValorMenu() {
        valorMenu = valorInicial + postre + bebida;
    }

    public double getPostre() {
        return postre;
    }

    public double getBebida() {
        return bebida;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú del Día:\n"
                + "\tNombre del Plato: %s\n"
                + "\tValor Inicial del menú: %.2f\n"
                + "\tValor Postre: %.2f\n"
                + "\tValor Bebida: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                getNombrePlato(),
                getValorInicial(),
                getPostre(),
                getBebida(),
                getValorMenu());

        return cadena;
    }

}
