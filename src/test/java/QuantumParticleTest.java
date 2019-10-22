/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import eci.escuelaing.edu.co.QuantumParticleSistem.QuantumParticle;
import eci.escuelaing.edu.co.computacioncuantica.Complejo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juan.moreno-mor
 */
public class QuantumParticleTest {
    private QuantumParticle app= new QuantumParticle();
    @Test
    public void probabilidadTest() {
        Complejo[] state = (new Complejo[4]);
        state[0] = new Complejo(-3,-1);
        state[1] = new Complejo(0,-2);
        state[2] = new Complejo(0,1);
        state[3] = new Complejo(2,0);
        int position = 2;
        Double expected = 0.052624;
        Double actual = app.probabilidad(state, position);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void transicionTest()throws Exception{
        Complejo[] startState = new Complejo[2];
        startState[0] = new Complejo(Math.sqrt(2) / 2, 0);
        startState[1] = new Complejo(0, Math.sqrt(2) / 2);
        Complejo[] endState = new Complejo[2];
        endState[0] = new Complejo(0,Math.sqrt(2) / 2);
        endState[1] = new Complejo(-Math.sqrt(2) / 2, 0);
        Complejo expected = new Complejo(0, -1.0000000000000002);
        Complejo actual = app.transicion(startState, endState);
        assertEquals(expected, actual);
    }

    @Test
    public void valorMediaTest() throws Exception {
        Complejo[] ket = (new Complejo[2]);
        ket[0] = new Complejo(Math.sqrt(2) / 2, 0);
        ket[1] = new Complejo(0, Math.sqrt(2) / 2);
        Complejo[][] observable = new Complejo[2][2];
        observable[0][0] = new Complejo(1, 0);
        observable[0][1] = new Complejo(0, -1);
        observable[1][0] = new Complejo(0, 1);
        observable[1][1] = new Complejo(2, 0);
        Complejo expected = new Complejo(2.5000000000000004, 0);
        Complejo actual = app.Mean(ket, observable);
        assertEquals(expected, actual);
    }

    @Test
    public void varianzaTest() throws Exception {
        Complejo[] ket = new Complejo[2];
        ket[0] = new Complejo(Math.sqrt(2) / 2, 0);
        ket[1] = new Complejo(0, Math.sqrt(2) / 2);
        Complejo[][] observable = new Complejo[2][2];
        observable[0][0] = new Complejo(1, 0);
        observable[0][1] = new Complejo(0, -1);
        observable[1][0] = new Complejo(0, 1);
        observable[1][1] = new Complejo(2, 0);
        Complejo expected = new Complejo(0.25, 0);
        Complejo actual = app.variance(ket, observable);
        assertEquals(expected, actual);
    }
    
}
