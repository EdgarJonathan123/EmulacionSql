/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Datos;

import java.util.LinkedList;
import Logica.Simbolo;

/**
 *
 * @author jonathan
 */
public class Registro {

    private LinkedList<Simbolo> datos;

    public Registro(LinkedList<Simbolo> datos) {
        this.datos = datos;

    }

    public String obtenerCadena(String clave) {

        String result = "";

        result+="{";
        for (Simbolo dato : datos) {
            result+=  dato.obtenerCadena(clave);
        }
        result+="}\n";

        return result;
    }

    public Registro() {
        this.datos = new LinkedList<Simbolo>();
    }

    public void add(Simbolo sim) {
        this.datos.add(sim);
    }

    public int size() {

        return this.datos.size();
    }

    public Simbolo get(int index) {

        return this.datos.get(index);
    }

    /**
     * @return the datos
     */
    public LinkedList<Simbolo> getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(LinkedList<Simbolo> datos) {
        this.datos = datos;
    }

    public void Imprimir() {

        for (Simbolo dato : datos) {
            String data = (String) dato.valor;
            System.out.print("{" + data + "] - ");
        }
        System.out.println("");
    }

}
