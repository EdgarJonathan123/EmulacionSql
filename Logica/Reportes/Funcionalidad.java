/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Reportes;

import Logica.Entorno;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class Funcionalidad {

    public Funcionalidad(LinkedList<Instruccion> raiz) {
        this.raiz = raiz;
    }

    public LinkedList<Instruccion> raiz;

    public void Ejecutar(Entorno ent) {

        if (raiz != null) {

            try {
                for (Instruccion instruccion : raiz) {
                    instruccion.Ejecutar(ent);
                }
                
                System.out.println("todo termino piola men");

            } catch (Exception e) {
                System.out.println("hubo un error en el for de ejecutar");
            }

        }

    }

}
