/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.edu.co.marbleSimulator;

import eci.escuelaing.edu.co.computacioncuantica.Complejo;
import eci.escuelaing.edu.co.computacioncuantica.Funciones;

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
    	
    public Complejo[] ejercicio3(Complejo[][]matriz,Complejo[]estadoInicial,int clicks){
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
	
	
	public Complejo [][] programa4(Complejo [][] grafo, Complejo [][] estado, int clicks) throws Exception {
		Complejo [][] estadof=estado;
                Funciones app=new Funciones();
		for(int i=0;i<clicks;i++) {
                        estadof=app.matrizMultiplicacion(grafo,app.matrizTranspuesta(estado));			
		}		
		return estadof;
	}
	

}

