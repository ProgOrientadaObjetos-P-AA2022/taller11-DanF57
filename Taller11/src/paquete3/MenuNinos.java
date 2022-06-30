package paquete3;

import paquete2.Menu;

public class MenuNinos extends Menu{

    private double helado;
    private double pastel;

    public MenuNinos(String n, double vI, double vp, double vb){
        super(n, vI);
        helado = vp;
        pastel = vb;
    }

    public void setHelado(double n){
        helado = n;
    }
    
    public void setPastel(double n){
        pastel = n;
    }

    @Override
    public void setValorMenu() {
        valorMenu = valorInicial + helado + pastel;
    }

    public double getHelado(){
        return helado;
    }

    public double getPastel(){
        return pastel;
    }
    
}
