/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaordenamiento3cm1;

import algoritmos.Burbuja;
import algoritmos.BurbujaOptimizado;
import herramientas.Grafica;
import herramientas.Vector;
import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class AAOrdenamiento3CM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //double [] datos = new double[]{6,5,3,1,8,7,2,4};
        double [] datos =herramientas.Datos.generarDatosAleatorios(50000, 100);
         
        //double [] datos2 = new double[]{8,7,6,5,4,3,2,1};
        double [] datos3 = datos.clone();
        Burbuja b1 = new Burbuja();
        b1.ordenar(datos);
        System.out.println();
        BurbujaOptimizado b2 = new BurbujaOptimizado();
        b2.ordenar(datos3);
        System.out.println();
        
        Grafica grafica1 = new Grafica("Comparaciones","Comparaciones", "Tiempo");
        
        ArrayList<Vector> datosS1 = new ArrayList<>();
        ArrayList<Vector> datosS2 = new ArrayList<>();

        datosS1.add(new Vector(0, 0.032));
//        datosS1.add(new Vector(1, 0.072));
//        datosS1.add(new Vector(2, 0.932));
//        datosS1.add(new Vector(3, 1.032));
//        datosS1.add(new Vector(4, 4.032));
        
        
        datosS2.add(new Vector(0, 0.02));
//        datosS2.add(new Vector(1, 0.022));
//        datosS2.add(new Vector(2, 0.122));
//        datosS2.add(new Vector(3, 4.032));
//        datosS2.add(new Vector(4, 3.032));
        
        grafica1.crearSerie("Burbuja", datosS1);
        grafica1.crearSerie("Burbuja Optimizada", datosS2);
        
        System.out.println();
        grafica1.mostrarGrafica();
       
        
    }
   
}
