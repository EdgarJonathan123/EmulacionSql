/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Datos;


import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class Archivo {

    private LinkedList<String> claves;
    private LinkedList<Registro> registros;

    public Archivo(LinkedList<String> claves, LinkedList<Registro> registros) {
        
       this.claves = claves;
       this.registros = registros;

    }


    public LinkedList<String> getClaves() {
        return claves;
    }

   

    public void setClaves(LinkedList<String> claves) {
        this.claves = claves;
    }

    public LinkedList<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(LinkedList<Registro> registros) {
        this.registros = registros;
    }
    
    

}
