/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Reportes;

import Logica.Entorno;
import Logica.Reportes.Expresion;
import Logica.TipoDato;

/**
 *
 * @author jonathan
 */
public class Literal extends Expresion {

    /**
     * @param tipo Tipo del literal (Numerico, Cadena)
     * @param valor valor del literal
     */
    public Literal(TipoDato tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.linea = 0;
        this.columna = 0;
    }
    
    public Literal(TipoDato tipo, String valor,int linea,int columna) {
        this.tipo = tipo;
        this.valor = valor;
        this.linea = linea;
        this.columna = columna;
    }

 

    @Override
    public Expresion obtenerValor(Entorno ent) {
        return this; //Retorno la instancia del objeto Expresion
    }

    public String Imprimir() {
            return this.valor.toString(); 
    }

}
