/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import eci.escuelaing.edu.co.QuantumParticleSistem.QuantumParticle;
import eci.escuelaing.edu.co.computacioncuantica.Complejo;
import eci.escuelaing.edu.co.computacioncuantica.Funciones;
import eci.escuelaing.edu.co.marbleSimulator.MarbleSimulator;
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
public class TestSimulador {
    private Funciones app = new Funciones();
    private MarbleSimulator simulator =new MarbleSimulator();
    private QuantumParticle particles = new QuantumParticle();
   
    
    @Test
	
        public void  MarbletTest(){
        
        double[][] matrizBool = {{0,0,0,0},
                                 {0,0,0,1},
                                 {0,1,0,0},
                                 {1,0,0,0}};
        double[] estadoInicial = {6,2,5,3};
        double[] solucion = simulator.marble(matrizBool, estadoInicial, 2);
        double[] respuesta = {0,6,3,0};
        for(int i=0;i<respuesta.length;i++){
            assertTrue(respuesta[i]==solucion[i]);
        }
    }
     @Test
	public void probabilityTest() {
		Complejo[] state = new Complejo[4];
		state[0] = new Complejo(-3,-1);
		state[1] = new Complejo(0,-2);
		state[2] = new Complejo(0,1);
		state[3] = new Complejo(2,0);
		int position = 2;
		Double expected = 0.052624;
		Double actual = particles.probabilidad(state, position);
		assertEquals(expected, actual, 0.0001);
	}  
        @Test
	public void meanTest() throws Exception {
		Complejo[] ket = new Complejo[2];
		ket[0] = new Complejo(Math.sqrt(2) / 2, 0);
		ket[1] = new Complejo(0, Math.sqrt(2) / 2);
		Complejo[][] observable = new Complejo[2][2];
		observable[0][0] = new Complejo(1, 0);
		observable[0][1] = new Complejo(0, -1);
		observable[1][0] = new Complejo(0, 1);
		observable[1][1] = new Complejo(2, 0);
		Complejo expected = new Complejo(2.5000000000000004, 0);
		Complejo actual = particles.Mean(ket, observable);
		assertEquals(expected, actual);
	}
        @Test
    public void programmingDrill331Test(){
        
        Complejo[][] matrizComplejos = new Complejo[3][3];
        matrizComplejos[0][0] = new Complejo(2,4);
        matrizComplejos[0][1] = new Complejo(1,3);
        matrizComplejos[0][2] = new Complejo(5,0);
        matrizComplejos[1][0] = new Complejo(3,2);
        matrizComplejos[1][1] = new Complejo(1,2);
        matrizComplejos[1][2] = new Complejo(7,12);
        matrizComplejos[2][0] = new Complejo(2,2);
        matrizComplejos[2][1] = new Complejo(1,1);
        matrizComplejos[2][2] = new Complejo(2,4);
        Complejo[] estadoInicial = new Complejo[3];
        estadoInicial[0]=new Complejo(1,3);
        estadoInicial[1]=new Complejo(2,5);
        estadoInicial[2]=new Complejo(3,6);
        Complejo[] solucion = simulator.ejercicio3(matrizComplejos,estadoInicial,2);
        Complejo[] respuesta = new Complejo[3];
        respuesta[0]=new Complejo(-701,177);
        respuesta[1]=new Complejo(-1027,84);
        respuesta[2]=new Complejo(-484,100);
        Assert.assertArrayEquals(solucion,respuesta);
    }
}
