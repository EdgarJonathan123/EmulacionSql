/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Analisis.Datos.ALDatos;
import Analisis.Datos.ASDatos;
import Analisis.reportes.ALReportes;
import Analisis.reportes.ASReportes;
import Analisis.TablaError;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

/**
 *
 * @author jonathan
 */
public class mainprueba {

    public static void main(String[] args) {

        /*   String datos = textoEntrada.getText();
        
        ALDatos lexico = new ALDatos(new BufferedReader(new StringReader(datos)));
        ASDatos sintactico= new ASDatos(lexico);

        try {
            System.out.println("------------Inicio Analisis----------");
            sintactico.parse();
            System.out.println("------------Fin Analisis--------");
        } catch (Exception e) {

        }
         */
        // String contenido = leer("/home/jonathan/Escritorio/2S2019/Compi/Ejemplo_Entrada_Práctica1/articulos.dat");
       // interpretarReporte("/home/jonathan/Escritorio/2S2019/Compi/Ejemplo_Entrada_Práctica1/reporte_articulos.rep");
        interpretarDatos("/home/jonathan/Documentos/2S2019/Compi/Ejemplo_Entrada_Práctica1/articulos.dat");

    }

    private static void interpretarDatos(String path) {
        try {
            ALDatos lexico = new ALDatos(new BufferedReader(new FileReader(path)));
            ASDatos sintactico = new ASDatos(lexico);

            System.out.println("------------Inicio Analisis----------");
            sintactico.parse();
            System.out.println("------------Fin Analisis--------");

            if (sintactico.raiz != null) {
                sintactico.raiz.Imprimir();
            } else {
                System.out.println("Existio un error a la hora de leer el archivo");
            }

            TablaError tabla = TablaError.getInstance();
            tabla.imprimir();
            tabla.escribirReporte();

        } catch (Exception ex) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println("Causa: " + ex.getCause());
        }
    }

    private static void interpretarReporte(String path) {
        try {
            ALReportes lexico = new ALReportes(new BufferedReader(new FileReader(path)));
            ASReportes sintactico = new ASReportes(lexico);

            System.out.println("------------Inicio Analisis----------");
            sintactico.parse();
            System.out.println("------------Fin Analisis--------");

        } catch (Exception ex) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println("Causa: " + ex.getCause());
        }
    }

    public static String leer(String archivo) {
        String cadena = "";

        try {

            FileReader f = new FileReader(archivo);
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                cadena +="\n"+cadena;
            }
            b.close();

        } catch (Exception e) {
        }

        return cadena;
    }
}
