/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Reportes.Funciones;

import Logica.Reportes.Expresion;
import Analisis.Datos.ALDatos;
import Analisis.Datos.ASDatos;
import Analisis.TablaError;
import Logica.Datos.Archivo;
import Logica.Entorno;
import Logica.Reportes.Expresion;
import Logica.TipoDato;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author jonathan
 */
public class LeerArchivo extends Expresion implements Funcion{

    Expresion expRuta;
    private String local = System.getProperty("user.dir");

    /**
     * @param expRuta Expresión que contiene la ruta del archivo a analizar
     * @param linea Línea donde está la función leerArchivo
     * @param columna Columna donde está la función leerArchivo
     */
    public LeerArchivo(Expresion expRuta, int linea, int columna) {
        this.expRuta = expRuta;
        this.linea = linea;
        this.columna = columna;

    }

    @Override
    public Expresion obtenerValor(Entorno ent) {

        Expresion parametro = expRuta.obtenerValor(ent);

        if (VerfificaParametro(parametro)) {
            //Error Semantico
            TablaError er = TablaError.getInstance();
            String descripcion = "Se esperaba Una Cadena de Texto, La Funcion Leer archivo Recibe Una Cadena de texto";
            er.setError(parametro.valor.toString(), linea, columna, "Reporte: Semantico", descripcion);

            this.tipo = TipoDato.error;
            this.valor = null;

            return this;
        }

        leer(parametro.valor.toString());

        return this;
    }

    public void leer(String path) {

        try {

            String ruta = local + "/Entradas/" + path;

            ALDatos lexico = new ALDatos(new BufferedReader(new FileReader(ruta)));
            ASDatos sintactico = new ASDatos(lexico);

            System.out.println("------------Inicio Analisis----------");
            sintactico.parse();
            System.out.println("------------Fin Analisis--------");

            if (sintactico.raiz != null) {
                sintactico.raiz.Imprimir();

                this.tipo = tipo.archivo;
                this.valor = sintactico.raiz;

            } else {

                this.tipo = TipoDato.error;
                this.valor = null;
                System.out.println("Existio un error a la hora de leer el archivo");
            }

        } catch (Exception ex) {

            this.tipo = TipoDato.error;
            this.valor = null;

            System.out.println("Error fatal en compilación de entrada.");
            System.out.println("Causa: " + ex.getCause());

            TablaError er = TablaError.getInstance();
            String descripcion = "Hubo un error al leer el archivo ruta invalida";
            er.setError(path, linea, columna, "Reporte: Semantico", descripcion);
        }

    }

    @Override
    public String Imprimir() {
        String result ="";
    
        if(this.tipo.compareTo(TipoDato.archivo)==0){
        
            Archivo arch = (Archivo)this.valor;
            
            result = arch.Imprimir();
        }
        
        return result;
    }

    @Override
    public Boolean VerfificaParametro(Expresion parametro) {
 
       return  parametro.tipo.compareTo(TipoDato.cadena) != 0;
    }

    @Override
    public Boolean VerfificaParametro(Expresion parametro1, Expresion parametro2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean VerfificaParametro(Expresion parametro1, Expresion parametro2, Expresion parametro3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
