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
        interpretarReporte("/**\n"
                + "*	Creo una variable de tipo Archivo\n"
                + "*/\n"
                + "\n"
                + "Archivo articulos = leerArchivo(\"articulos.dat\");\n"
                + "Imprimir(articulos);\n"
                + "\n"
                + "// Veo cuántos registros tiene el archivo\n"
                + "\n"
                + "Numerico numeroRegistros = Contar(articulos);\n"
                + "Imprimir(\"Número de registros: \", numeroRegistros); //20\n"
                + "\n"
                + "//Sumo el número de unidades en existencia\n"
                + "Numerico sumaUnidades = Sumar(articulos, \"UnidadesEnExistencia\");\n"
                + "Imprimir(\"El número de unidades es: \", sumaUnidades); //665.0\n"
                + "\n"
                + "// Veo cuál es el promedio del precio por unidad\n"
                + "Numerico promedioUnidad = promedio(articulos,\"PrecioUnidad\");\n"
                + "imprimir(\"El promedio de precio por unidad es: \", promedioUnidad); //31.3125\n"
                + "\n"
                + "// Veo cuántos productos tienen estado SUSPENDIDO\n"
                + "Numerico suspendidos = contarSi(articulos, \"Suspendido\", ==, \"VERDADERO\");\n"
                + "imprimir(\"Número de productos suspendidos: \", suspendidos); //3\n"
                + "\n"
                + "// Veo cuántos productos NO tienen estado SUSPENDIDO\n"
                + "Numerico noSuspendidos = contarSi(articulos, \"Suspendido\", !=, \"VERDADERO\");\n"
                + "imprimir(\"Número de productos NO suspendidos: \", noSuspendidos); //17\n"
                + "imprimir(\"\");\n"
                + "imprimir(\"\");\n"
                + "\n"
                + "// Obtengo la información de los productos de la categoría Frutas/Verduras\n"
                + "Cadena frutas_verduras = ObtenerSi(articulos, \"Categoría\", ==, \"Frutas/Verduras\");\n"
                + "Imprimir(\"******************** Frutas/Verduras ********************\");\n"
                + "Imprimir(frutas_verduras);\n"
                + "\n"
                + "// Obtengo la información de los productos de la categoría Repostería\n"
                + "Cadena reposteria = ObtenerSi(articulos, \"Categoría\", ==, \"Repostería\");\n"
                + "Imprimir(\"******************** Repostería ********************\");\n"
                + "Imprimir(reposteria);\n"
                + "\n"
                + "\n"
                + "// Obtengo la información de los productos donde la existencia es menor a 20\n"
                + "Cadena productos = ObtenerSi(articulos, \"UnidadesEnExistencia\", <, 20);\n"
                + "Imprimir(\"******************** Productos con Existencia < 20 ********************\");\n"
                + "Imprimir(productos);\n"
                + "\n"
                + "\n"
                + "\n"
                + "/**\n"
                + "*	Generación de reportes con la función Graficar\n"
                + "*/\n"
                + "\n"
                + "Graficar(\"precioProductos\", \"Precio por unidad de cada producto\", articulos, \"NombreProducto\", \"PrecioUnidad\");\n"
                + "\n"
                + "");

    }

    private static void interpretarDatos(String path) {
        try {
            ALDatos lexico = new ALDatos(new BufferedReader(new StringReader(path)));
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
            ALReportes lexico = new ALReportes(new BufferedReader(new StringReader(path)));
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
                cadena += cadena;
            }
            b.close();

        } catch (Exception e) {
        }

        return cadena;
    }
}
