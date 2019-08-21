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

    public static double Modulo(Complejo num){
        return Math.sqrt(num.getA()*num.getA()+num.getIm()*num.getIm());
    }
    public static Complejo Suma(Complejo a, Complejo b){
        double flotante = a.getA()+b.getA();
        double imaginario = a.getIm()+b.getIm();
        return new Complejo(flotante,imaginario);
    }
    public static Complejo Resta(Complejo a, Complejo b){
        double flotante = a.getA()-b.getA();
        double imaginario = a.getIm()-b.getIm();
        return new Complejo(flotante,imaginario);
    }
    public static Complejo Producto(Complejo a, Complejo b){
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
    public static Complejo conjugado(Complejo c){
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
         return escalarVec(-1,vect);
     }
     public Complejo[] escalarVec(double num, Complejo[] vec){
         for (Complejo i :vec){
             i=escalarComplejo(num,i);
         }
         return vec;
     }
     public Complejo[][] SumaMat(Complejo [][] matA, Complejo[][] matB){
         Complejo [][] rta=new Complejo[matA.length][matA[0].length];
         for (int i=0; i<matA.length;i++){
             rta[i]=sumaVecto(matA[i],matB[i]);
         }
         return rta;
     }
     
     
}
