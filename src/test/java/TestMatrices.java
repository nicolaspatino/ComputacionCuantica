/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import eci.escuelaing.edu.co.computacioncuantica.Complejo;
import eci.escuelaing.edu.co.computacioncuantica.Funciones;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2112712
 */
public class TestMatrices {
      
    @Test
    public void adicionMatricesTest() {
        //primera matriz de 2x2
        Funciones app = new Funciones();
        Complejo a= new Complejo(4,3);
        Complejo b  = new Complejo(1,-5);
        Complejo c= new Complejo(4,3);
        Complejo d  = new Complejo(1,-5);
        Complejo[][]mat={{a,b},{c,d}};
        //segunda matriz de 2x2
        Complejo e= new Complejo(4,3);
        Complejo f  = new Complejo(1,-5);
        Complejo g= new Complejo(4,3);
        Complejo h  = new Complejo(1,-5);
        Complejo[][]mat2 ={{e,f},{g,h}};
        
        Complejo[][] respuesta = app.SumaMat(mat, mat2);  
        Complejo rta1 = new Complejo(8,+6);
        Complejo rta2 = new Complejo(2,-10);
        Complejo[][] esperado ={{rta1,rta2},{rta1,rta2}};
    
        Assert.assertArrayEquals(esperado,respuesta);
    }
    
    @Test
    public void inversaMatrizTest(){
        
    }
}
