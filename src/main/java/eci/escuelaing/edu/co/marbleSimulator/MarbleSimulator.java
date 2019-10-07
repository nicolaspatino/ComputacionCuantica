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
    	public Complejo[] programa1(Complejo [][] matriz ,Complejo [] vector, int clicks) {
            Funciones app = new Funciones();
            Complejo [] output = X;
            for (int i = 0; i < t; i++) {
                r = app.accionMatrizSobreVector(matriz,vector);
            }
            return output;
	}
	//Programa 3.2.1
	public double[][] programa2(double [][] grafo ,double [][] estado, int clicks) {
		//Estado final 
		double [][] estadom= new double [estado[0].length][estado.length] ;
		double [][] multi= new double [grafo.length][estadom[0].length];
		//transponer vector
		for(int i=0;i<estado.length;i++) {
			for(int j=0;j<estado[i].length;j++) {
				estadom[j][i]=estado[i][j];			
			}
		}
		//multiplicacion y estados
		for(int c=0 ;c<clicks;c++) {
		for(int i=0;i<multi.length;i++) {
			for(int j=0; j<multi[i].length;j++) {
				for(int k=0 ;k<grafo[0].length;k++) {
					multi[i][j]+=grafo[i][k]*estadom[k][j];
				}	
			}
		}	
	}
	return multi;
	}
	
	//Programa 3.3.1
	public Complejo [][] programa4(Complejo [][] grafo, Complejo [][] estado, int clicks) throws Exception {
		Complejo [][] estadof=estado;
                Funciones app=new Funciones();
		for(int i=0;i<clicks;i++) {
                        estadof=app.matrizMultiplicacion(grafo,app.matrizTranspuesta(estado));			
		}
		
		return estadof;
	}
	
	
	
	
	

}

