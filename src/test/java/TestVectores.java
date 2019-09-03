


import eci.escuelaing.edu.co.computacioncuantica.Complejo;
import eci.escuelaing.edu.co.computacioncuantica.Funciones;
import eci.escuelaing.edu.co.computacioncuantica.Polar;
import org.junit.Assert;
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
public class TestVectores {
    
    @Test
    public void sumaVectorialTest() {
        Funciones app = new Funciones();
        Complejo a  = new Complejo(4,3);                  
        Complejo b  = new Complejo(1,-5);
        Complejo[] mat = {a,b};
        Complejo[] mat2= {a,b};
        Complejo[] respuesta = app.sumaVecto(mat, mat2);
        Complejo pos1 = new Complejo(8,6);
        Complejo pos2 = new Complejo(2,-10);
        Complejo[] c = {pos1,pos2};
        Assert.assertArrayEquals(c,respuesta);
    }
     @Test
    public void InversaVectorialTest() {
        Funciones app = new Funciones();
        Complejo n1 = new Complejo(6,5);
        Complejo n2 = new Complejo(1,-5);
        Complejo[] mat = {n1,n2};
        Complejo pos1 = new Complejo(-6,-5);
        Complejo pos2 = new Complejo(-1,5);
        Complejo[] respuesta = app.Inversa(mat);
        Complejo [] esperado ={pos1,pos2};
        Assert.assertArrayEquals(esperado,respuesta);
    }
    
     @Test
    public void multiplicacionEscalarVectorTest() {
        Funciones app = new Funciones();
        Complejo a = new Complejo(6,5);
        Complejo b = new Complejo(5,-7);
        Complejo [] mat = {a,b};
        Complejo num = new Complejo(3,3);
        Complejo [] respuesta = app.escalarVec(num,mat);
        Complejo pos1 = new Complejo(18,15);
        Complejo pos2 = new Complejo(15,-21);
        Complejo [] c = {pos1,pos2};
        Assert.assertArrayEquals(c,respuesta);
    }
}