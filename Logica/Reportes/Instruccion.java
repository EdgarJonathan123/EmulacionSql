/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Reportes;

import Logica.Entorno;

/**
 *
 * @author jonathan
 */
public abstract class Instruccion {

    /**
     * @param ent Entorno en el que se está ejecutando la instrucción
     */
    public abstract void Ejecutar(Entorno ent);

}
