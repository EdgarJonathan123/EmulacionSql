/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analisis;

import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class TablaError {

    public static TablaError instancia;

    private LinkedList<TError> tabla;

    private TablaError() {}

    public static TablaError getInstance() {

        if (instancia == null) {
            instancia = new TablaError();
        }

        return instancia;
    }

    public void setError(String lexema, int linea, int columna, String tipo, String descripcion) {

        if (getTabla() != null) {

            TError datos = new TError(lexema, linea, columna, tipo, descripcion);
            getTabla().add(datos);

        } else {
            
            setTabla(new LinkedList<>());
            
            TError datos = new TError(lexema, linea, columna, tipo, descripcion);
            getTabla().add(datos);

        }

    }

    /**
     * @return the tabla
     */
    public LinkedList<TError> getTabla() {
        return tabla;
    }

    /**
     * @param tabla the tabla to set
     */
    public void setTabla(LinkedList<TError> tabla) {
        this.tabla = tabla;
    }

}
