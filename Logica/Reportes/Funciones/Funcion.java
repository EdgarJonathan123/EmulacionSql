/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Reportes.Funciones;

import Logica.Reportes.Expresion;

/**
 *
 * @author jonathan
 */
public interface Funcion {

    public Boolean VerfificaParametro(Expresion parametro);

    public Boolean VerfificaParametro(Expresion parametro1, Expresion parametro2);

    public Boolean VerfificaParametro(Expresion parametro1, Expresion parametro2, Expresion parametro3);

}
