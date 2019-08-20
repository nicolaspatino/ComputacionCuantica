/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.edu.co.computacioncuantica;

/**
 *
 * @author nicolas
 */
public class Polar {
    private double angulo;
    private double r;
    public Polar(double angulo, double r){
        this.angulo = angulo;
        this.r=r; 
    }
    public double getAngulo(){
        return angulo;
    }
    public double getHipoten(){
        return r;
    }    
    @Override
    public String toString() {
        return "Angulo : " + angulo + " r : " + r ;
    }
}