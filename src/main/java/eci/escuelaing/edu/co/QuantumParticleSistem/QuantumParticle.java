/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.edu.co.QuantumParticleSistem;

import eci.escuelaing.edu.co.computacioncuantica.Complejo;
import eci.escuelaing.edu.co.computacioncuantica.Funciones;
import eci.escuelaing.edu.co.computacioncuantica.Polar;

/**
 *
 * @author 2112712
 */
public class QuantumParticle {
    private static Funciones app= new Funciones();
    public static double probabilidad(Complejo[] estado, int posicion) {       
        Double n = 0.0;
        for(int i = 0; i < estado.length;i++) {
            n += Math.pow(app.Modulo(estado[i]), 2);
        }
        Double norm = Math.sqrt(n);
        Double prob = Math.pow(app.Modulo(estado[posicion]), 2) / Math.pow(norm, 2);
        return prob;
    }
     public static Complejo InnerProduct(Complejo[] v1, Complejo[] v2){        
        Complejo r = new Complejo(0,0);
        for (int i = 0; i < v1.length;i++) {
            r = app.Suma(r, app.Producto(app.conjugado(v1[i]), v2[i]));  
        }
        return r;
    }
    public static Complejo Mean(Complejo[] vec, Complejo[][] mat) throws Exception{       
        Complejo[] apoyo =app.accionMatrizSobreVector(mat, vec);
        Complejo res = InnerProduct(apoyo, vec);
        return res;
    }
    public static Complejo variance(Complejo[] vec, Complejo[][] observable) throws Exception {
			Complejo mean = Mean(vec, observable);
			Complejo[][] m=new Complejo[2][2];
			m[0][0] = mean;
			m[0][1] = new Complejo(0, 0);
			m[1][0] = new Complejo(0, 0);
			m[1][1] = mean;
			Complejo[][] subtraction = app.SumaMat(observable, app.inversaDeMatriz(m));
			Complejo[][] temp = app.matrizMultiplicacion(subtraction, subtraction);
			Complejo[] act = app.accionMatrizSobreVector(temp, vec);
			Complejo ans = InnerProduct(vec, act);
			return ans;
	}
    
    public static Complejo transicion(Complejo[] estadoInicial, Complejo[] estadoFinal){
        Complejo ans = InnerProduct(estadoFinal, estadoInicial);
        return ans;
    }
}
