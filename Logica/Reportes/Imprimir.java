/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Reportes;

import Logica.Datos.Archivo;
import Logica.Entorno;
import java.util.LinkedList;
import Logica.Reportes.Instruccion;
import Logica.Simbolo;

/**
 *
 * @author jonathan
 */
public class Imprimir extends Instruccion {
    
    LinkedList<Expresion> lista_expresiones;
    
    public Imprimir(LinkedList<Expresion> lista_expresiones) {
        this.lista_expresiones = lista_expresiones;
    }
    
    @Override
    public void Ejecutar(Entorno ent) {
        for (Expresion e : lista_expresiones) {
            
            Expresion f = e.obtenerValor(ent);
            String result = f.Imprimir();
            ent.setConsola(ent.getConsola() + result);
            
        }
        
        ent.setConsola(ent.getConsola() + "\n");
        
    }
    
}
