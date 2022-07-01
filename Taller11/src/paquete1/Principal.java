/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;

import paquete2.Cuenta;
import paquete2.Menu;
import paquete3.MenuCarta;
import paquete3.MenuDia;
import paquete3.MenuEconomico;
import paquete3.MenuNinos;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Menu> listaCartas = new ArrayList<>();

        MenuNinos nino1 = new MenuNinos("Nuggets", 4.50, 1.50, 1.25);
        MenuNinos nino2 = new MenuNinos("Salchipapa", 2.50, 0, 2.50);

        MenuEconomico eco1 = new MenuEconomico("Pizza Economica", 5.50, 15);

        MenuDia dia = new MenuDia("Lomo de Cerdo", 6.50, 1, 2.75);

        MenuCarta carta = new MenuCarta("Salmon", 10.50, 1, 3, 5);

        listaCartas.add(nino1);
        listaCartas.add(nino2);
        listaCartas.add(eco1);
        listaCartas.add(dia);
        listaCartas.add(carta);

        for (int i = 0; i < listaCartas.size(); i++) {
            listaCartas.get(i).setValorMenu();
        }

        Cuenta cuenta = new Cuenta("Danie Flores", 12, listaCartas);
        cuenta.setSubtotal();
        cuenta.setTotal();

        System.out.println(cuenta);

    }

}
