


import eci.escuelaing.edu.co.computacioncuantica.Complejo;
import eci.escuelaing.edu.co.computacioncuantica.Funciones;
import eci.escuelaing.edu.co.computacioncuantica.Polar;
import org.junit.Test;
import static org.junit.Assert.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicolas
 */
public class Prueba {
    
    @Test
    public void sumaTest() {
        Funciones app = new Funciones();
        Complejo a= new Complejo(4,3);
        Complejo b  = new Complejo(1,-5);
        Complejo respuesta = app.Suma(a, b);
        Complejo c = new Complejo(5,-2);
        assertEquals(respuesta.toString(), c.toString());
    }
     @Test
    public void restaTest() {
        Funciones app = new Funciones();
        Complejo n1 = new Complejo(6,5);
        Complejo n2 = new Complejo(1,-5);
        Complejo respuesta = app.Resta(n1, n2);
        Complejo esperado = new Complejo(5,10);
        assertEquals(respuesta.toString(), esperado.toString());
    }
     @Test
    public void multiplicacionTest() {
        Funciones app = new Funciones();
        Complejo a = new Complejo(4,3);
        Complejo b = new Complejo(5,-7);
        Complejo respuesta = app.Producto(a, b);
        Complejo c = new Complejo(41,-13);
        assertEquals(respuesta.toString(), c.toString());
    }
     @Test
    public void DivisionTest(){
        Funciones app = new Funciones();
        Complejo a = new Complejo(1,2);
        Complejo b = new Complejo(3,4);
        Complejo respuesta = app.Division(a,b); 
        Complejo c  = new Complejo(0.44,0.08);
        boolean x = c.equals(respuesta);
        assertEquals(x,true);         
    }
    @Test
    public void conjugadoTest(){
        Funciones app = new Funciones();
        Complejo a = new Complejo(4,3);
        Complejo respuesta = app.conjugado(a); 
        Complejo c  = new Complejo(4,-3);
        boolean x = respuesta.equals(c);
        assertEquals(x,true);        
    }
    @Test
    public void polarACartesianoTest(){
        Funciones app = new Funciones();
        Polar polar = new Polar(36.86989764584402,5);
        Complejo respuesta = app.PolarToCartesian(polar);
        Complejo c  = new Complejo(4,3);
        boolean x = respuesta.equals( c);
        assertEquals(x,true);
                
    }
    @Test
    public void faseTest(){
        Funciones app = new Funciones();
        Complejo a = new Complejo(3,5);
        double respuesta = app.fase(a); 
        double c  = 59.03624346792648;
        assertEquals(c, respuesta,0);
                
    }
        @Test
    public void ModuloTest(){
        Funciones app = new Funciones();
        Complejo a = new Complejo(5,4);
        double  respuesta = app.Modulo(a); 
        double c  = Math.sqrt(41);
        assertEquals(c, respuesta,0);
                
    }
    
}