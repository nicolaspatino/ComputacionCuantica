/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.edu.co.computacioncuantica;

import eci.escuelaing.edu.co.computacioncuantica.Complejo;
import java.util.ArrayList;


/**
 *
 * @author 2112712
 */
public final class Funciones {
    private static Complejo respuesta;
    public Funciones(){ 
    }

    public  double Modulo(Complejo num){
        return Math.sqrt(num.getA()*num.getA()+num.getIm()*num.getIm());
    }
    public  Complejo Suma(Complejo a, Complejo b){
        double flotante = a.getA()+b.getA();
        double imaginario = a.getIm()+b.getIm();
        return new Complejo(flotante,imaginario);
    }
    public static Complejo Resta(Complejo a, Complejo b){
        double flotante = a.getA()-b.getA();
        double imaginario = a.getIm()-b.getIm();
        return new Complejo(flotante,imaginario);
    }
    public  Complejo Producto(Complejo a, Complejo b){
        double flotante = a.getA()*b.getA()-a.getIm()*b.getIm();
        double imaginario = a.getA()*b.getIm()+a.getIm()*b.getA();
        return new Complejo(flotante,imaginario);
    }
    public static Complejo Division(Complejo a, Complejo b){
        double flotante1 = ( a.getA()*b.getA() ) + a.getIm()*b.getIm();
        double flotante2 = b.getA()*b.getA() + b.getIm()*b.getIm();
        double imaginario = ( a.getIm()*b.getA()- a.getA()*b.getIm());
        return new Complejo(flotante1/flotante2,imaginario/flotante2);
    }
    public  Complejo conjugado(Complejo c){
     return new Complejo(c.getA(), -c.getIm());
  }
    public Polar CartesianToPolar(Complejo x){
        double r;
        r = Modulo(x);
        double rads = Math.atan(x.getIm()/x.getA());
        double angulo = Math.toDegrees(rads);
        return new Polar(angulo,r);
    }
    public Complejo PolarToCartesian(Polar x){
        double r = x.getHipoten();
        double radian = Math.toRadians(x.getAngulo()); 
        return new Complejo(r*Math.cos(radian),r*Math.sin(radian));
    }
    public double fase(Complejo x){
        double rads = Math.atan(x.getIm()/x.getA());
        double angulo = Math.toDegrees(rads);
        return angulo;
    }
    
    //Operaciones con vectores Complejos
    
     public Complejo[] sumaVecto(Complejo[] vectorA,Complejo[] vectorB){
        Complejo[] sumavec= new Complejo[vectorB.length];
        for (int i = 0; i < sumavec.length; i++) {
            sumavec[i]=Suma(vectorA[i], vectorB[i]);   
        }
        return sumavec;
    }
     public Complejo escalarComplejo(double num , Complejo complejo){
         complejo.setA(complejo.getA()*num);
         complejo.setIm(complejo.getIm()*num);
         return complejo;
     }
     public Complejo[] Inversa(Complejo[] vect){
          Complejo [] respuesta = new Complejo[vect.length];
        for (int i = 0; i < vect.length; i++){
            respuesta[i] = new Complejo(vect[i].getA()*-1,vect[i].getIm()*-1);
        }
        return respuesta;
     }
     public Complejo[] escalarVec(Complejo num, Complejo[] vec){
        Complejo[] respuesta = new Complejo[vec.length];
        for (int i = 0; i < respuesta.length; i++){
           respuesta[i] = new Complejo(num.getA()*vec[i].getA(),num.getIm()*vec[i].getIm());
        }
        return respuesta;
    
        
        //Operaciones con matrices Complejas
     }
     public Complejo[][] SumaMat(Complejo [][] matA, Complejo[][] matB){
         Complejo [][] rta=new Complejo[matA.length][matA[0].length];
         for (int i=0; i<matA.length;i++){
             rta[i]=sumaVecto(matA[i],matB[i]);
         }
         return rta;
     }
     public Complejo[][] inversaDeMatriz(Complejo[][] x){
        Complejo [][] respuesta = new Complejo[x.length][x[0].length];
        for (int i=0;i<respuesta.length;i++){
            for (int j=0;j<respuesta[i].length;j++){
                respuesta[i][j]= new Complejo(x[i][j].getA()*-1,x[i][j].getIm()*-1);
            }
        }
        return respuesta;
    }
        
        
    
