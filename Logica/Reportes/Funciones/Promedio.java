/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Reportes.Funciones;

import Analisis.TablaError;
import Logica.Datos.Archivo;
import Logica.Entorno;
import Logica.Reportes.Expresion;
import Logica.Reportes.Literal;
import Logica.Simbolo;
import Logica.TipoDato;

/**
 *
 * @author jonathan
 */
public class Promedio extends Expresion implements Funcion {

    Expresion id;
    Expresion clave;

    public Promedio(Expresion id, int linea, int columna, Expresion clave) {

        this.id = id;
        this.linea = linea;
        this.columna = columna;
        this.clave = clave;

    }

    @Override
    public Expresion obtenerValor(Entorno ent) {

        Expresion parametro1 = id.obtenerValor(ent);
        Expresion parametro2 = clave.obtenerValor(ent);

        if (VerfificaParametro(parametro1, parametro2)) {

            Archivo arch = (Archivo) parametro1.valor;
            String cl = (String) parametro2.valor;

            Simbolo sim = arch.Promedio(new Literal(TipoDato.cadena, cl, linea, columna));

            this.tipo = sim.tipo;
            this.valor = sim.valor;

            return this;

        }

        return this;

    }

    @Override
    public String Imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean VerfificaParametro(Expresion parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean VerfificaParametro(Expresion parametro1, Expresion parametro2) {

        if ((parametro1.tipo.compareTo(TipoDato.archivo) == 0)
                && (parametro2.tipo.compareTo(TipoDato.cadena) == 0)) {

            return true;
        } else {
            TablaError er = TablaError.getInstance();
            String descripcion = "No existe un archivo para el identificador ";
            System.out.println(descripcion);
            er.setError("", linea, columna, "Reporte: Semantico", descripcion);
            descripcion = "Se nececsita una cadena como segundo parametro de la funcion Promedio";
            System.out.println(descripcion);
            er.setError("", linea, columna, "Reporte: Semantico", descripcion);
            this.tipo = TipoDato.error;
            this.valor = null;

            return false;
        }
    }

    @Override
    public Boolean VerfificaParametro(Expresion parametro1, Expresion parametro2, Expresion parametro3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
