/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.edu.co.computacioncuantica;

import java.util.Arrays;

/**
 *
 * @author 2112712
 */
public class main {
    public static void main(String[] args) {
        Funciones app = new Funciones();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][] listaDos = new Complejo[2][4];
        Complejo[][] res = new Complejo[4][4];
        lista[0][0] = new Complejo(0, 0);
        lista[0][1] = new Complejo(1, 0);
        lista[1][0] = new Complejo(1, 0);
        lista[1][1] = new Complejo(0, 0);
        listaDos[0][0] = new Complejo(1, 0);
        listaDos[0][1] = new Complejo(0, 0);
        listaDos[0][2] = new Complejo(0, 0);
        listaDos[0][3] = new Complejo(0, 0);
        listaDos[1][0] = new Complejo(0, 0);
        listaDos[1][1] = new Complejo(1, 0);
        listaDos[1][2] = new Complejo(1, 0);
        listaDos[1][3] = new Complejo(1, 0);
      
    }
}
    

