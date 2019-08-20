/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.edu.co.computacioncuantica;

import eci.escuelaing.edu.co.computacioncuantica.Complejo;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author 2112712
 */
public class VectorComplejo extends ArrayList<Complejo>{
        private Complejo[] fila;
        private Complejo[][] matriz;
        public VectorComplejo(Complejo[][]matriz ){      
            this.matriz =matriz;
   
        }
        public VectorComplejo(Complejo[]vector){
            this.fila=vector;
        }
        
        @Override
        public String toString() {
        String cadena="";
        if (this.equals(fila)){
            cadena="MatrizCompleja{" + "vector=" + fila + '}';
        }else{
            cadena="MatrizCompleja{" + "matriz=" + matriz + '}';
        }
        return cadena;
    }       
    }

