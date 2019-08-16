/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Reportes.Funciones;

import Analisis.TablaError;
import Logica.Datos.Archivo;
import Logica.Entorno;
import Logica.OpRel;
import Logica.Reportes.Expresion;
import Logica.Reportes.Literal;
import Logica.Simbolo;
import Logica.TipoDato;

/**
 *
 * @author jonathan
 */
public class ObtenerSi extends Expresion implements Funcion {

    Expresion id;
    Expresion clave1;
    Expresion clave2;
    OpRel rel;

    public ObtenerSi(Expresion id, Expresion clave1, Expresion clave2, OpRel rel, int linea, int columna) {
        this.id = id;
        this.clave1 = clave1;
        this.clave2 = clave2;
        this.rel = rel;
        this.linea = linea;
        this.columna = columna;
    }

    @Override
    public Expresion obtenerValor(Entorno ent) {
        Expresion parametro1 = id.obtenerValor(ent);
        Expresion parametro2 = clave1.obtenerValor(ent);
        Expresion parametro3 = clave2.obtenerValor(ent);

        if (VerfificaParametro(parametro1, parametro2, parametro3)) {

            Archivo arch = (Archivo) parametro1.valor;
            String val1 = parametro2.valor.toString();
            String val2 = parametro3.valor.toString();

            Literal clave1 = new Literal(parametro2.tipo, val1, linea, columna);
            Literal clave2 = new Literal(parametro3.tipo, val2, linea, columna);

            Simbolo sim = arch.ObtenerSi(clave1, clave2, rel);

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean VerfificaParametro(Expresion parametro1, Expresion parametro2, Expresion parametro3) {
        Boolean p1isArchivo = parametro1.tipo.compareTo(TipoDato.archivo) == 0;
        Boolean p2isCadena = parametro2.tipo.compareTo(TipoDato.cadena) == 0;
        Boolean p3isCadena = parametro3.tipo.compareTo(TipoDato.cadena) == 0;
        Boolean p3isNum = parametro3.tipo.compareTo(TipoDato.numerico) == 0;

        if ((p1isArchivo && p2isCadena) && (p3isCadena || p3isNum)) {

            return true;
        } else {
            TablaError er = TablaError.getInstance();
            String descripcion = "ALguno des los parametros de la Funcion ObtenerSi es incorrecto Revisar los parametros ingresados ";
            System.out.println(descripcion);
            er.setError("", linea, columna, "Reporte: Semantico", descripcion);

            this.tipo = TipoDato.error;
            this.valor = null;
            return false;
        }
    }

}
