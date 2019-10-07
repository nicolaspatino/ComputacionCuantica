/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.edu.co.QuantumParticleSistem;

import eci.escuelaing.edu.co.computacioncuantica.Complejo;
import eci.escuelaing.edu.co.computacioncuantica.Funciones;

/**
 *
 * @author 2112712
 */
public class QuantumParticle {
    public static double probability(Complejo[] estado, int position) {
		Double n = 0.0;
                Funciones app = new Funciones();
		for(int i = 0; i < estado.length;i++) {
			n += Math.pow(app.Modulo([i]),2);
		}
		Double norm = Math.sqrt(n);
		Double prob = Math.pow(estado.getVector()[position].modulus(),2) / Math.pow(norm, 2);
		return prob;
	}
}
