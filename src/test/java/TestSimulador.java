/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import eci.escuelaing.edu.co.QuantumParticleSistem.QuantumParticle;
import eci.escuelaing.edu.co.computacioncuantica.Complejo;
import eci.escuelaing.edu.co.computacioncuantica.Funciones;
import eci.escuelaing.edu.co.marbleSimulator.MarbleSimulator;
import java.util.HashMap;
import java.util.Map;
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
  
    //marble fractions
    @Test
    public void  MarbletFractions(){       
       double[][] matriz = {{0,0,0,0},{0,0,0,2.3},{0,2.3,0,0},{2.3,0,0,0}};
        double[] estadoInicial = {6,2,5,3};
        double[] solucion = simulator.marble(matriz, estadoInicial, 2);
        double[] respuesta = {0,31.739999999999995,15.869999999999997,0};
        for(int i=0;i<respuesta.length;i++){
            assertTrue(respuesta[i]==solucion[i]);
        }
    }
    //marble booleano
    @Test
    public void  MarbletTest(){      
        double[][] matrizBool = {{0,0,0,0},{0,0,0,1},{0,1,0,0},{1,0,0,0}};
        double[] estadoInicial = {6,2,5,3};
        double[] solucion = simulator.marble(matrizBool, estadoInicial, 2);
        double[] respuesta = {0,6,3,0};
        for(int i=0;i<respuesta.length;i++){
            assertTrue(respuesta[i]==solucion[i]);
        }
    }
     //marble Complejos
    @Test
    public void Complejos(){       
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
        Complejo[] solucion = simulator.fractions(matrizComplejos,estadoInicial,2);
        Complejo[] respuesta = new Complejo[3];
        respuesta[0]=new Complejo(-701,177);
        respuesta[1]=new Complejo(-1027,84);
        respuesta[2]=new Complejo(-484,100);
        Assert.assertArrayEquals(solucion,respuesta);
    }
    //doble rendija
    @Test
    public void dobleRendijaTest() throws Exception {
        int slits = 2;
        int targets = 5;
        Map<String, Complejo> p = new HashMap<>();
        p.put("0 1", new Complejo(1.0/Math.sqrt(2), 0));
        p.put("0 2", new Complejo(1.0/Math.sqrt(2), 0));
        p.put("1 3", new Complejo(-1.0/Math.sqrt(6), 1.0/Math.sqrt(6)));
        p.put("1 4", new Complejo(-1.0/Math.sqrt(6), -1.0/Math.sqrt(6)));
        p.put("1 5", new Complejo(1.0/Math.sqrt(6), -1.0/Math.sqrt(6)));
        p.put("2 5", new Complejo(-1.0/Math.sqrt(6), 1.0/Math.sqrt(6)));
        p.put("2 6", new Complejo(-1.0/Math.sqrt(6), -1.0/Math.sqrt(6)));
        p.put("2 7", new Complejo(1.0/Math.sqrt(6), -1.0/Math.sqrt(6)));
        Complejo[][] expectedMatrix = new Complejo[8][8];
        expectedMatrix[0][0] = new Complejo(0, 0);
        expectedMatrix[0][1] = new Complejo(0, 0);
        expectedMatrix[0][2] = new Complejo(0, 0);
        expectedMatrix[0][3] = new Complejo(0, 0);
        expectedMatrix[0][4] = new Complejo(0, 0);
        expectedMatrix[0][5] = new Complejo(0, 0);
        expectedMatrix[0][6] = new Complejo(0, 0);
        expectedMatrix[0][7] = new Complejo(0, 0);
        expectedMatrix[1][0] = new Complejo(0, 0);
        expectedMatrix[1][1] = new Complejo(0, 0);
        expectedMatrix[1][2] = new Complejo(0, 0);
        expectedMatrix[1][3] = new Complejo(0, 0);
        expectedMatrix[1][4] = new Complejo(0, 0);
        expectedMatrix[1][5] = new Complejo(0, 0);
        expectedMatrix[1][6] = new Complejo(0, 0);
        expectedMatrix[1][7] = new Complejo(0, 0);
        expectedMatrix[2][0] = new Complejo(0, 0);
        expectedMatrix[2][1] = new Complejo(0, 0);
        expectedMatrix[2][2] = new Complejo(0, 0);
        expectedMatrix[2][3] = new Complejo(0, 0);
        expectedMatrix[2][4] = new Complejo(0, 0);
        expectedMatrix[2][5] = new Complejo(0, 0);
        expectedMatrix[2][6] = new Complejo(0, 0);
        expectedMatrix[2][7] = new Complejo(0, 0);
        expectedMatrix[3][0] = new Complejo(-1.0/Math.sqrt(12), 1.0/Math.sqrt(12));
        expectedMatrix[3][1] = new Complejo(-1.0/Math.sqrt(6), 1.0/Math.sqrt(6));
        expectedMatrix[3][2] = new Complejo(0, 0);
        expectedMatrix[3][3] = new Complejo(1, 0);
        expectedMatrix[3][4] = new Complejo(0, 0);
        expectedMatrix[3][5] = new Complejo(0, 0);
        expectedMatrix[3][6] = new Complejo(0, 0);
        expectedMatrix[3][7] = new Complejo(0, 0);
        expectedMatrix[4][0] = new Complejo(-1.0/Math.sqrt(12), -1.0/Math.sqrt(12));
        expectedMatrix[4][1] = new Complejo(-1.0/Math.sqrt(6), -1.0/Math.sqrt(6));
        expectedMatrix[4][2] = new Complejo(0, 0);
        expectedMatrix[4][3] = new Complejo(0, 0);
        expectedMatrix[4][4] = new Complejo(1, 0);
        expectedMatrix[4][5] = new Complejo(0, 0);
        expectedMatrix[4][6] = new Complejo(0, 0);
        expectedMatrix[4][7] = new Complejo(0, 0);
        expectedMatrix[5][0] = new Complejo(0, 0);
        expectedMatrix[5][1] = new Complejo(1.0/Math.sqrt(6), -1.0/Math.sqrt(6));
        expectedMatrix[5][2] = new Complejo(-1.0/Math.sqrt(6), 1.0/Math.sqrt(6));
        expectedMatrix[5][3] = new Complejo(0, 0);
        expectedMatrix[5][4] = new Complejo(0, 0);
        expectedMatrix[5][5] = new Complejo(1, 0);
        expectedMatrix[5][6] = new Complejo(0, 0);
        expectedMatrix[5][7] = new Complejo(0, 0);
        expectedMatrix[6][0] = new Complejo(-1.0/Math.sqrt(12), -1.0/Math.sqrt(12));
        expectedMatrix[6][1] = new Complejo(0, 0);
        expectedMatrix[6][2] = new Complejo(-1.0/Math.sqrt(6), -1.0/Math.sqrt(6));
        expectedMatrix[6][3] = new Complejo(0, 0);
        expectedMatrix[6][4] = new Complejo(0, 0);
        expectedMatrix[6][5] = new Complejo(0, 0);
        expectedMatrix[6][6] = new Complejo(1, 0);
        expectedMatrix[6][7] = new Complejo(0, 0);
        expectedMatrix[7][0] = new Complejo(1.0/Math.sqrt(12), -1.0/Math.sqrt(12));
        expectedMatrix[7][1] = new Complejo(0, 0);
        expectedMatrix[7][2] = new Complejo(1.0/Math.sqrt(6), -1.0/Math.sqrt(6));
        expectedMatrix[7][3] = new Complejo(0, 0);
        expectedMatrix[7][4] = new Complejo(0, 0);
        expectedMatrix[7][5] = new Complejo(0, 0);
        expectedMatrix[7][6] = new Complejo(0, 0);
        expectedMatrix[7][7] = new Complejo(1, 0);
        Complejo[][] actualMatrix = (Complejo[][]) MarbleSimulator.bullets(slits, targets, p).get(0);
        Complejo[] expectedVector = new Complejo[8];
        expectedVector[0] = new Complejo(0,0);
        expectedVector[1] = new Complejo(0,0);
        expectedVector[2] = new Complejo(0,0);
        expectedVector[3] = new Complejo(-1.0/Math.sqrt(12), 1.0/Math.sqrt(12));
        expectedVector[4] = new Complejo(-1.0/Math.sqrt(12), -1.0/Math.sqrt(12));
        expectedVector[5] = new Complejo(0,0);
        expectedVector[6] = new Complejo(-1.0/Math.sqrt(12), -1.0/Math.sqrt(12));
        expectedVector[7] = new Complejo(1.0/Math.sqrt(12), -1.0/Math.sqrt(12));
        Complejo[] actualVector = (Complejo[]) MarbleSimulator.bullets(slits, targets, p).get(1);
        Assert.assertEquals(expectedMatrix, actualMatrix);
    }


}
