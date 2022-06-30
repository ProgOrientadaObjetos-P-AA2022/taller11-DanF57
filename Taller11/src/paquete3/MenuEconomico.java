package paquete3;

import paquete2.Menu;

public class MenuEconomico extends Menu{

    private double descuentoP;

    public MenuEconomico(String n, double vI, double d){
        super(n, vI);
        descuentoP = d;
    }

    public void setDescuentoP(double n){
        descuentoP = n;
    }

    @Override
    public void setValorMenu() {
        valorMenu = valorInicial - (valorInicial * descuentoP/100);
    }
    
    public double getDescuentoP(){
        return descuentoP;
    }
}
