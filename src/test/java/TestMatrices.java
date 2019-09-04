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
        Funciones app = new Funciones();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  res = new Complejo[2][2];
        lista[0][0] =new Complejo(1,1);
        lista[0][1] =new Complejo(1,1);
        lista[1][0] = new Complejo(1,1);
        lista[1][1] = new Complejo(1,1);
        res[0][0] = new Complejo(-1,-1);
        res[0][1] = new Complejo(-1,-1);
        res[1][0] = new Complejo(-1,-1);
        res[1][1] = new Complejo(-1,-1);
        Complejo[][] respuesta = app.inversaDeMatriz(lista) ;
        Assert.assertArrayEquals(respuesta,res);
    }
    @Test
    public void escalarMatrizTest(){
       Funciones app = new Funciones();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  res = new Complejo[2][2];
        lista[0][0] =new Complejo(1,1);
        lista[0][1] =new Complejo(1,1);
        lista[1][0] = new Complejo(1,1);
        lista[1][1] = new Complejo(1,1);
        res[0][0] = new Complejo(0,4);
        res[0][1] = new Complejo(0,4);
        res[1][0] = new Complejo(0,4);
        res[1][1] = new Complejo(0,4);
        Complejo nc= new Complejo(2,2);
        Complejo[][] respuesta = app.multiplicacionEscalarPorMatriz(lista, nc) ;
        Assert.assertArrayEquals(respuesta,res);
    }
    @Test
    public void matrizTranspuestaTest(){
        Funciones app = new Funciones();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  res = new Complejo[2][2];
        lista[0][0] =new Complejo(1,0);
        lista[0][1] =new Complejo(1,0);
        lista[1][0] = new Complejo(0,1);
        lista[1][1] = new Complejo(1,0);
        res[0][0] = new Complejo(1,0);
        res[0][1] = new Complejo(0,1);
        res[1][0] = new Complejo(1,0);
        res[1][1] = new Complejo(1,0);
        Complejo[][] respuesta = app.matrizTranspuesta(lista) ;
        Assert.assertArrayEquals(respuesta,res);
    }
    @Test
     public void matrizConjugadaTest(){
        Funciones app = new Funciones();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  res = new Complejo[2][2];
        lista[0][0] =new Complejo(1,1);
        lista[0][1] =new Complejo(1,1);
        lista[1][0] = new Complejo(1,1);
        lista[1][1] = new Complejo(1,1);
        res[0][0] = new Complejo(1,-1);
        res[0][1] = new Complejo(1,-1);
        res[1][0] = new Complejo(1,-1);
        res[1][1] = new Complejo(1,-1);
        Complejo[][] respuesta = app.matrizConjugada(lista) ;
        Assert.assertArrayEquals(respuesta,res);
    }
     
    @Test
    public void matrizAdjuntaTest(){
        Funciones app = new Funciones();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  res = new Complejo[2][2];
        lista[0][0] =new Complejo(1,0);
        lista[0][1] =new Complejo(1,0);
        lista[1][0] = new Complejo(0,1);
        lista[1][1] = new Complejo(1,0);
        res[0][0] = new Complejo(1,0);
        res[0][1] = new Complejo(0,-1);
        res[1][0] = new Complejo(1,0);
        res[1][1] = new Complejo(1,0);
        Complejo[][] respuesta = app.matrizAdjunta(lista) ;
        Assert.assertArrayEquals(respuesta,res);
    }
    
    @Test
    public void accionMatrizTest() throws Exception {
        Funciones app = new Funciones();
        Complejo[][] lista = new Complejo[3][3];
        Complejo[] listaDos = new Complejo[3];
        Complejo[] res = new Complejo[3];
        lista[0][0] = new Complejo(3, 2);
        lista[0][1] = new Complejo(0, 0);
        lista[0][2] = new Complejo(5, -6);
        lista[1][0] = new Complejo(1, 0);
        lista[1][1] = new Complejo(4, 2);
        lista[1][2] = new Complejo(0, 1);
        lista[2][0] = new Complejo(4, -1);  
        lista[2][1] = new Complejo(0, 0);
        lista[2][2] = new Complejo(4, 0);
        listaDos[0] = new Complejo(7, 8);
        listaDos[1] = new Complejo(9, 0);
        listaDos[2] = new Complejo(1, 2);
        res[0] = new Complejo(22, 42);
        res[1] = new Complejo(41, 27);
        res[2] = new Complejo(40, 33);
        Complejo[] respuesta = app.accionMatrizSobreVector(lista, listaDos);
        Assert.assertArrayEquals(respuesta, res);
    }
    
    @Test
    public void matrizNormaTest() throws Exception {
        Funciones app = new Funciones();
        double[][] matriz = new double[2][2];
	matriz[0][0] = 3;
	matriz[0][1] = 5;
	matriz[1][0] = 2;
	matriz[1][1] = 3;    
	double expected = Math.sqrt(47);
	double actual = app.normaMatrices(matriz);
	assertEquals(expected, actual, 0.7);
    }

    @Test
    public void matrizDistanciaTest() throws Exception {
        Funciones app = new Funciones();
        double[][] matriz1 = new double[2][2];
        matriz1[0][0] = 3;
        matriz1[0][1] = 5;
        matriz1[1][0] = 2;
        matriz1[1][1] = 3;
        double[][] matriz2 = new double[2][2];
        matriz2[0][0] = 1;
        matriz2[0][1] = 6;
        matriz2[1][0] = 2;
        matriz2[1][1] = 4;
        double expected = 2.45;
        double actual = app.DistacnciaMatrices(matriz1, matriz2);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void matrizUnitariaTest() throws Exception{
        Funciones app = new Funciones();
        Complejo[][] lista = new Complejo[2][2];
        lista[0][0] =new Complejo(4,3);
        lista[0][1] =new Complejo(10,6);
        lista[1][0] = new Complejo(6,-7);
        lista[1][1] = new Complejo(2,5);
        boolean res= false;
        boolean respuesta = app.matrizUnitaria(lista) ;
        assertEquals(respuesta,res);
    }
    
    @Test
    public void matrizHermitianaTest() throws Exception{
        Funciones app = new Funciones();
        Complejo[][] lista = new Complejo[2][2];
        lista[0][0] =new Complejo(1,5);
        lista[0][1] =new Complejo(5,1);
        lista[1][0] = new Complejo(6,1);
        lista[1][1] = new Complejo(1,6);
        boolean res= false;
        boolean respuesta = app.matrizHermitiana(lista) ;
        assertEquals(respuesta,res);
    }
    
    @Test
    public void tensorMatrizTest(){
        Funciones app = new Funciones();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][] listaDos = new Complejo[2][2];
        Complejo[][] res = new Complejo[4][4];
        lista[0][0] = new Complejo(5, 0);
        lista[0][1] = new Complejo(4, 0);
        lista[1][0] = new Complejo(3, 0);
        lista[1][1] = new Complejo(1, 0);
        listaDos[0][0] = new Complejo(1, 0);
        listaDos[0][1] = new Complejo(1, 0);
        listaDos[1][0] = new Complejo(1, 0);
        listaDos[1][1] = new Complejo(1, 0);
        res[0][0] = new Complejo(5, 0);
        res[0][1] = new Complejo(5, 0);
        res[0][2] = new Complejo(4, 0);
        res[0][3] = new Complejo(4, 0);
        res[1][0] = new Complejo(5, 0);
        res[1][1] = new Complejo(5, 0);
        res[1][2] = new Complejo(4, 0);
        res[1][3] = new Complejo(4, 0);
        res[2][0] = new Complejo(3, 0);
        res[2][1] = new Complejo(3, 0);
        res[2][2] = new Complejo(1, 0);
        res[2][3] = new Complejo(1, 0);
        res[3][0] = new Complejo(3, 0);
        res[3][1] = new Complejo(3, 0);
        res[3][2] = new Complejo(1, 0);
        res[3][3] = new Complejo(1, 0);
        Complejo[][] respuesta = app.tensor(lista, listaDos);
        Assert.assertArrayEquals(respuesta, res);
    }
}
