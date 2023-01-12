/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosu3;

import Controlador.Grafo.GrafoDirigido;
import Controlador.Grafo.GrafoNoDirigido;
import Vista.FrmGrafo;

/**
 *
 * @author David Campoverde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GrafoDirigido gd = new GrafoDirigido(4);
        GrafoNoDirigido gnd = new GrafoNoDirigido(4);
//        System.out.println("Grafo dirigido");
//        System.out.println(gd);
        System.out.println("---------------------------------------------------");
        try {
//            gd.insertarArista(1, 3);
//            gd.insertarArista(1, 2);
//            gd.insertarArista(1, 4);
//            System.out.println(gd);
            System.out.println("Grafo no dirigido");
            gnd.insertarArista(4, 2);
            gnd.insertarArista(4, 1);
            gnd.insertarArista(4, 3);
            new FrmGrafo(null, true, gnd).setVisible(true);
            System.out.println(gnd);

        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
