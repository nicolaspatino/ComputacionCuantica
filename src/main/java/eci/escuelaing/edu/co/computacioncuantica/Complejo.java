/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.edu.co.computacioncuantica;

/**
 *
 * @author 2112712
 */
public final class Complejo {
   private double numeroA;
   private double imaginario;
   
   public Complejo(double numeroA, double imaginario){
       this.numeroA=numeroA;
       this.imaginario=imaginario;
   }
   
   public double getA(){
       return numeroA;
   }
   public double getIm(){
       return imaginario;
   }
   public void setIm(double nuevoIm){
       numeroA=nuevoIm;
   }
   public void setA(double nuevoA){
       imaginario =nuevoA;
   }
    @Override
    public String toString() {
        String simbolo = "";
        if(imaginario >= 0){
            simbolo="+";
        }
        return numeroA + " " + simbolo + " " + imaginario + 'i';
    }
    @Override
     public boolean equals(Object obj){
        if (this == obj) return true;
    	if (this.getClass() != obj.getClass()) return false;
    	Complejo number = (Complejo) obj;
    	return this.numeroA == number.getA() && this.imaginario == number.getIm();
        }
    
}
