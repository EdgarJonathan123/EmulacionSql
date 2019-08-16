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
import Logica.TipoDato;

/**
 *
 * @author jonathan
 */
public class Contar extends Expresion implements Funcion {

    Expresion identificador;

    public Contar(Expresion id, int linea, int columna) {

        this.identificador = id;
        this.linea = linea;
        this.columna = columna;

    }

    @Override
    public Expresion obtenerValor(Entorno ent) {

        Expresion parametro = identificador.obtenerValor(ent);

        if (VerfificaParametro(parametro)) {
            Archivo arch = (Archivo) parametro.valor;

            this.tipo = TipoDato.numerico;
            this.valor = arch.Contar();
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

        if (parametro.tipo.compareTo(TipoDato.archivo) != 0) {
            TablaError er = TablaError.getInstance();
            String descripcion = "No existe un archivo para el identificador ";
            System.out.println(descripcion);
            er.setError("", linea, columna, "Reporte: Semantico", descripcion);
            this.tipo = TipoDato.error;
            this.valor = null;
            return false;
        } else {
            return true;
        }

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
