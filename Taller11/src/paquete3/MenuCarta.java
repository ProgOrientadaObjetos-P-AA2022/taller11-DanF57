/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import paquete2.Menu;

/**
 *
 * @author Daniel
 */
public class MenuCarta extends Menu {

    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio; //porcentaje adicional por servicio

    public MenuCarta(String n, double vI,
            double vG, double vB, double pS) {
        super(n, vI);
        setValorGuarnicion(vG);
        setValorBebida(vB);
        setPorcentajeServicio(pS);
    }

    public void setValorGuarnicion(double c) {
        valorGuarnicion = c;
    }

    public void setValorBebida(double c) {
        valorBebida = c;
    }

    public void setPorcentajeServicio(double c) {
        porcentajeServicio = valorInicial * (c / 100);
    }

    @Override
    public void setValorMenu() {
        valorMenu = valorInicial + valorGuarnicion + valorBebida
                + porcentajeServicio;
    }

    public double getValorGuarnicion() {
        return valorGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public double getPorcentajeServicio() {
        return porcentajeServicio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú a la Carta:\n"
                + "\tNombre del Plato: %s\n"
                + "\tValor Inicial del menú: %.2f\n"
                + "\tValor Guarnición: %.2f\n"
                + "\tValor Bebida: %.2f\n"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                getNombrePlato(),
                getValorInicial(),
                getValorGuarnicion(),
                getValorBebida(),
                getPorcentajeServicio(),
                getValorMenu());

        return cadena;
    }
}
