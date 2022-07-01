/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Daniel
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;

    public Menu(String n, double vI) {
        nombrePlato = n;
        valorInicial = vI;
    }

    public void setNombrePlato(String n) {
        nombrePlato = n;
    }

    public void setValorInicial(double vI) {
        valorInicial = vI;
    }

    public abstract void setValorMenu();

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public double getValorMenu() {
        return valorMenu;
    }

}