     public Complejo[][] multiplicacionEscalarPorMatriz(Complejo[][] x,Complejo c){
        Complejo [][] respuesta = new Complejo[x.length][x[0].length];
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[0].length;j++){
                respuesta[i][j] = Producto(x[i][j], c);
            }
        }
        return respuesta;
    }
     public Complejo[][] matrizTranspuesta(Complejo[][] x){
        Complejo [][] respuesta = new Complejo[x.length][x[0].length];
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[0].length;j++){
                respuesta[i][j]=x[j][i];
            }
        }
        return respuesta;
    }
    public Complejo[][] matrizConjugada(Complejo[][] x){
        Complejo [][] respuesta = new Complejo[x.length][x[0].length];
        for (int i=0;i<respuesta.length;i++){
            for (int j=0;j<respuesta[0].length;j++){
                respuesta[i][j]= conjugado(x[i][j]);
            }
        }
        return respuesta;
    }
    public double normaMatrices(double[][] matriz){
	double[][] respuesta = new double[matriz.length][matriz[0].length];
	for (int i = 0;i < respuesta.length;i++) {
		for (int j = 0;j < respuesta.length;j++) {
                    respuesta[i][j] = matriz[j][i];
		}
	}
	double[][] r = new double[matriz.length][matriz[0].length];
	double s = 0;
	for (int i = 0; i < respuesta.length; i++) {
		for (int j = 0; j < respuesta[0].length; j++) {
			for (int k = 0; k < respuesta.length; k++) {
				s = s + (respuesta[i][k] * matriz[i][j]);
			}
			r[i][j] = s;
			s = 0;
		}
	}
	double trace = 0;
	for (int i = 0; i < r.length; i++) {
		trace = trace + r[i][i];
	}
	return Math.sqrt(trace);
    }
        public Complejo[][] matrizAdjunta(Complejo[][] x){
        Complejo [][] adjunta = new Complejo[x.length][x[0].length];
        adjunta = matrizTranspuesta(x);
        adjunta = matrizConjugada(adjunta);
        return adjunta;
    }
public double DistacnciaMatrices(double[][] m1, double[][] m2) {

        double ms[][] = new double[m1.length][m1[0].length];
        for (int i = 0; i < ms.length; i++) {
            for (int j = 0; j < ms[0].length; j++) {
                ms[i][j] = m1[i][j] - m2[i][j];
            }
        }
        double[][] mt = new double[ms.length][ms[0].length];
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                mt[i][j] = ms[j][i];
            }
        }
        double[][] r = new double[mt.length][mt[0].length];
        double s = 0;
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt[0].length; j++) {
                for (int k = 0; k < mt.length; k++) {
                    s = s + (mt[i][k] * ms[i][j]);
                }
                r[i][j] = s;
                s = 0;
            }
        }
        double trace = 0;
        for (int i = 0; i < r.length; i++) {
            trace = trace + r[i][i];
        }
        return Math.sqrt(trace);

    }
public  Complejo[] accionMatrizSobreVector(Complejo[][] m1,Complejo[] v) throws Exception{
        if (m1[0].length != v.length) {
            throw new Exception("Error de tamaños");
	} else {
            Complejo[] r = new Complejo[v.length];  
            Complejo s = new Complejo(0,0);
            for (int i = 0; i < v.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    s = Suma(s, Producto(m1[i][j], v[j]));
		}
		r[i] = s;
		s = new Complejo(0,0);
            }
            return r;
	}
    }
    public  boolean matrizHermitiana(Complejo[][] m1) throws Exception {
           if (m1.length != m1[0].length) {
               throw new Exception("No es una matriz valida");
           } else {
               return m1.equals(matrizAdjunta(m1));
           }
       }
    public Complejo[][] matrizMultiplicacion(Complejo[][] m1,Complejo[][] m2) throws Exception {
        if (m1.length != m2[0].length) {
            throw new Exception("la matriz no es cuadrada");
        } else {
            Complejo[][] r = new Complejo[m1.length][m1[0].length];
            Complejo s = new Complejo(0, 0);
            for (int m = 0; m < m1.length; m++) {
                for (int n = 0; n < m1[0].length; n++) {
                    for (int i = 0; i < m1.length; i++) {
                        Complejo temp = Producto(m1[m][i], m2[i][n]);
                        s = Suma(s, temp);
                    }
                    r[m][n] = s;
                    s = new Complejo(0, 0);
                }
            }
            return r;
        }
    } 
    public  Complejo[][] tensor(Complejo[][] m1, Complejo[][] m2) {
        Complejo[][] r = new Complejo[m1.length * m2.length][ m1[0].length * m2[0].length];
	Complejo[][] sp;
	int m = 0;
	int n = 0;
	for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                sp = this.multiplicacionEscalarPorMatriz(m2,m1[i][j]);
		for(int k = 0; k < sp.length; k++) {
                    for(int l = 0; l < sp[0].length; l++) {
                        r[m][n] = sp[k][l];
			n++;
                    }
                    m++;
                    n = j * m2[0].length;
		}
                m = i * m2.length;
		n = (j + 1) * m2[0].length;
            }
            m = (i + 1) * m2.length;
            n = 0;
        }
	return r;
    }
    public boolean matrizUnitaria(Complejo[][] m1) throws Exception {
        if (m1.length != m1[0].length) {
            throw new Exception("la matriz no es cuadrada");
        } else {
            boolean flag;
            flag = this.matrizMultiplicacion(m1, this.matrizAdjunta(m1)).equals(this.matrizMultiplicacion(this.matrizAdjunta(m1), m1));
            return flag;
        }
    }
}

