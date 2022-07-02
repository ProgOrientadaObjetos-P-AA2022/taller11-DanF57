package paquete2;

import java.util.ArrayList;

public class Cuenta {

    // nombre del cliente, IVA, listado de cartas -menú-, valor a cancelar total
    private String nombreCliente;
    private double iva;
    private ArrayList<Menu> listaCartas;
    private double subtotal;
    private double total;

    public Cuenta(String nC, double iv,
            ArrayList<Menu> ls) {
        nombreCliente = nC;
        setIva(iv);
        setListaCartas(ls);
        subtotal = 0;
    }

    public Cuenta(String nC,  ArrayList<Menu> ls, double iv) {
        nombreCliente = nC;
        setIva(iv);
        setListaCartas(ls);
        subtotal = 0;
    }

    public void setNombreCliente(String n) {
        nombreCliente = n;
    }

    public void setIva(double n) {
        iva = n;
    }

    public void setListaCartas(ArrayList<Menu> ls) {
        listaCartas = ls;
    }

    public void setSubtotal() {
        for (int i = 0; i < listaCartas.size(); i++) {
            subtotal += listaCartas.get(i).getValorMenu();
        }
    }

    public void setTotal() {
        total = subtotal + (subtotal * (iva / 100));
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getIVA() {
        return iva;
    }

    public ArrayList<Menu> getListaCartas() {
        return listaCartas;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n",
                getNombreCliente());

        for (int i = 0; i < getListaCartas().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    getListaCartas().get(i));
        }

        cadena = String.format("\n%s"
                + "Subtotal: %.1f\n"
                + "IVA: %.1f\n"
                + "Total a pagar: %.3f\n",
                cadena,
                getSubtotal(),
                getIVA(),
                getTotal());
        return cadena;
    }

}
