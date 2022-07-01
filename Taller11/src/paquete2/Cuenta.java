package paquete2;

import java.util.ArrayList;

public class Cuenta {

    //nombre del cliente, IVA, listado de cartas -menú-, valor a cancelar total
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

    public void setNombreCliente(String n) {
        nombreCliente = n;
    }

    public void setIva(double n) {
        iva = n / 100;
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
        total = subtotal + (subtotal * iva);
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getIVA() {
        return iva * subtotal;
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
        String cadena = String.format("Datos Cuenta\n"
                + "Nombre Cliente: %s\n"
                + "Subtotal: %.2f\n"
                + "Iva: %.2f\n\n" //Valor del Iva en base al subtotal
                + "Lista de Menus Pedidos\n",
                getNombreCliente(),
                getSubtotal(),
                getIVA());

        for (int i = 0; i < getListaCartas().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    getListaCartas().get(i));
        }

        cadena = String.format("\n%sTotal a Cancelar: %.2f\n",
                cadena,
                getTotal());
        return cadena;
    }

}
