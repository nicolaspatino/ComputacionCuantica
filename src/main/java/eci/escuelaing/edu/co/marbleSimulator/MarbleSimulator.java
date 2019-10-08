/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.edu.co.marbleSimulator;

import eci.escuelaing.edu.co.computacioncuantica.Complejo;
import eci.escuelaing.edu.co.computacioncuantica.Funciones;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class MarbleSimulator {
    private static Funciones app= new Funciones();
        //Programming drill 3.1.1
        public double[] marble(double[][]matriz,double[]estadoInicial,int clicks){
        double [] respuesta = new double[estadoInicial.length];
        while(clicks!=0) {
            for (int i = 0; i < estadoInicial.length; i++) {
                double suma = 0;
                for (int j = 0; j < estadoInicial.length; j++) {
                    suma += matriz[i][j] * estadoInicial[j];
                }
                respuesta[i] = suma;
            }
            System.arraycopy(respuesta, 0, estadoInicial, 0, estadoInicial.length);
            clicks-=1;
        }
        return respuesta;
    }
    	
    public Complejo[] fractions(Complejo[][]matriz,Complejo[]estadoInicial,int clicks){
        Complejo[] respuesta = new Complejo[estadoInicial.length];
        while (clicks!=0){
            for (int i = 0; i < estadoInicial.length ; i++) {
                Complejo valor = new Complejo(0,0);
                for (int j = 0; j < estadoInicial.length ; j++) {
                    valor = app.Suma(valor,app.Producto(matriz[i][j],estadoInicial[j]));
                }
                respuesta[i]=valor;
            }
            System.arraycopy(respuesta, 0, estadoInicial, 0, estadoInicial.length);
            clicks-=1;
        }
        return respuesta;
    }
	
	
	public static ArrayList<Object> bullets(int slits, int targets, Map p) throws Exception{
        Complejo[][] matriz = new Complejo[slits+targets+1][slits+targets+1];
        for(int i = 0; i < slits+targets+1; i++) {
            for(int j = 0; j < slits+targets+1; j++) {
                if(p.containsKey(Integer.toString(i) + " " + Integer.toString(j))) {
                    matriz[j][i] = (Complejo) p.get(Integer.toString(i) + " " + Integer.toString(j));
                } else {
                    matriz[j][i] = new Complejo(0,0);
                }
            }
        }
        for (int i = 0; i < slits+1; i++) {
            matriz[i][i] = new Complejo(0,0);
        }
        for (int i = slits + 1; i < slits+targets+1;i++) {
            matriz[i][i] = new Complejo(1,0);
        }
        Complejo[] vector = new Complejo[slits+targets+1];
        vector[0] = new Complejo(1, 0);
        for (int i = 1; i < vector.length;i++) {
            vector[i] = new Complejo(0,0);
        }
        ArrayList<Object> r = new ArrayList<Object>();
        r.add(app.matrizMultiplicacion(matriz,matriz));
        r.add(app.accionMatrizSobreVector(app.matrizMultiplicacion(matriz,matriz), vector));
        return r;
    }
	
}

