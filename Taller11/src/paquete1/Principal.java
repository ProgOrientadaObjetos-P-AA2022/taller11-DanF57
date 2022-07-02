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

        // MenuNinos nino1 = new MenuNinos("Nuggets", 4.50, 1.50, 1.25);

        MenuEconomico eco1 = new MenuEconomico("Econo001", 4, 25);

        MenuDia dia = new MenuDia("Niños 01", 2, 1, 1.50);
        MenuDia dia2 = new MenuDia("Niños 02", 3, 1, 1.50);
        MenuDia dia3 = new MenuDia("Dia 001", 5, 1, 1);

        MenuCarta carta = new MenuCarta("Carta 001", 6, 1.5, 2, 10);

        listaCartas.add(dia);
        listaCartas.add(dia2);
        listaCartas.add(eco1);
        listaCartas.add(dia3);
        listaCartas.add(carta);

        for (int i = 0; i < listaCartas.size(); i++) {
            listaCartas.get(i).setValorMenu();
        }

        Cuenta cuenta = new Cuenta("René Elizalde", 10, listaCartas);
        cuenta.setSubtotal();
        cuenta.setTotal();

        System.out.println(cuenta);

    }

}
