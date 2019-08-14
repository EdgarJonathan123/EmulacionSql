/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Analisis.Datos.ALDatos;
import Analisis.Datos.ASDatos;
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
        interpretar("/**\n"
                + "*	Defino las claves que va a tener el archivo de datos\n"
                + "*/\n"
                + "claves = [\n"
                + "			\"IdProducto\" // Tipo = Numerico\n"
                + "			,\"NombreProducto\"	// Tipo = Cadena\n"
                + "			,\"Proveedor\"	// Tipo = Cadena\n"
                + "			,\"Categoría\"	// Tipo = Cadena\n"
                + "			,\"CantidadPorUnidad\"	// Tipo = Cadena\n"
                + "			,\"PrecioUnidad\"	// Tipo = Numerico\n"
                + "			,\"UnidadesEnExistencia\"	// Tipo = Numerico\n"
                + "			,\"Suspendido\"	// Tipo = Cadena\n"
                + "		]\n"
                + "\n"
                + "\n"
                + "/**\n"
                + "*	Defino todos los registros que va a tener el archivo de datos\n"
                + "*/\n"
                + "\n"
                + "registros = \n"
                + "\n"
                + "[\n"
                + "\n"
                + "{ 1, \"Té Dharamsala\", \"Exotic Liquids\", \"Bebidas\", \"10 cajas x 20 bolsas\", 18,39, \"FALSO\" }\n"
                + "\n"
                + "{ 2, \"Cerveza tibetana Barley\", \"Exotic Liquids\", \"Bebidas\", \"24 - bot. 12 l\", 19,17, \"FALSO\" }\n"
                + "\n"
                + "{ 3, \"Sirope de regaliz\", \"Exotic Liquids\", \"Condimentos\", \"12 - bot. 550 ml\", 10,13, \"FALSO\" }\n"
                + "\n"
                + "{ 4 , \"Especias Cajun del chef Anton\", \"New Orleans Cajun Delights\", \"Condimentos\", \"48 - frascos 6 l\", 22,53, \"FALSO\" }\n"
                + "\n"
                + "{ 5, \"Mezcla Gumbo del chef Anton\", \"New Orleans Cajun Delights\", \"Condimentos\", \"36 cajas\", 21.35,0, \"VERDADERO\" }\n"
                + "\n"
                + "{ 6, \"Mermelada de grosellas de la abuela\", \"Grandma Kelly's Homestead\", \"Condimentos\", \"12 - frascos 8 l\", 25,120, \"FALSO\" }\n"
                + "\n"
                + "{ 7, \"Peras secas orgánicas del tío Bob\", \"Grandma Kelly's Homestead\", \"Frutas/Verduras\", \"12 - paq. 1 kg\", 30,15, \"FALSO\" }\n"
                + "\n"
                + "{ 8, \"Salsa de arándanos Northwoods\", \"Grandma Kelly's Homestead\", \"Condimentos\", \"12 - frascos 12 l\", 40,6, \"FALSO\" }\n"
                + "\n"
                + "{ 9, \"Buey Mishi Kobe\", \"Tokyo Traders\", \"Carnes\", \"18 - paq. 500 g\", 97,29, \"VERDADERO\" }\n"
                + "\n"
                + "{ 10, \"Pez espada\", \"Tokyo Traders\", \"Pescado/Marisco\", \"12 - frascos 200 ml\", 31,31, \"FALSO\" }\n"
                + "\n"
                + "{ 11, \"Queso Cabrales\", \"Cooperativa de Quesos 'Las Cabras'\", \"Lácteos\", \"paq. 1 kg\", 21,22, \"FALSO\" }\n"
                + "\n"
                + "{ 12, \"Queso Manchego La Pastora\", \"Cooperativa de Quesos 'Las Cabras'\", \"Lácteos\", \"10 - paq. 500 g\", 38,86, \"FALSO\" }\n"
                + "\n"
                + "{ 13, \"Algas Konbu\", \"Mayumi's\", \"Pescado/Marisco\", \"caja 2 kg\", 6,24, \"FALSO\" }\n"
                + "\n"
                + "{ 14, \"Cuajada de judías\", \"Mayumi's\", \"Frutas/Verduras\", \"40 - paq. 100 g\", 23.25,35, \"FALSO\" }\n"
                + "\n"
                + "{ 15, \"Salsa de soja baja en sodio\", \"Mayumi's\", \"Condimentos\", \"24 - bot. 250 ml\", 15.5,39, \"FALSO\" }\n"
                + "\n"
                + "{ 16, \"Postre de merengue Pavlova\", \"Pavlova, Ltd.\", \"Repostería\", \"32 - cajas 500 g\", 17.45,29, \"FALSO\" }\n"
                + "\n"
                + "{ 17, \"Cordero Alice Springs\", \"Pavlova, Ltd.\", \"Carnes\", \"20 - latas 1 kg\", 39,0, \"VERDADERO\" }\n"
                + "\n"
                + "{ 18, \"Langostinos tigre Carnarvon\", \"Pavlova, Ltd.\", \"Pescado/Marisco\", \"paq. 16 kg\", 62.5,42, \"FALSO\" }\n"
                + "\n"
                + "{ 19, \"Pastas de té de chocolate\", \"Specialty Biscuits, Ltd.\", \"Repostería\", \"10 cajas x 12 piezas\", 9.2,25, \"FALSO\" }\n"
                + "\n"
                + "{ 20, \"Mermelada de Sir Rodney's\", \"Specialty Biscuits, Ltd.\", \"Repostería\", \"30 cajas regalo\", 81,40, \"FALSO\" }\n"
                + "\n"
                + "\n"
                + "\n"
                + "]");

    }

    private static void interpretar(String path) {
        try {
            ALDatos lexico = new ALDatos(new BufferedReader(new StringReader(path)));
            ASDatos sintactico = new ASDatos(lexico);

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
