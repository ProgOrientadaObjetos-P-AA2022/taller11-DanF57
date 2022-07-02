package paquete3;

import paquete2.Menu;

public class MenuEconomico extends Menu {

    private double descuentoP;

    public MenuEconomico(String n, double vI, double d) {
        super(n, vI);
        descuentoP = d;
    }

    public void setDescuentoP(double n) {
        descuentoP = n;
    }

    @Override
    public void setValorMenu() {
        valorMenu = valorInicial - (valorInicial * descuentoP / 100);
    }

    public double getDescuentoP() {
        return descuentoP;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú Económico:\n"
                + "\tNombre del Plato: %s\n"
                + "\tValor Inicial del menú: %.2f\n"
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                getNombrePlato(),
                getValorInicial(),
                getDescuentoP(),
                getValorMenu());

        return cadena;
    }
}
