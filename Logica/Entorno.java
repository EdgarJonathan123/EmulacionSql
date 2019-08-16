/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.HashMap;

/**
 *
 * @author Jonathan
 * Esta clase me va a servir para manejar la tabla de símbolos, no voy a tener
 * una clase TablaDeSimbolos como tal, sino un conjunto de entornos de
 * ejecución, para la práctica 1 solo se tiene un entorno de ejecución que es el
 * entorno global
 */
public class Entorno {

    
    public HashMap<String, Simbolo> tabla; //Tabla donde voy a almacenar mis variables
    private String consola;
    
    public Entorno() {
        this.tabla = new HashMap<>(); //Inicializo mi tabla
        consola="";
    }

    /**
     * @param nombre Nombre de la variable a insertar
     * @param sim Simbolo con la información de la variable que estoy insertando
     * @param linea Línea donde se está haciendo la declaración, esto para
     * marcar errores
     * @param columna Columna donde se está haciendo la declaración, esto para
     * marcar errores
     */
    public void insertar(String nombre, Simbolo sim, int linea, int columna) {
        if (tabla.containsKey(nombre)) {
            System.out.println("La variable ya existe");
            return;
        }
        
        tabla.put(nombre, sim);
    }

    /**
     * @param nombre Nombre de la variable que se está buscando
     * @param linea Línea donde se quiere acceder a la variable, esto para
     * marcar errores
     * @param columna Columna donde se quiere acceder a la variable, esto para
     * marcar errores
     * @return Retorna un Simbolo si la variable existe o null si no existe
     */
    public Simbolo buscar(String nombre, int linea, int columna) {
        if (tabla.containsKey(nombre)) {
            Simbolo sim = tabla.get(nombre);
            return sim;
        }

        System.out.println("La variable '" + nombre + "' NO existe");
        return null;
    }

    /**
     * @return the consola
     */
    public String getConsola() {
        return consola;
    }

    /**
     * @param consola the consola to set
     */
    public void setConsola(String consola) {
        this.consola = consola;
    }
}
